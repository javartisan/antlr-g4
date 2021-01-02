package CreateTab;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;

public class Interpreter {

    public void createTable(String tableName, String key, List<Token> columns) {
        System.out.println("tableName = " + tableName);
        System.out.println("key = " + key);
        for (int i = 0; i < columns.size(); i++) {
            System.out.println(columns.get(i).getText());
            //System.out.println(columns.get(i).getTokenSource());
        }
    }

    public void createTable(String tableName, String key, List<Token> columns, List<Token> types) {
        System.out.println("tableName = " + tableName);
        System.out.println("key = " + key);
        for (int i = 0; i < columns.size(); i++) {
            System.out.println(columns.get(i).getText() + " =>  " + types.get(i).getText());
            //System.out.println(columns.get(i).getTokenSource());
        }
    }

    public void createTable(String tableName, String key, List<Token> columns, List<Token> types, String path) {
        System.out.println("tableName = " + tableName);
        System.out.println("key = " + key);
        System.out.println("path = " + path);
        for (int i = 0; i < columns.size(); i++) {
            System.out.println(columns.get(i).getText() + " =>  " + types.get(i).getText());
            //System.out.println(columns.get(i).getTokenSource());
        }
    }


    public static void main(String[] args) {

        //ANTLRInputStream stream = new ANTLRInputStream("create table  user (primary key id ,name,age);");
        //ANTLRInputStream stream = new ANTLRInputStream("create table  user (primary key id int,name varchar ,age int);");
        ANTLRInputStream stream = new ANTLRInputStream("create table  user_info (primary key id int,user_name varchar ,user_age int) location = /user/daxin/hive/user_info ;");
        CreateTabLexer lexer = new CreateTabLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CreateTabParser parser = new CreateTabParser(tokens);

        ParseTreeWalker walker = new ParseTreeWalker();

        CreateTabParser.TableContext tree = parser.table();

    }


}
