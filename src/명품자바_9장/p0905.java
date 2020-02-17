package 명품자바_9장;
// | 예제 9-5 | GridLayout을 사용하여 스윙프로그램을 만들되 콘탠트팬을 4*2그리드로 분할하고 
//JLabel 컴포넌트와 JTextField 컴포넌트를 부착하여 만들어라. 두 행 사이의 수직 간격은 5픽셀로 하라.
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class p0905 extends JFrame{
	String [] str= {"이름", "학번", "학과", "과목"};
	public p0905() {
		setTitle("GridLayout Test02");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,2,5,5));
		for(int i=0; i<8; i++) // 항목이 여러개일 경우 라벨은 짝수에만 들어가는 것에 주목
		{
			if(i%2==0) {
				JLabel l = new JLabel(str[i/2]);
				c.add(l);
			}
			else {
				JTextField tf = new JTextField(""); // 폭
				c.add(tf);
			}
		}
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new p0905();
	}
}
