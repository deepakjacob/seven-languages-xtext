/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class MongoBeansUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.mongobeans.ui.internal.MongoBeansActivator.getInstance().getInjector("org.xtext.mongobeans.MongoBeans");
	}
	
}
