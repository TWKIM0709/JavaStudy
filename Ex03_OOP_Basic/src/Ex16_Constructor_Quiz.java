import kr.or.kosa.Book;

/*
자동차 영업소 입니다.
영업사원은 고객에게 자동차를 팔려고 합니다.
고객은 자동차의 [기본 사양]을 살 수 도 있고 ....  여러가지 [선택 옵션]을 선택 할 수 있습니다.
자동차의 기본은
문의 개수 [4개] , 자동차의 색상 [기본은 red]  4개가 기본 입니다
그런데 고객은
문의 개수만 변경 가능하고  자동차의 색상 기본은 red  으로 할 수 있고	개수
문의 개수는 기본으로 하고 자동차의 색상 변경 가능하고					색상
문의 개수와 자동차의 색상 모든 변경 하여 차를 구매할 수 있습니다			개수 색상
자동차 구매
1. 기본 사양  
2. 옵션 : 문 변경 , 자동차의 색상 기본
3. 옵션 : 자동차의 색상 변경 , 문 기본
4. 옵션 : 자동차의 색상 변경 , 문 변경
*/
class Car6{
	int door;
	String color;
	// 기본사양
	public Car6(){
		door = 4;
		color = "red";
	}
	// 1옵션 문변경, 기본색상
	public Car6(int door){
		this.door = door;
		color = "red";
	}
	// 2옵션 색상변경, 문 기본
	public Car6(String color){
		door = 4;
		this.color = color;
	}
	// 3옵션 색상,문 변경
	public Car6(int door, String color){
		this.door = door;
		this.color = color;
	}
	// 정보 출력 함수
	public void printCar() {
		System.out.printf("문 [%d]개 달린 [%s]색 차\n",door,color);
	}
	
}

public class Ex16_Constructor_Quiz {

	public static void main(String[] args) {
		// 기본 옵션
		Car6 c1 = new Car6();
		
		// 옵션1 문 변경
		Car6 c2 = new Car6(6);
		
		// 옵션2 색상 변경
		Car6 c3 = new Car6("green");
		
		// 옵션3 문, 색상변경
		Car6 c4 = new Car6(1,"gold");
		
		//출력부
		c1.printCar();
		c2.printCar();
		c3.printCar();
		c4.printCar();
		
		Book book = new Book("홍길동전",5000);
		book.bookInfo();
		System.out.println(book.getName());
		System.out.println(book.getPrice());
	}

}
