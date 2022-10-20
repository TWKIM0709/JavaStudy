/*
	추상클래스
	>> 미완성 클래스(설계도)
	1. 완성된 코드 + 미완성 코드
	2. 완성(함수) 실행블럭이 있는 함수 + 미완성(함수) 실행블럭이 없는 함수 >> public void run() 없음;
	원래함수) public void run(){실행블럭}
	3. 완성된 클래스 (new 가능) <==> 미완성 클래스(스스로 객체 생성 불가)
	
	설계자 입장에서..
	>> 반드시 재정의해라 >> 강제적 구현을 목적으로(못 믿어서) 구현(재정의)을 강제
*/

class Car{
	//실행블력 안에 구문 없어도 {실행블럭이 있으면} 완성된 코드다
	void run() {
		
	}
}
class Hcar extends Car{
	
}
//Car >> run을 재정의하게 만들고 싶다 >> 강제성이 없으니 선택사항
//위 코드는 [강제성]이 없다

abstract class Abclass{	// 클래스 안에 최소 1개 이상의 추상함수(미완성함수)를 가지고 있는 클래스
	//완성된 코드
	int pos;
	void run() {
		pos++;
	}
	
	//미완성 코드 (미완성 함수 : 추상함수)
	abstract void stop();	// 실행블력이 없다 >> 재정의를 강제
}

class Child extends Abclass{

	@Override
	void stop() {
		this.pos = 0;
		System.out.println("stop : " + this.pos);
	}
}

class Child2 extends Abclass{

	@Override
	void stop() {
		this.pos = -1;
		System.out.println("stop : " + this.pos);
	}
}

public class Ex01_Abstract_Class {

	public static void main(String[] args) {
		Child ch1 = new Child();
		Child2 ch2 = new Child2();
		
		ch1.run();ch1.run();ch1.run();
		ch1.stop();

		ch2.run();ch2.run();ch2.run();
		ch2.stop();
		////////////////////////////////////////
		Abclass ab = ch1;
		//상속 관계에서 부모타입의 참조변수는 자식타입객체들의 주소를 받을 수 있다. (다형성)
		//부모는 자신의 자원만 볼 수 있다.
		//재정의가 된 자원은 볼 수 있다.
		ab.run();
		ab.stop();
	}

}







