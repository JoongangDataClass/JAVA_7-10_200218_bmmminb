package ��ǰ�ڹ�_7��;
// ���� �̸�(country)�� ����(capital)�� ������ Nation Ŭ������ �ۼ��ϰ� Vector<Nation> �÷����� �̿��Ͽ� ���α׷��� �ۼ��϶�.
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
		System.out.println("���� ���߱� ������ �����մϴ�.");
		while(true) {
		System.out.print("�Է�:1 ����:2 ����:3>>");
		int key=sc.nextInt();
		switch(key) {
			case 1: input(); break;
			case 2: quiz(); break;
			case 3: finish(); return;
			default: error("�߸��� �Է��Դϴ�.");
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

		System.out.println("���� " +v.size()+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		while(true) {
			System.out.println("����"+(v.size()+1)+"�� ���� �Է�: ");
			String country= sc.next();
			if(country.equals("�׸�"))
				break;
			String capital= sc.next();
			
			if(contains(country))
				System.out.println(country+"�� �̹� �ֽ��ϴ�!");
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
			System.out.print(nation.getCountry()+"�� ������?");
			String answer=sc.next();
			if(answer.equals("�׸�")) break;
			else if(answer.equals(nation.getCapital()))
				System.out.println("����!!!");
			else
				System.out.println("�ƴմϴ�!!");
			
		}
	}
	public void finish() {
		System.out.println("������ �����մϴ�.");
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
