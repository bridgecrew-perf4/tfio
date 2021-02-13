package unused;

// Generated from tfParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import antlr4.tfParser;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tfParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tfParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(tfParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(tfParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#bodyBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyBegin(tfParser.BodyBeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#bodyEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyEnd(tfParser.BodyEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#terraform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerraform(tfParser.TerraformContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal(tfParser.LocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(tfParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(tfParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(tfParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProvider(tfParser.ProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(tfParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(tfParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#blockName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockName(tfParser.BlockNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#blockType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockType(tfParser.BlockTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(tfParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(tfParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(tfParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(tfParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#negateOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateOp(tfParser.NegateOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#arithmeticOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOp(tfParser.ArithmeticOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#compareOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOp(tfParser.CompareOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#logicOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOp(tfParser.LogicOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#accessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessor(tfParser.AccessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(tfParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(tfParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#splat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplat(tfParser.SplatContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#attrSplat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrSplat(tfParser.AttrSplatContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#fullSplat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullSplat(tfParser.FullSplatContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#exprTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTerm(tfParser.ExprTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(tfParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(tfParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(tfParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(tfParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(tfParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(tfParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItems(tfParser.ItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(tfParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(tfParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#elementsEOL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementsEOL(tfParser.ElementsEOLContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#elementEOL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementEOL(tfParser.ElementEOLContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#forExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpr(tfParser.ForExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(tfParser.ForListContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#forMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForMap(tfParser.ForMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(tfParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#heredoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeredoc(tfParser.HeredocContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#interpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpo(tfParser.InterpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tfParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(tfParser.DirectiveContext ctx);
}