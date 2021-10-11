import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

	private Random rand;
	public List <MyShape> list;
	
	public ShapeFactory()
	{
		rand=new Random();
		list=this.generator();
	}

	

	public List<MyShape> generator() {
		List<MyShape> l = new ArrayList<>();
		MyShape temp = null;

		int x1=rand.nextInt(2)+80;
		int y1=x1;
		
		
		for (int i = 0; i < 6; i++) {
			
			
			int s = rand.nextInt(3);
			if (s == 0) {
				int widthrect = rand.nextInt(50)+20;
				int heightrect = rand.nextInt(50)+20;
				Color color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
				temp = new MyRectangle(x1, y1, widthrect, heightrect, color);

				l.add(temp);
			}
			if(s==1) {
				int edgeSquare=rand.nextInt(50)+20;
				Color color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
				temp=new MySquare(x1,y1,edgeSquare,color);
				l.add(temp);
			}
			if(s==2) {
				int ratioCircle= rand.nextInt(50) + 20;
				Color color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
				temp=new MyCircle(x1,y1,ratioCircle,color);
				l.add(temp);
			}
			x1+=80;
			y1+=80;

		}
		return l;

	}

	}