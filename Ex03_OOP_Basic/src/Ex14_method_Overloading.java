class Human2{
	String name;
	int age;
}

class Test2{
	Human2 add(Human2 h) {
		Human2 h2 = new Human2();
		h2.name = h.name + "더하기 h2";
		h2.age = 200;
		return h;
	}
	Human2 add(Human2 h, Human2 h2) {
		h2.name = h.name;
		h2.age = h.age;
		return h2;
	}
}

public class Ex14_method_Overloading {

	public static void main(String[] args) {
		Test2 t = new Test2();
		
		Human2 man = new Human2();		// man = Ox123 주소
		Human2 woman = new Human2();
		
		Human2 man2 = t.add(man);		// man2 = man의 주소값 Ox123 얻어감
	}

}
