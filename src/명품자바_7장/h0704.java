package ��ǰ�ڹ�_7��;

//Vector �÷����� �̿��Ͽ� �������� ����� ���� �����ϴ� ���α׷��� �ۼ��϶�. 
//�������� �Է��ϸ� ���Ϳ� �߰��ϰ� ���� �Էµ� ��� �������� ����� ����Ѵ�.
import java.util.Vector;
import java.util.Scanner;
public class h0704 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector <Integer> vector =new Vector<Integer>();
		while(true) {
		System.out.print("������ �Է�(0 �Է½� ����): ");
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
		System.out.println("\n���� ��� "+sum/vector.size());
	}
	
	sc.close();
	}
}
