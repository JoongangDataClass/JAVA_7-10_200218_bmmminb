package 명품자바_9장;
// | 예제 9-6 | 컨텐트팬에 배치관리자를 삭제하고 9개의 버튼과 하나의 문자열을 출력하는 프로그램을 작성하라. 
//"Hello, Press Buttons!" 문자열은 JLabel 컴포넌트를 이용하고, 그 위치를 130,50에 크기는 200*20으로 한다. 
//버튼의 크기는 50*20로 한다. // 배치관리자 없는 컨테이너에 컴포넌트를 절대 위치와 크기로 지정


import java.awt.*;
import javax.swing.*;

public class p0906 extends JFrame{
 public p0906() {
	 setTitle("Null Container Sample");
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 Container c= getContentPane();
	 c.setLayout(null);
	 JLabel la= new JLabel("Hello, Press Buttons!");
	 la.setLocation(130,50);
	 la.setSize(200,20);
	 c.add(la);
	 for(int i=1; i<=9; i++)
	 {
		 JButton b = new JButton(Integer.toString(i)); // 버튼 생성
		 b.setLocation(i*15, i*15);
		 b.setSize(50,20);
		 c.add(b);
	 }
	 setSize(300,200);
	 setVisible(true);
 }
 public static void main(String[] args) {
	new p0906();
}
}
