package 명품자바_7장;
// Comparable interface로 한정한 제네릭 메소드 Sort





public class Program3 {
	
    static <dt extends Comparable> void Sort(dt[] arr)
	{
	
		for(int i=arr.length; i>1; i--)
		{
			for(int j=1; j<i; j++)
			{
				if(arr[j].compareTo(arr[j-1])<0) {
					dt temp= arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
    
    static void Sort(int[] arr)
	{
	
		for(int i=arr.length; i>1; i--)
		{
			for(int j=1; j<i; j++)
			{
				if(Integer.compare(arr[j], arr[j-1])<0) {
					int temp= arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

    static void Sort(double[] arr)
   	{
   	
   		for(int i=arr.length; i>1; i--)
   		{
   			for(int j=1; j<i; j++)
   			{
   				if(Double.compare(arr[j], arr[j-1])<0) {
   					double temp= arr[j-1];
   					arr[j-1]=arr[j];
   					arr[j]=temp;
   				}
   			}
   		}
   	}


    
	public static void main(String[] args) {
		String[] arr = {"홍길동", "강감찬", "을지문덕", "김구", "이순신"};
		
		System.out.println("정렬 전");
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
		Sort(arr);		
		
		System.out.println("정렬 후");
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	     int [] arr2= {50,80,10,30,100};
	     double []arr3= {100.1, 8.3,33.1,44.5,99};
	     Sort(arr2);
	     Sort(arr3);
	     for(int i = 0; i<arr2.length;i++){
				System.out.print(arr2[i]+" ");
			}
	     System.out.println();
	     for(int i = 0; i<arr3.length;i++){
					System.out.print(arr3[i]+" ");
				}
	}
	}


