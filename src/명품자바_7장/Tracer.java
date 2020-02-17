package 명품자바_7장;


/*public boolean add(Object obj); //보관(같은 자료는 보관하지 않음)
public void clear();//모든 요소 삭제
public Object clone(); //자신을 복제한 개체 반환
public boolean contains(Object obj);//보관한 자료인지 판별
public boolean isEmpty();//비어있는지 판별
public Iterator<Element> iterator();//반복자 반환
public boolean remove(Object obj);//보관한 자료를 제거
public int size();//보관한 자료 개수 반환
*/
//HashSet 사용하는 예제 클래스
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
			default: System.out.println("잘못 선택하셨습니다."); break;
			}
		}
		System.out.println("종료합니다...");
	}
	int selectMenu() {
		System.out.println("1.추가 2.삭제 3.검색 4.목록 0.종료");
		int key= sc.nextInt();
		sc.nextLine();
		return key;
	}
	void addMember() {
		String name="";
		System.out.print("추가할 회원 이름: ");
		name=sc.nextLine();
		
		if(hs.add(name)) {
			System.out.println("추가하였습니다.");
		}
		else {
			System.out.println("이미 존재합니다");
		}
	}
	void removeMember() {
		String name="";
		System.out.print("삭제할 회원 이름: ");
		name=sc.nextLine();
		
		if(hs.remove(name)) {
			System.out.println("삭제하였습니다.");
		} else {
			System.out.println("존재하지 않습니다.");
		}
	}
	void searchMember() {
		String name="";
		System.out.print("검색할 회원 이름: ");
		name=sc.nextLine();
		if(hs.contains(name)) {
			System.out.println("존재합니다.");
		}
		else {
			System.out.println("존재하지 않습니다.");
		}
	}
	void listMember() {
		System.out.println("전체 목록");
		int cnt= hs.size();
		System.out.println("회원 수:" +cnt);
		for(String name : hs) {
			System.out.println(name);
		}
	}
}

