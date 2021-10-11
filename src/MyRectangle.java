import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math.*;
public class MyRectangle extends MyShape {
  private int width;
  private int height;
  
  
  public MyRectangle(int x, int y,int width , int height, Color color) {
	  super(x,y,color);
	  this.width=width;
	  this.height=height;
	  }
  
  public void draw(Graphics rec) {
	  rec.fillRect(x, y, width, height);
  }
  
  public double getArea() {
	  double area= this.width * this .height;
	  return area;
  }
  //getters
 
  public int getWidth(){ return this.width;}
  public int getHeight(){ return this.height;}
 
  
  
}
