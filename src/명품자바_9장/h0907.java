package 명품자바_9장;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


// 7. 다음과 같은 GUI 모양을 가진 스윙 프레임을 작성하라. #9장실습문제7번 #자바계산기만들기 #자바계산기틀
// ​※ JButton, JLabel, JTextField 사용. 여러개의 컴포넌트와 패널을 가진 스윙 프레임으로 컨텐트팬의 
// NORTH, CENTER, SOUTH에 각각 JPanel을 상속받은 패널을 붙이고 그 곳에 버튼이나 JLabel을 붙이면 된다.

public class h0907 extends JFrame implements ActionListener{
	String []str= {"CE", "계산", "+", "-", "x", "%"};
	JTextField tf1,tf2;
	String numStr="";
	
	public h0907() {
		setTitle("계산기프레임");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		JPanel pn =new JPanel();
		JPanel ps =new JPanel();
		JPanel pc =new JPanel();
		
		pn.setBackground(Color.LIGHT_GRAY);
		ps.setBackground(Color.YELLOW);
		pc.setLayout(new GridLayout(4,4,5,5));
		
	
		
		JLabel l1= new JLabel("수식입력");
		tf1 = new JTextField(10);
		pn.add(l1);
		pn.add(tf1);
		
		JLabel l2= new JLabel("계산결과");
		tf2 = new JTextField(10);
		ps.add(l2);
		ps.add(tf2);
		
		for(int i=0; i<16; i++)
		{
			JButton b= new JButton();
			
			
			if(i<10) {
				b.setText(i+"");
				b.setBackground(Color.white);
			} else {
				b.setText(str[i-10]);
				b.setBackground(Color.white);
			}
			if(i>11) 			
				b.setBackground(Color.white);
			pc.add(b);
			b.addActionListener(this);
		}
		c.add(pc);
		c.add(pn,BorderLayout.NORTH);
		c.add(ps,BorderLayout.SOUTH);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new h0907();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String str= e.getActionCommand();
		
		if(str.equals("CE"))
		{
			numStr="";
			tf1.setText(numStr);
			tf2.setText("");
		} else if(str.equals("계산"))
		{
			StringTokenizer st= new StringTokenizer(numStr, "+-x%", true); //구분자를 넣는다
			int num1=Integer.parseInt(st.nextToken());
			String op=st.nextToken();
			int num2=Integer.parseInt(st.nextToken());
			switch(op) {
			case "+":tf2.setText(num1+num2+"");break;
			case "-":tf2.setText(num1-num2+"");break;
			case "x":tf2.setText(num1*num2+"");break;
			case "%":tf2.setText(num1/num2+"");break;
			default: tf2.setText("오류"); break;
			}
			numStr="";
			tf1.setText(numStr);
		} else {
			numStr+=str;
			tf1.setText(numStr);
		}
	}

}
