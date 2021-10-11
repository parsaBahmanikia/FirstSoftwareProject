import javax.swing.JFrame;

public class Mymain {

	public static void main(String[] args) {
		JFrame f=new JFrame("title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		MyPanel panel=new MyPanel();
		f.add(panel);
		f.setSize(600, 600);
		f.setVisible(true);

	}

}
