package 명품자바_7장;
//스택
//import java.util.Stack;

/*
public void push(Element data);//순차보관
public Element pop();//가장 최근에 보관한 값 꺼내고 반환
public Element peek();//가장 최근에 보관한 값 단순 참조, 꺼내지 않음
public boolean empty(); //비어있는지 판별
public int search(Element data); //data를 보관한 순번 반환(1부터 시작)
*/




public class Program5 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(3); // 3
		stack.push(2); // 3 2
		System.out.println(stack.pop()); // 2를 출력, 스택에는 3
		stack.push(6); // 3 6
		stack.push(8); // 3 6 8
		System.out.println(stack.peek()); // 가장 최근에 보관한 값은 8
		//System.out.println(stack.search(6)); // 두 번째 보관한 요소임
		while(stack.isEmpty()==false)
		{
			System.out.println(stack.pop()); // 8 6 3 순으로 꺼냄
		}
	}
}
