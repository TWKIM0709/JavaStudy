import java.util.Scanner;

public class Ex12_Statment_Quiz {

	public static void main(String[] args) {
		// 메뉴를 보여주고 사용자에게 선택 ...
		// 다른 것을 선택하면 다시 선택하도록 강제
		// 1. while(true)
		// 2. do~ while()
		
		boolean auto = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		while(auto) {
			//출력
			System.out.println("*********************************");
			System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("*********************************");
			System.out.print("선택하세요 >> ");
			
			//입력
			int input = Integer.parseInt(scan.nextLine());
			
			//판단
			switch(input) {
				case 1 : System.out.println("예금처리.. 금액을 입력");
						 balance += Integer.parseInt(scan.nextLine());
						 break;
				case 2 : System.out.println("출금처리.. 금액을 입력");
						 balance -= Integer.parseInt(scan.nextLine());
						 break;
				case 3 : System.out.println("잔고는 " + balance);
						 break;
				case 4 : System.out.println("종료합니다.");
						 auto = false;
						 break;
				default : System.out.println("올바른 메뉴를 선택하세요.");
			}
			
		}
		
		
	}

}








