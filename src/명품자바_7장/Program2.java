package 명품자바_7장;
// 제네릭 메서드
public class Program2 {
	static <T> T Foo(T value)
	{
		System.out.println(value);
		System.out.println();
		return value;
	}

	public static void main(String[] args) {
		int i=10;
		int re = Foo(i);
		System.out.println("re :" + re);
	
	}
}
