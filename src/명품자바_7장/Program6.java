package 명품자바_7장;

public class Program6 {

	public static void main(String[] args) {
		UserArrayStack stack= new UserArrayStack(5);
		stack.push(5);
		stack.push(3);
		stack.push(8);
		stack.pop();
		stack.peek();
		stack.push('A');
	}
}
