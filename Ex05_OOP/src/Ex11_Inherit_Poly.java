
// 부모
class Pbase{
	int p = 100;
}
// 상속받은 애들
class Cbase extends Pbase{
	int c = 200;
}

class Dbase extends Pbase{
	int d = 300;
}

class Test{
	void print(Pbase p) {
		System.out.println("ㅁㄴㅇㄹ");
	}
}

public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		Dbase dbase = new Dbase();
		System.out.println(cbase.toString());
		
		//부모타입 Pbase 타입의 p는 Cbase, Dbase 모두 가질 수 있다.
		
		Pbase p = cbase;
		p = dbase;
		
		Cbase c = (Cbase)p;	//부모가 자식에게 주소를 주려면 Down 캐스팅해줘야된다.
	}

}
