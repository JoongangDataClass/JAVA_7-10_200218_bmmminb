package 명품자바_8장;
//서브 디렉터리를 모두 출력하는 프로그램을 작성하라.
import java.io.File;
public class h0803 {

	public static void main(String[] args) {
		File file = new File("src");
		for(String s: file.list()) {
			File sf = new File(file,s); // file은 parent s는 child 경로명
			if(sf.isDirectory())
			{
				System.out.println(sf);
			}
		}
	}
}
