import java.util.Scanner;

public class Ex12_Statment_Quiz2_2 {

	public static void main(String[] args) {
		// 가위 바위 보 게임 만들기
		// 메뉴 형태로 무한 반복		ex) 1.가위 2.바위 3.보 4.종료
		
		// = = = 변수 만들기 = = =
		int input = 0; 			// 입력값(입력한 가위바위보)을 저장할 input
		int random = 0;			// 랜덤값(컴퓨터가 낸거)를 저장할 random
		String str = "";		// 결과 출력할 문자열을 잠깐 담아두는 str 
		Scanner scan = new Scanner(System.in); //입력에 사용할 도구 'Scanner'를 scan이라는 이름으로 만들기
		int aa = 0;				// 값 비교에 사용
		
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
			if(input == 4) break;
			
			// 규칙으로
			aa = input - random;
			if(aa == 0) str = "비김";
			else if (aa == -2 || aa == 1) str = "이김";
			else if (aa == -1 || aa == 2) str = "짐";
			
			// 삼항연산자로
//			if(input == random) str = "비김";
//			else if(input > random) str = (input-random == 1) ? "이김" : "짐";
//			else str = (random - input == 1) ? "짐" : "이김";
			
			
			System.out.printf("유저 : %d | 컴퓨터 : %d  >> %s\n\n",input,random,str);
		}
		
	}

}
