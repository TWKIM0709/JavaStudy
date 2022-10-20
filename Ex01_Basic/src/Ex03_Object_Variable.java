
// 아파트를 만들 수 있는 설계도

class Apt{	// 설계도 == 데이터 타입(작은 타입을 모아 놓은 큰타입)
	int window;
}

// [데이터타입] [변수명] ex) int number; // number라는 변수는 타입에 맞는 값을 가진다.
//						Apt apt;


public class Ex03_Object_Variable {

	public static void main(String[] args) {
		
		int number = 100; 	//number 라는 변수는 타입에 맞는 정수(int)값을 가진다.
		
		Apt apt;			//Apt라는 타입은 무슨 값을? 공간의 크기는?
							//Apt는 타입, apt는 변수
							//apt변수는 Apt타입의 값을 가져야한다 == 주소값
							//실제로 아파트를 메모리에 올려야 아파트가 생성이 되고 그 주소가 만들어진다.
							//유일한 방법 : new (연산자)
		
		apt = new Apt();	//heap이라는 메모리에 아파트가 한채 만들어지고, 주소가 생성되고 .. 생성된 주소값을 apt라는 변수가 가진다
		System.out.println("apt라는 변수가 가지는 값 : " + apt);
		//apt라는 변수가 가지는 값 : Apt@626b2d4a >> 조작된 값
		//Apt + @ + 626b2d4a >> [설계도의 이름] + [@] + [16진수 주소값]
		
		Apt apt2 = new Apt();
		//apt.window >> .은 연산자 ( 주소 )
		
		System.out.println(apt == apt2); 	// 두 변수의 주소값이 같은지 확인 >> 달라서 false 나옴
		
		Apt apt3 = apt2; 					// apt2가 가지고 있는 주소값을 apt3에 할당 ( 같은 집에 살기로 했음 )
		System.out.println(apt3 == apt2);	// 같은 주소값을 가지고 있음 >> true
		apt2.window = 20;					// apt2의 창문을 20으로 설정
		System.out.println("apt3의 창문 개수 : " + apt3.window); //apt3과 apt2는 같은 주소값(집)을 가지고 있어 20이 나옴
		
		
		/* 값타입과 주소타입 증명하기
		   
		   = 실행 순서 =
		   Ex03_Object_Variable (소스파일)
		   javac Ex03_Object_Variable.java >> Ex03_Object_Variable.class (실행파일 생성됨)
		   java Ex03_Object_Variable (엔터)
		  
		   JVM 동작 >> OS >> JAVA 메모리 구성 (구획정리) >> 자원할당 (메모리) >> 프로그램 종료 >> 사용했던 메모리 OS에 반환 ... 끝
		   
		   이클립스 통합 개발툴 Ctrl + F11 >> 위의 동작 순서대로 실행됨
		   
		   기억하자
		    1. main 함수 안에 지역변수는 반드시 초기화 하고 사용
		    2. 약속 >> main 함수 >> 시작점을 가지는 함수 >> 프로그램 동작시 제일 먼저 실행됨
		 */
	}

}







