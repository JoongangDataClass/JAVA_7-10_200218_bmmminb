package ��ǰ�ڹ�_7��;
// <��ȭ��ȣ ���� ���α׷� �����>
//���׸� �ؽø�(HashMap)�� �̿��Ͽ� ��ȭ��ȣ ���� ���α׷��� ������.
//Phone Ŭ������ �ۼ��Ͽ� �ϳ��� ��ȭ��ȣ ������ ǥ���Ѵ�. 
//�ϳ��� ��ȭ��ȣ ������ �̸�, �ּ�, ��ȭ��ȣ�� �����ȴ�. 
//������ �̸��� ���� ����� �Էµ��� �ʵ��� ���α׷����� �ɷ��� �Ѵ�. 
//�� ���α׷��� �޴��� ����, ����, ã��, ��ü ����, ������ �� 5�����̴�. 
//���� ��ʸ� ��� ������ ����. ������ �ܼ�ȭ�ϱ� ���� ���� ������� ���� �ʾƵ� �Ǹ� ���������� ���� ���� ����� �޴��� �����غ��� ���� ���ڴ�.
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

class Phone{
	private String name;
	private String addr;
	private String number;
	public Phone(String name, String addr, String number) {
		super();
		this.name = name;
		this.addr = addr;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public String getNumber() {
		return number;
	}
	
}

public class PhoneBookApp {
	HashMap <String, Phone> hash= new HashMap<String,Phone>();
	Scanner sc= new Scanner(System.in);
	public void run() {
		System.out.println("------------------");
		System.out.println("��ȭ��ȣ ���� ���α׷��� �����մϴ�. ���Ϸ� �������� �ʽ��ϴ�.");
		System.out.println("------------------");
		while(true) {
		System.out.print("����: 0, ���� : 1, ã��: 2 , ��ü����: 3, ����: 4 >>");
		int key=sc.nextInt();
		switch(key)
		{
			case 0: input(); break;
			case 1: delete(); break;
			case 2: search(); break;
			case 3: show(); break;
			case 4: System.exit(0);
			default: error("�߸� �Է��Ͽ����ϴ�.");
		}
		}
	}
	public void input() {
		System.out.println("�̸�>>");
		String name= sc.next();
		if(hash.get(name)!=null)
		{
			System.out.println(name+"�� �̹� ��ϵǾ� �ִ� ����Դϴ�.");
		}
		else {
		System.out.println("�ּ�>>");
		String addr= sc.next();
		System.out.println("��ȭ��ȣ");
		String number=sc.next();
		Phone phone= new Phone(name,addr,number);
		hash.put(name, phone);
		}
	}
	public void delete() {
		System.out.print("�̸�>>");
		String name= sc.next();
		if(hash.get(name)==null)
			System.out.println(name+"�� ��ϵ��� ���� ����Դϴ�.");
			else
			{
				hash.remove(name);
				System.out.println(name+ "�� �����Ǿ����ϴ�.");
			}	
	}
	public void search() {
		System.out.print("�̸�>>");
		String name= sc.next();
		if(hash.get(name)==null)
		System.out.println(name+"�� ��ϵ��� ���� ����Դϴ�.");
		else
			System.out.println(name +"�� �ּҴ�" +hash.get(name).getAddr()+" ��ȭ��ȣ�� " +hash.get(name).getNumber());
			
	}
	public void show() {
		Iterator <String> it = hash.keySet().iterator();
		while(it.hasNext())
		{
			String check = it.next();
		
			System.out.println(check +"\t" +hash.get(check).getAddr()+"\t" +hash.get(check).getNumber());
			
			
		}
	}
	
	public void error(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		PhoneBookApp phone= new PhoneBookApp();
		phone.run();
	}

}
