
public class Ex02_Exception {

	public static void main(String[] args) {

		System.out.println("main start");
		int num = 100;
		int result = 0;

		// 원인 분석 (코드 끝까지)
		try {
			for (int i = 0; i < 10; i++) {
				result = num / (int) (Math.random() * 10); // 0~9
				System.out.println("result : " + result + " i : " + i);
			}
		} catch (ArithmeticException e) {	//문제가 발생되면 발생 객체의 주소를 받아서 원인을 분석 ...
			System.out.println("문제가 발생하면 관리자에게 문제원인을 메일 발송");
			System.out.printf("원인 : %s", e.getMessage());
		}

		System.out.println("main end");
	}

}
