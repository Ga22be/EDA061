package uppgift4;

public class Test {
	public static void main(String args[]){
		Expr expr1 = new Add(new Value(1), new Value(2));
		Expr expr2 = new Mult(expr1, new Value(3));
		
		System.out.println(expr2.tString());
	}
}
