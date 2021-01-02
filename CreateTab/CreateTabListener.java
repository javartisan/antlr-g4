// Generated from CreateTab.g4 by ANTLR 4.8

 package CreateTab ;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CreateTabParser}.
 */
public interface CreateTabListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CreateTabParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(CreateTabParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTabParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(CreateTabParser.TableContext ctx);
}