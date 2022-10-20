import kr.or.kosa.Emp;

/*
 * 
 * */

class Test2{
	int x = 100;
	void print() {
		System.out.println("부모 Test2");
	}
}
class Test3 extends Test2{
	int x = 300;	// 부모와 똑같은 변수를 만든다 >> 부모무시하기 >> 본인 것을 쓴다
	@Override
	void print() {
		System.out.println("자식이 부모의 함수를 재정의");
	}
	void print(String str) {
		System.out.println("이건 오버로딩" + str);
	}
}

public class Ex05_Inherit_Override {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		System.out.println(t3.x);	// 부모와 똑같은 변수를 만든다 >> 부모무시하기 >> 본인 것을 쓴다
		
		t3.print();
		t3.print("오버로딩 String parameter");
		
		
		Emp emp = new Emp(1000, "홍길동");
		System.out.println(emp);			//kr.or.kosa.Emp@cac736f
		System.out.println(emp.toString());	//kr.or.kosa.Emp@cac736f
		// emp를 출력하면 사실은 ... emp.toString()과 동일한 효과
		// toString() 은 Object의 자원 ... 주소값을 return 하겠다
		
		// toString() 을 재정의하면 결과는 재정의된 내용으로 출력된다. Emp [empno=1000, empname=홍길동]
		
		// JAVA API가 재공하는 수많은 클래스가 Object클래스의 toString()을 재정의하고 있다.
	}
}
