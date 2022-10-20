/**
 * instance variable     >> class Car {private Strin [color];}
 * >> 객체마다 가질 수 있는 값 >> 생성되는 객체마다 다른 색상을 가질 수 있다
 * 
 * local variable >> class Car{ public void move(){ int [speed] = 0; 반드시 초기화 } }
 * 
 * block variable >> class Car{ public void move(){ for(int [i] = 0; i<10...}{ 제어가 시작 되면 생성, 끝나면 소멸 } } }
 * 
 * static variable >> 공유자원 (객체간) , 객체 생성 이전에 memory 에 올라가는 자원 (영역 : class area, method area)
 * 
 * 객체를 만드는 유일한 방법 : new를 통해 메모리에 올리는 것
 * static : new 없이도 메모리에 올라간다 ... ?
 * 
 * public class Ex06_VairableScope >> 클래스 >> 구체화(메모리에 올려야) 사용 가능하다 >> main함수가 있는 클래스를 new한 적이 없다
 * 
 * 1. 프로그램 시작시 class 정보를 class area에 넣는다.
 * 2. class 정보를 읽을 때 static 가 붙은 자원이 있으면 해당 자원을 메모리에 올린다.
 * 3. static 자원의 이름이 main이면 메모리에 올렸던걸 stack에 바로 올린다. (new로 생성하지 않아도) >> 실행한다  
 * 
 * @author KOSA
 *
 */
class test{
	static int cv;
}
class Variable {
	int iv;
	/*
	 * 1. member field, instance variable
	 * 2. iv는 언제 사용 가능(메모리에 올라갈때)할까
	 * 2.1 Variable v1 = new Variable();>> heap 메모리에 객체가 생성된다. >> v1 객체 안에 iv가 생성된다
	 *     Variable v2 = new Variable();>> heap 메모리에 객체가 생성된다. >> v2 객체 안에 iv가 생성된다
	 * 3. 목적 : 데이터 (정보), 자료를 담을 목적
	 * 3.1 정보 : 고유 , 상태 , 부품(class)
	 * 	- 생성되는 객체마다 다른 값을 가지고 있다.
	 *  - 그래서 초기화를 값을 강제하지 않는다
	 *  - default 값은 가지고 있다. ( int : 0 		| double : 0.0 		| char : 빈문자 '\u0000' 
	 *  						  String : null | boolean : false 	| Car : null
	 *  - 변수의 생성 시점은 new라는 연산자를 통해서 heap에 Variable이라는 이름에 객체가 만들어지고 나서 바로 생성됨(그 객체 안에)
	 * */
	static int cv;
	/**
	 * 1. class variable (클래스 변수) , 일반적으로는 static variable (객체간 공유자원)
	 * 2. 목적 : 정보 담는 것 >> 생성되는 모든 객체가 공유하는 자원
	 *    >> 생성되는 모든 객체 >> heap이라는 영역에 생성된 객체들이 공유하는 자원
	 * 3. 접근방법
	 * 		1. [class이름].[static변수명] >> ex) Varialbe.cv >> 객체가 생성되기 전에 (클래스 단계에서?)올라감 ... 접근도 클래스로 ..
	 * 		2. Variable v  = new Variable(); >> v.cv  >> [v가 가진 cv]는 [class area]의 [Variable]의 [cv의 주소]를 가지고 있다.
	 * 		   Variable v2 = new Variable(); >> v2.cv >> [v2가 가진 cv]는 [class area]의 [Variable]의 [cv의 주소]를 가지고 있다.
	 * 		   >> v.cv == v2.cv   >> 같은 주소를 바라본다(static 변수의 주소) >> 객체끼리 공유하는 자원 >> static
	 * 4. 생성시점 ( JAVA의 실행 과정 )
	 * 	  Hello.java > javac Hello.java > Hello.class
	 *    java.exe Hello > 엔터 실행
	 *    > JVM > OS > MEMORY를 빌려 > 빌린 MEMORY 정리(영역을 나눔) > class Loader System이 분석함 
	 *    > 클래스 정보(metadata:설명) > class arda(method area) memory에 클래스정보(metadata)를 올림 (언제, 어떤, 버전 등의 정보를)
	 *    > 그 클래스 안에 static varialbe 또는 static method가 있다면
	 *    > static 자원을 class area(method area) memory 영역에 할당한다.
	 *    > 그 자원이 main(함수)이라면 실행한다 (stack 영역에 main 함수를 올린다) : 정해진 규칙
	 */
	void method() {
		iv = 0;
		/**
		 * local variable (함수 안에 >> 지역변수 >> 사용전에 반드시 초기화)
		 * 생명주기 : 함수가 호출되면 생성(stack메모리에 생성) >> 함수가 끝나면 (또는 강제로 return되면) 같이 소멸된다 >> 함수와 운명공동체 
		 */
		for(int i = 0; i< 10; i++) {
			/*
			 	int i >> block 변수 >> for문 시작되면 생성.. for문 끝나면 소멸
			 */
		}
	}
}

class abc{
	int a;
	static int b;
}

public class Ex06_Vairable_Scope {

	public static void main(String[] args) {
		Variable.cv = 100;
		
		Ex06_Vairable_Scope ex06 = new Ex06_Vairable_Scope();
		ex06.method();
		
		Variable v = new Variable();
		System.out.println("v.cv : " + v.cv);
		
	}
	public void method() {
		System.out.println("asdf");
	}

}
