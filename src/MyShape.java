import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math.*;
  public abstract class MyShape implements Comparable<MyShape>{  
	 protected int x;
	 protected int y;
     protected Color color;
     
     public MyShape(int x, int y, Color color) {
    	 this.x=x;
    	 this.y=y;
    	 this.color=color;
     }
     public abstract void draw(Graphics g);
     public abstract double getArea();
     //getters
     public int getX() {
    	 return this.x;
     }
     public int getY() {
    	 return this.y;
     }
     public Color getColor() {
    	 return this.color;
     }
     @Override
     public int compareTo(MyShape shape) {
    	 return Double.compare(this.getArea(), shape.getArea());
     }
     
     public void setXY(int x, int y) {
    	 this.x=x;
    	 this.y=y;
     }
 
}
