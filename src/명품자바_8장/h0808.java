package ��ǰ�ڹ�_8��;
//8��
//�̹��� ���� a.jpg�� b.jpg�� �����ϴ� ���α׷��� �ۼ��϶�.
//���縦 �����ϴ� ���� 10% ������ ������ '*' �ϳ��� ����ϵ��� �϶�.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class h0808 {
		public static void main(String[] args) {
			FileInputStream fin =null;
			FileOutputStream fout =null;
			try {
				fin= new FileInputStream("src\\��ǰ�ڹ�_8��\\tmp\\aa.jpg");
				fout= new FileOutputStream("src\\��ǰ�ڹ�_8��\\tmp\\����.jpg");
				int c;
				int total= fin.available(); //��ü ����
				int count=0; // ���� ����
				while((c=fin.read())!=-1)
				{
					if(count==total/10)
					{
						System.out.print("*");
						count=0;
					}
					fout.write(c);
					count++;
				}
				fin.close();
				fout.close();
			} catch(IOException e)
			{
				System.out.print("���� ����� ����");
			}
		}
}
