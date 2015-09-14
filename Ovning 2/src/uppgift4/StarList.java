package uppgift4;

public class StarList extends PrintList {

	@Override
	protected String op(int i) {
		return "* " + get(i) + '\n';
	}

}
