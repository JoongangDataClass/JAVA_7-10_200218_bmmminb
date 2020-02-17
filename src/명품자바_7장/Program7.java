package ��ǰ�ڹ�_7��;

/*import java.util.Queue;
import java.util.LinkedList;*/
interface QueueIF {
    boolean isEmpty();
    boolean isFull();
    void enqueue(Object data);
    void dequeue();
    void peek();
    void clear();
}

class ListQueueNode{
	private Object data;
	public ListQueueNode link;
	public ListQueueNode() {
		this.data=null;
		this.link=null;
	}
	public ListQueueNode(Object data) {
		this.data=data;
		this.link=null;
	}
	public ListQueueNode(Object data, ListQueueNode link)
	{
		this.data=data;
		this.link=link;
	}
	public Object getData() {
		return data;
	}
}

class ListQueue implements QueueIF{

	private ListQueueNode head; // ListQueueNode Ÿ���� head ��� �ν��Ͻ� ����
	private ListQueueNode front; // ť�� front ������
	private ListQueueNode rear; // ť�� rear ������
	private int queuesize; // ť ������
	
	//ť ������
	public ListQueue(int size)
	{
		head=null; // head �ʱ�ȭ
		front=null;// front �ʱ�ȭ
		rear=null; // rear �ʱ�ȭ
		this.queuesize=size;
	}
	//ť�� ����ִ� �������� Ȯ��
	public boolean isEmpty() {
		return (front==null&&rear==null);
	}
	
	//ť�� ������ �������� Ȯ��
	public boolean isFull() {
		//ť ������� ��� false return
		if(isEmpty()) {
			return false;
		}
		//ť �����Ͱ� null �� �ƴ� ��� count ���
		else {
			int nodecount=0; // ť ��� ī����
			ListQueueNode tempNode = head; //tempNode�� head �Ҵ�
			
			while(tempNode.link!=null)
			{
				++nodecount;
				tempNode=tempNode.link; // ���� ��带 ����
			}
			
			// ť ������� ��� ī��Ʈ�� ������ ��� true return
			return(this.queuesize-1==nodecount);
		}
	}
	// ť�� Node ����
	public void enqueue(Object data)
	{
		ListQueueNode newNode = new ListQueueNode(data); // ���ο� ��� ����
		
		//ť�� ���� á�� ���
		if(isFull()) {
			System.out.println("Queue is Full!");
			return;
		} 
		//ť�� ����� ���
		else if(isEmpty()) {
			//front, rear �����Ͱ� null �� ��� ���ο� ��带 �����ϵ��� ��
			//�� �� head�� �Բ�  ���ο� ��带 �����ϵ��� �� (head�� ù ��带 �����ϴ� �뵵�θ� ����� ����)
			this.head=newNode;
			this.front=this.head;
			this.rear=this.head;
		} else {
			// rear �������� ���(������ ���) link �� ���ο� ��带 �����ϵ��� ��.
			// ���� rear �����ʹ� ���� �߰��� ��带 �����ϵ��� ��.
			rear.link=newNode;
			rear=newNode;
		}
		
	}
	//ť���� ��� ����
	public void dequeue() {
		ListQueueNode tempNode;
		
		//front �����Ͱ� null�� ��� ��� ��尡 �����Ǿ����Ƿ� return
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
			return;
		}
		//front �������� link�� null�� ��� (ť�� ��尡 1�� ������ ���)
		if(front.link==null)
		{
			//head�� front,rear �����Ϳ� null�� �Ҵ��Ͽ� ���� ������ ������ ���� �ʱ�ȭ
			head=null;
			front=null;
			rear=null;
		} else {
			tempNode=front.link; //tempNode�� front �����Ͱ� ����Ű�� ����� ���� ��带 �Ҵ�.
			head= tempNode; //head�� tempNode�� �����ϵ��� ��.
			front.link=null; // ������  front �����Ͱ� ����Ű�� ����� link�� �ʱ�ȭ�Ͽ� ����.
			front =head; // front �����Ͱ� head(���� ���)�� �����ϵ��� ��
		}	
	}
	//ť�� ù��° ������ ����
	public void peek() {
		if(isEmpty())
		{
			System.out.println("Queue is Empty!");
			return;
		}
		else {
			System.out.println(front.getData());
		}
	}
	// ť �ʱ�ȭ 
	public void clear() {
		if(isEmpty())
		{
			System.out.println("Queue is Empty!");
			return;
		} else {
			head=null;
			front=null;
			rear=null;
		}
		
	}
	
	//ť Node Ž��
	public ListQueueNode searchNode(Object data) {
		ListQueueNode tempNode =this.front; // temp ��忡 front �����Ͱ� ����Ű�� ��带 �Ҵ�.
		
		// temp ��尡 null�� �ƴ� ������ �ݺ��Ͽ� Ž��
		while(tempNode!=null)
		{
			//�־��� �����Ϳ� temp ����� �����Ͱ� ��ġ�� ��� �ش� temp ��带 return
			if(data.equals(tempNode.getData())) {
				return tempNode;
			}
			else {
				// �����Ͱ� ��ġ���� ���� ��� temp ��忡 ���� ��� �Ҵ�
				tempNode= tempNode.link;
			}
		}
		return tempNode;
	}
	// ť�� ����� ��� �����͸� ���
	public void printListQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
			return;
		}
		else {
			ListQueueNode tempNode= this.front; // tempNode�� head�� ����Ű�� ù ��° ��带 �Ҵ�
			
			//tempNode�� null�� �ƴ� ������ �ݺ��Ͽ� ���
			while(tempNode!=null) {
				System.out.print(tempNode.getData()+ " ");
				tempNode= tempNode.link; // temp ��忡 ����  ���(tempNode.link) �Ҵ�.
				
			}
			System.out.println();
		}
	}
}

public class Program7 {

	public static void main(String[] args) {
		/*
		 * Queue<String> q = new LinkedList<String>(); q.offer("������"); q.offer("ȫ�浿");
		 * System.out.println(q.peek()); // ������ ���� // ������ ������, ȫ�浿
		 * 
		 * System.out.println(q.poll()); // ������ ����, ���� ȫ�浿 q.offer("�̼���");
		 * q.offer("�豸"); // ȫ�浿 , �̼���, �豸 while(q.isEmpty()==false) {
		 * System.out.println(q.poll()); } // ȫ�浿, �̼���, �豸 ������ ����
		 */		
		int queuesize=5;
		String str="D";
		ListQueue listQueue = new ListQueue(queuesize);
		
		listQueue.printListQueue();
		listQueue.enqueue("A");
		listQueue.printListQueue();
		listQueue.enqueue("B");
		listQueue.printListQueue();
		listQueue.enqueue("C");
		listQueue.printListQueue();
		listQueue.enqueue("D");
		listQueue.printListQueue();
		listQueue.enqueue("E");
		listQueue.printListQueue();
		listQueue.enqueue("F");
		listQueue.printListQueue();
		
		listQueue.dequeue();
		listQueue.printListQueue();
		listQueue.dequeue();
		listQueue.printListQueue();
		listQueue.peek();
		
		System.out.println(listQueue.searchNode(str).getData());
		
	}
}
