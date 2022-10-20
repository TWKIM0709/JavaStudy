package kr.or.kosa;
/*
	요구사항
	1. 책은 [책이름]과 [가격정보]를 가지고 있다.
	2. 책이 출판되려면 '반드시 책이름과 책의 가격정보를 가지고 있어야'한다.
	3. 책의 [이름]과 [가격정보]는 '특정 기능을 통해서만' 볼 수 있고, 출판된 이후에는 '수정'할 수 없다. private, setter 없음
	4. 책 [이름]과 [가격정보]는 '각각 확인'할 수 있다.
*/
public class Book {
	private String name;
	private int price;
	
	// 생성자
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// 이름과 가격정보 출력 함수
	public void bookInfo() {
		System.out.printf("이름 : %s, 가격 : %d원\n",name,price);
	}
	
	// 각각 확인하는 기능
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
