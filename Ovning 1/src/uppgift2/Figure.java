package uppgift2;

import java.awt.Graphics;
import java.util.ArrayList;

public class Figure extends ArrayList<Shape>{
	public void paint(Graphics g){
		for(Shape shape : this){
			shape.paint(g);
		}
	}
}
