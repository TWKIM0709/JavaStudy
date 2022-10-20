package Book;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//도서 관리자 클래스

import java.util.HashMap;
import java.util.Scanner;

public class BookManager {

	Scanner scan = new Scanner(System.in);

	HashMap<String, Book> book_dic = new HashMap<String, Book>();

	//실행 함수
	public void Run() {

		int key = 0;

		while ((key = selectMenu()) != 0) {

			switch (key) {

			case 1:
				addBook();
				break;

			case 2:
				removeBook();
				break;

			case 3:
				searchBook();
				break;

			case 4:
				listBook();
				break;

			case 5:
				listISBN();
				break;

			case 6:
				saveBookData();
				break;
			case 7:
				loadBookData();
				break;
				
			default:
				System.out.println("잘못 선택하였습니다.");
				break;

			}

		}

		System.out.println("종료합니다...");

	}
	//메뉴 선택 함수
	int selectMenu() {

		System.out.println("1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 6:저장 7:불러오기 0:종료");

		int key = scan.nextInt();

		scan.nextLine();

		return key;

	}
	
	//책 추가 함수...Book 객체 만들어서 book_dic에 넣음
	void addBook() {

		String isbn;

		System.out.print("추가할 도서 ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			System.out.println("이미 존재하는 ISBN입니다.");

			return;

		}

		String title;

		int price;

		System.out.print("도서 제목:");

		title = scan.nextLine();

		System.out.print("가격:");

		price = scan.nextInt();

		scan.nextLine();

		Book book = new Book(isbn, title, price);

		book_dic.put(isbn, book);

		System.out.println(book.toString() + " 생성하였습니다.");

	}

	//책 삭제 함수...book_dic에서 입력한 번호 삭제함
	void removeBook() {

		String isbn;

		System.out.print("삭제할 도서 ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			book_dic.remove(isbn);

			System.out.println("삭제하였습니다.");

		}

		else {

			System.out.println("존재하지 않습니다.");

		}

	}

	//입력한 번호 Map에서 찾아 출력
	void searchBook() {

		String isbn;

		System.out.print("검색할 도서 ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			Book book = book_dic.get(isbn);
			System.out.println("검색 결과>>" + book.toString());

		}

		else {

			System.out.println("존재하지 않습니다.");

		}

	}

	//Map - value 전체 출력
	void listBook() {

		System.out.println("도서 목록");

		int cnt = book_dic.size();

		System.out.println("도서 수:" + cnt);

		for (Book book : book_dic.values()) {

			System.out.println(book.toString());

		}

	}

	//Map - key 전체 출력
	void listISBN() {

		System.out.println("ISBN 목록");

		int cnt = book_dic.size();

		System.out.println("도서 수:" + cnt);

		for (String isbn : book_dic.keySet()) {

			System.out.println(isbn);

		}

	}

	// 저장 함수
	void saveBookData() {
		String filename = "BookData.txt";
		
		FileOutputStream fos = null;		//하나씩 보냄
		ObjectOutputStream oos = null;		//객체 통신 가능
		
		try {
			fos = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(book_dic);
			
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			System.out.println("문제 발생 : " + e);
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	}

	void loadBookData() {
		String filename = "BookData.txt";
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			book_dic = (HashMap)ois.readObject();
			
			System.out.println("불러오기 성공");
		} catch (Exception e) {
			System.out.println("불러오기 실패");
			System.out.println("기타 예외 발생 " + e.getMessage());
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}