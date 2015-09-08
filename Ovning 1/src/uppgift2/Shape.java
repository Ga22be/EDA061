package uppgift2;

import java.awt.Graphics;

public abstract class Shape {
	protected int x;
	protected int y;
	
	public abstract void paint(Graphics g);
	
	public void move(int dx, int dy){
		x = x + dx;
		y = y + dy;
	}
}
