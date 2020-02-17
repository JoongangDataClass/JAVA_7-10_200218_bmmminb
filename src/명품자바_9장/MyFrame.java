package 명품자바_9장;

import javax.swing.JFrame;;
public class MyFrame extends JFrame{
	MyFrame(){
		super("MyFrame");
		// setTilte("MyFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true); // 프레임출력
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
