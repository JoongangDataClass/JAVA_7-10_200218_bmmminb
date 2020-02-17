package ��ǰ�ڹ�_7��;

interface StackIF{
	boolean isEmpty();
	boolean isFull();
	void push(Object data);
	void pop();
	void peek();
	void clear();
	
	
}
class ListStackNode{
	private Object data; // ������ ���� ����
	public ListStackNode link; // �ٸ� ��带 ������ ��ũ
	public ListStackNode() {
		this.data=null;
		this.link=null;
	}

	public ListStackNode(Object data)
	{
		this.data=data;
		this.link=null;
	}
	public ListStackNode(Object data, ListStackNode link)
	{
		this.data=data;
		this.link=link;
	}
	public Object getData() {
		return this.data;
	}
}

public class ListStack implements StackIF{
	private ListStackNode head; // ListStackNode Ÿ���� head ��� �ν��Ͻ� ����
	private ListStackNode top; // ������ top ������
	private int stacksize;
	// ���� ������
	public ListStack(int size)
	{
		head=null; // head �ʱ�ȭ
		top=null; // null �ʱ�ȭ
		this.stacksize=size;
	}
	// ������ ����ִ� �������� Ȯ��
	public boolean isEmpty() {
		return top==null;
	}
	// ������ ������ �������� Ȯ��
	public boolean isFull() {
		// ���� ������� ��� false ����
		if(isEmpty())
		{
			return false;
		}
		//���� �����Ͱ� null�� �ƴ� ��� count ���
		else
		{
			int nodecount=0; // ���� ��� ī����
			ListStackNode tempNode=head; // tempNode�� head �Ҵ�
			while(tempNode.link !=null)
			{
				++nodecount;
				tempNode=tempNode.link; // ���� ��带 ����
			}
			// ���û������ ���ī��Ʈ�� ������ ��� true return
			return (this.stacksize - 1==nodecount);
		}
	}
	// ���ÿ� ��� ���� (�������� ����)
	public void push(Object data) {
		ListStackNode newNode = new ListStackNode(data); // ���ο� ��� ����
		// ������ ���� á�� ���
		if(isFull())
		{
			System.out.println("Stack is Full!");
			return;
		}
		//������ ����� ���
		else if(isEmpty())
		{
			// top �����Ͱ� null �� ��� ���ο� ��带 �����ϵ��� ��
			// �� �� head�� �Բ� ���ο� ��带 �����ϵ��� �� (head�� ù ��带 �����ϴ� �뵵�θ� ����� ����)
			this.head=newNode;
			this.top=this.head;
		}
		else {
			// top ��尡 null�� �ƴ� ��� temp ��尡 top�� �����ϵ��� ��
			// temp ���� ������ ��带 ã�� ���� ���
			ListStackNode tempNode =top;
			
			// temp ����� link�� null�� �ƴ� ������ ���� ��带 ����
			// tempNode.link�� ���� ��带 �����ϰ� �����Ƿ�
			// tempNode = tempNode.link�� tempNode�� ���� ��带 �����ϵ��� �ϴ� ��
			// while���� ��� ����Ǹ� tempNode�� ���� ������ ��带 ������ ���°� ��
			while(tempNode.link != null)
			{
				tempNode=tempNode.link;
			}
			
			// tempNode(������ ���)�� link�� ���� ��带 �����ϵ��� ��.
			tempNode.link= newNode;
		}
		
	}
	// ���ÿ��� Node ����(������ ��� ����)
	public void pop() {
		ListStackNode preNode;
		ListStackNode tempNode;
		
		//top �����Ͱ� null �� ��� ��� ��尡 �����Ǿ����Ƿ� return
		if(isEmpty())
		{
			System.out.println("Stack is Empty!");
			return;
		}
		//top �������� link�� null�� ��� (������ ��尡 1�� ������ ���)
		if(top.link==null) {
			//head�� top �����Ϳ� null�� �Ҵ��Ͽ� ���� ������ ������ ���� �ʱ�ȭ
			head=null;
			top=null;
		}
		else {
			preNode = top; // preNode�� top �����Ͱ� ����Ű�� ��帪 �Ҵ�
			tempNode =top.link; // tempNode�� top �����Ͱ� ����Ű�� ����� ���� ���(preNode�� ���� ���)
			
			// tempNode�� link�� null�� �ƴ� ������ �� ��徿 ���� ���� �̵�.
			// preNode�� tempNode�� �Ҵ��ϰ�
			// tempNode�� tempNode�� ���� ��带 �Ҵ�.
			// �̷��� �ϸ� preNode�� ������ ����� ���� ��尡 �ǰ�, tempNode�� ������ ��尡 ��.
			while(tempNode.link!=null)
			{
				preNode=tempNode;
				tempNode=tempNode.link;
			}
			
			//preNode�� link�� null�� ���� ���� ������ ��带 ����
			// ��, preNode�� ���� ����� tempNode���� ������ ����
			preNode.link=null;
		}
	}
	// ������ �ֻ���(������) ������ ����
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!");
			return;
		} else {
			ListStackNode tempNode =top;
			
			while(tempNode.link!=null) {
				tempNode = tempNode.link;
			}
			System.out.println(tempNode.getData());
		}
		
	}
	// ���� �ʱ�ȭ
	public void clear()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty!");
			return;
		} else {
			// ���� �����Ϳ� head �ʱ�ȭ
			head = null;
			top = null;
		}
	}
	// ���� ��� Ž��
	public ListStackNode searchNode(String data)
	{
		ListStackNode tempNode= this.top; // temp ��忡  top �����Ͱ� ����Ű�� ��带 �Ҵ�.
		
		//temp ��尡 null�� �ƴ� ������ ����ؼ� Ž��
		while(tempNode!=null)
		{
			//�־��� �����Ϳ� temp ����� �����Ͱ� ��ġ�� ��� �ش� ��带 return
			if(data.equals(tempNode.getData()))
				return tempNode;
			else // �����Ͱ� ��ġ���� ���� ��� temp ��忡 ���� ��� �Ҵ�.
				tempNode= tempNode.link;
		}
		return tempNode;
	}
	
	// ���ÿ� ����� ��� �����͸� ���
	public void printListStack() {
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return;
		} else {
			ListStackNode tempNode=this.top; // tempNode�� head�� ����Ű�� ù��° ��带 �Ҵ�
			
			//tempNode�� null �� �ƴ� ������ �ݺ��ؼ� ���
			while(tempNode!=null)
			{
				System.out.print(tempNode.getData() + " ");
				tempNode = tempNode.link; // tempNode�� ���� ���(tempNode.link) �Ҵ�.
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int stacksize=5;
		String str= "B";
		ListStack liststack = new ListStack(stacksize);
		
		liststack.printListStack();
		liststack.push("A");
		liststack.printListStack();
		liststack.push("B");
		liststack.printListStack();
		liststack.push("C");
		liststack.printListStack();
		liststack.push("D");
		liststack.printListStack();
		liststack.push("E");
		liststack.printListStack();
		liststack.push("F");
		liststack.printListStack();
		
		liststack.pop();
		liststack.printListStack();
		liststack.pop();
		liststack.printListStack();
		
		liststack.peek();
		
		System.out.println(liststack.searchNode(str).getData());
	}
}
