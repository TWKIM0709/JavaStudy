import java.util.Scanner;

public class Ex12_Statment_Quiz2_1 {

	public static void main(String[] args) {
		// 가위 바위 보 게임 만들기
		// 메뉴 형태로 무한 반복		ex) 1.가위 2.바위 3.보 4.종료
		
		// = = = 변수 만들기 = = =
		int input = 0; 			// 입력값(입력한 가위바위보)을 저장할 input
		int random = 0;			// 랜덤값(컴퓨터가 낸거)를 저장할 random
		String str = "";		// 결과 출력할 문자열을 잠깐 담아두는 str 
		Scanner scan = new Scanner(System.in); //입력에 사용할 도구 'Scanner'를 scan이라는 이름으로 만들기
		
		// while 반복문. 종료 전까지 무한 반복
		while(true) {
			// 컴퓨터 가위바위보 정하기
			random = (int)(3*Math.random()+1); // 1 ~ 3 사이의 랜덤 수 정하기
			
			// 메뉴 출력
			System.out.println("************************************");
			System.out.println("[1] 가위 | [2] 바위 | [3] 보 | [4] 종료");
			System.out.println("************************************");
			
			// 가위 바위 보 입력 받기
			input = Integer.parseInt(scan.nextLine());
			
			// if문으로 비교해서 승리, 패배, 종료 정하기
			if(input == 1) {			//가위를 냈을 때
				if(random == 1) {
					str = "무승부!";
				}else if(random == 2) {
					str = "컴퓨터의 승리!";
				}else if(random == 3) {
					str = "유저의 승리!";
				}
			}else if(input == 2) {		//바위를 냈을 때
				if(random == 1) {
					str = "유저의 승리!";
				}else if(random == 2) {
					str = "무승부!";
				}else if(random == 3) {
					str = "컴퓨터의 승리!";
				}
			}else if(input == 3) {		//보를 냈을 때
				if(random == 1) {
					str = "컴퓨터의 승리!";
				}else if(random == 2) {
					str = "유저의 승리!";
				}else if(random == 3) {
					str = "무승부!";
				}
			}else if(input == 4) {		//종료를 눌렀을 때
				System.out.println("가위바위보를 종료합니다");
				break;
			}else {						// 이상한 값(54891, 21)을 눌렀을 때
				System.out.println("올바른 값을 입력하세요");
			}
			System.out.printf("유저 : %d | 컴퓨터 : %d  >> %s\n\n",input,random,str);
		}
		
	}

}
