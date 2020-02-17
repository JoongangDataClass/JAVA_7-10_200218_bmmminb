package ��ǰ�ڹ�_7��;
// �ϳ��� �л� ������ ��Ÿ���� Student Ŭ�������� �̸�, �а�, �й�, ���� ����� �����ϴ� �ʵ尡 �ִ�.
// (1) �л����� Student ��ü�� �����ϰ� 4���� �л� ������ ArrayList<Student> �÷��ǿ� ������ �Ŀ�, 
// ArrayList<Student>�� ��� �л�(4��) ������ ����ϰ� �л� �̸��� �Է¹޾� �ش� �л��� ���� ����� ����ϴ� ���α׷��� �ۼ��϶�.
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
class Student{
	private String name;
	private String dept;
	private String number;
	private double grade;
	public Student(String name, String dept, String number, double grade)
	{
		this.name=name;
		this.dept=dept;
		this.number=number;
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public String getNumber() {
		return number;
	}
	public double getGrade() {
		return grade;
	}
	public void find(String name) {
		if(name.equals(this.name))
		{
			System.out.println(this.name+"," + this.dept+"," +this.number+","+this.grade);
		}
	}
}
public class h0705 {


	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Student [] st= new Student[4];
		ArrayList <Student> list= new ArrayList<Student>();
		System.out.println("�̸� �а� �й� �������");
		for(int i=0; i<st.length; i++)
		{
			System.out.print(">>");
			String text=sc.nextLine();
			StringTokenizer token= new StringTokenizer(text,",");
			String n= token.nextToken().trim();
			String dept=token.nextToken().trim();
			String number=token.nextToken().trim();
			double grade=Double.parseDouble(token.nextToken().trim());
			st[i]= new Student(n,dept,number,grade);
			list.add(st[i]);
		}
		for(int i=0;i <list.size(); i++) {
			System.out.println("------------------------");
			Student s= list.get(i);
			System.out.println("�̸� : "+s.getName());
			System.out.println("�а� : "+s.getDept());
			System.out.println("�й� : "+s.getNumber());
			System.out.println("������� : "+s.getGrade());
		}
		System.out.println("---------------");
		while(true)
		{
			System.out.print("�л� �̸� >>");
			String name=sc.nextLine();
			if(name.equals("�׸�"))
				break;
			for(int i=0; i<list.size(); i++)
			{
				Student s= list.get(i);
				s.find(name);
			}
		}
		sc.close();
	}
}
