package ��ǰ�ڹ�_8��;
// 2. �ؽ�Ʈ ������ �о� �ҹ��ڷ� �� ���� ���ڸ� ��� �빮�ڷ� �ٲ㼭 ����ϴ� ���α׷��� ���� ��Ʈ���� �̿��Ͽ� �ۼ��϶�.
import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
public class h0802 {

	public static void main(String[] args) {
		FileReader fin =null;
		BufferedOutputStream bout = new BufferedOutputStream(System.out,5);
		try {
			fin = new FileReader("src\\��ǰ�ڹ�_8��\\tmp\\test1.txt");
			int c;
			while((c=fin.read())!=-1) {
				String s= Character.toString((char) c).toUpperCase();
				char g=s.charAt(0);	
				bout.write(g);
			}
			fin.close();
			bout.close();
		} catch (IOException e)
		{
			System.out.println("������ �������� �ʽ��ϴ�");
		}
	}
}
