package ��ǰ�ڹ�_9��;
// 6. 20���� 10*10 ũ���� JLabel ������Ʈ�� ������ ���� (50,50) ��ġ���� (250,250) �������� ������ ��ġ�� 
// ��µǵ��� �������α׷��� �ۼ��϶�. �������� ũ��� 300*300���� �϶�

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
