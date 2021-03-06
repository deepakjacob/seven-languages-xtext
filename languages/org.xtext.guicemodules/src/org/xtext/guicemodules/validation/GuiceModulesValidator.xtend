/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.guicemodules.validation

import com.google.inject.BindingAnnotation
import com.google.inject.Inject
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.xbase.annotations.validation.XbaseWithAnnotationsJavaValidator
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation

import static org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage$Literals.*

class GuiceModulesValidator extends XbaseWithAnnotationsJavaValidator {
	
	@Inject extension TypeReferences

	@Check def checkAnnotationIsBindingAnnotation(XAnnotation it) {
		if (!annotationType.annotations.exists[ annotation.is(typeof(BindingAnnotation)) ])
			error("The annotation is not annotated with @BindingAnnotation", XANNOTATION__ANNOTATION_TYPE)
	}
}