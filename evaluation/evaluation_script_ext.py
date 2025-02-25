#!/usr/bin/env python3
"""
This script computes several code metrics for source files.
For Python files, it measures:
  - LinesOfCode
  - TokenCount
  - NonWordCharCount
  - NumKw and NumDiffKw (keywords)
  - MaxNesting
  - NumFunCalls, NumPars, AvgParPerCall
  - NumOps and NumDiffOps (operations; i.e. operator tokens and keywords treated as operations)
  - HalsteadVolume (using a simplified model)

For a declarative DSL, a similar set of metrics is computed.
You can supply:
  --dsl_tokens <path> : A JSON file with DSL token definitions (keywords and operators).
  --dsl_grammar <path> : A .xtext file with the DSL grammar (for future automatic extraction).
Usage:
    python code_metrics.py path/to/file_or_directory [--dsl] [--dsl_tokens DSL_TOKENS_FILE] [--dsl_grammar DSL_GRAMMAR_FILE]
"""
import os
import ast
import io
import math
import re
import tokenize
import keyword
import argparse
import json

# ------------- Global DSL Token Sets -------------
# Default values (can be overridden by external files)
DSL_KEYWORDS = {"SCRIPT", "CREATE", "ALTER", "DROP", "INSERT", "UPDATE", "DELETE",
                "VECTOR", "SEARCH", "NON", "DATABASE", "CLUSTER", "COLLECTION",
                "PARTITION", "FIELD", "LIMIT", "CONNECTION", "FILTER"}
DSL_OPERATORS = {"=", ">", "<", ">=", "<=", "LIKE", "IN", "(", ")", ",", ";", ":", "[", "]"}

# ------------- Utility Functions for DSL Files -------------
def load_dsl_tokens(file_path: str):
    """Load DSL tokens from a JSON file and update DSL_KEYWORDS and DSL_OPERATORS."""
    global DSL_KEYWORDS, DSL_OPERATORS
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            data = json.load(f)
        if "keywords" in data:
            DSL_KEYWORDS = set(token.upper() for token in data["keywords"])
        if "operators" in data:
            DSL_OPERATORS = set(data["operators"])
        print(f"Loaded DSL tokens from {file_path}")
    except Exception as e:
        print(f"Error loading DSL tokens file: {e}")

def load_dsl_grammar(file_path: str):
    """
    Stub function to load and process the DSL grammar file.
    In a full implementation, you could parse the .xtext file to extract tokens.
    For now, we just notify that the grammar file was provided.
    """
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            grammar_text = f.read()
        print(f"Loaded DSL grammar from {file_path}")
        # Future: Extract tokens from the grammar_text if desired.
    except Exception as e:
        print(f"Error loading DSL grammar file: {e}")

# ------------- Python Metrics Functions -------------
def compute_metrics(code: str) -> dict:
    metrics = {}
    
    # Lines of Code
    lines = code.splitlines()
    metrics['LinesOfCode'] = len(lines)
    
    # Tokenization for Python code
    tokens = list(tokenize.generate_tokens(io.StringIO(code).readline))
    filtered_tokens = [t for t in tokens if t.type != tokenize.ENDMARKER]
    metrics['TokenCount'] = len(filtered_tokens)
    
    # Count non-word characters (anything that is not alphanumeric or underscore)
    non_word_chars = re.findall(r'[^\w\s]', code)
    metrics['NonWordCharCount'] = len(non_word_chars)
    
    # Keywords (NumKw and NumDiffKw)
    kw_tokens = [t.string for t in filtered_tokens if t.type == tokenize.NAME and keyword.iskeyword(t.string)]
    metrics['NumKw'] = len(kw_tokens)
    metrics['NumDiffKw'] = len(set(kw_tokens))
    
    # AST-based metrics
    try:
        tree = ast.parse(code)
    except Exception as e:
        print(f"Error parsing code: {e}")
        tree = None
    if tree:
        metrics['MaxNesting'] = get_max_nesting(tree)
        metrics['CyclomaticComplexity'] = calculate_cyclomatic_complexity(tree)
        fun_calls, total_pars = count_function_calls(tree)
    else:
        metrics['MaxNesting'] = 0
        metrics['CyclomaticComplexity'] = 0
        fun_calls, total_pars = 0, 0
    metrics['NumFunCalls'] = fun_calls
    metrics['NumPars'] = total_pars
    metrics['AvgParPerCall'] = total_pars / fun_calls if fun_calls > 0 else 0
    
    # Count operations and operands for Halstead metrics.
    # Here, we treat operator tokens (from tokenize.OP) as operations,
    # and also count keywords (recognized as names) as operations.
    operations = []
    operands = []
    for t in filtered_tokens:
        if t.type == tokenize.OP:
            operations.append(t.string)
        elif t.type in (tokenize.NAME, tokenize.NUMBER, tokenize.STRING):
            if t.type == tokenize.NAME and keyword.iskeyword(t.string):
                operations.append(t.string)
            else:
                operands.append(t.string)
    N1 = len(operations)         # Total operations
    n1 = len(set(operations))     # Different operations
    N2 = len(operands)           # Total operands
    n2 = len(set(operands))      # Different operands

    metrics['NumOps'] = N1
    metrics['NumDiffOps'] = n1

    if (n1 + n2) > 0:
        metrics['HalsteadVolume'] = (N1 + N2) * math.log2(n1 + n2)
    else:
        metrics['HalsteadVolume'] = 0

    return metrics

def get_max_nesting(node, current_depth=0):
    """
    Recursively compute the maximum nesting depth of compound statements.
    Compound nodes include: If, For, While, Try, With, FunctionDef, AsyncFunctionDef, ClassDef.
    """
    max_depth = current_depth
    for child in ast.iter_child_nodes(node):
        if isinstance(child, (ast.If, ast.For, ast.While, ast.Try, ast.With,
                              ast.FunctionDef, ast.AsyncFunctionDef, ast.ClassDef)):
            child_depth = get_max_nesting(child, current_depth + 1)
        else:
            child_depth = get_max_nesting(child, current_depth)
        max_depth = max(max_depth, child_depth)
    return max_depth

def calculate_cyclomatic_complexity(node):
    """
    Compute cyclomatic complexity by counting decision points.
    """
    complexity = 0
    for child in ast.walk(node):
        if isinstance(child, (ast.If, ast.For, ast.While, ast.Try, ast.ExceptHandler, ast.With)):
            complexity += 1
        elif isinstance(child, ast.BoolOp):
            complexity += len(child.values) - 1  # Each extra operand adds a decision point
    return complexity + 1

def count_function_calls(node):
    """
    Count function call nodes and sum up the number of arguments.
    """
    call_count = 0
    total_params = 0
    for child in ast.walk(node):
        if isinstance(child, ast.Call):
            call_count += 1
            total_params += len(child.args) + len(child.keywords)
    return call_count, total_params

# ------------- DSL Metrics Functions -------------
def tokenize_dsl(code: str):
    """
    A simple regex-based tokenizer for a declarative DSL.
    This can be improved or replaced by a proper lexer if the DSL grammar is available.
    """
    # This regex captures words and non-whitespace punctuation.
    tokens = re.findall(r'\w+|[^\s\w]', code)
    return tokens

def compute_dsl_metrics(code: str) -> dict:
    metrics = {}
    
    # Lines of Code
    lines = code.splitlines()
    metrics['LinesOfCode'] = len(lines)
    
    # Tokenize DSL code
    tokens = tokenize_dsl(code)
    metrics['TokenCount'] = len(tokens)
    
    # Count non-word characters
    non_word_chars = re.findall(r'[^\w\s]', code)
    metrics['NonWordCharCount'] = len(non_word_chars)
    
    # Count DSL keywords (case-insensitive)
    kw_tokens = [token.upper() for token in tokens if token.upper() in DSL_KEYWORDS]
    metrics['NumKw'] = len(kw_tokens)
    metrics['NumDiffKw'] = len(set(kw_tokens))
    
    # For DSL, computing nesting and function calls depends on its syntax.
    # For now, we set these to zero or later extend using a DSL parser.
    metrics['MaxNesting'] = 0
    metrics['NumFunCalls'] = 0
    metrics['NumPars'] = 0
    metrics['AvgParPerCall'] = 0

    # Count operations and operands for DSL.
    # Tokens in DSL_OPERATORS are counted as operations.
    ops = [token for token in tokens if token.upper() in DSL_OPERATORS]
    # Everything that is not an operator or keyword is treated as an operand.
    operands = [token for token in tokens if token.upper() not in DSL_OPERATORS and token.upper() not in DSL_KEYWORDS]
    
    N1 = len(ops)      # Total operations
    n1 = len(set(ops)) # Different operations
    N2 = len(operands)      # Total operands
    n2 = len(set(operands)) # Different operands
    
    metrics['NumOps'] = N1
    metrics['NumDiffOps'] = n1
    
    if (n1 + n2) > 0:
        metrics['HalsteadVolume'] = (N1 + N2) * math.log2(n1 + n2)
    else:
        metrics['HalsteadVolume'] = 0

    return metrics

# ------------- Main Entry Point -------------
def analyze_file(filepath, is_dsl=False):
    try:
        with open(filepath, 'r', encoding='utf-8') as f:
            code = f.read()
    except Exception as e:
        print(f"Error reading {filepath}: {e}")
        return {}
    if is_dsl:
        return compute_dsl_metrics(code)
    else:
        return compute_metrics(code)

def analyze_directory(directory, is_dsl=False):
    results = {}
    for root, dirs, files in os.walk(directory):
        for file in files:
            # For DSL, you might want to check for a specific extension (e.g. '.dsl')
            if (not is_dsl and file.endswith(".py")) or (is_dsl and file.endswith(".dsl")):
                path = os.path.join(root, file)
                results[path] = analyze_file(path, is_dsl)
    return results

def main():
    parser = argparse.ArgumentParser(
        description="Analyze source files and compute code metrics."
    )
    parser.add_argument("path", help="Path to a file or directory.")
    parser.add_argument("--dsl", action="store_true",
                        help="Treat the file(s) as declarative DSL instead of Python.")
    parser.add_argument("--dsl_tokens", help="Path to a JSON file defining DSL tokens (keywords and operators).")
    parser.add_argument("--dsl_grammar", help="Path to a .xtext file with the DSL grammar.")
    args = parser.parse_args()

    # If DSL tokens file is provided, load it.
    if args.dsl and args.dsl_tokens:
        load_dsl_tokens(args.dsl_tokens)
    # If DSL grammar file is provided, load it (for potential future use).
    if args.dsl and args.dsl_grammar:
        load_dsl_grammar(args.dsl_grammar)

    if os.path.isfile(args.path):
        metrics = analyze_file(args.path, is_dsl=args.dsl)
        print(f"Metrics for {args.path}:")
        for key, value in metrics.items():
            print(f"{key}: {value}")
    elif os.path.isdir(args.path):
        results = analyze_directory(args.path, is_dsl=args.dsl)
        for filepath, metrics in results.items():
            print(f"\nMetrics for {filepath}:")
            for key, value in metrics.items():
                print(f"{key}: {value}")
    else:
        print("The specified path is not a valid file or directory.")

if __name__ == "__main__":
    main()
