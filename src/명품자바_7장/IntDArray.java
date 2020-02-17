package ��ǰ�ڹ�_7��;

//������ ���� ������ �����ϴ� ���� �� �迭 Ŭ������ ���׸� �������� ���ϴ� ������ ����ڰ� ������ �� �ִ� ���׸� ���� �迭 Ŭ������ ������ ���Դϴ�.
//���� ���� �迭
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
		String outstr= String.format("����� ũ�� : %d �������� : %d", capacity, usage);
		System.out.println(outstr);
		for(int i=0; i<usage; i++)
		{
			System.out.print(buffer[i] + " ");
		}
		System.out.println();
	}
}
