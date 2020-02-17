package 명품자바_9장;
// | 예제 9-4 | BoderLayout 배치관리자를 사용하여 컨텐트팬에 다음과 같이 5개의 버튼 컴포넌트를 삽입하라.

import java.awt.*;
import javax.swing.*;
public class p0904 extends JFrame{
	
	public p0904() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new BorderLayout(30,20));
		c.add(new JButton("Calculate"),BorderLayout.CENTER);
		c.add(new JButton("add"),BorderLayout.NORTH);
		c.add(new JButton("sub"),BorderLayout.SOUTH);
		c.add(new JButton("mul"),BorderLayout.EAST);
		c.add(new JButton("div"),BorderLayout.WEST);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new p0904();
	}
}
