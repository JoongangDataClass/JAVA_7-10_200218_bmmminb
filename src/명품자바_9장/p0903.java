package 명품자바_9장;
// 수평 간격이 30, 수직 간격이 40픽셀이고 LEFT로 정렬 배치하는 FlowLayout 
//배치관리자를 가진 컨텐트팬에 5개의 버튼 컴포넌트를 부착한 스윙 응용프로그램을 작성하라.

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
