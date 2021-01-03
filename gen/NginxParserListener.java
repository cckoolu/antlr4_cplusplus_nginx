// Generated from /home/lu/Downloads/nginx_demo_v2_20201226_by_lyuqiang/nginx_demo/grammar/NginxParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NginxParser}.
 */
public interface NginxParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NginxParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(NginxParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(NginxParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#context}.
	 * @param ctx the parse tree
	 */
	void enterContext(NginxParser.ContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#context}.
	 * @param ctx the parse tree
	 */
	void exitContext(NginxParser.ContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#context_name}.
	 * @param ctx the parse tree
	 */
	void enterContext_name(NginxParser.Context_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#context_name}.
	 * @param ctx the parse tree
	 */
	void exitContext_name(NginxParser.Context_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#context_value}.
	 * @param ctx the parse tree
	 */
	void enterContext_value(NginxParser.Context_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#context_value}.
	 * @param ctx the parse tree
	 */
	void exitContext_value(NginxParser.Context_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(NginxParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(NginxParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#location_left_field}.
	 * @param ctx the parse tree
	 */
	void enterLocation_left_field(NginxParser.Location_left_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#location_left_field}.
	 * @param ctx the parse tree
	 */
	void exitLocation_left_field(NginxParser.Location_left_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#location_middle_field}.
	 * @param ctx the parse tree
	 */
	void enterLocation_middle_field(NginxParser.Location_middle_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#location_middle_field}.
	 * @param ctx the parse tree
	 */
	void exitLocation_middle_field(NginxParser.Location_middle_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#location_right_field}.
	 * @param ctx the parse tree
	 */
	void enterLocation_right_field(NginxParser.Location_right_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#location_right_field}.
	 * @param ctx the parse tree
	 */
	void exitLocation_right_field(NginxParser.Location_right_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#field_group}.
	 * @param ctx the parse tree
	 */
	void enterField_group(NginxParser.Field_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#field_group}.
	 * @param ctx the parse tree
	 */
	void exitField_group(NginxParser.Field_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#fg_left}.
	 * @param ctx the parse tree
	 */
	void enterFg_left(NginxParser.Fg_leftContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#fg_left}.
	 * @param ctx the parse tree
	 */
	void exitFg_left(NginxParser.Fg_leftContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#fg_right}.
	 * @param ctx the parse tree
	 */
	void enterFg_right(NginxParser.Fg_rightContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#fg_right}.
	 * @param ctx the parse tree
	 */
	void exitFg_right(NginxParser.Fg_rightContext ctx);
	/**
	 * Enter a parse tree produced by {@link NginxParser#notes_string}.
	 * @param ctx the parse tree
	 */
	void enterNotes_string(NginxParser.Notes_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NginxParser#notes_string}.
	 * @param ctx the parse tree
	 */
	void exitNotes_string(NginxParser.Notes_stringContext ctx);
}