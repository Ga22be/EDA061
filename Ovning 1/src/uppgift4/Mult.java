package uppgift4;

public class Mult extends BinExpr {
	public Mult(Expr expr1, Expr expr2) {
		super(expr1, expr2);
	}
	
	protected String op(String string1, String string2) {
		return string1 + "*" + string2;
	}


}
