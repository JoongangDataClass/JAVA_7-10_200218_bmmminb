package 생활코딩;

public class Main {

	public static void main(String[] args) {
		LinkedList numbers= new LinkedList();

		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addFirst(5);
		numbers.add(1,15);
		System.out.println(numbers.removeFirst());
		System.out.println(numbers);
		System.out.println(numbers.remove(2));
		System.out.println(numbers);
	}
}
