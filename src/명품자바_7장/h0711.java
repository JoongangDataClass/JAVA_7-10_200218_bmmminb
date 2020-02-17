package 명품자바_7장;
// 나라 이름(country)과 수도(capital)로 구성된 Nation 클래스를 작성하고 Vector<Nation> 컬렉션을 이용하여 프로그램을 작성하라.
import java.util.Scanner;
import java.util.Vector;

class Nation
{
	private String country;
	private String capital;
	public Nation(String country, String capital)
	{
		this.country=country;
		this.capital=capital;
	}
	public String getCountry() {
		return country;
	}
	public String getCapital() {
		return capital;
	}
}
class CapitalGame{
	Vector <Nation> v = new Vector <Nation>();
	Scanner sc=new Scanner(System.in);
	public void Run() {
		System.out.println("수도 맞추기 게임을 시작합니다.");
		while(true) {
		System.out.print("입력:1 퀴즈:2 종료:3>>");
		int key=sc.nextInt();
		switch(key) {
			case 1: input(); break;
			case 2: quiz(); break;
			case 3: finish(); return;
			default: error("잘못된 입력입니다.");
		}
		}
	}
	public boolean contains(String country)
	{
		for(int i=0; i<v.size();i++)
		{
			if(country.equals(v.get(i).getCountry()))
				return true;
		}
		return false;
	}
	public void input() {

		System.out.println("현재 " +v.size()+"개 나라와 수도가 입력되어 있습니다.");
		while(true) {
			System.out.println("나라"+(v.size()+1)+"와 수도 입력: ");
			String country= sc.next();
			if(country.equals("그만"))
				break;
			String capital= sc.next();
			
			if(contains(country))
				System.out.println(country+"는 이미 있습니다!");
			else
			{
				v.add(new Nation(country,capital));
			}
				
		}
		
	}
	public void quiz()
	{
		while(true)
		{
			int index= (int) (Math.random()*v.size());
			Nation nation= v.get(index);
			System.out.print(nation.getCountry()+"의 수도는?");
			String answer=sc.next();
			if(answer.equals("그만")) break;
			else if(answer.equals(nation.getCapital()))
				System.out.println("정답!!!");
			else
				System.out.println("아닙니다!!");
			
		}
	}
	public void finish() {
		System.out.println("게임을 종료합니다.");
	}
	public void error(String msg) {
		System.out.println(msg);
	}
}
public class h0711 {

	public static void main(String[] args) {
		CapitalGame game= new CapitalGame();
		game.Run();
		
		
		
	}
}
