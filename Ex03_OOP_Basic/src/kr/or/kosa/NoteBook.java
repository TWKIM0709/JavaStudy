package kr.or.kosa;

public class NoteBook {
	
	public String color;
	// 객체 지향 언어 >> [캡슐화] , [은닉화] 가 주목적 >> [직접]적으로 값을 [변경]하거나 쓰는 것을 방지하는 목적
	// public int year; >> public 이라 직접 접근 가능 >> private로 막아버림
	// private 접근하는 법 >> 간접적으로 사용 >> 누군가를 통해서 >> getter setter
	// 간접적 >> 개발자가 [논리]를 통해서 [제어]하겠다 ..
	// 캡슐화 약속 >> 표준화 >> getYear ... , setYear ... >> getter setter
	private int year;

	// read 전용
	public int getYear() { // 간접적으로 year member filed 값을 return 하는 함수
		return year;
	}

	// write 전용
	public void setYear(int year) { // 간접할당의 장점 >> 내가 원하는대로 '강제'할 수 있다
		if (year < 0)
			this.year = 1999;
		else
			this.year = year;
	}
	
	// 노트북은 마우스를 가지고 있다
	// 마우스 >> 휠, 버튼, 모델명 >> 쪼갤 수 있다.
	//		>> 부품정보 ... (엔진, 타이어, 마우스 등)
	// 마우스 설계도 (class)
	
	// 노트북하고 마우스는 별개의 상품
	// public Mouse mouse = new Mouse();	//Mouse 라는 타입은 클래스 >> 참조변수 mouse >> 주소값을 가진다
	
	// 노트북은 '필요에 따라' 마우스를 가질 수 있다
	// 가진다 : 생성된 객체의 주소를 가진다
	public void handle(Mouse mouse) {
		mouse.x = 100;
		mouse.y = 200;
	}

}
