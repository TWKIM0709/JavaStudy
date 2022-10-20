import kr.or.kosa.common.Car;

/* 
   클래스 == 설계도 == 데이터 타입
   
   클래스의 구성 요소 (설계도라고 판단하려면 최소한 무엇을 가지고 있어야 한다)
   
   [필드 + 함수] + 생성자 함수
    필드(member field) >> 데이터, 정보를 담아야 한다 >> 고유정보, 상태정보, 부품정보 >> Filed >> Variable
    함수(method) >> 기능(행위) >> 자동차 - 달린다, 멈춘다, 소리가 난다
    + 추가적으로 생성자 >> 특수한 목적의 함수 >> 객체가 만들어질 때 member field 초기화 목적으로 사용
    
    클래스 , 필드 , 생성자 , 함수 : 자기들만의 영역(범위)가 있음 >> 접근자 , 한정자 , 수정자
    >> public , private , default , protected
    
    >> kr.or.kosa.common 안에 Car 클래스 생성 >> public class Car{} >> 오픈마인드?
     
    >> kr.or.kosa.common 안에 AirPlane 클래스 생성 >> (접근자 없음) class AirPlane >> default class
    	>> default의 의미 : [같은 package 안에서는 오픈] [다른 package에서는 접근 불가]
    	>> default 접근자 : 같은 package 내에서 만들어서 연습용으로 사용 ... 실무에서는 안씀 ...
    	
    하나의 물리적인 java 파일은 여러개의 클래스를 가질 수 있다.
    >> Ex01_Main.java 파일은 Ex01_Main이라는 클래스를 하나 가지고 있다
    >> 클래스가 추가로 필요하다
    >> 일반적으로는 필요한 클래스를 별도의 파일로 생성해서 사용한다 ... Apt.java
    >>
    >> 그냥 연습용이면 ... 굳이 물리적으로 파일을 만들 필요가 있나? >> 연습할떄는 여러개 만들어서 해도 상관 없다
    >>
    >> 하나의 물리적 파일은 여러개의 클래스를 가질 수 있지만 ... public은 하나의 클래스만 가질 수 있다(대표) 
*/

class Emp{		// 공부하거나 실습할때 바로 확인 가능 ...
	
}
class Test{			 	 // 암묵적으로 컴파일러가 default class Test 로 해석
	int data;			 // instance variable >> 접근자 없음 >> 컴파일러가 default int data 로 해석
	public int p_data; 	 // class Test의 접근자가 default >> public의 의미가 없다
	private int pri_data;// private 감추다 , 숨기다 , 캡슐화(은닉화)
}

public class Ex01_Main {
	
	public static void main(String[] args) {
		Car car = new Car();
		
		//AirPlane air = new AirPlane();	클래스가 없다고 해석 ... package가 달라 보이지 않음
		
		Apt apt = new Apt();
		
		Test t = new Test();
		//t.pri_data 감춰져 있어 직접 사용불가
	}
}














