/*
 * static   변수는 객체마다 [같은 값]을 가지게 하는 것을 목적으로 설계
 * instance 변수는 객체마다 [다른 값]을 가지게 하는 것을 목적으로 설계
 * 
 * 
 * 두 변수에 대해서 초기화 하는 방법 ...
 */

class InitTest{
	static int cv = 10;
	static int cv2;
	int iv = 11;
	//3놈은 사실 default 값을 가지고 있어 초기화를 따로 해주지 않아도 상관 X (필요하면 해도 됨)	
	
	{
		// 초기자 블럭 ( 필요하면 member field를 여기서 초기화해라)
		// 객체가 생성되고나서 >> 변수가 메모리에 올라가고 >> 바로 호출 { 블럭 }
		// 인위적인 코드 ex) if(iv > 10) iv = 100;
//		iv = 2222;
		System.out.println("초기자 블럭");
		if(iv > 10) iv = 1000;
		
		// 초기화 >> 객체가 new 되지 않으면 ... >> 초기자 블럭 적용 못함 >> static 초기자 블럭이 따로 있음
		// cv = 30;
	}
	
	static {
		// static 자원에 대한 초기화 블럭
		// 언제 실행? : static int cv = 10; 과 static int cv2; 가 메모리에 올라간 직후
		cv = 1111;
		cv2 = cv + 2222;	//조작된 표현이 가능 
	}
	
}

public class Ex09_Static_init {

	public static void main(String[] args) {
//		InitTest t = new InitTest();
//		System.out.println(t.iv);
//		
//		System.out.println(t.cv);
		
		
		System.out.println(InitTest.cv + ", " + InitTest.cv2);
		
	}

}
