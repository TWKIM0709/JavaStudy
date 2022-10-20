import kr.or.kosa.Fclass;
import kr.or.kosa.TV;

public class Ex02_Method_Call {

	public static void main(String[] args) {
		//Fclass 생성 ... 메모리에 올리기 ... 객체생성
		Fclass fclass = new Fclass();
		
		fclass.m(); //호출했다 : Call 했다
		
		fclass.m2(23);
		
		int result = fclass.m3();
		System.out.println("m3 함수 호출시 돌려 받은 값 result : " + result);	
		
		int result2 = fclass.m4(555);
		System.out.println("m4 함수 호출시 돌려 받은 값 result2 : " + result2);
		
		result2 = fclass.sum(100, 200, 300);
		System.out.println("sum 함수 호출시 돌려 받은 값 result2 : " + result2);
		
		fclass.callSubSum();
		
		result2 = fclass.opSum(30);
		System.out.println("opSum(30) 함수 호출시 돌려 받은 값 result2 : " + result2);

		result2 = fclass.opSum(-30);
		System.out.println("opSum(-30) 함수 호출시 돌려 받은 값 result2 : " + result2);
		
		System.out.println(fclass.max(10, 5));
		
		System.out.println("asdfdsf");
		
	}

}
