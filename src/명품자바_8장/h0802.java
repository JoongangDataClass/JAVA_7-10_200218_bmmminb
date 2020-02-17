package 명품자바_8장;
// 2. 텍스트 파일을 읽어 소문자로 된 영어 문자를 모두 대문자로 바꿔서 출력하는 프로그램을 버퍼 스트림을 이용하여 작성하라.
import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
public class h0802 {

	public static void main(String[] args) {
		FileReader fin =null;
		BufferedOutputStream bout = new BufferedOutputStream(System.out,5);
		try {
			fin = new FileReader("src\\명품자바_8장\\tmp\\test1.txt");
			int c;
			while((c=fin.read())!=-1) {
				String s= Character.toString((char) c).toUpperCase();
				char g=s.charAt(0);	
				bout.write(g);
			}
			fin.close();
			bout.close();
		} catch (IOException e)
		{
			System.out.println("파일이 존재하지 않습니다");
		}
	}
}
