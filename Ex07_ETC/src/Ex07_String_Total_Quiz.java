import java.util.Scanner;

public class Ex07_String_Total_Quiz {

	// substring()을 썻을 때
	// 14자리 체크 함수
	public static boolean checkSize(String jumin) {
		return (jumin.length() == 14) ? true : false;
	}
	
	// 뒷자리 첫번째 1~4 체크함수 123456
	public static boolean checkBack(String jumin) {
		int number = Integer.parseInt(jumin.substring(7, 8));
		return (number <= 4 && number > 0) ? true : false;
	}

	// 뒷자리 남자 여자 구분 ( 1 3 남자 // 2 4 여자 )
	public static void printGender(String jumin) {
		int number = Integer.parseInt(jumin.substring(7, 8));
		System.out.println((number%2==0) ? "여자" : "남자");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String jumin = "";
		while (true) {
			System.out.println("주민번호를 입력하세요 ex)123456-1234567");
			jumin = scan.nextLine();
			if (checkSize(jumin)) {
				System.out.println("자릿수 체크 성공");
			} else {
				System.out.println("자릿수 체크 실패");
				continue;
			}
			if (checkBack(jumin)) {
				System.out.println("뒷번호 첫번째 자리값 체크 성공");
			} else {
				System.out.println("뒷번호 첫번째 자리값 체크 실패");
				continue;
			}
			printGender(jumin);
//			
			System.out.println("자릿수 체크"+ (checkSize(jumin) ? " 성공" : " 실패"));
			System.out.println("뒷번호 첫번째 자리값 체크" + (checkBack(jumin) ? " 성공":" 실패"));
			printGender(jumin);
		}
	}
}