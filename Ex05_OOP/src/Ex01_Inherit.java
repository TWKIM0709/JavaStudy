/*
	OOP(객체지향언어)의 특징 ( 여러개의 조각(클래스)들을 조립해서 하나의 큰 제품을 만드는 행위 )
	1. 상속
	2. 캡슐화 (은닉화) >> private
	3. 다형성 (상속관계에서 부모 타입이 자식타입의 주소를 가질 수 있다.)

	= 상속 =
	java : [child] 'extends' [Base]
	c#	 : [child] : [Base]
	
	특징
	1. 다중상속이 불가능
	2. 단일상속만 가능 >> 여러개의 상속 받는 방법 >> 계층적 상속가능
	3. 다중상속 비슷한 기능 >> Interface (아직 안배움)
	
	상속
	1. 진정한 의미 : 재사용성
	2. 단점 : 초기 설계 비용(돈, 시간)이 많이든다
	3. 재사용성 >> 설계 >> 시간↑ (여러개의 설계도 분할 ... 부모 , 자식 ... 할아버지... )
	4. 상속 관계에서는 부모 클래스부터 메모리에 올라간다 ... 부모 >> 자식 >> 자식의 자식
		GrandFather >> Father >> Child	: heap 메모리에 3객체
	5. 사용자(개발자)가 만드는 모든 클래스 >> default로 Object 클래스를 상속
		>> 최상위 클래스가 Object 상속 ( 다중상속 안됨 >> 모든 클래스가 Object를 직접 상속하는건 아니다)
		>> class Car extends Object { ... }
		Object : 모든 클래스의 root(최상위) >> 모든 클래스의 부모
	6. private : 상속관계여도 직접은 못 접근한다
*/

class Car{	//extends Object
	
}

class GrandFater extends Object{	
	public int gmoney = 5000;
	private int pmoney = 10000;
	public GrandFater() {
		System.out.println("GrandFater");
	}
}

class Fater extends GrandFater{
	public int fmoney = 3000;
	public Fater() {
		System.out.println("Fater");
	}
}

class Child extends Fater{
	public int cmoney = 1000;
	public Child(){
		System.out.println("Child");
	}
}

public class Ex01_Inherit {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
		
		Car car = new Car();
	}

}











