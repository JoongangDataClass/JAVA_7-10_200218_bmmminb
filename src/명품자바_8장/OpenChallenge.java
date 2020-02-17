package 명품자바_8장;
//<행맨(HangMan) 게임 만들기>
//간단한 행맨 게임을 만들어보자. 행맨은 많이 알려져 있는 전통 잇는 게임이다. 
//이 도전을 통해 파일 입출력을 다루고자 한다. 
//행맨은 컴퓨터가 사용자 모르게 영어 단어 하나를 선택하고 이 단어에서 몇 개의 글자를 숨긴 다음 화면에 출력하여 사용자로 하여금 
//이 단어를 맞추게 하는 게임이다. 숨긴 글자의 수가 많으면 그만큼 난이도가 높다. 한 단어에 대해 5번 틀리면 프로그램을 종료한다. 
//행맨에 사용되는 단어 파일은 배포된 words.txt 파일을 이용하라. 이 파일에는 한 줄에 하나의 영어 단어가 적혀있다.

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
		
		int random2 = 2;// 숨길 개수 
		char [] question2 = new char[random2];	
		

		for(int i=0; i<random2; i++)
		{
			int random3 = (int) (Math.random()*question.length); // 단어 인덱스
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
			if(check2(question)==1)//*문자가 없으면, 정답
			{
				
				return 0;
				
			}
			else if(check2(question)==0) // *문자가 있으면
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
		
		return 1; //오답이면
		
	}
	
	
	public static void main(String[] args) {
		FileReader f1= null;
		Scanner sc= new Scanner(System.in);
		
		ArrayList <String> list =new ArrayList<String>();
		try {
			f1= new FileReader("src\\명품자바_8장\\words.txt");
			
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
			System.out.print("파일 입출력 오류");
		}

		

		
	
		while(true) {
			int random = (int) (Math.random()*list.size());
			String word=list.get(random);
	
			int n=check(word);
			if(n==0) //정답이면
			{
				System.out.println("Next(y/n)?");
				
				if(sc.nextLine().charAt(0)=='y')
				{
					continue;
				}
				else
					break;
			}
			else if(n==1)// 5회 이상 틀렸으면
			{
				System.out.println("5회");
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
