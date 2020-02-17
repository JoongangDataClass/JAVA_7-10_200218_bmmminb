package 명품자바_7장;

class Array<T extends Number>{
	private T value;
	public Array(T value)
	{
		this.value=value;
	}
	 public void setValue(T value) {
		    this.value = value;
		  }

	 public T getValue() {
		 return value;
	 }
	 public static int compare(Array a, Array b)
		{
			if(a>b)
				return 1;
			else if(a<b)
				return -1;
			else
				return 0;
		}
	
}


class Util
{
	private Array [] arr;
	public Util(Array[] a)
	{
		this.arr= a;
	}

	public void self(Array [] array) {
		for(int i=0; i<arr.length; i++)
		{
			array[i]=arr[i];
		}
	}

	
	
	public void Sort(Array[] arr)
	{
	
		for(int i=arr.length; i>1; i--)
   		{
   			for(int j=1; j<i; j++)
   			{
   				if(Array.compare(arr[j], arr[j-1])<0) {
   					Array temp= arr[j-1];
   					arr[j-1]=arr[j];
   					arr[j]=temp;
   				}
   			}
   		}
}

	
}


public class practice {
	
	public static void main(String[] args) {
		Array <Integer>[] a= new Array[5];
		for(int i=0; i<a.length; i++)
		{
			a[i] = new <Integer> Array(i);
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i].getValue() +" ");
		}
		System.out.println();
		Array <Double>[] a2= new Array[5];
		for(int i=0; i<a2.length; i++)
		{
			a2[i] = new <Double> Array(i+0.1);
		}
		
		for(int i=0; i<a2.length; i++)
		{
			System.out.print(a2[i].getValue() +" ");
		}
		System.out.println();
		Util util= new Util(a);
		Array<Integer> [] a3= new Array[5];
		util.self(a3);
		for(int i=0; i<a3.length; i++)
		{
			System.out.print(a3[i].getValue() +" ");
		}
		util.Sort(a3);
		//util.Sort(a);
	}
}

	
	

