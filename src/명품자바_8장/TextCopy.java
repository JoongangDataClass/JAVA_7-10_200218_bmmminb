package 명품자바_8장;
import java.io.*;
public class TextCopy {

	public static void main(String[] args) {
		File src= new File("c:\\windows\\System.ini"); // 소스 파일
		File dst= new File("src\\명품자바_8장\\tmp\\system.txt"); // 목적 파일
		FileReader fr= null;
		FileWriter fw= null;
		BufferedReader in=null;
		BufferedWriter out=null;
		int c;
		try {
			fr = new FileReader(src);
			fw= new FileWriter(dst);
			in = new BufferedReader(fr);
			out = new BufferedWriter(fw);
			while((c = in.read())!=-1){
				out.write((char) c);
			}
			in.close();
			out.close();
			fr.close();
			fw.close();
		}catch(IOException e)
		{
			System.out.println("파일 복사 오류");
		}
	}
}
