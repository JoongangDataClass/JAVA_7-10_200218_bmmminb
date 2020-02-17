package 명품자바_9장;
// 문제 3을 수정하여 다음 결과와 같이 각 버튼의 배경색을 서로 다르게 설정하라.


import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class h0904 extends JFrame{
	
	public h0904(){
		setTitle("BorderLayout Practice");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new GridLayout(1,10));
		
		for(int i=0; i<10; i++)
		{
			Color [] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
					Color.CYAN, Color.BLUE, Color.MAGENTA,Color.GRAY,Color.PINK,
					Color.LIGHT_GRAY};
			String text= Integer.toString(i);
			JButton b= new JButton(text);
			b.setOpaque(true);
			b.setBackground(col[i]);
			c.add(b);
		}
		setVisible(true);
	}

		public static void main(String[] args) {
			new h0904();
		}
}
