import kr.or.kosa.Pclass;

/*
	상속관계에서 ... 접근자 : protected
	
	public
	private
	default
	protected
	
	protected : 양면성 >> default , public
	>> 상속이 없는 클래스 안에서 protected >> default와 동일
	>> 상속관계에서만 의미를 같는다 ( 상속관계에서는 ) >> public
*/

class Dclass{
	public int i;
	private int p;
	int s;	//default
	protected int k;	//상속이 아니면 default
}

class Child2 extends Pclass{
	void method() {
		this.k = 100;	// 상속관계 >> 자식은 부모의 protected 자원을 public 처럼 사용
		System.out.println(this.k);
	}
}

public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Pclass p = new Pclass();
		//p.i
		//p.k	>> protected >> 그냥 쓰면 default 접근자 >> 못쓴다
		
		Child2 c = new Child2();
		c.method();
	}

}
