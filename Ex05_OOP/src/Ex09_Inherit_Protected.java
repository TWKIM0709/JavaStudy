import kr.or.kosa.Bird;

class Bi extends Bird{
	//일반 새.. 날 수 있다.
	@Override
	public void moveFast() {
		super.moveFast();			//  바꿀 필요 없다. 그대로 쓰겠다. ( super )
	}
}

class Ostrich extends Bird{
	//특징 : 새인데 날지 못하고 달린다.
	void run() {
		System.out.println("달린다.");
	}
	@Override
	public void moveFast() {
		run();
	}
}

public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Bi b = new Bi();
//		b.moveFast() >> protected >> 상속을 안해서 사용 못 함
		// moveFast()>> 상속관계에서 재정의를 하지 않으면 사용할 수 없다.
		b.moveFast();	//상속받은 moveFast를 super로 그대로 상속했다. Fly 날 수 있는 새
		
		Ostrich o = new Ostrich();
		o.moveFast(); 	//상속받은 moveFast를 run으로 재정의	했다.
	}
}



