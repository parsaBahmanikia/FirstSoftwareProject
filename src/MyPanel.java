import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MyPanel extends JPanel implements ActionListener  {
    private boolean check;
    private JButton load;
    private JButton sort;
     public static ShapeFactory shape2;
   
    
    public MyPanel() {
      super();
      load=new JButton("Load shapes");
       add(load);
       sort=new JButton("Sort shapes");
       add(sort);
       load.addActionListener(this);
       sort.addActionListener(this);
       
    }
    
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==load) {
        this.check=true;
        repaint();
       
      }
      else if(e.getSource()==sort) {
    	  SortingTechnique obj =new SortingTechnique();
    	  obj.repaint();
      }
     
    
      
    }
    
  
  
  public void paintComponent(Graphics g) {
    if (check == true) {
      super.paintComponent(g);
      Graphics2D g2d=(Graphics2D) g;
      
      ShapeFactory shape=new ShapeFactory();
      shape2=shape;
      for(MyShape sh:  shape.list) {
        g2d.setColor(sh.getColor());
        sh.draw(g2d);
      }
      
      
    }
    }
   


}

