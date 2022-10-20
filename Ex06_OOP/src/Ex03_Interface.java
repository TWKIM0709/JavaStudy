/*
	추상클래스와 인터페이스
	
	▶ 인터페이스
	약속, 표준을 만드는 것 (규칙, 규약)
	소프트웨어 설계의 최상위 단계
	구현부를 가지지 않는다.. 약속에 대한 정의만...
	
	▶ 추상클래스와 인터페이스의 공통점
	1. 스스로 객체 생성이 불가능
	2. 사용
	 추상클래스 extends			ex) class Car extends Abclass
	 인터페이스 implements		ex) class Car implements Abinterface
	둘 다 추상자원을 가지고 있다 >> extends를 하던 implements를 하던 >> 강제적 구현(재정의)이 목적
	
	▶ 추상클래스와 인터페이스의 다른점
	1. 추상클래스(완성 + 미완성) <==> 인터페이스(전체가 미완성)
	2. 원칙적으로 클래스는 [다중상속 불가](계층적 상속 사용)
	   		   인터페이스는 [다중 구현 가능]	>>	설계시 작은 단위로 >> 여러개를 만들어서 >> 모아서 큰 약속
	   class Test extends Object implements Ia, Ib, Ic{ ... }
	   Tip) 인터페이스와 인터페이스끼리는 상속이 가능하다 >> 약속을 크게 만들 수 있다.
	3. 인터페이스(상수를 제외한 나머지는 미완성 함수) >> JDK8부터는 Default, static을 쓸 수 있게 되었는데 잘 안씀..
	
	▶ 초급 개발자의 시선
	1. 인터페이스를 [[[[다형성]]]] 입장으로 접근하자 ( 인터페이스는 부모 타입 ) ***
	2. 인터페이스는 서로 연관성이 없는 클래스를 하나로 묶어주는 기능을 한다 (같은 부모를 가지게 함으로써)
	3. Java API >> 수 많은 (미리 만들어진) 인터페이스르 제공 >> 설계하지 않아도 사용할 수 있는 자원이 이미 있다
	4. 인터페이스 (~able) : ~ 할 수 있는 >> 날 수 있는, 달릴 수 있는
	5. 객체간 연결고리 (객체간 소통) >> [[[[다형성]]]]
	
	
	
	
	▶ 복습
	1. 실제 구현부를 가지고 있지 않다 : 실행 블럭이 없다 : 규칙과 약속만 있다
	시스템에서 이동 기능을 move 라는 이름을 사용하고 좌표값을 받아야 된다.
	>> 합의 void move(int x, int y);	//구현은 알아서
	>> JAVA API 인터페이스 >> 설계, 구현 클래스 다 있음
	>> Collection(동적배열) >> Vector , ArrayList , HashSet , HashMap
	이런 클래스는 수 많은 인터페이스를 구현하고 있는 클래스이다.
	
	2. 생성방법
	interface 이름 { ... }
	2.1 상수(final)	>> [public static final] int VERSION = 1;
	2.2 추상함수		>> [public abstract] void message(String args);
	
	▶종류
	interface Aable{}	//아무 자원을 가지지 않아도 된다.
	interface Aable{ int NUM = 10; }
	interface Aable{ void run(); }
	
	class Test extends Object implement Ia, Ib, Ic{ .... }
	class Test implement Ia, Ib, Ic{ .... }
*/

interface Ia{
	//어차피 인터페이스는 [상수 or 추상함수]만 존재하니 생략 >> 컴파일러가 알아서 해준다 
	int AGE = 100;	//상수		>> [public static final] int AGE
	String GENDER = "남";		// [public static final] String GENDER
	
	// { } 가 없는 추상함수만 있다.
	
	String print();				// [public abstract] String print();
	void message(String args);	// [public abstract] void message(String args);
}

interface Ib{
	int AGE = 10;
	void info();
	String val(String s);
}


class Test2 extends Object implements Ia{

	@Override
	public String print() {
		
		return null;
	}

	@Override
	public void message(String args) {
		
	}
	
}

class Test3 extends Object implements Ia, Ib{
	
	@Override
	public void info() {
		
	}

	@Override
	public String val(String s) {
		return null;
	}

	@Override
	public String print() {
		return null;
	}

	@Override
	public void message(String args) {
		
	}
}
public class Ex03_Interface {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		Ia ia = t2;	//다형성 >> 부모는 자식객체의 주소를 가질 수 있다.
		ia.message("재정의되어 사용 가능");
		System.out.println(ia.GENDER);
		
		
		Test3 t3 = new Test3();
		Ia ia2 = t3;
		Ib ib2 = t3;
		System.out.println(ia2.GENDER);
		System.out.println(ib2.AGE);
	}

}
