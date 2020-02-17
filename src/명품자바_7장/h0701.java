package 명품자바_7장;
// Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 벡터에 저장하고 벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.
import java.util.*;
public class h0701 {

	public static void PrintBig(Vector <Integer> v)
	{
		int big= v.get(0);
		for(int i=1; i<v.size(); i++)
		{
			if(big<v.get(i))
				big=v.get(i);
		}
		System.out.println("가장 큰 수는 :" + big);
	}
	public static void main(String[] args) {
		Vector <Integer> v= new Vector<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.print("정수(-1이 입력될 때까지)>>>");
		
		while(true) {
			int s=sc.nextInt();
			if(s==-1)
				break;
			v.add(s);
		}
		if(v.size()==0) {
			System.out.println("수가 하나도 없음");
			sc.close();
			return;
		}
		else {
		PrintBig(v);
		sc.close();
		}
	}
		
}
