package 명품자바_8장;
import java.io.FileInputStream;
//4. 사용자로부터 두 개의 텍스트 파일 이름을 입력받고 첫 번째 파일 뒤에 두 번째 파일을 덧붙여 새로운 파일을 생성하는 프로그램을 작성하라.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class h0804 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		FileReader F1=null;
		FileReader F2=null;
		FileWriter F3=null;
		InputStreamReader in=null;
		FileInputStream fin =null;
		try {
			F1= new FileReader("src\\명품자바_8장\\tmp\\"+sc.next()+".txt");
			F2= new FileReader("src\\명품자바_8장\\tmp\\"+sc.next()+".txt");
			F3= new FileWriter("src\\명품자바_8장\\tmp\\text3.txt");
			int c;
			
			while((c=F1.read())!=-1)
			{
				F3.write((char) c);
			}
			while((c=F2.read())!=-1)
			{
				F3.write((char) c);
			}
			
			F1.close();
			F2.close();
			F3.close();
			
		
		}
		catch(IOException e)
		{
			System.out.println("파일 입출력 오류");
		}
		
		try {
			F1= new FileReader("src\\명품자바_8장\\tmp\\text3.txt");
			int c;
			while((c=F1.read())!=-1)
			{
				System.out.print((char) c);
			}
			F1.close();
			/*
			 * fin= new FileInputStream("src\\명품자바_8장\\tmp\\text3.txt"); in = new
			 * InputStreamReader(fin); int c; while((c=in.read())!=-1) {
			 * System.out.print((char) c); } in.close(); fin.close();
			 */
		}
		catch(IOException e)
		{
			System.out.println("파일 입출력 오류");
		}
	}
}
