package 명품자바_7장;
import java.util.Scanner;
import java.util.HashMap;
//"그만"이 입력될 때까지 나라 이름과 인구를 입력받아 저장하고, 다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 작성하라. 
// 다음 해시맵을 이용하라.
public class h0703 {

	
	public static void main(String[] args) {
		HashMap <String,Integer> hash = new HashMap <String,Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요.(예:Korea 5000)");
		while(true)
		{
			System.out.print("나라 이름,인구>>");
			String str = sc.nextLine();
			if(str.equals("그만"))
				break;
			String [] sen = str.split(" ");
			hash.put(sen[0], Integer.parseInt(sen[1]));
		}
		while(true)
		{
			System.out.print("인구 검색>>");
			String str = sc.nextLine();
			if(str.equals("그만"))
				break;
			if(hash.containsKey(str))
			{
				System.out.println(str+"의 인구는 " +hash.get(str));
			}
			else {
				System.out.println(str + "나라는 없습니다.");
			}
			
		}
		sc.close();
	}
}
