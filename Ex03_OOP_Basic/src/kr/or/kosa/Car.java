package kr.or.kosa;

// 원칙적으로 >> 실무처럼
// 1. 캡슐화	(member field)
// 2. 		( 간접적 처리 : getter setter )

public class Car {
	private int window;
	private int speed;
	
	// 필요에 따라서
	// setter만 생성		: 쓰기만
	// getter만 생성		: 읽기만
	// getter setter 생성: 읽기, 쓰기 둘 다
	
	// getter 함수
	public int getWindow() {
		return window;
	}
	// setter 함수
	public void setWindow(int data) {
		window = data;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 단축
   /** 1. 툴 사용 IDE >> 우클릭 >> source >> Generate getter and setter
	// 2. 롬복(Lombok) >> Java 라이브러리로 반복되는 getter, setter, toString .. 등의 
	//					 반복 메서드 작성 코드를 줄여주는 코드 다이어트 라이브러리 이다.*/
	// 	@Getter
	// 	@Setter 
	// 	컴파일러에게 자동으로 getter,setter 를 만들어달라 요청 ...
	
	// 	이런 데이터를 담을 수 있는 클래스를 ( VO, DTO , DOMAIN ) ValueObject, DataTransformObject, Domain 라고 부른다
	// 	>> MVC 패턴 >> 틀이 정해져 있다?
	
	/** 3. 필요하다면 별도의 함수를 생성*/
	// ex) speed를 10씩 올리거나 감소하는 기능을 만드세요
	// 일반적으로는 아래처럼 별도의 함수를 만들기 보다는 read, write만 한다면 setter와 getter를 통해 제어한다.
	public void speedUp() {
		speed+=10;
	}
	public void speedDown() {
		if(speed>0) {
			speed-=10;
		}else {
			speed = 0;
		}
	}
}



















