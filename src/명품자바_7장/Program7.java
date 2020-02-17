package 명품자바_7장;

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

	private ListQueueNode head; // ListQueueNode 타입의 head 노드 인스턴스 변수
	private ListQueueNode front; // 큐의 front 포인터
	private ListQueueNode rear; // 큐의 rear 포인터
	private int queuesize; // 큐 사이즈
	
	//큐 생성자
	public ListQueue(int size)
	{
		head=null; // head 초기화
		front=null;// front 초기화
		rear=null; // rear 초기화
		this.queuesize=size;
	}
	//큐가 비어있는 상태인지 확인
	public boolean isEmpty() {
		return (front==null&&rear==null);
	}
	
	//큐가 가득찬 상태인지 확인
	public boolean isFull() {
		//큐 비어있을 경우 false return
		if(isEmpty()) {
			return false;
		}
		//큐 포인터가 null 이 아닌 경우 count 계산
		else {
			int nodecount=0; // 큐 노드 카운터
			ListQueueNode tempNode = head; //tempNode에 head 할당
			
			while(tempNode.link!=null)
			{
				++nodecount;
				tempNode=tempNode.link; // 다음 노드를 참조
			}
			
			// 큐 사이즈와 노드 카운트가 동일한 경우 true return
			return(this.queuesize-1==nodecount);
		}
	}
	// 큐에 Node 삽입
	public void enqueue(Object data)
	{
		ListQueueNode newNode = new ListQueueNode(data); // 새로운 노드 생성
		
		//큐가 가득 찼을 경우
		if(isFull()) {
			System.out.println("Queue is Full!");
			return;
		} 
		//큐가 비었을 경우
		else if(isEmpty()) {
			//front, rear 포인터가 null 인 경우 새로운 노드를 참조하도록 함
			//이 때 head도 함께  새로운 노드를 참조하도록 함 (head는 첫 노드를 참조하는 용도로만 사용을 제한)
			this.head=newNode;
			this.front=this.head;
			this.rear=this.head;
		} else {
			// rear 포인터의 노드(마지막 노드) link 가 새로운 노드를 참조하도록 함.
			// 이후 rear 포인터는 새로 추가된 노드를 참조하도록 함.
			rear.link=newNode;
			rear=newNode;
		}
		
	}
	//큐에서 노드 삭제
	public void dequeue() {
		ListQueueNode tempNode;
		
		//front 포인터가 null인 경우 모든 노드가 삭제되었으므로 return
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
			return;
		}
		//front 포인터의 link가 null인 경우 (큐에 노드가 1개 남았을 경우)
		if(front.link==null)
		{
			//head와 front,rear 포인터에 null을 할당하여 남은 노드와의 연결을 끊고 초기화
			head=null;
			front=null;
			rear=null;
		} else {
			tempNode=front.link; //tempNode는 front 포인터가 가리키는 노드의 다음 노드를 할당.
			head= tempNode; //head가 tempNode를 참조하도록 함.
			front.link=null; // 기존에  front 포인터가 가리키는 노드의 link를 초기화하여 끊음.
			front =head; // front 포인터가 head(다음 노드)를 참조하도록 함
		}	
	}
	//큐의 첫번째 데이터 추출
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
	// 큐 초기화 
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
	
	//큐 Node 탐색
	public ListQueueNode searchNode(Object data) {
		ListQueueNode tempNode =this.front; // temp 노드에 front 포인터가 가리키는 노드를 할당.
		
		// temp 노드가 null이 아닐 때까지 반복하여 탐색
		while(tempNode!=null)
		{
			//주어진 데이터와 temp 노드의 데이터가 일치할 경우 해당 temp 노드를 return
			if(data.equals(tempNode.getData())) {
				return tempNode;
			}
			else {
				// 데이터가 일치하지 않을 경우 temp 노드에 다음 노드 할당
				tempNode= tempNode.link;
			}
		}
		return tempNode;
	}
	// 큐에 저장된 모든 데이터를 출력
	public void printListQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
			return;
		}
		else {
			ListQueueNode tempNode= this.front; // tempNode에 head가 가리키는 첫 번째 노드를 할당
			
			//tempNode가 null이 아닐 때까지 반복하여 출력
			while(tempNode!=null) {
				System.out.print(tempNode.getData()+ " ");
				tempNode= tempNode.link; // temp 노드에 다음  노드(tempNode.link) 할당.
				
			}
			System.out.println();
		}
	}
}

public class Program7 {

	public static void main(String[] args) {
		/*
		 * Queue<String> q = new LinkedList<String>(); q.offer("강감찬"); q.offer("홍길동");
		 * System.out.println(q.peek()); // 강감찬 참조 // 여전히 강감찬, 홍길동
		 * 
		 * System.out.println(q.poll()); // 강감찬 꺼냄, 현재 홍길동 q.offer("이순신");
		 * q.offer("김구"); // 홍길동 , 이순신, 김구 while(q.isEmpty()==false) {
		 * System.out.println(q.poll()); } // 홍길동, 이순신, 김구 순으로 꺼냄
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
