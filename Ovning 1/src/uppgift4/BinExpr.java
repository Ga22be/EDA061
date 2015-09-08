package uppgift4;

public abstract class BinExpr implements Expr {
	private Expr expr1, expr2;
	
	protected BinExpr(Expr expr1, Expr expr2){
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
		
	protected abstract String op(String string1, String string2);
	
	public String tString() {
		return op(expr1.tString(), expr2.tString());
	}

}
