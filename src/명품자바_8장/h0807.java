package ��ǰ�ڹ�_8��;
//7��
//�̹��� ���� a.jpg�� b.jpg�� �����ϴ� ���α׷��� �ۼ��϶�.
//�� ���� 1kB ������ �����͸� �����϶�.
//a.jpg�� ������Ʈ ���� �ؿ� �־�� �Ѵ�.

import java.awt.Container;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class h0807 extends JFrame{
	BufferedImage img=null;
	public h0807() {
		setTitle("Image Load test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		ImageIcon img= new ImageIcon("src\\��ǰ�ڹ�_8��\\tmp\\����.jpg");
		JLabel imageLabel = new JLabel(img);
		c.add(imageLabel);
		setSize(300,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		FileInputStream fin = null; // ����Ʈ ��Ʈ�� ����
		FileOutputStream fout= null;
		try {
			fin = new FileInputStream("src\\��ǰ�ڹ�_8��\\tmp\\aa.jpg");
			fout = new FileOutputStream("src\\��ǰ�ڹ�_8��\\tmp\\����.jpg");
			int c;
			while((c=fin.read())!=-1)
			{
				fout.write(c);
			}
			fin.close();
			fout.close();
			// ��Ʈ�� �ݱ�
		} catch (IOException e)
		{
			System.out.print("���� ����� ����");
		}
		new h0807();
	}
}
