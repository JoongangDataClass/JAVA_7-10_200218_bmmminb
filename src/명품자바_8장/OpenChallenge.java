package ��ǰ�ڹ�_8��;
//<���(HangMan) ���� �����>
//������ ��� ������ ������. ����� ���� �˷��� �ִ� ���� �մ� �����̴�. 
//�� ������ ���� ���� ������� �ٷ���� �Ѵ�. 
//����� ��ǻ�Ͱ� ����� �𸣰� ���� �ܾ� �ϳ��� �����ϰ� �� �ܾ�� �� ���� ���ڸ� ���� ���� ȭ�鿡 ����Ͽ� ����ڷ� �Ͽ��� 
//�� �ܾ ���߰� �ϴ� �����̴�. ���� ������ ���� ������ �׸�ŭ ���̵��� ����. �� �ܾ ���� 5�� Ʋ���� ���α׷��� �����Ѵ�. 
//��ǿ� ���Ǵ� �ܾ� ������ ������ words.txt ������ �̿��϶�. �� ���Ͽ��� �� �ٿ� �ϳ��� ���� �ܾ �����ִ�.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class OpenChallenge {
	//static Scanner sc= new Scanner(System.in);
	public static int check2(char[] question2)
	{
		for(int i=0; i<question2.length; i++)
		{
			if('*'==question2[i])
			{
				return 0;
			}
		}
		return 1;
	}
	public static int check(String word)
	{
		
		char [] question=word.toCharArray();
		
		int random2 = 2;// ���� ���� 
		char [] question2 = new char[random2];	
		

		for(int i=0; i<random2; i++)
		{
			int random3 = (int) (Math.random()*question.length); // �ܾ� �ε���
			for(int j=0; j<i;j++)
			{
			if(question[random3]=='*')
			{
				random3 = (int) (Math.random()*question.length);
				j=-1;
			}
			}
			question2[i]=question[random3];
			question[random3]='*';
		}
		
		//System.out.println(word);
		System.out.println(question);
		System.out.println(question2);
		char [] question3=word.toCharArray();
		
		
		
		int count=0;
		
		Scanner sc2 = new Scanner(System.in);
		
		
		while(count!=5) {
			if(check2(question)==1)//*���ڰ� ������, ����
			{
				
				return 0;
				
			}
			else if(check2(question)==0) // *���ڰ� ������
			{
			System.out.print(">>");
			char answer=sc2.nextLine().charAt(0);
			//System.out.println(question3);
			
				for(int i=0; i<question.length; i++)
				{
					if(answer==question3[i])
					{
						
						question[i]=question3[i];
					}
				}
				System.out.println(question);
			}
	
			++count;
		
			}
		
		return 1; //�����̸�
		
	}
	
	
	public static void main(String[] args) {
		FileReader f1= null;
		Scanner sc= new Scanner(System.in);
		
		ArrayList <String> list =new ArrayList<String>();
		try {
			f1= new FileReader("src\\��ǰ�ڹ�_8��\\words.txt");
			
			BufferedReader bin= new BufferedReader(f1);
			String s;
			while((s=bin.readLine())!=null)
			{
				list.add(s);
				
			}
			bin.close();
			f1.close();
		}catch (IOException e)
		{
			System.out.print("���� ����� ����");
		}

		

		
	
		while(true) {
			int random = (int) (Math.random()*list.size());
			String word=list.get(random);
	
			int n=check(word);
			if(n==0) //�����̸�
			{
				System.out.println("Next(y/n)?");
				
				if(sc.nextLine().charAt(0)=='y')
				{
					continue;
				}
				else
					break;
			}
			else if(n==1)// 5ȸ �̻� Ʋ������
			{
				System.out.println("5ȸ");
				System.out.println("Next(y/n)?");
			
				if(sc.nextLine().charAt(0)=='y')
				{
					continue;
				}
					break;
			}
			
		}
		sc.close();
		
		
	}
}
