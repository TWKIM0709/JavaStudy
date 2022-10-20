
/*
	다형성(상속 관계에서 존재)
	다형성 : 여러가지 성질(형태)을 가질 수 있는 능력
	
	Java : [상속관계]에서 [하나의 참조변수]가 [여러개의 타입]을 가질 수 있다.
	>> [하나의 참조변수] >> 부모타입
	>> [여러개의 타입]  >> 부모를 상속받은 자식
	
	다형성 : 	현실 >> 부모는 자식에게 모든 것을 준다.
			프로그램 >> 자식이 부모에게 조건 없이 준다.
	
	상속관계에서 부모타입은 자식타입의 주소를 가질 수 있다
	단.. 부모는 자신의 자원만 접근 가능하다.
	단.. 재정의된 자원은 접근 가능하다
*/

//부모 자원으로 ( 분모:공통사항:일반화,추상화 )
class Tv2{
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown(){
		this.ch--;
	}
}

//CapTv : 특수화, 구체화, 고유한 자원 추가
class CapTv extends Tv2{
	String text;
	String captionText() {
		return text = "자막처리중";
	}
}



public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv ct = new CapTv();
		ct.power();
		ct.chUp();
		ct.chDown();
		System.out.println(ct.captionText());
		
		///////////////////////////////////////////
		
		Tv2 tv2 = ct;	
		//상속관계에서 부모타입은 자식타입의 주소를 가질 수 있다
		//단.. 부모는 자신의 자원만 접근 가능하다
		//단.. 재정의된 자원은 접근 가능하다.
		
		System.out.println(tv2==ct);
		//tv.captionText();	//자식 자원은 접근 불가 (+재정의된 부모 자원도 불가)
	}

}





