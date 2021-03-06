/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.template.services;

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
public class TemplateGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class TemplateFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TemplateFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLessThanSignExclamationMarkHyphenMinusHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftPointingDoubleAngleQuotationMarkKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cPackageKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cPackageAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPackageQualifiedNameParserRuleCall_2_1_0 = (RuleCall)cPackageAssignment_2_1.eContents().get(0);
		private final Assignment cImportsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cImportsImportParserRuleCall_3_0 = (RuleCall)cImportsAssignment_3.eContents().get(0);
		private final Assignment cParamsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParamsParameterParserRuleCall_4_0 = (RuleCall)cParamsAssignment_4.eContents().get(0);
		private final Assignment cBodyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBodyRichStringParserRuleCall_5_0 = (RuleCall)cBodyAssignment_5.eContents().get(0);
		
		//TemplateFile:
		//	"<!--" "«" ("package" package=QualifiedName)? imports+=Import* params+=Parameter* body=RichString;
		public ParserRule getRule() { return rule; }

		//"<!--" "«" ("package" package=QualifiedName)? imports+=Import* params+=Parameter* body=RichString
		public Group getGroup() { return cGroup; }

		//"<!--"
		public Keyword getLessThanSignExclamationMarkHyphenMinusHyphenMinusKeyword_0() { return cLessThanSignExclamationMarkHyphenMinusHyphenMinusKeyword_0; }

		//"«"
		public Keyword getLeftPointingDoubleAngleQuotationMarkKeyword_1() { return cLeftPointingDoubleAngleQuotationMarkKeyword_1; }

		//("package" package=QualifiedName)?
		public Group getGroup_2() { return cGroup_2; }

		//"package"
		public Keyword getPackageKeyword_2_0() { return cPackageKeyword_2_0; }

		//package=QualifiedName
		public Assignment getPackageAssignment_2_1() { return cPackageAssignment_2_1; }

		//QualifiedName
		public RuleCall getPackageQualifiedNameParserRuleCall_2_1_0() { return cPackageQualifiedNameParserRuleCall_2_1_0; }

		//imports+=Import*
		public Assignment getImportsAssignment_3() { return cImportsAssignment_3; }

		//Import
		public RuleCall getImportsImportParserRuleCall_3_0() { return cImportsImportParserRuleCall_3_0; }

		//params+=Parameter*
		public Assignment getParamsAssignment_4() { return cParamsAssignment_4; }

		//Parameter
		public RuleCall getParamsParameterParserRuleCall_4_0() { return cParamsParameterParserRuleCall_4_0; }

		//body=RichString
		public Assignment getBodyAssignment_5() { return cBodyAssignment_5; }

		//RichString
		public RuleCall getBodyRichStringParserRuleCall_5_0() { return cBodyRichStringParserRuleCall_5_0; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	"import" importedNamespace=QualifiedName;
		public ParserRule getRule() { return rule; }

		//"import" importedNamespace=QualifiedName
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedNamespace=QualifiedName
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }

		//QualifiedName
		public RuleCall getImportedNamespaceQualifiedNameParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameParserRuleCall_1_0; }
	}

	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsXAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Keyword cParamKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeJvmTypeReferenceParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cEqualsSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDefaultexpAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDefaultexpXExpressionParserRuleCall_4_1_0 = (RuleCall)cDefaultexpAssignment_4_1.eContents().get(0);
		
		//Parameter:
		//	annotations+=XAnnotation* "param" type=JvmTypeReference? name=ID ("=" defaultexp=XExpression)?;
		public ParserRule getRule() { return rule; }

		//annotations+=XAnnotation* "param" type=JvmTypeReference? name=ID ("=" defaultexp=XExpression)?
		public Group getGroup() { return cGroup; }

		//annotations+=XAnnotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }

		//XAnnotation
		public RuleCall getAnnotationsXAnnotationParserRuleCall_0_0() { return cAnnotationsXAnnotationParserRuleCall_0_0; }

		//"param"
		public Keyword getParamKeyword_1() { return cParamKeyword_1; }

		//type=JvmTypeReference?
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//JvmTypeReference
		public RuleCall getTypeJvmTypeReferenceParserRuleCall_2_0() { return cTypeJvmTypeReferenceParserRuleCall_2_0; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//("=" defaultexp=XExpression)?
		public Group getGroup_4() { return cGroup_4; }

		//"="
		public Keyword getEqualsSignKeyword_4_0() { return cEqualsSignKeyword_4_0; }

		//defaultexp=XExpression
		public Assignment getDefaultexpAssignment_4_1() { return cDefaultexpAssignment_4_1; }

		//XExpression
		public RuleCall getDefaultexpXExpressionParserRuleCall_4_1_0() { return cDefaultexpXExpressionParserRuleCall_4_1_0; }
	}

	public class RichStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RichString");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRichStringAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cExpressionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionsRichStringLiteralParserRuleCall_1_0 = (RuleCall)cExpressionsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cExpressionsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cExpressionsRichStringPartParserRuleCall_2_0_0 = (RuleCall)cExpressionsAssignment_2_0.eContents().get(0);
		private final Assignment cExpressionsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cExpressionsRichStringLiteralParserRuleCall_2_1_0 = (RuleCall)cExpressionsAssignment_2_1.eContents().get(0);
		
		//RichString returns xbase::XBlockExpression:
		//	{RichString} expressions+=RichStringLiteral (expressions+=RichStringPart expressions+=RichStringLiteral)*;
		public ParserRule getRule() { return rule; }

		//{RichString} expressions+=RichStringLiteral (expressions+=RichStringPart expressions+=RichStringLiteral)*
		public Group getGroup() { return cGroup; }

		//{RichString}
		public Action getRichStringAction_0() { return cRichStringAction_0; }

		//expressions+=RichStringLiteral
		public Assignment getExpressionsAssignment_1() { return cExpressionsAssignment_1; }

		//RichStringLiteral
		public RuleCall getExpressionsRichStringLiteralParserRuleCall_1_0() { return cExpressionsRichStringLiteralParserRuleCall_1_0; }

		//(expressions+=RichStringPart expressions+=RichStringLiteral)*
		public Group getGroup_2() { return cGroup_2; }

		//expressions+=RichStringPart
		public Assignment getExpressionsAssignment_2_0() { return cExpressionsAssignment_2_0; }

		//RichStringPart
		public RuleCall getExpressionsRichStringPartParserRuleCall_2_0_0() { return cExpressionsRichStringPartParserRuleCall_2_0_0; }

		//expressions+=RichStringLiteral
		public Assignment getExpressionsAssignment_2_1() { return cExpressionsAssignment_2_1; }

		//RichStringLiteral
		public RuleCall getExpressionsRichStringLiteralParserRuleCall_2_1_0() { return cExpressionsRichStringLiteralParserRuleCall_2_1_0; }
	}

	public class RichStringLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RichStringLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRichStringLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueTEXTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//RichStringLiteral returns xbase::XStringLiteral:
		//	{RichStringLiteral} value=TEXT;
		public ParserRule getRule() { return rule; }

		//{RichStringLiteral} value=TEXT
		public Group getGroup() { return cGroup; }

		//{RichStringLiteral}
		public Action getRichStringLiteralAction_0() { return cRichStringLiteralAction_0; }

		//value=TEXT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//TEXT
		public RuleCall getValueTEXTTerminalRuleCall_1_0() { return cValueTEXTTerminalRuleCall_1_0; }
	}

	public class RichStringPartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RichStringPart");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cXExpressionInsideBlockParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRichStringForLoopParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRichStringIfParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//RichStringPart returns xbase::XExpression:
		//	XExpressionInsideBlock | RichStringForLoop | RichStringIf;
		public ParserRule getRule() { return rule; }

		//XExpressionInsideBlock | RichStringForLoop | RichStringIf
		public Alternatives getAlternatives() { return cAlternatives; }

		//XExpressionInsideBlock
		public RuleCall getXExpressionInsideBlockParserRuleCall_0() { return cXExpressionInsideBlockParserRuleCall_0; }

		//RichStringForLoop
		public RuleCall getRichStringForLoopParserRuleCall_1() { return cRichStringForLoopParserRuleCall_1; }

		//RichStringIf
		public RuleCall getRichStringIfParserRuleCall_2() { return cRichStringIfParserRuleCall_2; }
	}

	public class RichStringForLoopElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RichStringForLoop");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRichStringForLoopAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFORKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDeclaredParamAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDeclaredParamJvmFormalParameterParserRuleCall_2_0 = (RuleCall)cDeclaredParamAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cForExpressionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cForExpressionXExpressionParserRuleCall_4_0 = (RuleCall)cForExpressionAssignment_4.eContents().get(0);
		private final Assignment cEachExpressionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cEachExpressionRichStringParserRuleCall_5_0 = (RuleCall)cEachExpressionAssignment_5.eContents().get(0);
		private final Keyword cENDFORKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//RichStringForLoop returns xbase::XForLoopExpression:
		//	{RichStringForLoop} "FOR" declaredParam=JvmFormalParameter ":" forExpression=XExpression eachExpression=RichString
		//	"ENDFOR";
		public ParserRule getRule() { return rule; }

		//{RichStringForLoop} "FOR" declaredParam=JvmFormalParameter ":" forExpression=XExpression eachExpression=RichString
		//"ENDFOR"
		public Group getGroup() { return cGroup; }

		//{RichStringForLoop}
		public Action getRichStringForLoopAction_0() { return cRichStringForLoopAction_0; }

		//"FOR"
		public Keyword getFORKeyword_1() { return cFORKeyword_1; }

		//declaredParam=JvmFormalParameter
		public Assignment getDeclaredParamAssignment_2() { return cDeclaredParamAssignment_2; }

		//JvmFormalParameter
		public RuleCall getDeclaredParamJvmFormalParameterParserRuleCall_2_0() { return cDeclaredParamJvmFormalParameterParserRuleCall_2_0; }

		//":"
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }

		//forExpression=XExpression
		public Assignment getForExpressionAssignment_4() { return cForExpressionAssignment_4; }

		//XExpression
		public RuleCall getForExpressionXExpressionParserRuleCall_4_0() { return cForExpressionXExpressionParserRuleCall_4_0; }

		//eachExpression=RichString
		public Assignment getEachExpressionAssignment_5() { return cEachExpressionAssignment_5; }

		//RichString
		public RuleCall getEachExpressionRichStringParserRuleCall_5_0() { return cEachExpressionRichStringParserRuleCall_5_0; }

		//"ENDFOR"
		public Keyword getENDFORKeyword_6() { return cENDFORKeyword_6; }
	}

	public class RichStringIfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RichStringIf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRichStringIfAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cIFKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIfAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIfXExpressionParserRuleCall_2_0 = (RuleCall)cIfAssignment_2.eContents().get(0);
		private final Assignment cThenAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cThenRichStringParserRuleCall_3_0 = (RuleCall)cThenAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cElseAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cElseRichStringElseIfParserRuleCall_4_0_0 = (RuleCall)cElseAssignment_4_0.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cAlternatives_4.eContents().get(1);
		private final Keyword cELSEKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cElseAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cElseRichStringParserRuleCall_4_1_1_0 = (RuleCall)cElseAssignment_4_1_1.eContents().get(0);
		private final Keyword cENDIFKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//RichStringIf returns xbase::XIfExpression:
		//	{RichStringIf} "IF" if=XExpression then=RichString (else=RichStringElseIf | "ELSE" else=RichString)? "ENDIF";
		public ParserRule getRule() { return rule; }

		//{RichStringIf} "IF" if=XExpression then=RichString (else=RichStringElseIf | "ELSE" else=RichString)? "ENDIF"
		public Group getGroup() { return cGroup; }

		//{RichStringIf}
		public Action getRichStringIfAction_0() { return cRichStringIfAction_0; }

		//"IF"
		public Keyword getIFKeyword_1() { return cIFKeyword_1; }

		//if=XExpression
		public Assignment getIfAssignment_2() { return cIfAssignment_2; }

		//XExpression
		public RuleCall getIfXExpressionParserRuleCall_2_0() { return cIfXExpressionParserRuleCall_2_0; }

		//then=RichString
		public Assignment getThenAssignment_3() { return cThenAssignment_3; }

		//RichString
		public RuleCall getThenRichStringParserRuleCall_3_0() { return cThenRichStringParserRuleCall_3_0; }

		//(else=RichStringElseIf | "ELSE" else=RichString)?
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//else=RichStringElseIf
		public Assignment getElseAssignment_4_0() { return cElseAssignment_4_0; }

		//RichStringElseIf
		public RuleCall getElseRichStringElseIfParserRuleCall_4_0_0() { return cElseRichStringElseIfParserRuleCall_4_0_0; }

		//"ELSE" else=RichString
		public Group getGroup_4_1() { return cGroup_4_1; }

		//"ELSE"
		public Keyword getELSEKeyword_4_1_0() { return cELSEKeyword_4_1_0; }

		//else=RichString
		public Assignment getElseAssignment_4_1_1() { return cElseAssignment_4_1_1; }

		//RichString
		public RuleCall getElseRichStringParserRuleCall_4_1_1_0() { return cElseRichStringParserRuleCall_4_1_1_0; }

		//"ENDIF"
		public Keyword getENDIFKeyword_5() { return cENDIFKeyword_5; }
	}

	public class RichStringElseIfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RichStringElseIf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRichStringIfAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cELSEIFKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIfAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIfXExpressionParserRuleCall_2_0 = (RuleCall)cIfAssignment_2.eContents().get(0);
		private final Assignment cThenAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cThenRichStringParserRuleCall_3_0 = (RuleCall)cThenAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cElseAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cElseRichStringElseIfParserRuleCall_4_0_0 = (RuleCall)cElseAssignment_4_0.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cAlternatives_4.eContents().get(1);
		private final Keyword cELSEKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cElseAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cElseRichStringParserRuleCall_4_1_1_0 = (RuleCall)cElseAssignment_4_1_1.eContents().get(0);
		
		//RichStringElseIf returns xbase::XIfExpression:
		//	{RichStringIf} "ELSEIF" if=XExpression then=RichString (else=RichStringElseIf | "ELSE" else=RichString)?;
		public ParserRule getRule() { return rule; }

		//{RichStringIf} "ELSEIF" if=XExpression then=RichString (else=RichStringElseIf | "ELSE" else=RichString)?
		public Group getGroup() { return cGroup; }

		//{RichStringIf}
		public Action getRichStringIfAction_0() { return cRichStringIfAction_0; }

		//"ELSEIF"
		public Keyword getELSEIFKeyword_1() { return cELSEIFKeyword_1; }

		//if=XExpression
		public Assignment getIfAssignment_2() { return cIfAssignment_2; }

		//XExpression
		public RuleCall getIfXExpressionParserRuleCall_2_0() { return cIfXExpressionParserRuleCall_2_0; }

		//then=RichString
		public Assignment getThenAssignment_3() { return cThenAssignment_3; }

		//RichString
		public RuleCall getThenRichStringParserRuleCall_3_0() { return cThenRichStringParserRuleCall_3_0; }

		//(else=RichStringElseIf | "ELSE" else=RichString)?
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//else=RichStringElseIf
		public Assignment getElseAssignment_4_0() { return cElseAssignment_4_0; }

		//RichStringElseIf
		public RuleCall getElseRichStringElseIfParserRuleCall_4_0_0() { return cElseRichStringElseIfParserRuleCall_4_0_0; }

		//"ELSE" else=RichString
		public Group getGroup_4_1() { return cGroup_4_1; }

		//"ELSE"
		public Keyword getELSEKeyword_4_1_0() { return cELSEKeyword_4_1_0; }

		//else=RichString
		public Assignment getElseAssignment_4_1_1() { return cElseAssignment_4_1_1; }

		//RichString
		public RuleCall getElseRichStringParserRuleCall_4_1_1_0() { return cElseRichStringParserRuleCall_4_1_1_0; }
	}
	
	
	private TemplateFileElements pTemplateFile;
	private ImportElements pImport;
	private ParameterElements pParameter;
	private RichStringElements pRichString;
	private RichStringLiteralElements pRichStringLiteral;
	private RichStringPartElements pRichStringPart;
	private RichStringForLoopElements pRichStringForLoop;
	private RichStringIfElements pRichStringIf;
	private RichStringElseIfElements pRichStringElseIf;
	private TerminalRule tTEXT;
	
	private final Grammar grammar;

	private XbaseWithAnnotationsGrammarAccess gaXbaseWithAnnotations;

	@Inject
	public TemplateGrammarAccess(GrammarProvider grammarProvider,
		XbaseWithAnnotationsGrammarAccess gaXbaseWithAnnotations) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaXbaseWithAnnotations = gaXbaseWithAnnotations;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.template.Template".equals(grammar.getName())) {
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

	
	//TemplateFile:
	//	"<!--" "«" ("package" package=QualifiedName)? imports+=Import* params+=Parameter* body=RichString;
	public TemplateFileElements getTemplateFileAccess() {
		return (pTemplateFile != null) ? pTemplateFile : (pTemplateFile = new TemplateFileElements());
	}
	
	public ParserRule getTemplateFileRule() {
		return getTemplateFileAccess().getRule();
	}

	//Import:
	//	"import" importedNamespace=QualifiedName;
	public ImportElements getImportAccess() {
		return (pImport != null) ? pImport : (pImport = new ImportElements());
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//Parameter:
	//	annotations+=XAnnotation* "param" type=JvmTypeReference? name=ID ("=" defaultexp=XExpression)?;
	public ParameterElements getParameterAccess() {
		return (pParameter != null) ? pParameter : (pParameter = new ParameterElements());
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}

	//RichString returns xbase::XBlockExpression:
	//	{RichString} expressions+=RichStringLiteral (expressions+=RichStringPart expressions+=RichStringLiteral)*;
	public RichStringElements getRichStringAccess() {
		return (pRichString != null) ? pRichString : (pRichString = new RichStringElements());
	}
	
	public ParserRule getRichStringRule() {
		return getRichStringAccess().getRule();
	}

	//RichStringLiteral returns xbase::XStringLiteral:
	//	{RichStringLiteral} value=TEXT;
	public RichStringLiteralElements getRichStringLiteralAccess() {
		return (pRichStringLiteral != null) ? pRichStringLiteral : (pRichStringLiteral = new RichStringLiteralElements());
	}
	
	public ParserRule getRichStringLiteralRule() {
		return getRichStringLiteralAccess().getRule();
	}

	//RichStringPart returns xbase::XExpression:
	//	XExpressionInsideBlock | RichStringForLoop | RichStringIf;
	public RichStringPartElements getRichStringPartAccess() {
		return (pRichStringPart != null) ? pRichStringPart : (pRichStringPart = new RichStringPartElements());
	}
	
	public ParserRule getRichStringPartRule() {
		return getRichStringPartAccess().getRule();
	}

	//RichStringForLoop returns xbase::XForLoopExpression:
	//	{RichStringForLoop} "FOR" declaredParam=JvmFormalParameter ":" forExpression=XExpression eachExpression=RichString
	//	"ENDFOR";
	public RichStringForLoopElements getRichStringForLoopAccess() {
		return (pRichStringForLoop != null) ? pRichStringForLoop : (pRichStringForLoop = new RichStringForLoopElements());
	}
	
	public ParserRule getRichStringForLoopRule() {
		return getRichStringForLoopAccess().getRule();
	}

	//RichStringIf returns xbase::XIfExpression:
	//	{RichStringIf} "IF" if=XExpression then=RichString (else=RichStringElseIf | "ELSE" else=RichString)? "ENDIF";
	public RichStringIfElements getRichStringIfAccess() {
		return (pRichStringIf != null) ? pRichStringIf : (pRichStringIf = new RichStringIfElements());
	}
	
	public ParserRule getRichStringIfRule() {
		return getRichStringIfAccess().getRule();
	}

	//RichStringElseIf returns xbase::XIfExpression:
	//	{RichStringIf} "ELSEIF" if=XExpression then=RichString (else=RichStringElseIf | "ELSE" else=RichString)?;
	public RichStringElseIfElements getRichStringElseIfAccess() {
		return (pRichStringElseIf != null) ? pRichStringElseIf : (pRichStringElseIf = new RichStringElseIfElements());
	}
	
	public ParserRule getRichStringElseIfRule() {
		return getRichStringElseIfAccess().getRule();
	}

	//terminal TEXT:
	//	"»" !"«"* (EOF | "«");
	public TerminalRule getTEXTRule() {
		return (tTEXT != null) ? tTEXT : (tTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TEXT"));
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
