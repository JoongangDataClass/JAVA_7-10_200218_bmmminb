package ��ǰ�ڹ�_9��;
// | ���� 9-5 | GridLayout�� ����Ͽ� �������α׷��� ����� ����Ʈ���� 4*2�׸���� �����ϰ� 
//JLabel ������Ʈ�� JTextField ������Ʈ�� �����Ͽ� ������. �� �� ������ ���� ������ 5�ȼ��� �϶�.
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class p0905 extends JFrame{
	String [] str= {"�̸�", "�й�", "�а�", "����"};
	public p0905() {
		setTitle("GridLayout Test02");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,2,5,5));
		for(int i=0; i<8; i++) // �׸��� �������� ��� ���� ¦������ ���� �Ϳ� �ָ�
		{
			if(i%2==0) {
				JLabel l = new JLabel(str[i/2]);
				c.add(l);
			}
			else {
				JTextField tf = new JTextField(""); // ��
				c.add(tf);
			}
		}
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new p0905();
	}
}
