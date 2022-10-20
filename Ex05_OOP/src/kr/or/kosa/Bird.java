package kr.or.kosa;

//부모로 사용
//새들의 공통사항, 추상화된 내용 >> 날 수 있다. 빠르다. 
public class Bird {
	//공통기능
	public void fly() {
		System.out.println("Flying");
	}
	//protected 
	//설계자가 고민... 날지 않는 타조가 상속을 하면 어떻게 하지?
	//	>> Bird를 상속하는 당신은 moveFast() 자원에 대해서 재정의를 했으면 좋겠다.
	protected void moveFast() {
		fly();
	}
}
