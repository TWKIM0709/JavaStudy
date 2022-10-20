//라인주석
/* 블럭주석
 
   Ex02_Variable >> 클래스 >> 설계도 >> 데이터 타입
   
   // ===== 클래스의 종류 =====
   1. class Car { ... } >> 독자적인 실행이 불가능 >> 다른 클래스(설계도)에서 참조하는 클래스 >> main 함수가 없다 >> Lib (라이브러리)
   2. class Car { public static void main(String[] args){ ... }} >> 독자적으로 실행 가능한 클래스
   2.1 static void main(String[] args) >> main 이름을 가지는 함수  >> 프로그램의 시작점(진입점) >> 실행
   
   Tip) C#과 자바는 부모가 같아서 문법이 똑같음
   C# 언어 ) public static void Main(String[] args)
   							   ^ 이거하나 뺴고(대소문자)
   // ===== 변수란? =====
   변수 : Variable
    데이터(자료)를 담을 수 있는 공간의 이름 ( 메모리 )
    공간(크기) : 데이터의 타입(자료형) >> 메모리의 공간은 한정되어 있다 >> 최소한의 공간, 최대한의 데이터
   - 만드는 법
   [데이터 타입] [변수명] = [값] >> Ex) int i = 100
   
   // ===== 클래스 구성 =====
   public class [클래스 이름] {
   	  public static void main(String[] args){
   	    이(함수) 안에 있는 변수 >> 지역변수
   	    int num = 100; //초기화
   	  }
   }
   
   // ===== 위치에 따른 변수의 종류 =====
   변수가 선언되는 위치 (scope : 유효범위)
    > 변수의 종류에 따라서
    1. instance variable	(객체변수) 			>> class Car { int number = 2000; }
    2. local variable 		(지역변수 / 함수안에) 	>> class Car { public void run() { int speed = 0; } }
    3. block variable 		(블럭변수)			>> 함수안에 - 제어블럭(if, for 등) 안에 있는 변수 >> class Car { public void run() { for(int i = 0; i...){ ... } } } 
    4. static variable		(공유자원 / 객체간)		>> class Car { public static num = 100; }
   
*/

// class는 설계도이다 == class는 Type이다 ( 여려개의 의미 있는 작은 타입을 가지는 큰 타입 ) : 사용자 정의 타입

// 자바는 하나의 물리적인 파일안에 여러개의 클래스를 사용가능 ... (연습용으로)
// 실제 개발할 때는 하나의 파일에 하나의 클래스를 사용한다.

// ===== class 맛보기 =====
class Car{	// 설계도를 사용하기 위해서는 구체화 시켜야 된다 ... 메모리 위에 올리는(만드는) 행위를 통해서 >> 연산자 new
	int iv = 100;	// instance variable(객체변수)
	int window;		// instance variable은 초기화를 하지 않아도 된다.
					// instance variable는 내부적으로 기본값을 갖는다(default) >> int형은 0을 기본값으로 (int window = 0) >> float, double(실수)의 기본값은 0.0
	/*
	 초기화 : 변수가 처음 값을 갖는 것(할당을 통해)
	 질문 :	why int window 이런 객체변수는 초기화를 하지 않아도 문제가 생기지 않는다.
	 		자동차를 만들 때 int window = 4 ... 창문 4개
	 		Car 라는 설계도를 가지고 차를 생산 가능
	 		Car 쌍용차 = new Car(); //자동차를 만드는 행위
	 		쌍용차.window = 10;
	 		
	 		Car 삼성차 = new Car();
	 		삼성차.window = 2;
	 		
	 		생성되는 자동차마다 창문의 개수를 달리 할 수 있다.
	 		
	 */
	public void stop() { //별도의 지역(함수)
		window = 100;
		//speed = 200; 선언시 문제점을 파악할 수 있다 .. 알아야 될 것 ..
	}
	public void start() {
		int speed = 100; //지역변수
	}
}



public class Ex02_Variable {

	public static void main(String[] args) {
		// 시작점 
		// main 함수 안에 코드가 있어야 실행된 결과를 볼 수 있다.
		int lv = 100;
		System.out.println("lv(지역변수) : " + lv);
		
		int number = 0; //선언과 동시에 초기화
		System.out.println("number :" + number);
		number = 100;
		System.out.println("수정 후 number :" + number);
		number = 200;
		System.out.println("수정 후 number :" + number);
		
		// ===== 선언과 초기화 =====
		int a = 100;
		int b; //선언만 ( 초기화 안됨 )
		System.out.println("a : "+a);
		//The local variable a may not have been initialized >> 지역변수가 초기화되지 않음
		//main() { 함수안에 있는 변수는 지역변수라고 하는 데 이 지역변수는 초기화 하지 않으면 사용 불가 }
		
		b = 200; // b 초기화
		System.out.println("b 변수 초기화 후 출력 : "+b);
		
		// ===== 선언 방법 =====
		int c, d; // 선호하지 않음 >> 같은 타입의 변수가 중복되면 >> 배열 사용 >> int[] c...
		
		// key point
		// local variable >> 함수 안에 있는 변수 >> main() { 안에 있는 변수(지역변수) } >> 반드시 초기화가 필요
		int k = 100; //지역변수는 선언과 동시에 초기화를 하는 습관을 들이자
		
		// ===== 클래스 생성 =====
		Car scar = new Car(); 	// scar 라는 자동차를 생산 ...(현실 아파트를 지은 것)
								// java가 OS에게 할당 받은 메모리 영역에 만들어 진 것
		
		// ============
		//int k = 100;  같은 지역 내에서는 같은 변수명이 존재할 수 없다
		
		int f = 100; // f 라는 변수는 100이라는 값을 가지고 있다.
		int f2 = f;  // 할당
		System.out.println("f : " + f);
		System.out.println("f2 : " + f2);
	}
}















