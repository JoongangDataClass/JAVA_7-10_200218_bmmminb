package ��ǰ�ڹ�_7��;
// Scanner Ŭ������ ����Ͽ� 6�� ����('A', 'B', 'C', 'D', 'F')�� ���ڷ� �Է¹޾� ArrayList�� �����ϰ�,
//ArrayList�� �˻��Ͽ� ������ ����(A=4.0, B=3.0, C=2.0, D=1.0, F=0)�� ��ȯ�Ͽ� ����� ����ϴ� ���α׷��� �ۼ��϶�. 
import java.util.Scanner;
import java.util.ArrayList;
public class h0702 {

	
	public static void main(String[] args) {
		ArrayList <Character >arraylist = new ArrayList <Character>();
		Scanner sc= new Scanner(System.in);
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F) >> ");
		for(int i=0; i<6; i++)
		{
			char g= sc.next().charAt(0);
			arraylist.add(g);
		}
		double sum=0;
		for(int i=0; i<arraylist.size(); i++) {
			char c = arraylist.get(i);
			switch(c) {
			
			case 'A': sum+=4.0; break;
			case 'B': sum+=3.0; break;
			case 'C': sum+=2.0; break;
			case 'D': sum+=1.0; break;
			case 'F':  break;
			}
		}
		double average= sum/6;
		System.out.println(average);
		sc.close();
	}
}
