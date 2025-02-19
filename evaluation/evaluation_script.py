#!/usr/bin/env python3
"""
This script computes several code metrics for Python source files:
- Lines of Code
- Max Nesting (compound statement depth)
- Token Count (excluding ENDMARKER)
- Non-Word Character Count (characters that are not alphanumeric or underscore)
- NumOperations and NumDifferentOperations (based on operator tokens)
- NumParameters (total parameters in function calls) and AvgParameter per call
- NumKeywords and NumDifferentKeywords (keywords in the code)
- Halstead Volume (using a simplified Halstead model)

Usage:
    python code_metrics.py path/to/file_or_directory
"""
import os
import sys
import ast
import io
import math
import re
import tokenize
import keyword
import argparse

def compute_metrics(code: str) -> dict:
    metrics = {}

    # 1. Lines of Code
    lines = code.splitlines()
    metrics['LinesOfCode'] = len(lines)

    # 2. Token Count (excluding ENDMARKER)
    tokens = list(tokenize.generate_tokens(io.StringIO(code).readline))
    filtered_tokens = [t for t in tokens if t.type != tokenize.ENDMARKER]
    metrics['TokenCount'] = len(filtered_tokens)

    # 3. Non-Word Character Count
    # \w matches [a-zA-Z0-9_], so [^\w\s] matches characters that are not word characters or whitespace.
    non_word_chars = re.findall(r'[^\w\s]', code)
    metrics['NonWordCharacterCount'] = len(non_word_chars)

    # 4. Keywords (using token type NAME and checking with keyword.iskeyword)
    keyword_tokens = [t.string for t in filtered_tokens if t.type == tokenize.NAME and keyword.iskeyword(t.string)]
    metrics['NumKeywords'] = len(keyword_tokens)
    metrics['NumDifferentKeywords'] = len(set(keyword_tokens))

    # 5. Max Nesting (using AST)
    try:
        tree = ast.parse(code)
    except Exception as e:
        print(f"Error parsing code: {e}")
        tree = None
    if tree:
        metrics['MaxNesting'] = get_max_nesting(tree)
    else:
        metrics['MaxNesting'] = 0

    # 6. Function Call Analysis (for parameters)
    if tree:
        op_calls, total_params = count_function_calls(tree)
    else:
        op_calls, total_params = 0, 0
    metrics['NumFunctionCalls'] = op_calls
    metrics['NumParameters'] = total_params
    metrics['AvgParameterPerCall'] = total_params / op_calls if op_calls > 0 else 0

    # 7. Halstead Metrics (Operators and Operands)
    operators = []
    operands = []
    for t in filtered_tokens:
        # Consider OP tokens as operators.
        if t.type == tokenize.OP:
            operators.append(t.string)
        # For NAME, NUMBER, and STRING tokens: if a NAME is a keyword, treat it as an operator.
        elif t.type in (tokenize.NAME, tokenize.NUMBER, tokenize.STRING):
            if t.type == tokenize.NAME and keyword.iskeyword(t.string):
                operators.append(t.string)
            else:
                operands.append(t.string)

    N1 = len(operators)         # Total operators
    n1 = len(set(operators))      # Distinct operators
    N2 = len(operands)           # Total operands
    n2 = len(set(operands))        # Distinct operands

    metrics['NumOperations'] = N1
    metrics['NumDifferentOperations'] = n1

    # Halstead Volume: (N1 + N2) * log2(n1 + n2)
    if (n1 + n2) > 0:
        halstead_volume = (N1 + N2) * math.log2(n1 + n2)
    else:
        halstead_volume = 0
    metrics['HalsteadVolume'] = halstead_volume

    return metrics

def get_max_nesting(node, current_depth=0):
    """
    Recursively compute the maximum nesting depth of compound statements.
    Compound nodes include: If, For, While, Try, With, FunctionDef, AsyncFunctionDef, ClassDef.
    """
    max_depth = current_depth
    for child in ast.iter_child_nodes(node):
        # Increase depth if child is a compound statement.
        if isinstance(child, (ast.If, ast.For, ast.While, ast.Try, ast.With,
                              ast.FunctionDef, ast.AsyncFunctionDef, ast.ClassDef)):
            child_depth = get_max_nesting(child, current_depth + 1)
        else:
            child_depth = get_max_nesting(child, current_depth)
        if child_depth > max_depth:
            max_depth = child_depth
    return max_depth

def count_function_calls(node):
    """
    Count all function call nodes in the AST and sum the number of arguments (positional + keyword).
    """
    call_count = 0
    total_params = 0
    for child in ast.walk(node):
        if isinstance(child, ast.Call):
            call_count += 1
            # For each call, count the positional arguments and keyword arguments.
            total_params += len(child.args) + len(child.keywords)
    return call_count, total_params

def analyze_file(filepath):
    try:
        with open(filepath, 'r', encoding='utf-8') as f:
            code = f.read()
    except Exception as e:
        print(f"Error reading {filepath}: {e}")
        return {}
    metrics = compute_metrics(code)
    return metrics

def analyze_directory(directory):
    results = {}
    for root, dirs, files in os.walk(directory):
        for file in files:
            if file.endswith(".py"):
                path = os.path.join(root, file)
                results[path] = analyze_file(path)
    return results

def main():
    parser = argparse.ArgumentParser(
        description="Analyze Python source files and compute code metrics."
    )
    parser.add_argument("path", help="Path to a Python file or directory of Python files.")
    args = parser.parse_args()

    if os.path.isfile(args.path):
        metrics = analyze_file(args.path)
        print(f"Metrics for {args.path}:")
        for key, value in metrics.items():
            print(f"{key}: {value}")
    elif os.path.isdir(args.path):
        results = analyze_directory(args.path)
        for filepath, metrics in results.items():
            print(f"\nMetrics for {filepath}:")
            for key, value in metrics.items():
                print(f"{key}: {value}")
    else:
        print("The specified path is not a valid file or directory.")

if __name__ == "__main__":
    main()
