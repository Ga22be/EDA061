package uppgift2;

import java.awt.Graphics;

public abstract class Shape {
	private int x;
	private int y;
	
	public Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public abstract void paint(Graphics g);
	
	public void move(int dx, int dy){
		x = x + dx;
		y = y + dy;
	}
}
