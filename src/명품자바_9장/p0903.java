package ��ǰ�ڹ�_9��;
// ���� ������ 30, ���� ������ 40�ȼ��̰� LEFT�� ���� ��ġ�ϴ� FlowLayout 
//��ġ�����ڸ� ���� ����Ʈ�ҿ� 5���� ��ư ������Ʈ�� ������ ���� �������α׷��� �ۼ��϶�.

import java.awt.*;
import javax.swing.*;
public class p0903 extends JFrame {
	
	public p0903() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c= getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		c.add(new JButton("Calculate"));
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new p0903();
	}
}
