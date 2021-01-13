// Generated from tfParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tfParser}.
 */
public interface tfParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tfParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(tfParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(tfParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(tfParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(tfParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#bodyBegin}.
	 * @param ctx the parse tree
	 */
	void enterBodyBegin(tfParser.BodyBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#bodyBegin}.
	 * @param ctx the parse tree
	 */
	void exitBodyBegin(tfParser.BodyBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#bodyEnd}.
	 * @param ctx the parse tree
	 */
	void enterBodyEnd(tfParser.BodyEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#bodyEnd}.
	 * @param ctx the parse tree
	 */
	void exitBodyEnd(tfParser.BodyEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#terraform}.
	 * @param ctx the parse tree
	 */
	void enterTerraform(tfParser.TerraformContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#terraform}.
	 * @param ctx the parse tree
	 */
	void exitTerraform(tfParser.TerraformContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocal(tfParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocal(tfParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(tfParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(tfParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(tfParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(tfParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(tfParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(tfParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#provider}.
	 * @param ctx the parse tree
	 */
	void enterProvider(tfParser.ProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#provider}.
	 * @param ctx the parse tree
	 */
	void exitProvider(tfParser.ProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(tfParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(tfParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(tfParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(tfParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#blockName}.
	 * @param ctx the parse tree
	 */
	void enterBlockName(tfParser.BlockNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#blockName}.
	 * @param ctx the parse tree
	 */
	void exitBlockName(tfParser.BlockNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#blockType}.
	 * @param ctx the parse tree
	 */
	void enterBlockType(tfParser.BlockTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#blockType}.
	 * @param ctx the parse tree
	 */
	void exitBlockType(tfParser.BlockTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(tfParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(tfParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(tfParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(tfParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(tfParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(tfParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(tfParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(tfParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#negateOp}.
	 * @param ctx the parse tree
	 */
	void enterNegateOp(tfParser.NegateOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#negateOp}.
	 * @param ctx the parse tree
	 */
	void exitNegateOp(tfParser.NegateOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOp(tfParser.ArithmeticOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#arithmeticOp}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOp(tfParser.ArithmeticOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(tfParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(tfParser.CompareOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicOp(tfParser.LogicOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicOp(tfParser.LogicOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#accessor}.
	 * @param ctx the parse tree
	 */
	void enterAccessor(tfParser.AccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#accessor}.
	 * @param ctx the parse tree
	 */
	void exitAccessor(tfParser.AccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(tfParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(tfParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(tfParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(tfParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#splat}.
	 * @param ctx the parse tree
	 */
	void enterSplat(tfParser.SplatContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#splat}.
	 * @param ctx the parse tree
	 */
	void exitSplat(tfParser.SplatContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#attrSplat}.
	 * @param ctx the parse tree
	 */
	void enterAttrSplat(tfParser.AttrSplatContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#attrSplat}.
	 * @param ctx the parse tree
	 */
	void exitAttrSplat(tfParser.AttrSplatContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#fullSplat}.
	 * @param ctx the parse tree
	 */
	void enterFullSplat(tfParser.FullSplatContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#fullSplat}.
	 * @param ctx the parse tree
	 */
	void exitFullSplat(tfParser.FullSplatContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#exprTerm}.
	 * @param ctx the parse tree
	 */
	void enterExprTerm(tfParser.ExprTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#exprTerm}.
	 * @param ctx the parse tree
	 */
	void exitExprTerm(tfParser.ExprTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(tfParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(tfParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(tfParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(tfParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(tfParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(tfParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(tfParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(tfParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(tfParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(tfParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(tfParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(tfParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#items}.
	 * @param ctx the parse tree
	 */
	void enterItems(tfParser.ItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#items}.
	 * @param ctx the parse tree
	 */
	void exitItems(tfParser.ItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(tfParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(tfParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(tfParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(tfParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#elementsEOL}.
	 * @param ctx the parse tree
	 */
	void enterElementsEOL(tfParser.ElementsEOLContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#elementsEOL}.
	 * @param ctx the parse tree
	 */
	void exitElementsEOL(tfParser.ElementsEOLContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#elementEOL}.
	 * @param ctx the parse tree
	 */
	void enterElementEOL(tfParser.ElementEOLContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#elementEOL}.
	 * @param ctx the parse tree
	 */
	void exitElementEOL(tfParser.ElementEOLContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void enterForExpr(tfParser.ForExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void exitForExpr(tfParser.ForExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(tfParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(tfParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#forMap}.
	 * @param ctx the parse tree
	 */
	void enterForMap(tfParser.ForMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#forMap}.
	 * @param ctx the parse tree
	 */
	void exitForMap(tfParser.ForMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(tfParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(tfParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#heredoc}.
	 * @param ctx the parse tree
	 */
	void enterHeredoc(tfParser.HeredocContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#heredoc}.
	 * @param ctx the parse tree
	 */
	void exitHeredoc(tfParser.HeredocContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#interpo}.
	 * @param ctx the parse tree
	 */
	void enterInterpo(tfParser.InterpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#interpo}.
	 * @param ctx the parse tree
	 */
	void exitInterpo(tfParser.InterpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tfParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(tfParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link tfParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(tfParser.DirectiveContext ctx);
}