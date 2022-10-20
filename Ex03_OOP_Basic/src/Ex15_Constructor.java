/*
	생성자 함수(Constructor)
	1. 함수(특수한 목적)
	2. 목적 >> member field 초기화 >> 초기자 블럭과 역할 겹침 >> 생성자를 많이쓴다
	3. 일반함수와 다른 점
	3.1 함수의 이름이 고정(class 이름과 동일)
	3.2 return 타입이 없다 (객체 생성과 동시에 호출 >> return 받을 대상이 없다.
	3.4. 실행시점 >> new 객체 생성 >> heap 공간 생성 >> member field 올라감 >> 자동으로 생성자 함수 호출
	3.5. return type (X) >> void >> [public] [void(생략)] [클래스 이름] >> public [클래스이름](...) { ... }
	
	4. why >> 생성되는 '객체마다' '강제적으로' member field 값을 초기화하기 위해
	
	ex)
	class Car{	String color;	}
	
	A) 무조건 파란색 차를 만들거다 ... 처음부터 파란색으로 설계해주세요
	class Car{ 	String color = "blue";	}
	
	B) 알아서 하겠다.
	class Car{	String color;	}
	Car car = new Car();
	car.color = "gold";
	
	문제) 만약 색상 설정을 안하면 >> null 색상..(?)으로 출고
	
	>> 차량을 만들 때 무조건 색상을 입력하게 할 수 있는 방법 ...
	>> 함수 ... {초기자블럭} ... 강제성이 약함, 입력값을 넣을 수 없다.
	
	5. 생성자 함수(... overloading 적용가능)
	
 	6. 생성자 오버로딩을 통해 다양한 강제사항을 구현 ***
 	
 ******생성자를 쓰는 가장 중요한 목적은 강제적 초기화(member field)
*/

class Car{
	String carname = "포니";
	// 당신이 만약 Car 설계도를 만들 때.... 어떠한 생성자도 만들지 않는다면
	// 컴파일러가 알아서 'default 생성자 함수'를 생성한다.
	// public Car() { } 자동 생산
	
	// 개발자가 직접 구현한다면
	public Car() {
		System.out.println("기본생성자 Car(){}  호출");
		carname = "내마음";
	}
}

class Car4{
	String carname;
	// default constructor 가 생략되어 있다.
}
class Car2{
	String carname;
	public Car2() {		//default constructor 초기화
		carname = "포니";
	}
}

class Car3{			// 설계의도 : 기본 자동차 이름으로 써도 되고 .. 원하면 이름 넣어서 생성해도 된다.
	String carname;
	
	public Car3() {				//default constructor 로 carname 설정이 없으면 '기본이름'으로 초기화
		carname = "기본이름";
	}
	
	public Car3(String carname) {	// Point ************** 생성자 Overloading으로 carname을 받아 초기화
		this.carname = carname;
	}
}

// '무조건' 이름이 있어야 만들 수 있게 하고 싶을 때
class Car5{			// 설계의도 : 기본 자동차 이름으로 써도 되고 .. 원하면 이름 넣어서 생성해도 된다.
	String carname;
	public Car5(String carname) {	// Point ************** 생성자 Overloading으로 carname을 받아 초기화
		this.carname = carname;
	}
}

// 위 코드는 default constructor를 구현하지 않았다.	>> 구현하지 않아도 컴파일러가 자동 생성하지 않나??
// 예외적으로 ... 개발자가 Overloading된 생성자를 '한개라도 만든다면' 컴파일러는 default constructor를 자동 생성하지 않는다.


public class Ex15_Constructor {

	public static void main(String[] args) {
		Car car = new Car();	// new Car() 괄호 : 함수의 괄호 // defalut constructor

		System.out.println(car.carname);
		
		Car3 car3 = new Car3();
		System.out.println(car3.carname);
		
		Car3 car4 = new Car3("내차");
		System.out.println(car4.carname);
	}

}






