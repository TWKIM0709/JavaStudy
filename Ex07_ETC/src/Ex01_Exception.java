
/*
	오류
	1. 에러(Error)		>> 네트워크 장애, 메모리 부족, 하드웨어 랙 등 >> 개발자가 코드적으로 해결 불가
	2. 예외(Exception)	>> 개발자의 코드 실수에 의해 발생 >> 문제 코드를 찾아서 수정 >> 배포
						>> 컴파일 시가 아니라 ... 실행할 때 ... 알기 힘듬
						>> 문제가 발생하면(Exception) 프로그램 강제 종료
	3. 예외처리 			>> 예외발생에 대한 코드를 수정하는 것이 아니고 >> 임시 방편으로 문제가 생기더라도 프로그램이 안정적으로 종료 되는 것을 처리
						>> 결국에는 예외처리를 통해서 문제가 생긴 부분을 찾고 >> 다시 코드를 수정해야한다.
	   try {
	   	 >> 문제가 의심되는 코드 영역
	   	 >> 문제가 발생(exception)
	   }catch(Exception e){
	   	 >> 문제가 발생한 예외부분을 파악 ...
	   	 >> 처리 (코드를 수정하는 것이 아니고 보고하는 것)
	   	 >> 이 부분에서 행하는 것
	   	 >> 1. 관리자 email
	   	    2. 로그파일에 기록 (장애 발생 기록)
	   	    3. 강제로 프로그램이 종료되는 것 막기
	   	 >> 개발자가 연락을 받고 수정하게 되는 것이 답...
	   }finally{
	   	 >> 문제가 발생하던, 발생하지 않던 강제적으로 실행해야 될 코드
	   	 >> 특정 자원에 대한 종료를 강제
	   }
*/

public class Ex01_Exception {

	public static void main(String[] args) {
		/*
		System.out.println("Main Start");
		
		System.out.println(0/0); //java.lang.ArithmeticException: / by zero
		//프로그램이 강제 종료
		
		//main end 구문은 화면에 출력되지 않음
		System.out.println("Main End");
		*/

		System.out.println("Main Start");
		try {
			System.out.println(0/0);
			
			//e 변수는 >> Exception e >> Exception 객체의 주소값
			
			//ArithmeticException 문제가 발생
			//>> 컴파일러에 의해서 ArithmeticException 객체가 생성
			//>> 그 객체에게 문제가 되는 메세지, 코드 전달
		}catch(Exception e) {	// 부모타입의 변수는 자식타입의 주소를 받을 수 있다.
			System.out.println(e.getMessage());
		}
		System.out.println("Main End");
	}

}








