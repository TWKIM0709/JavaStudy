package kr.or.kosa;

/**
 *  기능 ( 행위를 만드는 방법 )
 *  함수 (Method)
 *  
 *  method : 행위 또는 기능의 최소단위 구현 : 하나의 함수에 하나의 기능만 구현
 *  		 ex) 먹는다 , 달린다 , 잔다 , 걷는다
 *  클래스 : filed + method
 *  
 *  ex) 롯데월드 : 게임방 :: 농구 , 동전, 뽑기 ...
 *  
 *  >> method 함수는 호출에 의해서만 동작된다  :  누군가 이름을 부르지 않으면 동작하지 않는다 ...
 *  
 *  
 *  
 *  JAVA 함수)
 *  1. void , parameter(O) 			: void print(String str) { .. }
 *  2. void , parameter(X) 			: void print() { ... }
 *  3. return type , parameter(O) 	: [type] print(int data) { ... return [type]; }
 *  4. return type , parameter(X)	: [type] print() { .... return [type]; }
 *  								   type >> int , double , String , class 등 데이터 타입
 *  								   ex) int print(int data) { ... return 100; }
 *  
 *  >> void >> 돌려주는 것이 없다 >> 리턴 타입이 없다
 *  >> return type >> 기본 8가지 + String + Array(배열) + class + collection + interface 등
 *  
 *  = return sample =
 *  boolean print() { ... return [true or false]}
 *  Car print() { Car c = new Car(); ... return c; } // Car [객체의 주소]를 return하겠다
 *  String print() { ... return "문자열"; }
 *  
 *  >> parameter type >> void print( [파라미터] , [파라미터] ){ ... }
 *  >> 기본 8가지 + String + Array(배열) + class + collection + interface 등
 *  
 *  = parameter sample =
 *  void print(int i) {}
 *  void print(String str){}
 *  void print(Car car){}	// print 함수는 parameter로 Car타입의 주소값을 받는다
 *  
 *  ex)
 *  Car c = new Car();
 *  
 *  void print(Car car) { ... }
 *  
 *  print(c);		//print 함수를 호출할 때 c라는 변수값(주소값)을 넣는다
 *  
 *  어려워요 ... 파라미터가 여러개 ...
 *  
 *  void print(int a, int b, int c, int d){} ... 여러개 가능
 *  void print(Car c, String str, int i){} ... 여러 타입도 가능
 *  
 *  
 *  >> 관용적인 표현
 *     코드 규칙 : 관용적
 *     class 이름의 첫글자는 대문자 	: class Car , class Person
 *     method 이름의 첫단어의 첫글자는 소문자, 이어지는 단어의 첫글자는 대문자 : void getNumber(){} , void empPrint(){}
 *     
 *     ex) 사원번호를 가지고 사원의 모든 정보를 가지고와라
 *     void getEmpListByEmpno(int empNumber){} >> 함수의 이름으로 대략적인 내용파악이 가능하도록
 *  
 *  
 * @author KOSA
 *
 */
public class Fclass {
	// void m(){} >> 컴파일러가 default 접근자 >> default void m() >> 같은 패키지 안에서만 ...
	// 함수는 대부분 public으로 생성
	// 나머지는 private : 이유 : 클래스 내부에서만 쓰는 함수 >> 공통함수 >> 다른 함수를 도와주는게 목적
	
	// return X , parameter X
	public void m() {	
		// 기능 구현
		// main 함수 처럼
		System.out.println("일반함수 : void, parameter X");
	}
	
	//return X , parameter O
	public void m2(int i) {	
		System.out.println("일반함수 : void , parameter O");
		System.out.println("parameter 는 함수 내에서 자유롭게 활용 / parameter 는 함수 내에서만 유효 / parameter(i) :" + i);	
	}
	
	//return O , parameter X
	public int m3() {	
		// return type이 존재하면 반드시 타입에 맞는 값을 return 해줘야됨
		return 1000;
	}
	//return O , parameter O
	public int m4(int data) {
		return 100 + data;
	}
	
	// = = = = 여기까지가 기본 4가지 = = = =
	
	// return O , parameter O ... parameter 개수가 여러개
	public int sum(int i, int j, int k) {
		return i + j + k;
	}
	
	//함수의 접근자
	//(default) int subSum(){}	// 같은 package는 가능
	// private int subSum(){}	// 같은 package도 안됨
	// class 내부에서 다른 함수를 도와주는 공통함수 ... private 함수로 사용
	

	private int subSum(int i) {	// 다른 함수가 호출해서 사용하는 목적
		return i + 100;			// 로직을 다른 여러 함수가 가지고 있다면 ... 변경시 복잡함 ... 유지보수를 위해 공통함수로 빼두는 것
	}
	
	public void callSubSum() {
		//함수는 다른 함수를 호출할 수 있다
		int result = subSum(100);
		System.out.println("call result : " + result);
	}
	
	private int operationMethod(int data) {
		return data*200;
	}
	
	public int opSum(int data) {
		int result = operationMethod(data);
		if(result > 0 ) return 1;
		else return -1;
	}
	
	/* 
	   = = = Quiz = = =
	   a와 b 둘중에 큰 값을 return하는 함수를 만드세요
	   ex) max(10,5) 를 넣으면 10이 return 되는 함수
	*/
	public int max(int a, int b) {
		return (a>b) ? a : b;
	}
	

	
}











