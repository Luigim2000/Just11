import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		JFrame f=new JFrame("ST");
		f.setLayout(new BorderLayout());
		f.setSize(600,600);
		GamePanel p=new GamePanel();

		f.add(p,BorderLayout.CENTER);
		p.setFocusable(true);
		f.setMinimumSize(new Dimension(600,600));
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}