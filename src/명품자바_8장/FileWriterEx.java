package ��ǰ�ڹ�_8��;
import java.io.*;
public class FileWriterEx {

	public static void main(String[] args) {
		InputStreamReader in= new InputStreamReader(System.in);
		
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("src\\��ǰ�ڹ�_8��\\test.txt");
			while((c = in.read())!=-1)
					{
						fout.write(c);
					}
			in.close();
			fout.close();
		} catch (IOException e)
		{
			System.out.println("����� ����");
		}
	}
}
