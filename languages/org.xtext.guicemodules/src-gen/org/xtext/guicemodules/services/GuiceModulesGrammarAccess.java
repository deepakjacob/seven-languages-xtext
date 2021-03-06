/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.guicemodules.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.xbase.annotations.services.XbaseWithAnnotationsGrammarAccess;
import org.eclipse.xtext.xbase.services.XbaseGrammarAccess;
import org.eclipse.xtext.xbase.services.XtypeGrammarAccess;

@Singleton
public class GuiceModulesGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModulesASTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ModulesAST");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportASTParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cModulesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cModulesModuleASTParserRuleCall_1_0 = (RuleCall)cModulesAssignment_1.eContents().get(0);
		
		//ModulesAST:
		//	imports+=ImportAST* modules+=ModuleAST*;
		public ParserRule getRule() { return rule; }

		//imports+=ImportAST* modules+=ModuleAST*
		public Group getGroup() { return cGroup; }

		//imports+=ImportAST*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }

		//ImportAST
		public RuleCall getImportsImportASTParserRuleCall_0_0() { return cImportsImportASTParserRuleCall_0_0; }

		//modules+=ModuleAST*
		public Assignment getModulesAssignment_1() { return cModulesAssignment_1; }

		//ModuleAST
		public RuleCall getModulesModuleASTParserRuleCall_1_0() { return cModulesModuleASTParserRuleCall_1_0; }
	}

	public class ModuleASTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ModuleAST");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameQualifiedNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cMixinKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cMixinsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cMixinsModuleASTCrossReference_1_1_0 = (CrossReference)cMixinsAssignment_1_1.eContents().get(0);
		private final RuleCall cMixinsModuleASTQualifiedNameParserRuleCall_1_1_0_1 = (RuleCall)cMixinsModuleASTCrossReference_1_1_0.eContents().get(1);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cMixinsAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final CrossReference cMixinsModuleASTCrossReference_1_2_1_0 = (CrossReference)cMixinsAssignment_1_2_1.eContents().get(0);
		private final RuleCall cMixinsModuleASTQualifiedNameParserRuleCall_1_2_1_0_1 = (RuleCall)cMixinsModuleASTCrossReference_1_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBindingsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBindingsBindingASTParserRuleCall_3_0 = (RuleCall)cBindingsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ModuleAST:
		//	name=QualifiedName ("mixin" mixins+=[ModuleAST|QualifiedName] ("," mixins+=[ModuleAST|QualifiedName])*)? "{"
		//	bindings+=BindingAST* "}";
		public ParserRule getRule() { return rule; }

		//name=QualifiedName ("mixin" mixins+=[ModuleAST|QualifiedName] ("," mixins+=[ModuleAST|QualifiedName])*)? "{"
		//bindings+=BindingAST* "}"
		public Group getGroup() { return cGroup; }

		//name=QualifiedName
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_0_0() { return cNameQualifiedNameParserRuleCall_0_0; }

		//("mixin" mixins+=[ModuleAST|QualifiedName] ("," mixins+=[ModuleAST|QualifiedName])*)?
		public Group getGroup_1() { return cGroup_1; }

		//"mixin"
		public Keyword getMixinKeyword_1_0() { return cMixinKeyword_1_0; }

		//mixins+=[ModuleAST|QualifiedName]
		public Assignment getMixinsAssignment_1_1() { return cMixinsAssignment_1_1; }

		//[ModuleAST|QualifiedName]
		public CrossReference getMixinsModuleASTCrossReference_1_1_0() { return cMixinsModuleASTCrossReference_1_1_0; }

		//QualifiedName
		public RuleCall getMixinsModuleASTQualifiedNameParserRuleCall_1_1_0_1() { return cMixinsModuleASTQualifiedNameParserRuleCall_1_1_0_1; }

		//("," mixins+=[ModuleAST|QualifiedName])*
		public Group getGroup_1_2() { return cGroup_1_2; }

		//","
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }

		//mixins+=[ModuleAST|QualifiedName]
		public Assignment getMixinsAssignment_1_2_1() { return cMixinsAssignment_1_2_1; }

		//[ModuleAST|QualifiedName]
		public CrossReference getMixinsModuleASTCrossReference_1_2_1_0() { return cMixinsModuleASTCrossReference_1_2_1_0; }

		//QualifiedName
		public RuleCall getMixinsModuleASTQualifiedNameParserRuleCall_1_2_1_0_1() { return cMixinsModuleASTQualifiedNameParserRuleCall_1_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//bindings+=BindingAST*
		public Assignment getBindingsAssignment_3() { return cBindingsAssignment_3; }

		//BindingAST
		public RuleCall getBindingsBindingASTParserRuleCall_3_0() { return cBindingsBindingASTParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class BindingASTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BindingAST");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBindKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFromAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFromKeyASTParserRuleCall_1_0 = (RuleCall)cFromAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cToKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cToAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cToKeyASTParserRuleCall_2_0_1_0 = (RuleCall)cToAssignment_2_0_1.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cToInstanceKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cToInstanceAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cToInstanceXExpressionParserRuleCall_2_1_1_0 = (RuleCall)cToInstanceAssignment_2_1_1.eContents().get(0);
		
		//BindingAST:
		//	"bind" from=KeyAST ("to" to=KeyAST | "to-instance" toInstance=XExpression)?;
		public ParserRule getRule() { return rule; }

		//"bind" from=KeyAST ("to" to=KeyAST | "to-instance" toInstance=XExpression)?
		public Group getGroup() { return cGroup; }

		//"bind"
		public Keyword getBindKeyword_0() { return cBindKeyword_0; }

		//from=KeyAST
		public Assignment getFromAssignment_1() { return cFromAssignment_1; }

		//KeyAST
		public RuleCall getFromKeyASTParserRuleCall_1_0() { return cFromKeyASTParserRuleCall_1_0; }

		//("to" to=KeyAST | "to-instance" toInstance=XExpression)?
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//"to" to=KeyAST
		public Group getGroup_2_0() { return cGroup_2_0; }

		//"to"
		public Keyword getToKeyword_2_0_0() { return cToKeyword_2_0_0; }

		//to=KeyAST
		public Assignment getToAssignment_2_0_1() { return cToAssignment_2_0_1; }

		//KeyAST
		public RuleCall getToKeyASTParserRuleCall_2_0_1_0() { return cToKeyASTParserRuleCall_2_0_1_0; }

		//"to-instance" toInstance=XExpression
		public Group getGroup_2_1() { return cGroup_2_1; }

		//"to-instance"
		public Keyword getToInstanceKeyword_2_1_0() { return cToInstanceKeyword_2_1_0; }

		//toInstance=XExpression
		public Assignment getToInstanceAssignment_2_1_1() { return cToInstanceAssignment_2_1_1; }

		//XExpression
		public RuleCall getToInstanceXExpressionParserRuleCall_2_1_1_0() { return cToInstanceXExpressionParserRuleCall_2_1_1_0; }
	}

	public class KeyASTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "KeyAST");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationXAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeJvmTypeReferenceParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//KeyAST:
		//	annotation=XAnnotation? type=JvmTypeReference;
		public ParserRule getRule() { return rule; }

		//annotation=XAnnotation? type=JvmTypeReference
		public Group getGroup() { return cGroup; }

		//annotation=XAnnotation?
		public Assignment getAnnotationAssignment_0() { return cAnnotationAssignment_0; }

		//XAnnotation
		public RuleCall getAnnotationXAnnotationParserRuleCall_0_0() { return cAnnotationXAnnotationParserRuleCall_0_0; }

		//type=JvmTypeReference
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//JvmTypeReference
		public RuleCall getTypeJvmTypeReferenceParserRuleCall_1_0() { return cTypeJvmTypeReferenceParserRuleCall_1_0; }
	}

	public class ImportASTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ImportAST");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//ImportAST:
		//	"import" importedNamespace=QualifiedNameWithWildCard;
		public ParserRule getRule() { return rule; }

		//"import" importedNamespace=QualifiedNameWithWildCard
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedNamespace=QualifiedNameWithWildCard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }

		//QualifiedNameWithWildCard
		public RuleCall getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0; }
	}

	public class QualifiedNameWithWildCardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedNameWithWildCard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildCard:
		//	QualifiedName ".*"?;
		public ParserRule getRule() { return rule; }

		//QualifiedName ".*"?
		public Group getGroup() { return cGroup; }

		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }

		//".*"?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	
	
	private ModulesASTElements pModulesAST;
	private ModuleASTElements pModuleAST;
	private BindingASTElements pBindingAST;
	private KeyASTElements pKeyAST;
	private ImportASTElements pImportAST;
	private QualifiedNameWithWildCardElements pQualifiedNameWithWildCard;
	
	private final Grammar grammar;

	private XbaseWithAnnotationsGrammarAccess gaXbaseWithAnnotations;

	@Inject
	public GuiceModulesGrammarAccess(GrammarProvider grammarProvider,
		XbaseWithAnnotationsGrammarAccess gaXbaseWithAnnotations) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaXbaseWithAnnotations = gaXbaseWithAnnotations;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.guicemodules.GuiceModules".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public XbaseWithAnnotationsGrammarAccess getXbaseWithAnnotationsGrammarAccess() {
		return gaXbaseWithAnnotations;
	}

	
	//ModulesAST:
	//	imports+=ImportAST* modules+=ModuleAST*;
	public ModulesASTElements getModulesASTAccess() {
		return (pModulesAST != null) ? pModulesAST : (pModulesAST = new ModulesASTElements());
	}
	
	public ParserRule getModulesASTRule() {
		return getModulesASTAccess().getRule();
	}

	//ModuleAST:
	//	name=QualifiedName ("mixin" mixins+=[ModuleAST|QualifiedName] ("," mixins+=[ModuleAST|QualifiedName])*)? "{"
	//	bindings+=BindingAST* "}";
	public ModuleASTElements getModuleASTAccess() {
		return (pModuleAST != null) ? pModuleAST : (pModuleAST = new ModuleASTElements());
	}
	
	public ParserRule getModuleASTRule() {
		return getModuleASTAccess().getRule();
	}

	//BindingAST:
	//	"bind" from=KeyAST ("to" to=KeyAST | "to-instance" toInstance=XExpression)?;
	public BindingASTElements getBindingASTAccess() {
		return (pBindingAST != null) ? pBindingAST : (pBindingAST = new BindingASTElements());
	}
	
	public ParserRule getBindingASTRule() {
		return getBindingASTAccess().getRule();
	}

	//KeyAST:
	//	annotation=XAnnotation? type=JvmTypeReference;
	public KeyASTElements getKeyASTAccess() {
		return (pKeyAST != null) ? pKeyAST : (pKeyAST = new KeyASTElements());
	}
	
	public ParserRule getKeyASTRule() {
		return getKeyASTAccess().getRule();
	}

	//ImportAST:
	//	"import" importedNamespace=QualifiedNameWithWildCard;
	public ImportASTElements getImportASTAccess() {
		return (pImportAST != null) ? pImportAST : (pImportAST = new ImportASTElements());
	}
	
	public ParserRule getImportASTRule() {
		return getImportASTAccess().getRule();
	}

	//QualifiedNameWithWildCard:
	//	QualifiedName ".*"?;
	public QualifiedNameWithWildCardElements getQualifiedNameWithWildCardAccess() {
		return (pQualifiedNameWithWildCard != null) ? pQualifiedNameWithWildCard : (pQualifiedNameWithWildCard = new QualifiedNameWithWildCardElements());
	}
	
	public ParserRule getQualifiedNameWithWildCardRule() {
		return getQualifiedNameWithWildCardAccess().getRule();
	}

	//XAnnotation:
	//	{XAnnotation} "@" annotationType=[types::JvmAnnotationType|QualifiedName] ("("
	//	(elementValuePairs+=XAnnotationElementValuePair ("," elementValuePairs+=XAnnotationElementValuePair)* |
	//	value=XAnnotationElementValue)? ")")?;
	public XbaseWithAnnotationsGrammarAccess.XAnnotationElements getXAnnotationAccess() {
		return gaXbaseWithAnnotations.getXAnnotationAccess();
	}
	
	public ParserRule getXAnnotationRule() {
		return getXAnnotationAccess().getRule();
	}

	//XAnnotationElementValuePair:
	//	element=[types::JvmOperation|ValidID] "=" value=XAnnotationElementValue;
	public XbaseWithAnnotationsGrammarAccess.XAnnotationElementValuePairElements getXAnnotationElementValuePairAccess() {
		return gaXbaseWithAnnotations.getXAnnotationElementValuePairAccess();
	}
	
	public ParserRule getXAnnotationElementValuePairRule() {
		return getXAnnotationElementValuePairAccess().getRule();
	}

	//XAnnotationElementValueStringConcatenation returns xbase::XExpression:
	//	XAnnotationElementValue ({XAnnotationElementValueBinaryOperation.leftOperand=current} operator="+"
	//	rightOperand=XAnnotationElementValue)*;
	public XbaseWithAnnotationsGrammarAccess.XAnnotationElementValueStringConcatenationElements getXAnnotationElementValueStringConcatenationAccess() {
		return gaXbaseWithAnnotations.getXAnnotationElementValueStringConcatenationAccess();
	}
	
	public ParserRule getXAnnotationElementValueStringConcatenationRule() {
		return getXAnnotationElementValueStringConcatenationAccess().getRule();
	}

	//XAnnotationElementValue returns xbase::XExpression:
	//	XAnnotation | XAnnotationValueArray | XStringLiteral | XBooleanLiteral | XNumberLiteral | XTypeLiteral |
	//	XAnnotationValueFieldReference | "(" XAnnotationElementValueStringConcatenation ")";
	public XbaseWithAnnotationsGrammarAccess.XAnnotationElementValueElements getXAnnotationElementValueAccess() {
		return gaXbaseWithAnnotations.getXAnnotationElementValueAccess();
	}
	
	public ParserRule getXAnnotationElementValueRule() {
		return getXAnnotationElementValueAccess().getRule();
	}

	//XAnnotationValueFieldReference returns xbase::XExpression:
	//	{xbase::XFeatureCall} declaringType=[types::JvmDeclaredType|StaticQualifier]?
	//	feature=[types::JvmIdentifiableElement|IdOrSuper];
	public XbaseWithAnnotationsGrammarAccess.XAnnotationValueFieldReferenceElements getXAnnotationValueFieldReferenceAccess() {
		return gaXbaseWithAnnotations.getXAnnotationValueFieldReferenceAccess();
	}
	
	public ParserRule getXAnnotationValueFieldReferenceRule() {
		return getXAnnotationValueFieldReferenceAccess().getRule();
	}

	//XAnnotationValueArray returns xbase::XExpression:
	//	{XAnnotationValueArray} "{" values+=XAnnotationElementValue ("," values+=XAnnotationElementValue)* "}";
	public XbaseWithAnnotationsGrammarAccess.XAnnotationValueArrayElements getXAnnotationValueArrayAccess() {
		return gaXbaseWithAnnotations.getXAnnotationValueArrayAccess();
	}
	
	public ParserRule getXAnnotationValueArrayRule() {
		return getXAnnotationValueArrayAccess().getRule();
	}

	//XExpression:
	//	XAssignment;
	public XbaseGrammarAccess.XExpressionElements getXExpressionAccess() {
		return gaXbaseWithAnnotations.getXExpressionAccess();
	}
	
	public ParserRule getXExpressionRule() {
		return getXExpressionAccess().getRule();
	}

	//XAssignment returns XExpression:
	//	{XAssignment} / * (declaringType=[types::JvmDeclaredType] '::')? * / feature=[types::JvmIdentifiableElement|ValidID]
	//	OpSingleAssign value=XAssignment | XOrExpression (=> ({XBinaryOperation.leftOperand=current}
	//	feature=[types::JvmIdentifiableElement|OpMultiAssign]) rightOperand=XAssignment)?;
	public XbaseGrammarAccess.XAssignmentElements getXAssignmentAccess() {
		return gaXbaseWithAnnotations.getXAssignmentAccess();
	}
	
	public ParserRule getXAssignmentRule() {
		return getXAssignmentAccess().getRule();
	}

	//OpSingleAssign:
	//	"=";
	public XbaseGrammarAccess.OpSingleAssignElements getOpSingleAssignAccess() {
		return gaXbaseWithAnnotations.getOpSingleAssignAccess();
	}
	
	public ParserRule getOpSingleAssignRule() {
		return getOpSingleAssignAccess().getRule();
	}

	//OpMultiAssign:
	//	"+=";
	public XbaseGrammarAccess.OpMultiAssignElements getOpMultiAssignAccess() {
		return gaXbaseWithAnnotations.getOpMultiAssignAccess();
	}
	
	public ParserRule getOpMultiAssignRule() {
		return getOpMultiAssignAccess().getRule();
	}

	//XOrExpression returns XExpression:
	//	XAndExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOr])
	//	rightOperand=XAndExpression)*;
	public XbaseGrammarAccess.XOrExpressionElements getXOrExpressionAccess() {
		return gaXbaseWithAnnotations.getXOrExpressionAccess();
	}
	
	public ParserRule getXOrExpressionRule() {
		return getXOrExpressionAccess().getRule();
	}

	//OpOr:
	//	"||";
	public XbaseGrammarAccess.OpOrElements getOpOrAccess() {
		return gaXbaseWithAnnotations.getOpOrAccess();
	}
	
	public ParserRule getOpOrRule() {
		return getOpOrAccess().getRule();
	}

	//XAndExpression returns XExpression:
	//	XEqualityExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAnd])
	//	rightOperand=XEqualityExpression)*;
	public XbaseGrammarAccess.XAndExpressionElements getXAndExpressionAccess() {
		return gaXbaseWithAnnotations.getXAndExpressionAccess();
	}
	
	public ParserRule getXAndExpressionRule() {
		return getXAndExpressionAccess().getRule();
	}

	//OpAnd:
	//	"&&";
	public XbaseGrammarAccess.OpAndElements getOpAndAccess() {
		return gaXbaseWithAnnotations.getOpAndAccess();
	}
	
	public ParserRule getOpAndRule() {
		return getOpAndAccess().getRule();
	}

	//XEqualityExpression returns XExpression:
	//	XRelationalExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpEquality])
	//	rightOperand=XRelationalExpression)*;
	public XbaseGrammarAccess.XEqualityExpressionElements getXEqualityExpressionAccess() {
		return gaXbaseWithAnnotations.getXEqualityExpressionAccess();
	}
	
	public ParserRule getXEqualityExpressionRule() {
		return getXEqualityExpressionAccess().getRule();
	}

	//OpEquality:
	//	"==" | "!=";
	public XbaseGrammarAccess.OpEqualityElements getOpEqualityAccess() {
		return gaXbaseWithAnnotations.getOpEqualityAccess();
	}
	
	public ParserRule getOpEqualityRule() {
		return getOpEqualityAccess().getRule();
	}

	//XRelationalExpression returns XExpression:
	//	XOtherOperatorExpression (=> ({XInstanceOfExpression.expression=current} "instanceof") type=JvmTypeReference | =>
	//	({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpCompare])
	//	rightOperand=XOtherOperatorExpression)*;
	public XbaseGrammarAccess.XRelationalExpressionElements getXRelationalExpressionAccess() {
		return gaXbaseWithAnnotations.getXRelationalExpressionAccess();
	}
	
	public ParserRule getXRelationalExpressionRule() {
		return getXRelationalExpressionAccess().getRule();
	}

	//OpCompare:
	//	">=" | "<=" | ">" | "<";
	public XbaseGrammarAccess.OpCompareElements getOpCompareAccess() {
		return gaXbaseWithAnnotations.getOpCompareAccess();
	}
	
	public ParserRule getOpCompareRule() {
		return getOpCompareAccess().getRule();
	}

	//XOtherOperatorExpression returns XExpression:
	//	XAdditiveExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOther])
	//	rightOperand=XAdditiveExpression)*;
	public XbaseGrammarAccess.XOtherOperatorExpressionElements getXOtherOperatorExpressionAccess() {
		return gaXbaseWithAnnotations.getXOtherOperatorExpressionAccess();
	}
	
	public ParserRule getXOtherOperatorExpressionRule() {
		return getXOtherOperatorExpressionAccess().getRule();
	}

	//OpOther:
	//	"->" | ".." | "=>" | ">" (=> (">" ">") | ">") | "<" (=> ("<" "<") | "<") | "<>" | "?:" | "<=>";
	public XbaseGrammarAccess.OpOtherElements getOpOtherAccess() {
		return gaXbaseWithAnnotations.getOpOtherAccess();
	}
	
	public ParserRule getOpOtherRule() {
		return getOpOtherAccess().getRule();
	}

	//XAdditiveExpression returns XExpression:
	//	XMultiplicativeExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAdd])
	//	rightOperand=XMultiplicativeExpression)*;
	public XbaseGrammarAccess.XAdditiveExpressionElements getXAdditiveExpressionAccess() {
		return gaXbaseWithAnnotations.getXAdditiveExpressionAccess();
	}
	
	public ParserRule getXAdditiveExpressionRule() {
		return getXAdditiveExpressionAccess().getRule();
	}

	//OpAdd:
	//	"+" | "-";
	public XbaseGrammarAccess.OpAddElements getOpAddAccess() {
		return gaXbaseWithAnnotations.getOpAddAccess();
	}
	
	public ParserRule getOpAddRule() {
		return getOpAddAccess().getRule();
	}

	//XMultiplicativeExpression returns XExpression:
	//	XUnaryOperation (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMulti])
	//	rightOperand=XUnaryOperation)*;
	public XbaseGrammarAccess.XMultiplicativeExpressionElements getXMultiplicativeExpressionAccess() {
		return gaXbaseWithAnnotations.getXMultiplicativeExpressionAccess();
	}
	
	public ParserRule getXMultiplicativeExpressionRule() {
		return getXMultiplicativeExpressionAccess().getRule();
	}

	//OpMulti:
	//	"*" | "**" | "/" | "%";
	public XbaseGrammarAccess.OpMultiElements getOpMultiAccess() {
		return gaXbaseWithAnnotations.getOpMultiAccess();
	}
	
	public ParserRule getOpMultiRule() {
		return getOpMultiAccess().getRule();
	}

	//XUnaryOperation returns XExpression:
	//	{XUnaryOperation} feature=[types::JvmIdentifiableElement|OpUnary] operand=XCastedExpression | XCastedExpression;
	public XbaseGrammarAccess.XUnaryOperationElements getXUnaryOperationAccess() {
		return gaXbaseWithAnnotations.getXUnaryOperationAccess();
	}
	
	public ParserRule getXUnaryOperationRule() {
		return getXUnaryOperationAccess().getRule();
	}

	//OpUnary:
	//	"!" | "-" | "+";
	public XbaseGrammarAccess.OpUnaryElements getOpUnaryAccess() {
		return gaXbaseWithAnnotations.getOpUnaryAccess();
	}
	
	public ParserRule getOpUnaryRule() {
		return getOpUnaryAccess().getRule();
	}

	//XCastedExpression returns XExpression:
	//	XMemberFeatureCall (=> ({XCastedExpression.target=current} "as") type=JvmTypeReference)*;
	public XbaseGrammarAccess.XCastedExpressionElements getXCastedExpressionAccess() {
		return gaXbaseWithAnnotations.getXCastedExpressionAccess();
	}
	
	public ParserRule getXCastedExpressionRule() {
		return getXCastedExpressionAccess().getRule();
	}

	//XMemberFeatureCall returns XExpression:
	//	XPrimaryExpression (=> ({XAssignment.assignable=current} "." feature=[types::JvmIdentifiableElement|ValidID]
	//	OpSingleAssign) value=XAssignment | => ({XMemberFeatureCall.memberCallTarget=current} ("." | nullSafe?="?." |
	//	spreading?="*.")) ("<" typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")?
	//	feature=[types::JvmIdentifiableElement|ValidID] (=> explicitOperationCall?="(" (memberCallArguments+=XShortClosure |
	//	memberCallArguments+=XExpression ("," memberCallArguments+=XExpression)*)? ")")? memberCallArguments+=XClosure?)*;
	public XbaseGrammarAccess.XMemberFeatureCallElements getXMemberFeatureCallAccess() {
		return gaXbaseWithAnnotations.getXMemberFeatureCallAccess();
	}
	
	public ParserRule getXMemberFeatureCallRule() {
		return getXMemberFeatureCallAccess().getRule();
	}

	//XPrimaryExpression returns XExpression:
	//	XConstructorCall | XBlockExpression | XSwitchExpression | XFeatureCall | XLiteral | XIfExpression | XForLoopExpression
	//	| XWhileExpression | XDoWhileExpression | XThrowExpression | XReturnExpression | XTryCatchFinallyExpression |
	//	XParenthesizedExpression;
	public XbaseGrammarAccess.XPrimaryExpressionElements getXPrimaryExpressionAccess() {
		return gaXbaseWithAnnotations.getXPrimaryExpressionAccess();
	}
	
	public ParserRule getXPrimaryExpressionRule() {
		return getXPrimaryExpressionAccess().getRule();
	}

	//XLiteral returns XExpression:
	//	XClosure | XBooleanLiteral | XNumberLiteral | XNullLiteral | XStringLiteral | XTypeLiteral;
	public XbaseGrammarAccess.XLiteralElements getXLiteralAccess() {
		return gaXbaseWithAnnotations.getXLiteralAccess();
	}
	
	public ParserRule getXLiteralRule() {
		return getXLiteralAccess().getRule();
	}

	//XClosure returns XExpression:
	//	=> ({XClosure} "[") => ((declaredFormalParameters+=JvmFormalParameter (","
	//	declaredFormalParameters+=JvmFormalParameter)*)? explicitSyntax?="|")? expression=XExpressionInClosure "]";
	public XbaseGrammarAccess.XClosureElements getXClosureAccess() {
		return gaXbaseWithAnnotations.getXClosureAccess();
	}
	
	public ParserRule getXClosureRule() {
		return getXClosureAccess().getRule();
	}

	//XExpressionInClosure returns XExpression:
	//	{XBlockExpression} (expressions+=XExpressionInsideBlock ";"?)*;
	public XbaseGrammarAccess.XExpressionInClosureElements getXExpressionInClosureAccess() {
		return gaXbaseWithAnnotations.getXExpressionInClosureAccess();
	}
	
	public ParserRule getXExpressionInClosureRule() {
		return getXExpressionInClosureAccess().getRule();
	}

	//XShortClosure returns XExpression:
	//	=> ({XClosure} (declaredFormalParameters+=JvmFormalParameter ("," declaredFormalParameters+=JvmFormalParameter)*)?
	//	explicitSyntax?="|") expression=XExpression;
	public XbaseGrammarAccess.XShortClosureElements getXShortClosureAccess() {
		return gaXbaseWithAnnotations.getXShortClosureAccess();
	}
	
	public ParserRule getXShortClosureRule() {
		return getXShortClosureAccess().getRule();
	}

	//XParenthesizedExpression returns XExpression:
	//	"(" XExpression ")";
	public XbaseGrammarAccess.XParenthesizedExpressionElements getXParenthesizedExpressionAccess() {
		return gaXbaseWithAnnotations.getXParenthesizedExpressionAccess();
	}
	
	public ParserRule getXParenthesizedExpressionRule() {
		return getXParenthesizedExpressionAccess().getRule();
	}

	//XIfExpression returns XExpression:
	//	{XIfExpression} "if" "(" if=XExpression ")" then=XExpression ("else" else=XExpression)?;
	public XbaseGrammarAccess.XIfExpressionElements getXIfExpressionAccess() {
		return gaXbaseWithAnnotations.getXIfExpressionAccess();
	}
	
	public ParserRule getXIfExpressionRule() {
		return getXIfExpressionAccess().getRule();
	}

	//XSwitchExpression returns XExpression:
	//	{XSwitchExpression} "switch" (=> (localVarName=ValidID ":")? switch=XExpression | => ("(" localVarName=ValidID ":")
	//	switch=XExpression ")") "{" cases+=XCasePart+ ("default" ":" default=XExpression)? "}";
	public XbaseGrammarAccess.XSwitchExpressionElements getXSwitchExpressionAccess() {
		return gaXbaseWithAnnotations.getXSwitchExpressionAccess();
	}
	
	public ParserRule getXSwitchExpressionRule() {
		return getXSwitchExpressionAccess().getRule();
	}

	//XCasePart:
	//	typeGuard=JvmTypeReference? ("case" case=XExpression)? ":" then=XExpression;
	public XbaseGrammarAccess.XCasePartElements getXCasePartAccess() {
		return gaXbaseWithAnnotations.getXCasePartAccess();
	}
	
	public ParserRule getXCasePartRule() {
		return getXCasePartAccess().getRule();
	}

	//XForLoopExpression returns XExpression:
	//	{XForLoopExpression} "for" "(" declaredParam=JvmFormalParameter ":" forExpression=XExpression ")"
	//	eachExpression=XExpression;
	public XbaseGrammarAccess.XForLoopExpressionElements getXForLoopExpressionAccess() {
		return gaXbaseWithAnnotations.getXForLoopExpressionAccess();
	}
	
	public ParserRule getXForLoopExpressionRule() {
		return getXForLoopExpressionAccess().getRule();
	}

	//XWhileExpression returns XExpression:
	//	{XWhileExpression} "while" "(" predicate=XExpression ")" body=XExpression;
	public XbaseGrammarAccess.XWhileExpressionElements getXWhileExpressionAccess() {
		return gaXbaseWithAnnotations.getXWhileExpressionAccess();
	}
	
	public ParserRule getXWhileExpressionRule() {
		return getXWhileExpressionAccess().getRule();
	}

	//XDoWhileExpression returns XExpression:
	//	{XDoWhileExpression} "do" body=XExpression "while" "(" predicate=XExpression ")";
	public XbaseGrammarAccess.XDoWhileExpressionElements getXDoWhileExpressionAccess() {
		return gaXbaseWithAnnotations.getXDoWhileExpressionAccess();
	}
	
	public ParserRule getXDoWhileExpressionRule() {
		return getXDoWhileExpressionAccess().getRule();
	}

	//XBlockExpression returns XExpression:
	//	{XBlockExpression} "{" (expressions+=XExpressionInsideBlock ";"?)* "}";
	public XbaseGrammarAccess.XBlockExpressionElements getXBlockExpressionAccess() {
		return gaXbaseWithAnnotations.getXBlockExpressionAccess();
	}
	
	public ParserRule getXBlockExpressionRule() {
		return getXBlockExpressionAccess().getRule();
	}

	//XExpressionInsideBlock returns XExpression:
	//	XVariableDeclaration | XExpression;
	public XbaseGrammarAccess.XExpressionInsideBlockElements getXExpressionInsideBlockAccess() {
		return gaXbaseWithAnnotations.getXExpressionInsideBlockAccess();
	}
	
	public ParserRule getXExpressionInsideBlockRule() {
		return getXExpressionInsideBlockAccess().getRule();
	}

	//XVariableDeclaration returns XExpression:
	//	{XVariableDeclaration} (writeable?="var" | "val") (=> (type=JvmTypeReference name=ValidID) | name=ValidID) ("="
	//	right=XExpression)?;
	public XbaseGrammarAccess.XVariableDeclarationElements getXVariableDeclarationAccess() {
		return gaXbaseWithAnnotations.getXVariableDeclarationAccess();
	}
	
	public ParserRule getXVariableDeclarationRule() {
		return getXVariableDeclarationAccess().getRule();
	}

	//JvmFormalParameter returns types::JvmFormalParameter:
	//	parameterType=JvmTypeReference? name=ValidID;
	public XbaseGrammarAccess.JvmFormalParameterElements getJvmFormalParameterAccess() {
		return gaXbaseWithAnnotations.getJvmFormalParameterAccess();
	}
	
	public ParserRule getJvmFormalParameterRule() {
		return getJvmFormalParameterAccess().getRule();
	}

	//FullJvmFormalParameter returns types::JvmFormalParameter:
	//	parameterType=JvmTypeReference name=ValidID;
	public XbaseGrammarAccess.FullJvmFormalParameterElements getFullJvmFormalParameterAccess() {
		return gaXbaseWithAnnotations.getFullJvmFormalParameterAccess();
	}
	
	public ParserRule getFullJvmFormalParameterRule() {
		return getFullJvmFormalParameterAccess().getRule();
	}

	//XFeatureCall returns XExpression:
	//	{XFeatureCall} declaringType=[types::JvmDeclaredType|StaticQualifier]? ("<" typeArguments+=JvmArgumentTypeReference
	//	("," typeArguments+=JvmArgumentTypeReference)* ">")? feature=[types::JvmIdentifiableElement|IdOrSuper] (=>
	//	explicitOperationCall?="(" (featureCallArguments+=XShortClosure | featureCallArguments+=XExpression (","
	//	featureCallArguments+=XExpression)*)? ")")? featureCallArguments+=XClosure?;
	public XbaseGrammarAccess.XFeatureCallElements getXFeatureCallAccess() {
		return gaXbaseWithAnnotations.getXFeatureCallAccess();
	}
	
	public ParserRule getXFeatureCallRule() {
		return getXFeatureCallAccess().getRule();
	}

	//IdOrSuper:
	//	ValidID | "super";
	public XbaseGrammarAccess.IdOrSuperElements getIdOrSuperAccess() {
		return gaXbaseWithAnnotations.getIdOrSuperAccess();
	}
	
	public ParserRule getIdOrSuperRule() {
		return getIdOrSuperAccess().getRule();
	}

	//// This is a workaround since ANTLR will not be able to resolve
	//// StaticQualifier: ValidID ('::' ValidID)*; and XFeatureCall: (StaticQualifier '::')? ValidID
	//// Make sure to change the value converter if you change the syntax of the StaticQualifier
	//StaticQualifier:
	//	(ValidID "::")+;
	public XbaseGrammarAccess.StaticQualifierElements getStaticQualifierAccess() {
		return gaXbaseWithAnnotations.getStaticQualifierAccess();
	}
	
	public ParserRule getStaticQualifierRule() {
		return getStaticQualifierAccess().getRule();
	}

	//XConstructorCall returns XExpression:
	//	{XConstructorCall} "new" constructor=[types::JvmConstructor|QualifiedName] ("<"
	//	typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")? ("("
	//	(arguments+=XShortClosure | arguments+=XExpression ("," arguments+=XExpression)*)? ")")? arguments+=XClosure?;
	public XbaseGrammarAccess.XConstructorCallElements getXConstructorCallAccess() {
		return gaXbaseWithAnnotations.getXConstructorCallAccess();
	}
	
	public ParserRule getXConstructorCallRule() {
		return getXConstructorCallAccess().getRule();
	}

	//XBooleanLiteral returns XExpression:
	//	{XBooleanLiteral} ("false" | isTrue?="true");
	public XbaseGrammarAccess.XBooleanLiteralElements getXBooleanLiteralAccess() {
		return gaXbaseWithAnnotations.getXBooleanLiteralAccess();
	}
	
	public ParserRule getXBooleanLiteralRule() {
		return getXBooleanLiteralAccess().getRule();
	}

	//XNullLiteral returns XExpression:
	//	{XNullLiteral} "null";
	public XbaseGrammarAccess.XNullLiteralElements getXNullLiteralAccess() {
		return gaXbaseWithAnnotations.getXNullLiteralAccess();
	}
	
	public ParserRule getXNullLiteralRule() {
		return getXNullLiteralAccess().getRule();
	}

	//XNumberLiteral returns XExpression:
	//	{XNumberLiteral} value=Number;
	public XbaseGrammarAccess.XNumberLiteralElements getXNumberLiteralAccess() {
		return gaXbaseWithAnnotations.getXNumberLiteralAccess();
	}
	
	public ParserRule getXNumberLiteralRule() {
		return getXNumberLiteralAccess().getRule();
	}

	//XStringLiteral returns XExpression:
	//	{XStringLiteral} value=STRING;
	public XbaseGrammarAccess.XStringLiteralElements getXStringLiteralAccess() {
		return gaXbaseWithAnnotations.getXStringLiteralAccess();
	}
	
	public ParserRule getXStringLiteralRule() {
		return getXStringLiteralAccess().getRule();
	}

	//XTypeLiteral returns XExpression:
	//	{XTypeLiteral} "typeof" "(" type=[types::JvmType|QualifiedName] ")";
	public XbaseGrammarAccess.XTypeLiteralElements getXTypeLiteralAccess() {
		return gaXbaseWithAnnotations.getXTypeLiteralAccess();
	}
	
	public ParserRule getXTypeLiteralRule() {
		return getXTypeLiteralAccess().getRule();
	}

	//XThrowExpression returns XExpression:
	//	{XThrowExpression} "throw" expression=XExpression;
	public XbaseGrammarAccess.XThrowExpressionElements getXThrowExpressionAccess() {
		return gaXbaseWithAnnotations.getXThrowExpressionAccess();
	}
	
	public ParserRule getXThrowExpressionRule() {
		return getXThrowExpressionAccess().getRule();
	}

	//XReturnExpression returns XExpression:
	//	{XReturnExpression} "return" => expression=XExpression?;
	public XbaseGrammarAccess.XReturnExpressionElements getXReturnExpressionAccess() {
		return gaXbaseWithAnnotations.getXReturnExpressionAccess();
	}
	
	public ParserRule getXReturnExpressionRule() {
		return getXReturnExpressionAccess().getRule();
	}

	//XTryCatchFinallyExpression returns XExpression:
	//	{XTryCatchFinallyExpression} "try" expression=XExpression (catchClauses+=XCatchClause+ ("finally"
	//	finallyExpression=XExpression)? | "finally" finallyExpression=XExpression);
	public XbaseGrammarAccess.XTryCatchFinallyExpressionElements getXTryCatchFinallyExpressionAccess() {
		return gaXbaseWithAnnotations.getXTryCatchFinallyExpressionAccess();
	}
	
	public ParserRule getXTryCatchFinallyExpressionRule() {
		return getXTryCatchFinallyExpressionAccess().getRule();
	}

	//XCatchClause:
	//	"catch" "(" declaredParam=FullJvmFormalParameter ")" expression=XExpression;
	public XbaseGrammarAccess.XCatchClauseElements getXCatchClauseAccess() {
		return gaXbaseWithAnnotations.getXCatchClauseAccess();
	}
	
	public ParserRule getXCatchClauseRule() {
		return getXCatchClauseAccess().getRule();
	}

	//QualifiedName:
	//	ValidID ("." ValidID)*;
	public XbaseGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaXbaseWithAnnotations.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//Number hidden():
	//	HEX | (INT | DECIMAL) ("." (INT | DECIMAL))?;
	public XbaseGrammarAccess.NumberElements getNumberAccess() {
		return gaXbaseWithAnnotations.getNumberAccess();
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}

	//terminal HEX:
	//	("0x" | "0X") ("0".."9" | "a".."f" | "A".."F" | "_")+ ("#" (("b" | "B") ("i" | "I") | ("l" | "L")))?;
	public TerminalRule getHEXRule() {
		return gaXbaseWithAnnotations.getHEXRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9" ("0".."9" | "_")*;
	public TerminalRule getINTRule() {
		return gaXbaseWithAnnotations.getINTRule();
	} 

	//terminal DECIMAL:
	//	INT (("e" | "E") ("+" | "-")? INT)? (("b" | "B") ("i" | "I" | "d" | "D") | ("l" | "L" | "d" | "D" | "f" | "F"))?;
	public TerminalRule getDECIMALRule() {
		return gaXbaseWithAnnotations.getDECIMALRule();
	} 

	//JvmTypeReference:
	//	JvmParameterizedTypeReference => ({JvmGenericArrayTypeReference.componentType=current} "[" "]")* | XFunctionTypeRef;
	public XtypeGrammarAccess.JvmTypeReferenceElements getJvmTypeReferenceAccess() {
		return gaXbaseWithAnnotations.getJvmTypeReferenceAccess();
	}
	
	public ParserRule getJvmTypeReferenceRule() {
		return getJvmTypeReferenceAccess().getRule();
	}

	//XFunctionTypeRef:
	//	("(" (paramTypes+=JvmTypeReference ("," paramTypes+=JvmTypeReference)*)? ")")? "=>" returnType=JvmTypeReference;
	public XtypeGrammarAccess.XFunctionTypeRefElements getXFunctionTypeRefAccess() {
		return gaXbaseWithAnnotations.getXFunctionTypeRefAccess();
	}
	
	public ParserRule getXFunctionTypeRefRule() {
		return getXFunctionTypeRefAccess().getRule();
	}

	//JvmParameterizedTypeReference:
	//	type=[JvmType|QualifiedName] ("<" arguments+=JvmArgumentTypeReference ("," arguments+=JvmArgumentTypeReference)*
	//	">")?;
	public XtypeGrammarAccess.JvmParameterizedTypeReferenceElements getJvmParameterizedTypeReferenceAccess() {
		return gaXbaseWithAnnotations.getJvmParameterizedTypeReferenceAccess();
	}
	
	public ParserRule getJvmParameterizedTypeReferenceRule() {
		return getJvmParameterizedTypeReferenceAccess().getRule();
	}

	//JvmArgumentTypeReference returns JvmTypeReference:
	//	JvmTypeReference | JvmWildcardTypeReference;
	public XtypeGrammarAccess.JvmArgumentTypeReferenceElements getJvmArgumentTypeReferenceAccess() {
		return gaXbaseWithAnnotations.getJvmArgumentTypeReferenceAccess();
	}
	
	public ParserRule getJvmArgumentTypeReferenceRule() {
		return getJvmArgumentTypeReferenceAccess().getRule();
	}

	//JvmWildcardTypeReference:
	//	{JvmWildcardTypeReference} "?" (constraints+=JvmUpperBound | constraints+=JvmLowerBound)?;
	public XtypeGrammarAccess.JvmWildcardTypeReferenceElements getJvmWildcardTypeReferenceAccess() {
		return gaXbaseWithAnnotations.getJvmWildcardTypeReferenceAccess();
	}
	
	public ParserRule getJvmWildcardTypeReferenceRule() {
		return getJvmWildcardTypeReferenceAccess().getRule();
	}

	//JvmUpperBound:
	//	"extends" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundElements getJvmUpperBoundAccess() {
		return gaXbaseWithAnnotations.getJvmUpperBoundAccess();
	}
	
	public ParserRule getJvmUpperBoundRule() {
		return getJvmUpperBoundAccess().getRule();
	}

	//JvmUpperBoundAnded returns JvmUpperBound:
	//	"&" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundAndedElements getJvmUpperBoundAndedAccess() {
		return gaXbaseWithAnnotations.getJvmUpperBoundAndedAccess();
	}
	
	public ParserRule getJvmUpperBoundAndedRule() {
		return getJvmUpperBoundAndedAccess().getRule();
	}

	//JvmLowerBound:
	//	"super" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundElements getJvmLowerBoundAccess() {
		return gaXbaseWithAnnotations.getJvmLowerBoundAccess();
	}
	
	public ParserRule getJvmLowerBoundRule() {
		return getJvmLowerBoundAccess().getRule();
	}

	//JvmTypeParameter:
	//	name=ValidID (constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded* | constraints+=JvmLowerBound)?;
	public XtypeGrammarAccess.JvmTypeParameterElements getJvmTypeParameterAccess() {
		return gaXbaseWithAnnotations.getJvmTypeParameterAccess();
	}
	
	public ParserRule getJvmTypeParameterRule() {
		return getJvmTypeParameterAccess().getRule();
	}

	//ValidID:
	//	ID;
	public XtypeGrammarAccess.ValidIDElements getValidIDAccess() {
		return gaXbaseWithAnnotations.getValidIDAccess();
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "$" | "_") ("a".."z" | "A".."Z" | "$" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaXbaseWithAnnotations.getIDRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaXbaseWithAnnotations.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaXbaseWithAnnotations.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaXbaseWithAnnotations.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaXbaseWithAnnotations.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaXbaseWithAnnotations.getANY_OTHERRule();
	} 
}
