package ��ǰ�ڹ�_7��;
// Scanner Ŭ������ -1�� �Էµ� ������ ���� ������ �Է¹޾� ���Ϳ� �����ϰ� ���͸� �˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��϶�.
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
		System.out.println("���� ū ���� :" + big);
	}
	public static void main(String[] args) {
		Vector <Integer> v= new Vector<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.print("����(-1�� �Էµ� ������)>>>");
		
		while(true) {
			int s=sc.nextInt();
			if(s==-1)
				break;
			v.add(s);
		}
		if(v.size()==0) {
			System.out.println("���� �ϳ��� ����");
			sc.close();
			return;
		}
		else {
		PrintBig(v);
		sc.close();
		}
	}
		
}
