package ��ǰ�ڹ�_7��;


/*public boolean add(Object obj); //����(���� �ڷ�� �������� ����)
public void clear();//��� ��� ����
public Object clone(); //�ڽ��� ������ ��ü ��ȯ
public boolean contains(Object obj);//������ �ڷ����� �Ǻ�
public boolean isEmpty();//����ִ��� �Ǻ�
public Iterator<Element> iterator();//�ݺ��� ��ȯ
public boolean remove(Object obj);//������ �ڷḦ ����
public int size();//������ �ڷ� ���� ��ȯ
*/
//HashSet ����ϴ� ���� Ŭ����
import java.util.HashSet;
import java.util.Scanner;

public class Tracer {
	Scanner sc= new Scanner(System.in);
	HashSet <String> hs = new HashSet<String>();
	
	public void Run() {
		int key=0;
		while((key=selectMenu())!=0)
		{
			switch(key) {
			case 1:	addMember(); break;
			case 2:	removeMember(); break;
			case 3:	searchMember(); break;
			case 4:	listMember(); break;
			default: System.out.println("�߸� �����ϼ̽��ϴ�."); break;
			}
		}
		System.out.println("�����մϴ�...");
	}
	int selectMenu() {
		System.out.println("1.�߰� 2.���� 3.�˻� 4.��� 0.����");
		int key= sc.nextInt();
		sc.nextLine();
		return key;
	}
	void addMember() {
		String name="";
		System.out.print("�߰��� ȸ�� �̸�: ");
		name=sc.nextLine();
		
		if(hs.add(name)) {
			System.out.println("�߰��Ͽ����ϴ�.");
		}
		else {
			System.out.println("�̹� �����մϴ�");
		}
	}
	void removeMember() {
		String name="";
		System.out.print("������ ȸ�� �̸�: ");
		name=sc.nextLine();
		
		if(hs.remove(name)) {
			System.out.println("�����Ͽ����ϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}
	void searchMember() {
		String name="";
		System.out.print("�˻��� ȸ�� �̸�: ");
		name=sc.nextLine();
		if(hs.contains(name)) {
			System.out.println("�����մϴ�.");
		}
		else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}
	void listMember() {
		System.out.println("��ü ���");
		int cnt= hs.size();
		System.out.println("ȸ�� ��:" +cnt);
		for(String name : hs) {
			System.out.println(name);
		}
	}
}

