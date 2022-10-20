/*
 	변수 <-> 상수
 	상수 : 한번 값이 [초기화]되면 그 값은 변경 불가능하다.
 	상수자원 : 고유값 ex) 주민등록번호, PI값(3.141592...), 시스템번호(버전번호 등)
 	상수는 관용적으로 [대문자]로 쓴다.
 	
 	java : final int NUM = 10;
 	TIP) c# : const integer NUM = 10;
 	
 	final 키워드
 	1. final class Car{ } >> class 앞에 final >> 상속 금지
 	2. public final void print(){} >> 함수 앞에 final >> override 금지
 	3. final int number = 10 >> member field 앞에 final >> 값 변경 금지
 	
*/

class Vcard{
	final String KIND = "heart";
	final int NUM = 10;
	
	void method() {
		System.out.println(Math.PI);
	}
}

class Vcard2{		//설계자 입장에서 ... 만든 카드마다 다른 상수값을 가지게 하겠다.(고유값을 주겠다.)
	final String KIND;
	final int NUM;
//	public Vcard2() {}
	public Vcard2(String KIND, int NUM) {
		this.KIND = KIND;
		this.NUM = NUM;
	}
	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
}

public class Ex07_Final {

	public static void main(String[] args) {
		Vcard vc = new Vcard();
//		vc.KIND = "ss";	//변경불가
		System.out.println(vc.KIND);
		vc.method();
		
		Vcard2 vc2 = new Vcard2("다이아몬드",1);
		System.out.println(vc2);
		Vcard2 vc3 = new Vcard2("스페이드",2);
		System.out.println(vc3);
		Vcard2 vc4 = new Vcard2("클로버",3);
		System.out.println(vc4);
	}

}
