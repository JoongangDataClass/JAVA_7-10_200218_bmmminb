package ��ǰ�ڹ�_7��;
//���� �̸��� ����Ʈ ������ �����ϴ� ���α׷��� �ؽø��� �̿��Ͽ� �ۼ��϶�.
// ���α׷��� ���� �̸��� ����Ʈ�� �Բ� ���� �����ϴµ�, ����Ʈ�� �߰��� ������ �����Ͽ� ����ȴ�.

import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
public class h0708 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap <String, Integer> client = new HashMap<String,Integer>();
		while(true)
		{
			System.out.print("�̸��� ����Ʈ �Է�>>>");
			String name= sc.next();
			if(name.equals("�׸�"))
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
