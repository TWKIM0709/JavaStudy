package kr.or.kosa.common;

public class Car {
	int i;				//컴파일러가 자동으로 default 취급 ( 같은 package )
	// default package 에 Ex01_Main에서 i는 사용 불가 ( default 는 같은 폴더 한정 ) 
	public int window;	// 같은 package 다른 package 상관 없이 다 사용 가능
	private int door;	// 캡슐화 ... 접근 불가 ... 간접적으로 접근해야 됨
						// getter , setter >> 특수한 목적의 함수
	
	public int getDoor() { 			// 숨겨진 자원 write
		return door;
	}
	public void setDoor(int door) {	// 숨겨진 자원 read
		this.door = door;
	}
}
