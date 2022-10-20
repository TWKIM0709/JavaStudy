/*
	this : 객체 자신을 가르키는 this( this.empno ...등 )
		 : 생성자를 호출하는 this ( this(100,"red"); ... )
		
	상속관계
	부모 <> 자식
	
	super 	: 현재 자식이 부모에게 접근할 수 있는 주소값을 가지고 있다.
			: 상속관계에서 부모에 접근할 수 있는 유일한 방법
		
	1. super >> 상속관계에서 부모자원에 접근
	2. super >> 상속관계에서 부모의 생성자를 호출(명시적으로)
	
	TIP)
	Java : super();
	C#	 : base();
*/

class Base{
	String basename;
	Base(){
		System.out.println("Base 기본 생성자 함수");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("basename : " + this.basename);
	}
	void method() {
		System.out.println("부모매소드");
	}
}

class Derived extends Base{
	String dname;
	Derived() {
		System.out.println("Derived 기본 생성자 함수");
	}
	Derived(String dname){
		
		//부모의 생성자를 호출할 수 있는 super
		super("super를 사용해 부모 생성자 호출");
		
		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	
	// 어느날 비도오고 마음도 꿀꿀하고.. 부모님이 그리울 때...
	
	// 상속관계에서 override(재정의)를 하게되면 method는 override된 것만 사용할 수 있다
	@Override
	void method() {
		System.out.println("부모자원 재정의");
	}
	//이 때 override한 method(부모 클래스의 매소드)를 사용하고 싶으면 super.[함수]로 사용할 수 있다.
	void pmethod() {
		super.method(); // 부모의 함수 method()를 사용함
	}
}

public class Ex06_Inherit_super {

	public static void main(String[] args) {
		Derived d = new Derived("홍길동");
		d.method();
		d.pmethod();
	}

}
