package 명품자바_8장;
//5번
//사용자로부터 두 개의 파일 이름을 입력받고 두 파일의 내용을 비교하여 같으면 "파일이 같습니다."를,
//틀리면 "파일이 서로 다릅니다."를 출력하는 프로그램을 작성하라.
//비교 대상인 파일은 텍스트 및 바이너리 파일 모두를 포함한다.
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class h0805 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		FileInputStream F1 =null;
		FileInputStream F2 =null;
		int same=0; //같은 파일인지 다른 파일인지 구분하는 변수
		try {
			int a,b;
			F1= new FileInputStream("src\\명품자바_8장\\tmp\\"+sc.next());
			F2= new FileInputStream("src\\명품자바_8장\\tmp\\"+sc.next());
			
			if(F1.available()!=F2.available()) {
				same=0;
			}
			else {
				same=1; // 파일의 길이가 같다
				while((a=F1.read())!=-1) // 파일 1 읽기
				{
					b=F2.read(); // 파일 2 읽기
					if(a!=b)
					{
						same=0;
						break;
					}
				}
			}
			F1.close();
			F2.close();
			if(same==1)
			{
				System.out.print("두 파일은 같습니다.");
			}
			else
				System.out.print("두 파일은 다릅니다.");
		}
		catch(IOException e)
		{
			System.out.print("파일 입출력 오류");
		}
	}
	
}
