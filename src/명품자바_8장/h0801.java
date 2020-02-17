package 명품자바_8장;
// 1. a.jpg 파일의 크기를 화면에 출력하는 프로그램을 작성하라. 
//파일의 크기는 File 클래스의 length() 메소드를 이용하면 된다. a.jpg는 프로젝트 폴더 밑에 있어야 한다.
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class h0801 {

	public static void main(String[] args) {
		File f = new File("src\\명품자바_8장\\tmp\\aa.jpg");
		if(f.exists()) {
			System.out.println(f.length());
		}
		else {
			System.out.println("파일이 없습니다.");
		}
	}
}
