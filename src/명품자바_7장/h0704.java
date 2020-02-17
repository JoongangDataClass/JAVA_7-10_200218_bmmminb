package 명품자바_7장;

//Vector 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하라. 
//강수량을 입력하면 벡터에 추가하고 현재 입력된 모든 강수량과 평균을 출력한다.
import java.util.Vector;
import java.util.Scanner;
public class h0704 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector <Integer> vector =new Vector<Integer>();
		while(true) {
		System.out.print("강수량 입력(0 입력시 종료): ");
		int n= sc.nextInt();
		if(n==0)
			break;
		vector.add(n);
		int sum=0;
		for(int i=0; i<vector.size(); i++)
		{
			System.out.print(vector.get(i) + " ");
			sum+=vector.get(i);
		}
		System.out.println("\n현재 평균 "+sum/vector.size());
	}
	
	sc.close();
	}
}
