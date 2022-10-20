/*
 * static member field >> 객체간 공유자원 ...
 * static method >> 왜?
 * 1. 객체 생성 없이 호출 가능
 * 2. 많이 사용한다
 * 3. 설계도를 만들 때 고려해야된다 ( 그 자원(기능)을 많이 사용한다면 )
 * 4. 많이 쓰는 자원 ... new 없이 바로 ... 편하게 사용하려고 ...
 */

class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {
		//일반함수
		//new 로 heap에 올려서 사용
		//1. iv 제어가능
		//2. cv 제어가능	// static 자원은 객체 생성 이전에 memory load
	}
	
	static void print() {
		//static 함수
		//1. cv 제어가능
		//2. iv 제어불가능
		//iv = 100; // 생성 시점의 문제 >> static 자원은 일반 자원보다 우선한다
		
		//static 자원만 가지고 놀면 된다.
		cv = 100001;
	}
	
}

public class Ex10_Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass.print(); // new 없이 사용
		System.out.println(StaticClass.cv);
		
		//일반자원(객체 생성)
		StaticClass sc = new StaticClass();
		sc.m();
		sc.print();
	}

}
