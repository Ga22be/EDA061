package uppgift4;

import java.util.ArrayList;

public abstract class PrintList extends ArrayList {
	protected PrintList(){
		
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < size(); i++){
			builder.append(op(i));
		}
		return builder.toString();
	}
	
	protected abstract String op(int i);
}
