package 명품자바_7장;
// ArrayList<Student> 대신, HashMap<String, Studnet> 해시맵을 이용하여 다시 작성하라. 해시맵에서 키는 학생 이름으로 한다.

import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Iterator;

public class h0705_2 {


	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Student [] st= new Student[4];
		HashMap <String,Student> hash= new HashMap<String,Student>();
		System.out.println("이름 학과 학번 학점평균");
		for(int i=0; i<st.length; i++)
		{
			System.out.print(">>");
			String text=sc.nextLine();
			StringTokenizer token= new StringTokenizer(text,",");
			String n= token.nextToken().trim();
			String dept= token.nextToken().trim();
			String number=token.nextToken().trim();
			double grade=Double.parseDouble(token.nextToken().trim());
			st[i]= new Student(n,dept,number,grade);
			hash.put(n,st[i]);
		}
		Set<String> key=hash.keySet();
		Iterator <String> it= key.iterator();
		while(it.hasNext()){
			String name=it.next();
			System.out.println("------------------------");
			Student s= hash.get(name);
			System.out.println("이름 : "+s.getName());
			System.out.println("학과 : "+s.getDept());
			System.out.println("학번 : "+s.getNumber());
			System.out.println("학점평균 : "+s.getGrade());
		}
		System.out.println("---------------");
		while(true)
		{
			System.out.print("학생 이름 >>");
			String name=sc.next();
			if(name.equals("그만"))
				break;
			Student s=hash.get(name);
			s.find(name);
		}
		sc.close();
	}
}
