package ��ǰ�ڹ�_8��;
import java.io.FileInputStream;
//4. ����ڷκ��� �� ���� �ؽ�Ʈ ���� �̸��� �Է¹ް� ù ��° ���� �ڿ� �� ��° ������ ���ٿ� ���ο� ������ �����ϴ� ���α׷��� �ۼ��϶�.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class h0804 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		FileReader F1=null;
		FileReader F2=null;
		FileWriter F3=null;
		InputStreamReader in=null;
		FileInputStream fin =null;
		try {
			F1= new FileReader("src\\��ǰ�ڹ�_8��\\tmp\\"+sc.next()+".txt");
			F2= new FileReader("src\\��ǰ�ڹ�_8��\\tmp\\"+sc.next()+".txt");
			F3= new FileWriter("src\\��ǰ�ڹ�_8��\\tmp\\text3.txt");
			int c;
			
			while((c=F1.read())!=-1)
			{
				F3.write((char) c);
			}
			while((c=F2.read())!=-1)
			{
				F3.write((char) c);
			}
			
			F1.close();
			F2.close();
			F3.close();
			
		
		}
		catch(IOException e)
		{
			System.out.println("���� ����� ����");
		}
		
		try {
			F1= new FileReader("src\\��ǰ�ڹ�_8��\\tmp\\text3.txt");
			int c;
			while((c=F1.read())!=-1)
			{
				System.out.print((char) c);
			}
			F1.close();
			/*
			 * fin= new FileInputStream("src\\��ǰ�ڹ�_8��\\tmp\\text3.txt"); in = new
			 * InputStreamReader(fin); int c; while((c=in.read())!=-1) {
			 * System.out.print((char) c); } in.close(); fin.close();
			 */
		}
		catch(IOException e)
		{
			System.out.println("���� ����� ����");
		}
	}
}
