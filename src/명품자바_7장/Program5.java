package ��ǰ�ڹ�_7��;
//����
//import java.util.Stack;

/*
public void push(Element data);//��������
public Element pop();//���� �ֱٿ� ������ �� ������ ��ȯ
public Element peek();//���� �ֱٿ� ������ �� �ܼ� ����, ������ ����
public boolean empty(); //����ִ��� �Ǻ�
public int search(Element data); //data�� ������ ���� ��ȯ(1���� ����)
*/




public class Program5 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(3); // 3
		stack.push(2); // 3 2
		System.out.println(stack.pop()); // 2�� ���, ���ÿ��� 3
		stack.push(6); // 3 6
		stack.push(8); // 3 6 8
		System.out.println(stack.peek()); // ���� �ֱٿ� ������ ���� 8
		//System.out.println(stack.search(6)); // �� ��° ������ �����
		while(stack.isEmpty()==false)
		{
			System.out.println(stack.pop()); // 8 6 3 ������ ����
		}
	}
}
