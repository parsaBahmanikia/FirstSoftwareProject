import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math.*;
public class MySquare extends MyShape {
	private int edge;
	public MySquare(int x, int y, int edge, Color color) {
		super(x,y,color);
		this.edge=edge;
		
	}
	
	public void draw(Graphics g) {
		g.fillRect(x, y, edge, edge);
	}
	
	public double getArea() {
		  double area= this.edge * this.edge;
		  return area;
	  }
	
	  public int getEdge(){ return this.edge;}
	  
	  

}
