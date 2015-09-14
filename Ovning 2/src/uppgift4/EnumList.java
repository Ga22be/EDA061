package uppgift4;

public class EnumList extends PrintList {

	@Override
	protected String op(int i) {
		return String.valueOf(i + 1) + ". " + get(i) + '\n'; 
	}

}
