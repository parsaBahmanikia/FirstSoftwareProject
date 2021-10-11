import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math.*;
public class MyCircle extends MyShape {
	private int ratio;
	public MyCircle(int x, int y, int ratio, Color color) {
		super(x,y,color);
		this.ratio=ratio;
	}
	
	public void draw(Graphics g) {
		g.fillOval(x, y, ratio, ratio);
	}
	public double getArea() {
		double area = Math.PI * ratio * ratio;
		return area;
		  
	  }
   //getters
 
   public int getRatio() {return this.ratio;}
  
}
