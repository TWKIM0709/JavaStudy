/*
	OOP : 객체 지향 프로그래밍 >> 여러개의 조각(설계도)들을 만들어서 조합하는 행위
	>> 여러개의 설계도를 재사용하는 방법
	
	1. 상속 (재사용성)
	2. 캡슐화 (은닉화) : private ... getter setter (직접할당을 막고 간접할당을 통해 데이터를 보호)
	3. 다형성 : 하나의 타입으로 여러개 객체의 주소를 가질 수 있는 것
	
	>>method overloading(오버로딩)
	  하나의 이름으로 여러가지 기능을 하는 함수
	ex) System.out.println() >> println()함수 이름은 한개 ... 사용 방법은 어러개
	1. 오버로딩은 성능향상 (X)
	2. 편하게 사용하려고 ... 설계자가 개발자를 배려
	3. 오버로딩을 사용하지 않아도 문제되지 않는다
	
	
	문법) 함수 이름은 같고 parameter의 [개수]와 [타입]을 다르게하면 Overloading이라 한다.
	1. 함수 이름은 동일해야한다.
	2. parameter의 개수 또는 타입은 달라야한다.
	3. return type은 Overloading 과 무관하다(판단 기준이 아니다).
	4. parameter의 [순서]가 다름을 인정***  
*/
class Human{
	String name;
	int age;
}

class OverTest{
	int add(int i) {
		return 100 + i;
	}
	//int add(int s) { ... } 충돌난다 ... 타입이 같아서 ... parameter 이름은 상관 X
	
	int add(int i, int j) {	//parameter의 개수가 달라 Overloading 된다.
		return i + j;
	}
	String add(String s) {
		System.out.println("오버로딩 : " + s);
		return "hello" + s;
	}
	String add(String s, int i) {
		return "오버로딩";
	}
	String add(int i, String s) { //순서가 다름을 인정 ...
		return "오버로딩";
	}
	
	void add(Human human) {
		human.name = "홍길동";
		human.age = 100;
		System.out.printf("이름 %s, 나이 %d", human.name,human.age);
	}
}

public class Ex13_Method_Overloading {

	public static void main(String[] args) {
		// println Overloading
		System.out.println();
		System.out.println("A"); // 자동으로 parameter String 호출
		System.out.println('a'); // 자동으로 parameter char 호출
		
		/*
		오버로딩을 쓰지 않는다면 ... 귀찮아진다
		System.out.println();
		System.out.printlnString("A");
		System.out.printlnChar('a');
		*/
		
		OverTest ot = new OverTest();
		
		int result = ot.add(100);
		System.out.println(result);
		result = ot.add(200,300);
		System.out.println(result);
		
	}

}
