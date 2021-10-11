import java.util.*;
import java.util.List;
import java.awt.*;
import javax.swing.*;
public class SortingTechnique extends JPanel {
  public static void sortShapes(List <MyShape> list) {
	  
	  for(int i=0; i < list.size(); i++) {
		  for(int j=i+1; j <list.size(); j++) {
			  if(list.get(j).compareTo(list.get(i))<0) {
				  MyShape temp= list.get(i);
				  list.set(i, list.get(j));
				  list.set(j, temp);
			  }
		  }
	  }
  }
  
  public void paintComponent(Graphics g) {
	     {
	      super.paintComponent(g);
	      Graphics2D g2d=(Graphics2D) g;
	      
	      sortShapes(MyPanel.shape2.list);
	      
	      for(MyShape sh: MyPanel.shape2.list ) {
	        g2d.setColor(sh.getColor());
	        sh.draw(g2d);
	      }
	      
	      
	    }
	    }
  public  void reDraw() {
	  this.repaint();
  }
	   
}
