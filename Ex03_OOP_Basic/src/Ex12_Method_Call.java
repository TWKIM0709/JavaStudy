/*
   함수 사용시 parameter 값을 전달, 주소 전달
   
   - 값을 전달 - call by value
   void m(int x) { ... }	>> x 변수는 값을 받는다
   int y = 200;
   호출 m(y);
   
   - 주소값을 전달 - call by ref
   void m2(Car c) { ... }	>> c 변수는 Car(주소값)를 받는다
   Car c2 = new Car();
   m2(c2);	같은 타입의 주소값을 전달한다
   
*/

class Data{
	int i;
}


public class Ex12_Method_Call {

	static void scall(Data sdata) {	// default static
		System.out.println("함수 : " + sdata.i);
		sdata.i = 111;	// OxA번지의 i 값 변경
	}
	
	static void vcall(int x) {		// default static
		System.out.println("before x : " + x);
		x = 8888;
		System.out.println("after x : " + x);
	}
	
	
	public static void main(String[] args) {
		// 
		Data d = new Data();	//d의 주소값 OxA번지
		d.i = 100;
		System.out.println("d.1 : " + d.i);
		
		scall(d);	// 주소값(OxA) 전달
		
		System.out.println("after d.i : " + d.i ); // 111
		
		vcall(d.i);	//'값'만 전달
		
		System.out.println("d.i : " + d.i);
	}

}
