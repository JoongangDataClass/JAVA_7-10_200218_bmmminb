package ��ǰ�ڹ�_8��;
//���� ���͸��� ��� ����ϴ� ���α׷��� �ۼ��϶�.
import java.io.File;
public class h0803 {

	public static void main(String[] args) {
		File file = new File("src");
		for(String s: file.list()) {
			File sf = new File(file,s); // file�� parent s�� child ��θ�
			if(sf.isDirectory())
			{
				System.out.println(sf);
			}
		}
	}
}
