package kr.or.kosa;

/*
	class == 설계도 == 데이터 타입
	설계도는 종이 ... 구체화 시켜야 됨(메모리) ... 객체
	구체화 된 것 : 객체 , 인스턴스
	
	설계도 : Field(고유, 상태, 부품) + Method(기능) + Constructor(생성자함수)
	
	public class Ex01_Main {
		public static void main(String[] args) {
			여기 안에다 코드 연습
			main 이름을 가진 함수의 안쪽 지역
			String name = "초기화";	>>	local variable >> 접근자 X >> 함수가 호출되면 생성되었다가 함수가 종료되면 같이 소멸됨
			int age = 0;			
		}
}
*/

public class Person {
	public String name;		// 문자열의 	default >> null
	public int age;			// 정수의		default >> 0
	public boolean power;	// boolean	default >> false	( 프로그램은 네거티브하다 )
	
	// member field (범용적) >> instance variable >> 객체변수
	// 1. instance variable >> 초기화를 하지 않아도 된다 >> default 값
	// 	  필요하다면 초기화 가능 : public int age = 100;
	// Today Point 	: 왜 초기화를 하지 않아도 될까
	//	** 생성되는 객체(사람)마다 , [다른 이름을 가질 수 있다]
	// Person member field >> 사람을 만들때마다 다른 값을 가지게 할건데 굳이 초기화를 할 필요가 없다
	/*
	   main(){
	   	 Person 남자 = new Person(); 사람 1명
	   	 남자.name = "김유신";
	   	 남자.age = 100;
	   	 남자.power = true;
	   	 
	   	 Person 여자 = new Person(); 사람 2명
	   	 여자.name =  "유관순";
	   	 여자.age = 20;
	   	 여자.power = false;  
	   }
	*/
	
	//기능
	//정보를 출력하는 기능
	public void personPrint() {
		System.out.printf("이름은 %s , 나이는 %d , 파워는 %s",name,age,power);
	}
}










