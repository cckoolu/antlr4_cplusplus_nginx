// Generated from /home/lu/Downloads/nginx_demo_v2_20201226_by_lyuqiang/nginx_demo/grammar/NginxParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NginxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NginxParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NginxParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(NginxParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext(NginxParser.ContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#context_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_name(NginxParser.Context_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#context_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_value(NginxParser.Context_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(NginxParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#location_left_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation_left_field(NginxParser.Location_left_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#location_middle_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation_middle_field(NginxParser.Location_middle_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#location_right_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation_right_field(NginxParser.Location_right_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#field_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_group(NginxParser.Field_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#fg_left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFg_left(NginxParser.Fg_leftContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#fg_right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFg_right(NginxParser.Fg_rightContext ctx);
	/**
	 * Visit a parse tree produced by {@link NginxParser#notes_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotes_string(NginxParser.Notes_stringContext ctx);
}