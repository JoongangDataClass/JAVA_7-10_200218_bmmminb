package ��ǰ�ڹ�_9��;

import javax.swing.JFrame;;
public class MyFrame extends JFrame{
	MyFrame(){
		super("MyFrame");
		// setTilte("MyFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true); // ���������
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
