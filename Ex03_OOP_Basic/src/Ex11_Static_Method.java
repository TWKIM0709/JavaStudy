
public class Ex11_Static_Method {

	public void method() {	// heap 메모리에 load 되고 나서 사용 가능 (new...)
		System.out.println("일반함수");
	}
	
	public static void smethod() {
		System.out.println("스태틱함수");
	}
	
	public static void main(String[] args) {
		
		//안에서 smethod() 사용
		//Ex11_Static_Method.smethod();	어차피 자신의 (Ex11_Static_Method) 의 자원
		smethod();	// 클래스 없이 바로 사용해도 가능
		
		Ex11_Static_Method ex11 = new Ex11_Static_Method();
		//ex11 참조변수 (주소를 가지고 있는 변수)는 stsatic 접근, 일반 접근 가능
		ex11.method();
	}

}
