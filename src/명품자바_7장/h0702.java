package 명품자바_7장;
// Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아 ArrayList에 저장하고,
//ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여 평균을 출력하는 프로그램을 작성하라. 
import java.util.Scanner;
import java.util.ArrayList;
public class h0702 {

	
	public static void main(String[] args) {
		ArrayList <Character >arraylist = new ArrayList <Character>();
		Scanner sc= new Scanner(System.in);
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		for(int i=0; i<6; i++)
		{
			char g= sc.next().charAt(0);
			arraylist.add(g);
		}
		double sum=0;
		for(int i=0; i<arraylist.size(); i++) {
			char c = arraylist.get(i);
			switch(c) {
			
			case 'A': sum+=4.0; break;
			case 'B': sum+=3.0; break;
			case 'C': sum+=2.0; break;
			case 'D': sum+=1.0; break;
			case 'F':  break;
			}
		}
		double average= sum/6;
		System.out.println(average);
		sc.close();
	}
}
