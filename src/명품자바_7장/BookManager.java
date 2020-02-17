package 명품자바_7장;
//도서 관리자 클래스

/*//보관한 모든 쌍을 제거
public void clear();
//특정 key를 보관하고 있는지 판별
public boolean containsKey(Key key);
//특정 value를 보관하고 있는지 판별
public boolean containsValue(Value value);
//Map에 보관한 key, value를 대응하는 Set 구하기
public Set<Map.Entry<Key, Value> > entrySet();
//key에 대응하는 value 구하기
public Value get(Key key);
//Map의 key의 Set 구하기
public Set<Key> keySet();
//key, value 쌍 보관
public void put(Key key, Value value);
//src에 보관한 쌍 모두를 보관
public void putAll(Map<Key, Value> src);
//특정 key에 대응하는 key, value 쌍을 제거
public void Remove(Key key);
//보관한 개수
public int size();
//보관한 value의 Collection 구하기
public Collection<Value> values();*/

import java.util.HashMap;
import java.util.Scanner;

public class BookManager {
	Scanner scan = new Scanner(System.in);
	HashMap <String,Book> book_dic= new HashMap<String, Book>();
	public void Run() {
		int key=0;
		while((key = selectMenu())!=0) {
			
			switch(key) {
			case 1: addBook(); break;
			case 2: removeBook(); break;
			case 3: searchBook(); break;
			case 4: listBook(); break;
			case 5: listISBN(); break;
			default: System.out.println("잘못 선택하셨습니다."); break;
			}
		}
		System.out.println("종료합니다...");
	}
	
	int selectMenu() {
		System.out.println("1.추가 2:삭제 3.검색 4.도서 목록 5:ISBN 0:종료");
		int key=scan.nextInt();
		scan.nextLine();
		return key;
	}
	void addBook() {
		String isbn;
		System.out.print("추가할 도서 ISBN:");
		isbn = scan.nextLine();
		if(book_dic.containsKey(isbn)) {
			System.out.println("이미 존재하는 ISBN입니다.");
			return;
		}
		String title;
		int price;
		System.out.print("도서 제목:");
		title=scan.nextLine();
		System.out.print("가격:");
		price=scan.nextInt();
		scan.nextLine();
		Book book = new Book(isbn,title,price);
		book_dic.put(isbn, book);
		System.out.println(book.toString()+" 생성하였습니다.");
	}
	void removeBook() {
		String isbn;
		System.out.print("삭제할 도서 ISBN:");
		isbn = scan.nextLine();
		if(book_dic.containsKey(isbn)) {
			book_dic.remove(isbn);
			System.out.println("삭제하였습니다.");
		}
		else
			System.out.println("존재하지 않습니다.");
	}
	void searchBook() {
		String isbn;
		System.out.print("검색할 도서 ISBN");
		isbn=scan.nextLine();
		if(book_dic.containsKey(isbn)) {
			Book book = book_dic.get(isbn);
			System.out.println("검색 결과 >>" + book.toString());
		}
		else
			System.out.println("존재하지 않습니다.");
	}
	void listBook() {
		System.out.println("도서 목록");
		int cnt = book_dic.size();
		System.out.println("도서 수: " + cnt);
		for(Book book: book_dic.values()) {
			System.out.println(book.toString());
		}
	}
	void listISBN() {
		System.out.println("ISBN 목록");
		int cnt= book_dic.size();
		System.out.println("ISBN 수: " +cnt);
		for(String isbn: book_dic.keySet()) {
			System.out.println(isbn);
		}
	}
	
}
