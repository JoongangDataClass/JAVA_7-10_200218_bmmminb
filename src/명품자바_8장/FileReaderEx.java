package ��ǰ�ڹ�_8��;
import java.io.*;
public class FileReaderEx {

	public static void main(String[] args) {
		FileReader in=null;
		try {
			//���Ϸκ��� ���� �Է� ��Ʈ�� ����
			in= new FileReader("c:\\windows\\system.ini");
			int c=0;
			while((c =in.read()) !=-1) // �� ���ھ� �д´�
			{
				System.out.print((char)c);
			}
			in.close();
		} catch (IOException e)
		{
			System.out.println("����� ����");
		}
	}
	
}
