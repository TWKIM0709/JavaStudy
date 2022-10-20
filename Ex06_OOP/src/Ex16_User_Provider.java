/*
	user 사용자 <==> provider 제공자
	
	class A(){}
	class B(){}
	관계 : A는 B를 사용합니다.	>> 상속, 포함
	
	1. 상속 : A extends B
	2. 포함 : A 클래스가 member field로 B를 사용 >> class A{ B b; }
		2.1 부분
		2.2 전체
		
	-------------------------------------------------------------------(전체집합)
	public class B{}
	public class A{
		public int i;
		public B b;		//A는 B를 사용한다 (포함 관계의 형태로)
		public A(){ this.b = new B(); }
	}
	
	>> main함수
	A a = new A();
	a.b.자원;	//B객체에 접근하는 방법
	
	B는 독자적인 생성은 불가능 >> A라는 객체가 만들어져야 B도 같이 생성 >> new A();를 해야 B 객체가 생성된다.
						  >> A와 B는 같은 운명 공동체 (전체집합) >> 자동차와 엔진, 노트북과 CPU 등
	------------------------------------------------------------(부분집합)
	public class B{}
	public class A{
		public int i;
		public B b;		//A는 B를 사용한다.
		public A(){}
		void m(B b){
			this.b = b;
		}
	}
	-------------------------------------------------------------
	
	관계 : A는 B를 사용합니다 >> A는 B를 참조합니다 >> 포함관계
		  B를 Member Field로
*/

interface Icall{
	void m();
}


class D implements Icall{
	@Override
	public void m() {
		System.out.println("D가 Icall 인터페이스의 m() 재정의");
	}
}
class F implements Icall{
	@Override
	public void m() {
		System.out.println("F가 Icall 인터페이스의 m() 재정의");
	}
}


// 현대적인 프로그래밍 방식 (Interface 가 대새) >> 유연성 >> 디커플링(느슨하게?)
class C {
	/*이전 방식
	void method(D d){...} or void method(F f){...} >> 확장성 무시
	*/
	void method(Icall ic) {	//Icall을 구현하는 모든 객체의 주소를 받을 수 있다.
		ic.m();
	}
	
	
	
}







public class Ex16_User_Provider {

	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		F f = new F();
		
		c.method(d);
		c.method(f);
	}

}








/*

 메인 : 동물원
 
  
  		인터페이스
  		I육식, I초식
  
 		- 동물(추상클래스)
 			사자 extends 동물 implements 육식
 			토끼 extends 동물 implements 초식
 			꿩 extends 동물 implements 초식
 		
 		- 사육사
 			밥주는 기능 (인터페이스로 육식, 초식 구분)

[동물]
동물은 나이, 색깔을 모두 가지고 있다.
각각의 동물은 고유한 종족을 가지고 있다.
동물은 이동하는 기능을 가지고 있다.

ex)
나이 : 1 , 3, 6
이름 : 나비, 흰둥이 등등
종족 : 토끼, 사자, 사슴

[사육사]
사육사는 이름을 가지고 있다
사육사는 동물의 정보를 말하는 기능을 가지고 있다.
사육사는 밥을 주는 기능을 가지고 있다. (육식, 초식 구분)


*/