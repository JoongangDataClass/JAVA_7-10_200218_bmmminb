package ��ǰ�ڹ�_7��;
// ArrayList<Student> ���, HashMap<String, Studnet> �ؽø��� �̿��Ͽ� �ٽ� �ۼ��϶�. �ؽøʿ��� Ű�� �л� �̸����� �Ѵ�.

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
		System.out.println("�̸� �а� �й� �������");
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
			System.out.println("�̸� : "+s.getName());
			System.out.println("�а� : "+s.getDept());
			System.out.println("�й� : "+s.getNumber());
			System.out.println("������� : "+s.getGrade());
		}
		System.out.println("---------------");
		while(true)
		{
			System.out.print("�л� �̸� >>");
			String name=sc.next();
			if(name.equals("�׸�"))
				break;
			Student s=hash.get(name);
			s.find(name);
		}
		sc.close();
	}
}
