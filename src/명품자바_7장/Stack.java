package 명품자바_7장;
//연결 리스트를 이용한 구현
class MyNode <Element>{

	private Element data;
	private MyNode nextnode;
	
	public MyNode(Element data){
		this.data=data;
		this.nextnode=null;
	}
	public Element getData() {
		return data;
	}
	public void setnextnode(MyNode node)
	{
		nextnode=node;
	}
	public MyNode getnextnode() {
		return nextnode;
	}
}

public class Stack <Element>{
	private MyNode topNode;
	public Stack()
	{
		this.topNode=null;
	}
	public void push(Element data)
	{
		MyNode newNode= new MyNode(data);
		newNode.setnextnode(topNode);
		topNode=newNode;
	}
	public Element pop() {
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException("empty");
		}
		else {
			Element data=peek();
			topNode=topNode.getnextnode();
			return data;
		}
	}
	public Element peek() {
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException();
		}
		else {
			return (Element) topNode.getData();
		}
	}

	public boolean isEmpty() {
		return(topNode==null);
	}
	
}