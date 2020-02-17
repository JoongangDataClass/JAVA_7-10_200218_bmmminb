package 명품자바_7장;
//고객의 이름과 포인트 점수를 관리하는 프로그램을 해시맵을 이용하여 작성하라.
// 프로그램은 고객의 이름과 포인트를 함께 저장 관리하는데, 포인트는 추가될 때마다 누적하여 저장된다.

import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
public class h0708 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap <String, Integer> client = new HashMap<String,Integer>();
		while(true)
		{
			System.out.print("이름과 포인트 입력>>>");
			String name= sc.next();
			if(name.equals("그만"))
				break;
			int point= sc.nextInt();
			if(client.get(name)==null)
			{	
			client.put(name, point);
			}
			else {
				client.put(name,client.get(name)+point);
			}
			Iterator <String> it = client.keySet().iterator();
			while(it.hasNext())
			{
				String people=it.next();
				int sum=client.get(people);
				System.out.print("("+people+","+sum+") ");
			}
			System.out.println();
		}
		
	}
}
