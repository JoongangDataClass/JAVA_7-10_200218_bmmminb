package ��ǰ�ڹ�_7��;
//���� ���� �迭�� ���׸� ���� �迭
public class Program {

	public static void main(String[] args) {
		System.out.println("==Test IntDArray=======");
		IntDArray idarr= new IntDArray(10);
		idarr.viewAll();
		idarr.add(3);
		idarr.viewAll();
		idarr.add(2);
		idarr.viewAll();
		idarr.add(6);
		idarr.viewAll();
		
		System.out.println("==Test DArray=======");
		DArray <Integer> darr= new DArray<Integer>(10);
		darr.viewAll();
		darr.add(3);
		darr.viewAll();
		darr.add(2);
		darr.viewAll();
		darr.add(6);
		darr.viewAll();
		
		System.out.println("==Test DArray<String>===");
		DArray<String> darr2 = new DArray<String>(10);
		darr2.viewAll();
		darr2.add("Hello");
		darr2.viewAll();
		darr2.add("������ ����");
		darr2.viewAll();
		darr2.add("ehpub.co.kr");
		darr2.viewAll();
	}
	
}
