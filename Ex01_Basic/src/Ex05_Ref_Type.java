/*
> 클래스는 설계도이다, 클래스틑 데이터 타입이다
  클래스 == 설계도 == 타입
  
> 클래스는 구체화를 통해서 사용 ( 집을 짓는 행위 )
  프로그램에서는 [new 연산자]를 통해서 memory 에 집을 짓는다 >> 객체(인스턴스)
  
> 설계도의 종류 2가지
  1. 독자적으로 실행 가능	>> public static void main(String[] args) {} 을 가지고 있는 클래스
  2. 독자적으로 실행 불가능	>> main 함수가 없는 나머지 클래스 >> 남을 도와주는 클래스
  
> 같은 패키지(폴더) 안에 같은 이름의 Class는 존재할 수 없다


*/

class Apt2{	//main 함수가 없다
	int door = 10;
	int window = 20;
}

public class Ex05_Ref_Type {

	public static void main(String[] args) {
		//Apt2라는 설계도를 가지고 구체화 된 산물 생성
		
		int num;
		num = 100;	// 정수(타입)값을 넣어주면 됨...
		Apt2 apt2;	// 주소값을 줘야됨...
		apt2 = new Apt2();	// Apt2라고 하는 설계도를 기반으로 아파트를 지었다 (JVM이 OS에 빌린 memory(heap) 위에) 
		
		System.out.println("apt2 : "+apt2);	//Apt2@626b2d4a
		
		Apt2 ssapt = apt2;	//주소값을 할당... ssapt변수는 apt2가 가지고 있는 주소값으로 초기화 됨
		ssapt.door = 100;	// . 연산자는 주소를 찾아가는 연산자
		
		System.out.println("apt2가 바라보는 door : " + apt2.door);
	}

}
