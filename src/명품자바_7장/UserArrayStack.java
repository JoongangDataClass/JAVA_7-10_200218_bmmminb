package 명품자바_7장;
// 배열을 이용한 스택 구현



public class UserArrayStack{

	int top;
    Object []stack;
	int size;
	public UserArrayStack(int size)
	{
		this.size=size;
		stack= new Object [size];
		top=-1; // top의 값 초기화
	}
	public void push(Object item)
	{
		stack[++top]=item;
		System.out.println(stack[top] + " push!");
	}
	public void peek()
	{
		System.out.println(stack[top] + " peek!");
	}
	public void pop() {
		System.out.println(stack[top] + " pop!");
		stack[top--]=0;
	}
	public Object item(Object item)
	{
		for(int i=0; i<=top; i++)
		{
			if(stack[i]==item)
				return (top - i) + 1; // top -탐색한 배열의 인덱스,배열 이므로 +1
		}
		return -1;
	}
	
	public boolean isempty() {
		return size==0;
	}
	
	
}


