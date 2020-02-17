package 명품자바_8장;
import java.io.*;
public class BinaryCopy {

	public static void main(String[] args) {
		File src= new File("c:\\windows\\explorer.exe");
		File dst= new File("src\\명품자바_8장\\tmp\\explorer.bin");
		FileInputStream fi =null;
		FileOutputStream fo =null;
		BufferedInputStream in=null;
		BufferedOutputStream out= null;
		int c;
		try {
			fi= new FileInputStream(src);
			fo= new FileOutputStream(dst);
			in =new BufferedInputStream(fi);
			out= new BufferedOutputStream(fo);
			while((c=in.read())!=-1) {
				out.write((char)c);
			}
			in.close();
			out.close();
			fi.close();
			fo.close();
		} catch(IOException e)
		{
			System.out.println("파일 복사 오류");
		}
	}
}
