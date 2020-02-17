package 명품자바_9장;
// 6. 20개의 10*10 크기의 JLabel 컴포넌트가 프레임 내에 (50,50) 위치에서 (250,250) 영역에서 랜덤한 위치에 
// 출력되도록 스윙프로그램을 작성하라. 프레임의 크기는 300*300으로 하라

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class h0906 extends JFrame{
	public h0906() {
		setTitle("Random JLabel");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(null);
		
		for(int i=0; i<20; i++)
		{
			int x= (int) (Math.random() *200) +50;
			int y= (int) (Math.random() *200) +50;
			
			JLabel label= new JLabel((int)(Math.random()*100)+"");
			label.setBounds(x,y,20,20);
			label.setOpaque(true);
			label.setBackground(Color.RED);
			c.add(label);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new h0906();
	}
}
