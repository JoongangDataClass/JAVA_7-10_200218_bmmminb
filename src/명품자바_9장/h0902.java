package 명품자바_9장;
// 2. BoderLayout을 사용하여 컴포넌트 사이의 수평 수직 간격이 각각 5픽셀, 7픽셀이 되도록 스윙 응용프로그램을 작성하라.

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class h0902 extends JFrame{

	public h0902() {
		setTitle("BorderLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c= getContentPane();
		
		
		c.setLayout(new BorderLayout(5,7));
		
		c.add(new JButton("North"),BorderLayout.NORTH);
		c.add(new JButton("Center"),BorderLayout.CENTER);
		c.add(new JButton("East"),BorderLayout.EAST);
		c.add(new JButton("West"),BorderLayout.WEST);
		c.add(new JButton("South"),BorderLayout.SOUTH);
		
		
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new h0902();
	}
}
