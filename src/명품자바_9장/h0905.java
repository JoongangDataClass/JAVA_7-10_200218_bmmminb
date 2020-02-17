package 명품자바_9장;
// 5. GridLayout을 이용하여 다음 그림과 같이 16개의 색을 배경색으로 하는 4*4 바둑판을 구성하라. #9장실습문제5번
// ​※ 16개의 JLabel 컴포넌트를 생성하고 각 레이블 컴포넌트의 배경색을 칠한다음 하나씩 GridLayout을 가진 컨테이너에 붙이면 된다.

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class h0905 extends JFrame{
	public h0905() {
		setTitle("The Color Buttons Frame");
		setSize(600,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4));
		
		for(int i=0; i<16; i++)
		{
			Color [] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
					Color.CYAN, Color.BLUE, Color.MAGENTA,Color.GRAY,Color.PINK,
					Color.LIGHT_GRAY, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
					Color.CYAN, Color.BLUE};
			JLabel label =new JLabel(i+ "");
			label.setBackground(col[i]);
			label.setOpaque(true);
			c.add(label);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new h0905();
	}
}
