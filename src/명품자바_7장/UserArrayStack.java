package ��ǰ�ڹ�_7��;
// �迭�� �̿��� ���� ����



public class UserArrayStack{

	int top;
    Object []stack;
	int size;
	public UserArrayStack(int size)
	{
		this.size=size;
		stack= new Object [size];
		top=-1; // top�� �� �ʱ�ȭ
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
				return (top - i) + 1; // top -Ž���� �迭�� �ε���,�迭 �̹Ƿ� +1
		}
		return -1;
	}
	
	public boolean isempty() {
		return size==0;
	}
	
	
}


