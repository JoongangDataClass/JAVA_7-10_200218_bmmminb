package 명품자바_8장;
import java.io.BufferedReader;
// 자바 소스 파일을 읽어들여서 맨 앞에 행 번호를 붙여서 화면에 출력하는 프로그램을 작성하라.
import java.io.FileReader;
import java.io.IOException;

public class h0806 {

	public static void main(String[] args) {
		FileReader in=null;
		try {
			in = new FileReader("src\\명품자바_8장\\h0805.java");
			BufferedReader bin= new BufferedReader(in);
			String s;
			int a=1;
			while((s=bin.readLine())!=null)
			{
				System.out.format("%4d: %s%n", a, s);
				a++;
				
			}
			in.close();
		} catch(IOException e)
		{
			System.out.print("파일 입출력 오류");
		}
	}
}
