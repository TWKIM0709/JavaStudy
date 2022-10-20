package kr.or.kosa;
//디자인 패턴 >> 생성 패턴 >> new

// 싱글톤 ...(객체 하나를 만들어서 공유)
// 의도 : 하나의 객체를 공유하는 보장성 코드를 제공

// 공유IP , 공유프린터 등 설계에 사용

// 하나의 주소값을 쓰도록 강제하는 디자인패턴 Singleton

public class Singleton {
	private static Singleton p;	//p라는 변수가 주소를 가지게 ... new 해야 ...
	
	private Singleton() {
		//생성자 접근자를 private .. 생성자 함수 호출 불가 .. 객체 생성 불가 (new Singleton 불가)
	}
	public static Singleton getInstance() {
		if(p == null) {
			p = new Singleton();	//같은 클래스 내부에서 public과 private는 동등
		}
		return p;
	}
}
