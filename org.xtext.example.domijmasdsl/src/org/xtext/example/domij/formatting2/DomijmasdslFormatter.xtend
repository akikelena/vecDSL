/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.domij.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.domij.services.DomijmasdslGrammarAccess
import vecdslMM.Create
import vecdslMM.Script

class DomijmasdslFormatter extends AbstractFormatter2 {
	
	@Inject extension DomijmasdslGrammarAccess

	def dispatch void format(Script script, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (method : script.methods) {
			method.format
		}
	}

	def dispatch void format(Create _create, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		_create.ddlConcept.format
	}
	
	// TODO: implement for Alter, Drop, Insert, Update, Delete, VectorSearch, NonVectorSearch, VectorDatabase, Cluster, VectorCollection, VectorIndex, NonVectorField, VectorField
}
