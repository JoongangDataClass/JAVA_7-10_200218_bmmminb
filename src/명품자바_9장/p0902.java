package ��ǰ�ڹ�_9��;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class p0902 extends JFrame{
	public p0902() {
		super("MyFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE); // �������� �� �޸𸮻󿡼� ������� �ϱ�
		setSize(300,300);
		Container contentPane= this.getContentPane();
		contentPane.setLayout(new FlowLayout());// ��ư�� ������� (�Ⱦ��� ����)
		contentPane.setBackground(Color.DARK_GRAY); // ������ static
		
		JButton okBtn = new JButton("OK");
		JButton cancelBtn = new JButton("Cancel");
		JButton ignoreBtn = new JButton("Ignore"); // ctrl +shift +o :import
		
		contentPane.add(okBtn);
		contentPane.add(cancelBtn);
		contentPane.add(ignoreBtn);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new p0902();
	}
	
}
