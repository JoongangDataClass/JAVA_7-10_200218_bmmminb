package 명품자바_9장;

import javax.swing.JFrame;

// "Let's study Java"라는 문자열을 타이틀로 가지고 프레임의 크기가 400*200인 스윙 프로그램을 작성하라.


public class h0901 extends JFrame{
	public h0901() {
		setTitle("Let's study Java");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new h0901();
	}
}
