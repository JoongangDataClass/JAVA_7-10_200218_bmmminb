package ��ǰ�ڹ�_7��;
// ���� �̸�, ����, �浵 ������ ���� Location Ŭ������ �ۼ��ϰ�, ���� �̸��� 'Ű'�� �ϴ� HashMap<String, Location>
// �÷����� �����, ����ڷκ��� �Է� �޾� 4���� ���ø� �����϶�. �׸��� ���� �̸����� �˻��ϴ� ���α׷��� �ۼ��϶�.

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
class Location
{
	private String city;
	private int longitude;
	private int latitude;
	public Location(String city, int longitude, int latitude) {
		super();
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public String getCity() {
		return city;
	}
	public int getLongitude() {
		return longitude;
	}
	public int getLatitude() {
		return latitude;
	}
	public void find(String city)
	{
		if(city.equals(this.city))
			System.out.println(city + " " + longitude + " " + latitude);
	}
	
}

public class h0706 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Location []loc =new Location[4];
		HashMap <String,Location> hash= new HashMap<String,Location>();
		System.out.println("����, �浵, ���� �Է�: ");
		for(int i=0; i<loc.length; i++)
		{
			String text= sc.nextLine();
			StringTokenizer st= new StringTokenizer(text,",");
			String city= st.nextToken().trim();
			int longitude = Integer.parseInt(st.nextToken().trim());
			int latitude = Integer.parseInt(st.nextToken().trim());
			loc[i]= new Location(city,longitude,latitude);
			hash.put(city, loc[i]);
		}
		Set <String> key= hash.keySet();
		Iterator <String> it= key.iterator();
		System.out.println("------------------------");
		while(it.hasNext())
		{
			String name=it.next();
			Location l= hash.get(name);
			System.out.println(l.getCity() + " " +l.getLongitude() + " " + l.getLatitude());
		}
		while(true)
		{
			System.out.print("���� �̸� >>");
			String city= sc.next();
			if (city.equals("�׸�"))
			break;
			Location l= hash.get(city);
			if(l==null)
				System.out.println(city+ "�� �����ϴ�.");
			else
			l.find(city);
		}
	}
}
