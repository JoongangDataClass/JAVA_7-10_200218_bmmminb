package ��ǰ�ڹ�_7��;
import java.util.Scanner;
import java.util.HashMap;
//"�׸�"�� �Էµ� ������ ���� �̸��� �α��� �Է¹޾� �����ϰ�, �ٽ� ���� �̸��� �Է¹޾� �α��� ����ϴ� ���α׷��� �ۼ��϶�. 
// ���� �ؽø��� �̿��϶�.
public class h0703 {

	
	public static void main(String[] args) {
		HashMap <String,Integer> hash = new HashMap <String,Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��:Korea 5000)");
		while(true)
		{
			System.out.print("���� �̸�,�α�>>");
			String str = sc.nextLine();
			if(str.equals("�׸�"))
				break;
			String [] sen = str.split(" ");
			hash.put(sen[0], Integer.parseInt(sen[1]));
		}
		while(true)
		{
			System.out.print("�α� �˻�>>");
			String str = sc.nextLine();
			if(str.equals("�׸�"))
				break;
			if(hash.containsKey(str))
			{
				System.out.println(str+"�� �α��� " +hash.get(str));
			}
			else {
				System.out.println(str + "����� �����ϴ�.");
			}
			
		}
		sc.close();
	}
}
