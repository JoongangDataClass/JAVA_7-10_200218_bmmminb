package ��ǰ�ڹ�_9��;
// | ���� 9-6 | ����Ʈ�ҿ� ��ġ�����ڸ� �����ϰ� 9���� ��ư�� �ϳ��� ���ڿ��� ����ϴ� ���α׷��� �ۼ��϶�. 
//"Hello, Press Buttons!" ���ڿ��� JLabel ������Ʈ�� �̿��ϰ�, �� ��ġ�� 130,50�� ũ��� 200*20���� �Ѵ�. 
//��ư�� ũ��� 50*20�� �Ѵ�. // ��ġ������ ���� �����̳ʿ� ������Ʈ�� ���� ��ġ�� ũ��� ����


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
		 JButton b = new JButton(Integer.toString(i)); // ��ư ����
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
