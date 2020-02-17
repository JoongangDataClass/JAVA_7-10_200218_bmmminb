package 명품자바_7장;
// 제네릭 동적 배열
public class DArray<datatype> {

	Object [] buffer;
	int capacity;
	int usage;
	public DArray(int capacity) {
		this.capacity=capacity;
		buffer= new Object[capacity];
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
	public boolean add(datatype value) {
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
