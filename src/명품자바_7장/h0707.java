package 명품자바_7장;
//이름과 학점(4.5만점)을 5개 입력받아 해시맵에 저장하고, 장학생 선발 기준을 입력 받아 장학생 명단을 출력하라.

import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
public class h0707 {

	
	public static void main(String[] args) {
		System.out.println("미래장학금관리시스템입니다.");
		HashMap <String,Double> hash= new HashMap<String,Double>();
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<5;i++)
		{
			System.out.print("이름과 학점>>");
			String name= sc.next();
			double grade=sc.nextDouble();
			hash.put(name, grade);
		}
		System.out.print("장학금 선발 학점 기준 입력>>");
		double x=sc.nextDouble();
		System.out.print("장학생 명단: ");
		Iterator <String> it= hash.keySet().iterator();
		while(it.hasNext())
		{
			String name=it.next();
			double score=hash.get(name);
			if(score>=x)
				System.out.print(name+ " ");
		}
		System.out.println("");
		sc.close();
	}
}
