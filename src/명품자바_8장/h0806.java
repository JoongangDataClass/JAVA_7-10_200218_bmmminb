package ��ǰ�ڹ�_8��;
import java.io.BufferedReader;
// �ڹ� �ҽ� ������ �о�鿩�� �� �տ� �� ��ȣ�� �ٿ��� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��϶�.
import java.io.FileReader;
import java.io.IOException;

public class h0806 {

	public static void main(String[] args) {
		FileReader in=null;
		try {
			in = new FileReader("src\\��ǰ�ڹ�_8��\\h0805.java");
			BufferedReader bin= new BufferedReader(in);
			String s;
			int a=1;
			while((s=bin.readLine())!=null)
			{
				System.out.format("%4d: %s%n", a, s);
				a++;
				
			}
			in.close();
		} catch(IOException e)
		{
			System.out.print("���� ����� ����");
		}
	}
}
