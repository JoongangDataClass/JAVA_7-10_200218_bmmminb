package 명품자바_7장;

//다음은 정수 형식을 보관하는 정수 적 배열 클래스와 제네릭 형식으로 원하는 형식을 사용자가 결정할 수 있는 제네릭 동적 배열 클래스를 정의한 것입니다.
//정수 동적 배열
public class IntDArray {

	int [] buffer;
	int capacity;
	int usage;
	public IntDArray(int capacity){
		this.capacity=capacity;
		buffer=new int [capacity];
		usage=0;
	}
	
	public boolean isEmpty() {
		return usage==0;
	}
	public boolean isFull() {
		return usage==capacity;	
	}
	public int size() {
		return usage;
	}
	public boolean add(int value) {
		if(isFull()) {
			return false;
		}
		buffer[usage] = value;
		usage++;
		return true;
	}
	public void viewAll() {
		String outstr= String.format("저장소 크기 : %d 보관개수 : %d", capacity, usage);
		System.out.println(outstr);
		for(int i=0; i<usage; i++)
		{
			System.out.print(buffer[i] + " ");
		}
		System.out.println();
	}
}
