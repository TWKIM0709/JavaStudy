import kr.or.kosa.Singleton;

public class Ex14_Singleton_main {

	public static void main(String[] args) {
//		Singleton singleton = new Singleton();	생성자는 private라 new로 생성 불가
		Singleton singleton = Singleton.getInstance();	// Singleton 객체를 생성하고 주소값을 받을 수 있는 유일한 방법 getInstance()
		Singleton singleton2 = Singleton.getInstance();	// 객체가 없을 경우 생성, 있을경우 해당 객체를 return하기 때문에 3개의 주소는 같음
		Singleton singleton3 = Singleton.getInstance();	// 하나의 주소값을 쓰도록 강제하는 디자인패턴 Singleton
		
		System.out.println(singleton);
	}

}
