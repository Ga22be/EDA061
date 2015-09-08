package uppgift4;

public class Add extends BinExpr {

	public Add(Expr expr1, Expr expr2) {
		super(expr1, expr2);
	}

	@Override
	protected String op(String string1, String string2) {
		return string1 + "+" + string2;
	}

}
