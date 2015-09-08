package uppgift4;

public class Value implements Expr {
	private int value;
	
	public Value(int value) {
		this.value = value;
	}
	@Override
	public String tString() {
		return String.valueOf(value);
	}

}
