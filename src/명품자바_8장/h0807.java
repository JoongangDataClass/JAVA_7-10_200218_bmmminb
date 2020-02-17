package 명품자바_8장;
//7번
//이미지 파일 a.jpg를 b.jpg로 복사하는 프로그램을 작성하라.
//한 번에 1kB 단위로 데이터를 복사하라.
//a.jpg는 프로젝트 폴더 밑에 있어야 한다.

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
		
		ImageIcon img= new ImageIcon("src\\명품자바_8장\\tmp\\복사.jpg");
		JLabel imageLabel = new JLabel(img);
		c.add(imageLabel);
		setSize(300,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		FileInputStream fin = null; // 바이트 스트림 생성
		FileOutputStream fout= null;
		try {
			fin = new FileInputStream("src\\명품자바_8장\\tmp\\aa.jpg");
			fout = new FileOutputStream("src\\명품자바_8장\\tmp\\복사.jpg");
			int c;
			while((c=fin.read())!=-1)
			{
				fout.write(c);
			}
			fin.close();
			fout.close();
			// 스트림 닫기
		} catch (IOException e)
		{
			System.out.print("파일 입출력 오류");
		}
		new h0807();
	}
}
