package ��ǰ�ڹ�_7��;
// ���׸� �޼���
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
