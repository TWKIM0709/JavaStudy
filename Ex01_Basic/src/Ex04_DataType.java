/*
  1. 자바가 제공하는 기본 타입(시스템 타입 : 원시타입) >> 8가지
  2. 8가지 기본 타입 [값을 저장]하는 타입
  
  3. 숫자 > 정수 > (음의 정수, 0, 양의 정수) > byte	(8bit) -128 ~ 0 ~ 127
  		 >								 char	한문자를 표현하는 자료형 (영문자, 특수문자, 공백) 1byte
  		 >										한글 1자 >> 2byte
  		 >										협의) char(2byte) : 한글, 영문자, 특수문자, 공백
  		 >											 크기에 상관없이 2byte >> unicode >> 아스키코드
  		 >										ex) char c = 'A'; char c2 = '가';
  		 >								 short	(C언어 호환성)
  		 >								 int	(-21 ~ 21억 정수 : 4byte) ** 정수의 기본 타입 **
  		 >								 long	(8byte)
  		 > 실수(부동소수점)	>	>	>	>  > float	(4byte) 
  		 								 double	(8byte) >> 정밀도가 높다(표현 범위가 크다) ** 실수의 기본 타입**
     논리 > 참, 거짓 > true, false >	>  > boolean
     
     현재는 대충 ... 정수는 int ... 실수는 double ... 쓰면 별 문제 없다 
  
  	 가장 많이 쓰는 데이터 : 문자열 >> 홍길동, 김유신, 안녕하세요, HelloWolrd
  	 **문자열의 표현** >> String >> "홍길동" , "안녕하세요"
  	 ex) String name = "홍길동"; >> String은 클래스이다 (참조 타입)
  	     String str = new String("홍길동");
  	 **별도의 언급 전까지는 String을 값타입처럼 사용 (int, double처럼)**
  	 
  	 기본타입 8개 + String >> 9가지를 가지고 데이터를 표현
  	 
  	 자바 타입
  	 1. 값타입(value type) 	: 8가지 기본타입
  	 2. 참조타입(ref type) 	: 클래스, 배열 >> 변수의 값이 저장되는 것이 아닌 주소값이 저장됨
  	 
  	 System.out.println() 단축키 >> syso + Ctrl + SpaceBar
  */


//class == 설계도 == Data Type
class Car2{ //Car2는 데이터 타입 , Car2는 설계도 >> 구체화 >> 메모리에 올리는 작업이 필요 >> new 연산자
	String color;
	int window;
}


public class Ex04_DataType {

	public static void main(String[] args) {
		String str = "홍길동"; 	//문자열 데이터를 담을 수 있는 타입
		int age = 100; 		 	//정수 타입
		
		Car2 c;					//c는 main함수 안에 있는 지역변수
		//System.out.println(c);//지역변수라 초기화하지 않으면 실행이 불가능하다. 
		//c라는 변수의 초기화 >> 주소값을 가지게 하는 것 >> new 연산자를 통해서 메모리에 할당
		c = new Car2();
		System.out.println("c의 주소값 : "+c);
		
		//=========================================================================
		
		//선언과 초기화
		Car2 c2 = new Car2();
		c2.window = 4;
		c2.color = "gold";
		
		//=========================================================================
		
		int i = 10; //선언과 초기화
		int j;		//선언
		j = 20;		//초기화
		
		int k;
		k = j;		//Point (값 할당 / j라는 변수가 가지는 값을 k에게 할당)
		System.out.println("k의 값 : "+k);
		System.out.println("j의 값 : "+ j);
		
		k = 300;
		System.out.println("k의 값 : "+ k);
		System.out.println("j의 값은 변화가 없다. j : "+ j);
		
		//=========================================================================
		
		//선언하는 다른 방법
		//int p, q, g;	//이런 경우는 보통 배열을 사용한다. int[] arr = new int[3]

		//int (-21억 ~ 21억)
		int p = 100000000;
		//int p2 = 100000000000;
		//p2가 정수(int)니까 안되겠지? ... 할당(int에 100000000000를 넣는) 부분이 문제가 아니라 10000000000라는 숫자 자체가 문제다
		//The literal 100000000000 of type int is out of range 
		//개발자가 직접 입력하는 (있는 그대로의) 값은 기본적으로 int라는 그릇에 담아서 처리한다.
		//4byte(int) 그릇에 큰 값을 입력해서 담을 수가 없다. (변수의 타입과 별개로)
		//해결방법 
		long p3 = 100000000000l;//리터값을 long형 그릇에 담아서 처리
		long p4 = 100;			//100이라는 리터값은 int 그릇에 담겨있다
		//작은 타입 값을 큰 타입 값에 넣는 것은 문제가 안된다
		
		//int p2 = 100000000000l;	//Type mismatch: cannot convert from long to int
									//변수(int)와 입력값(long)의 타입이 달라 오류 발생 

		int p2 = (int)100000000000l; // (int) 캐스팅 >> 타입변환으로 해결
		System.out.println(p2); //정상적인 해결 방법이 아니다 ... 버려지는 값이 나온다 (쓰레기 값) 1215752192
		
		
		int p5 = (int)1000l; 	//캐스팅을 통해서 타입 일치
		System.out.println(p5);	//다행히 크기도 맞아서 쓰레기 값 없이 출력 됨
		
		//=========================================================================
		
		//char 2byte 정수값
		//한 문자를 표현하기 위해 만든 자료형
		//영문자, 특수문자, 공백, 한글 ... 등의 문자 하나 ... 한글은 2byte .. 표준화
		//문자열	(문자의 집합)	: "홍길동" , "이름"	>> String name = "홍길동";
		//문자	(한문자)		: 'A' , '홍'			>> char ch = '홍';
		
		char single = '가';
		System.out.println(single);
		//char s = 'AB'; >> Invalid character constant 오류 >> 예외사항 (컴파일도 안됨)
		
		//char 타입 > 정수 타입 ... 정수 호환 가능
		//char 타입 > 문자를 저장하긴 하지만 내부적으로는 정수값을 가지고 있다.
		//			 이 정수값은 아스키코드표를 기반으로 하고 있다.
		
		// = = = = = 실습 = = = = = = 65 a 97 A
		int intch = 'A'; // int intch = (int)'A'; 로 하는게 맞지만 내부적으로 자동 형변환 처리를 해준다 ... 암시적
		System.out.println("intch : " + intch + " // (char)intch : " + (char)intch);
		
		char ch2 = 'a';
		System.out.println(ch2);
		int intch2 = (int)ch2; // 내부적으로 처리는 되지만 casting을 직접 처리해도 좋다
		System.out.println(intch2);
		
		int intch3 = 65;
		char ch3 = (char) intch3;
		System.out.println(ch3);
		
		//속지말자 >> 할당에 있어서 값을 보지 말고 그 값을 담고 있는 Type을 보자
		//명시적 형변환, 암시적 형변환
		//강제, 명시적 형변환은 개발자의 몫이다.
		//key point : 형변환시 손실 데이터에 대한 고민을 하자
		//위에서 했던 것처럼....
		//큰 것을 작은 것으로 강제 형변환 할때는 데이터 손실 생각
		
		
		/*
		  Today point
		   1. 할당에서 변수가 가지고 있는 값을 보지 말고 변수의 타입을 보자
		   2. 변수의 타입 크기를 확인하자
		** 3. 큰 타입에는 작은 타입의 값을 넣을 수 있다.
		** 4. 작은 타입에 큰 타입을 넣고 싶다면 강제형변환(casting)을 해야한다. >> 책임은 개발자가...
		** 4.1 char = int 넣을 때 >> 강제로 char = (char)int 데이터 손실 발생할 수 있음
		   4.2 int = char >> 내부적으로 컴파일러가 친절하게 형변환 해줌
		 */
		
		// = = = = = String = = = = =
		
		//String >> 문자열을 담을 수 있는 타입
		//쓰는 방법 >> int, double 처럼 사용 (특별한 말이 없으면)
		String name = "hello world";
		System.out.println(name);
		
		String name2 = name + " 반갑습니다."; // +는 산술연산 및 결합연산에 사용됨
		System.out.println(name2);
		
		// Tip) Oracle 데이터베이스(언어) >> +는 산술 연산만 >> 결합은 || >> ex) '안녕'||'하세요'
		//		JAVA에서의 특수문자 처리 (이스케이프 시퀀스 문자 : 특정 문자 앞에 \를 붙여 사용 ' " \ 등)
		char sing = '\''; // \를 통해서 '가 데이터 임을 표현
		System.out.println(sing);
		
		//Quiz : 홍"길"동   이라는 문자열을 표현하고 싶다.
		String name3 = "홍\"길\"동";
		System.out.println(name3);
		
		String str3 = "1000";
		String str4 = "10";
		String result = str3 + str4;	//문자열이라 100010으로 출력 
		System.out.println(result);
		
		//Quiz C:\Temp 문자열을 String 변수에 담아서 화면에 출력하세요
		String str5 = "C:\\Temp"; //     \t Tap키	/n 줄바꿈
		System.out.println(str5);
		
		// = = = = = 실수형(부동소수점) = = = = =
		
		// float 4byte  ||  double 8byte   || 실수의 기본 타입은 double
		
		//문제 float f = 3.14;	// 실수의 기본 타입은 double형이라 타입미스매치 발생
		// - 해결 방법 -
		//float f = (float)3.14;// 데이터의 손실을 가져올 수 있다
		//float f = 3.14f;		// (float)3.14와 같다.
		double f = 3.14;		// f의 타입을 float -> double로 변경
		
		float f2 = 1.123456789f;	//float 타입에 담고 싶으면 무조건 접미사 f 붙이기
									//대략적으로 7자리 소수 표현 가능
									//한계점에서 반올림을 한다
		System.out.println(f2);		//1.123456789 >> 1.1234568 출력됨
									//         ^에서 반올림
		
		double d = 1.123456789123456789;//대략적으로 16자리 소수 표현 가능
										//반올림을 한다.
		System.out.println(d);			//1.123456789123456789 >> 1.1234567891234568 출력됨
										//                  ^에서 반올림 

		System.out.println((byte)128);
		//byte 타입 : -128 ~ 127 출력 가능 >> 128은 byte로 표현 불가 >> overflow 순환
		
		byte q = (byte)129;
		System.out.println(q);
		
		//정수와 실수
		double d2 = 100; 		// double 타입에 int 타입 100을 넣었지만 내부적으로 컴파일러가 형변환을 해줌
		System.out.println(d2);	// 컴파일러가 형변환을 해줘서 100.0으로 출력됨
		
		//Quiz
		double d3 = 100;
		int i5 = 100;
		//int result2 = d3 + i5; 			//타입이 안맞아서 오류남
		//int result2 = (int) (d3 + i5); 	//(casting) 이 방법은 데이터의 손실이 생길 수 있음.
		double result2 = d3 + i5;			// 데이터의 손실은 가져오지 않는다
		
		//Today point
		//1. 큰 타입 + 작은 타입 >> 큰 타입
		//2. 타입간 변환 >> 변수가 가지는 값이 아닌 타입을 보고 판단하자
		//3. 명시적 형변환시 손실 데이터에 대한 고민을 하자
		
		int i6 = 100;		//문제 없음
		byte b2 = (byte)i6;	//casting으로 큰타입에 작은타입 넣기
		
		byte b3 = 20;		//문제 없음
		int i7 = b3;		//컴파일러가 내부적으로 자동 형변환 시키는 것 int i7 = (int)b3;
	}
}






