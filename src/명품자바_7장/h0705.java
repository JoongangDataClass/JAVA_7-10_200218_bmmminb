package 명품자바_7장;
// 하나의 학생 정보를 나타내는 Student 클래스에는 이름, 학과, 학번, 학점 평균을 저장하는 필드가 있다.
// (1) 학생마다 Student 객체를 생성하고 4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에, 
// ArrayList<Student>의 모든 학생(4명) 정보를 출력하고 학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하라.
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
		System.out.println("이름 학과 학번 학점평균");
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
			System.out.println("이름 : "+s.getName());
			System.out.println("학과 : "+s.getDept());
			System.out.println("학번 : "+s.getNumber());
			System.out.println("학점평균 : "+s.getGrade());
		}
		System.out.println("---------------");
		while(true)
		{
			System.out.print("학생 이름 >>");
			String name=sc.nextLine();
			if(name.equals("그만"))
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
