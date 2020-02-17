package 명품자바_7장;
import java.util.Vector;
import java.util.Scanner;
abstract class Shape {
	private Shape next;
	public Shape() { next = null; }
	public void setNext(Shape obj) { next = obj; } //링크 연결
	public Shape getNext() { return next; }
	public abstract void draw();
}
class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}
public class h0710 {

	public static void main(String[] args) {
		Vector <Shape> v = new Vector<Shape>();
		Scanner sc= new Scanner(System.in);
		Shape shape=null;
		System.out.println("그래픽 편집기를 실행합니다.");
	
		
		while(true)
		{
			System.out.print("삽입(1),삭제(2),모두보기(3),종료(4)");
			int key=sc.nextInt();
			switch(key)
			{
			case 1: 
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				int choice=sc.nextInt();
				switch(choice) {
				case 1: shape =new Line(); break;
				case 2: shape= new Rect(); break;
				case 3: shape= new Circle (); break;
				}
				v.add(shape);
				break;
			case 2:
				System.out.println("삭제할 도형의 위치 >>");
				int location=sc.nextInt();
				if(v.size()==0 || v.size()<=location)
					System.out.println("삭제할 수 없습니다.");
				else
					v.remove(location);
				break;
			case 3:
				for(int i=0; i<v.size(); i++)
				{
					v.get(i).draw();
				}
				break;
			case 4:
				System.out.print("beauty를 종료합니다.");
				sc.close();
				return;
			}
		}
	}
	
}
