package ��ǰ�ڹ�_7��;
//�̸��� ����(4.5����)�� 5�� �Է¹޾� �ؽøʿ� �����ϰ�, ���л� ���� ������ �Է� �޾� ���л� ����� ����϶�.

import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
public class h0707 {

	
	public static void main(String[] args) {
		System.out.println("�̷����бݰ����ý����Դϴ�.");
		HashMap <String,Double> hash= new HashMap<String,Double>();
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<5;i++)
		{
			System.out.print("�̸��� ����>>");
			String name= sc.next();
			double grade=sc.nextDouble();
			hash.put(name, grade);
		}
		System.out.print("���б� ���� ���� ���� �Է�>>");
		double x=sc.nextDouble();
		System.out.print("���л� ���: ");
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
