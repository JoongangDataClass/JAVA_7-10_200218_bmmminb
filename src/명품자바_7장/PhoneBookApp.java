package 명품자바_7장;
// <전화번호 관리 프로그램 만들기>
//제네릭 해시맵(HashMap)을 이용하여 전화번호 관리 프로그램을 만들어보자.
//Phone 클래스를 작성하여 하나의 전화번호 정보를 표현한다. 
//하나의 전화번호 정보는 이름, 주소, 전화번호로 구성된다. 
//동일한 이름을 가진 사람이 입력되지 않도록 프로그램에서 걸러야 한다. 
//이 프로그램의 메뉴는 삽입, 삭제, 찾기, 전체 보기, 종료의 총 5가지이다. 
//실행 사례를 들면 다음과 같다. 문제를 단순화하기 위해 파일 입출력은 하지 않아도 되며 연습문제를 통해 파일 입출력 메뉴를 삽입해보는 것이 좋겠다.
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
		System.out.println("전화번호 관리 프로그램을 시작합니다. 파일로 저장하지 않습니다.");
		System.out.println("------------------");
		while(true) {
		System.out.print("삽입: 0, 삭제 : 1, 찾기: 2 , 전체보기: 3, 종료: 4 >>");
		int key=sc.nextInt();
		switch(key)
		{
			case 0: input(); break;
			case 1: delete(); break;
			case 2: search(); break;
			case 3: show(); break;
			case 4: System.exit(0);
			default: error("잘못 입력하였습니다.");
		}
		}
	}
	public void input() {
		System.out.println("이름>>");
		String name= sc.next();
		if(hash.get(name)!=null)
		{
			System.out.println(name+"은 이미 등록되어 있는 사람입니다.");
		}
		else {
		System.out.println("주소>>");
		String addr= sc.next();
		System.out.println("전화번호");
		String number=sc.next();
		Phone phone= new Phone(name,addr,number);
		hash.put(name, phone);
		}
	}
	public void delete() {
		System.out.print("이름>>");
		String name= sc.next();
		if(hash.get(name)==null)
			System.out.println(name+"는 등록되지 않은 사람입니다.");
			else
			{
				hash.remove(name);
				System.out.println(name+ "은 삭제되었습니다.");
			}	
	}
	public void search() {
		System.out.print("이름>>");
		String name= sc.next();
		if(hash.get(name)==null)
		System.out.println(name+"는 등록되지 않은 사람입니다.");
		else
			System.out.println(name +"의 주소는" +hash.get(name).getAddr()+" 전화번호는 " +hash.get(name).getNumber());
			
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
