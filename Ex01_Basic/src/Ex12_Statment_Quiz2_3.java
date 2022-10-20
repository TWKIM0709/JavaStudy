import java.util.Scanner;

public class Ex12_Statment_Quiz2_3 {

	public static void main(String[] args) {

		// 변수 생성
		// UNIT : 화폐단위
		// NUM : 화폐매수
		// SW : 스위칭 변수 , 다음 단위 변경에 사용
		// MONEY: 돈 입력 받는 변수
		// 단위 : 10000 >> 5000 >> 1000 >> 500 >> 100 >> 50 >> 10 >> 5 >> 1
		// /2 /5 /2 /5 /2 /5 /2 /5
		int unit = 10000, num = 0, sw = 0, money = 0;
		Scanner scan = new Scanner(System.in);

		// Money 입력 받기
		System.out.print("돈을 입력 >> ");
		money = Integer.parseInt(scan.nextLine());

		while (unit >= 1) {
			// Num 구하기
			num = (int) (money / unit);
			// Unit, Num 출력하기
			System.out.printf("%d : %d 장\n", unit, num);
			// Money의 양을 Unit(단위)으로 센만큼(Num) 줄이기
			money -= unit * num;
			// SW 값을 확인해 Unit(단위)의 값을 1/5 또는 1/2로 줄이고 sw 값 변경하기
			if (sw == 0) {
				unit /= 2;
				sw = 1;
			} else {
				unit /= 5;
				sw = 0;
			}
		}
	}

}
