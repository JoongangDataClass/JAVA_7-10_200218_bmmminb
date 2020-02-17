package 명품자바_8장;
//8번
//이미지 파일 a.jpg를 b.jpg로 복사하는 프로그램을 작성하라.
//복사를 진행하는 동안 10% 진행할 때마다 '*' 하나씩 출력하도록 하라.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class h0808 {
		public static void main(String[] args) {
			FileInputStream fin =null;
			FileOutputStream fout =null;
			try {
				fin= new FileInputStream("src\\명품자바_8장\\tmp\\aa.jpg");
				fout= new FileOutputStream("src\\명품자바_8장\\tmp\\복사.jpg");
				int c;
				int total= fin.available(); //전체 개수
				int count=0; // 현재 개수
				while((c=fin.read())!=-1)
				{
					if(count==total/10)
					{
						System.out.print("*");
						count=0;
					}
					fout.write(c);
					count++;
				}
				fin.close();
				fout.close();
			} catch(IOException e)
			{
				System.out.print("파일 입출력 오류");
			}
		}
}
