package 명품자바_9장;
// 3. GridLayout을 사용하여 다음 그림과 같이 한 줄에 10개의 버튼을 동일한 크기로 배치하는 스윙 프로그램을 작성하라.
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class h0903 extends JFrame{
	
	public h0903(){
		setTitle("BorderLayout Practice");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new GridLayout(1,10));
		
		for(int i=0; i<10; i++)
		{
			c.add(new JButton(i +""));
		}
		setVisible(true);
	}

		public static void main(String[] args) {
			new h0903();
		}
}
