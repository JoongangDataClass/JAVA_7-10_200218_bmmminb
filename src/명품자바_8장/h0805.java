package ��ǰ�ڹ�_8��;
//5��
//����ڷκ��� �� ���� ���� �̸��� �Է¹ް� �� ������ ������ ���Ͽ� ������ "������ �����ϴ�."��,
//Ʋ���� "������ ���� �ٸ��ϴ�."�� ����ϴ� ���α׷��� �ۼ��϶�.
//�� ����� ������ �ؽ�Ʈ �� ���̳ʸ� ���� ��θ� �����Ѵ�.
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class h0805 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		FileInputStream F1 =null;
		FileInputStream F2 =null;
		int same=0; //���� �������� �ٸ� �������� �����ϴ� ����
		try {
			int a,b;
			F1= new FileInputStream("src\\��ǰ�ڹ�_8��\\tmp\\"+sc.next());
			F2= new FileInputStream("src\\��ǰ�ڹ�_8��\\tmp\\"+sc.next());
			
			if(F1.available()!=F2.available()) {
				same=0;
			}
			else {
				same=1; // ������ ���̰� ����
				while((a=F1.read())!=-1) // ���� 1 �б�
				{
					b=F2.read(); // ���� 2 �б�
					if(a!=b)
					{
						same=0;
						break;
					}
				}
			}
			F1.close();
			F2.close();
			if(same==1)
			{
				System.out.print("�� ������ �����ϴ�.");
			}
			else
				System.out.print("�� ������ �ٸ��ϴ�.");
		}
		catch(IOException e)
		{
			System.out.print("���� ����� ����");
		}
	}
	
}
