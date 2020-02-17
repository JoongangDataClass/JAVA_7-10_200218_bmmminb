package 명품자바_7장;
// 도시 이름, 위도, 경도 정보를 가진 Location 클래스를 작성하고, 도시 이름을 '키'로 하는 HashMap<String, Location>
// 컬렉션을 만들고, 사용자로부터 입력 받아 4개의 도시를 저장하라. 그리고 도시 이름으로 검색하는 프로그램을 작성하라.

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
		System.out.println("도시, 경도, 위도 입력: ");
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
			System.out.print("도시 이름 >>");
			String city= sc.next();
			if (city.equals("그만"))
			break;
			Location l= hash.get(city);
			if(l==null)
				System.out.println(city+ "는 없습니다.");
			else
			l.find(city);
		}
	}
}
