package ��ǰ�ڹ�_8��;
// 1. a.jpg ������ ũ�⸦ ȭ�鿡 ����ϴ� ���α׷��� �ۼ��϶�. 
//������ ũ��� File Ŭ������ length() �޼ҵ带 �̿��ϸ� �ȴ�. a.jpg�� ������Ʈ ���� �ؿ� �־�� �Ѵ�.
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class h0801 {

	public static void main(String[] args) {
		File f = new File("src\\��ǰ�ڹ�_8��\\tmp\\aa.jpg");
		if(f.exists()) {
			System.out.println(f.length());
		}
		else {
			System.out.println("������ �����ϴ�.");
		}
	}
}
