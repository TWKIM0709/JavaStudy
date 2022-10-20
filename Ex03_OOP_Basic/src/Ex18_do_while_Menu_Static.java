import java.util.Scanner;

public class Ex18_do_while_Menu_Static {

	static Scanner scan = new Scanner(System.in);
	
	//기능
	static void inputRecord() {
		System.out.println("성적 데이터 입력>>");
	}
	static void deleteRecord() {
		System.out.println("성적 데이터 삭제");
	}
	static void sortRecord() {
		System.out.println("성적 데이터 정렬");
	}
	
	static int displayMenu() {
		System.out.println("**********성적관리**********");
		System.out.println("1. 학생성적 입력");
		System.out.println("2. 학생성적 삭제");
		System.out.println("3. 학생성적 이름순 정렬");
		System.out.println("4. 프로그램 종료");
		System.out.println("**************************");
		
		int menu = 0;
		do {
			try {
				menu = Integer.parseInt(scan.nextLine());
				if(menu >= 1 && menu <=4) {
					break;
				}else {
					// 1보다 작거나 4보다 큰 값
					// 코드적으로는 오류(예외)가 아니지만 이런 상황을 예외로 만들겠다.
					throw new Exception("메뉴 선택 번호가 잘못 되었습니다.");	//사용자 정의 예외 >> catch로 빠짐
				}
			}catch (Exception e) {
				System.out.println("원인 : " + e.getMessage());
				System.out.println("메뉴 선택에 대한 문제가 발생");
				System.out.println("1 ~ 4 사이의 수를 입력하세요");
			}
		}while(true);
		
		//1 ~ 4까지 중 하나를 선택하면
		return menu;
	}
	
	
	public static void main(String[] args) {
		while(true) {
			switch (displayMenu()) {
			case 1: inputRecord();
				break;
			case 2: deleteRecord();
			break;
			case 3 : sortRecord();
				break;
			case 4: System.out.println("프로그램 종료");
				//return;	//main 함수 종료
				System.exit(0); //프로그램 강제 종료 Kill
			}
		}

	}

}
