import java.util.Scanner;
import java.io.FileInputStream;

/*
 	말
 	 X 이동가능한 포 	>> 사용할 말
 	 Y 이동불가능한 포 	>> 방해
 	 L 빈칸			
 	 H 일반알 		>> 먹어야 되는거
 	
 	규칙
 	 1. Y는 못 넘음
 	 2. 빈칸은 건너뜀
 	 3. H를 먹어야됨.
 	 4. H를 먹으려면 H를 하나 건너 뛰어야됨
 	 
 	 바둑판의 크기는 8 ~ 100
  	
 	입력
 	 1. TestCase의 개수 입력 >> 반복 횟수
 	 
 	 2. 바둑판의 크기 입력
 	 3. 알 입력?
 	 4. 출력
 	 
 	 5. [1]만큼 2~4 반복 
 */
class Solution {
	static int AnswerN = 0;	// 답 넣는 변수
	static int N = 10;	// 바둑판 크기 입력 변수 
	static String[][] board = new String[100][100];	// 바둑판
	static int x = 0, y = 0;// 현재 X의 위치
	static boolean meetn = false;
	
	// 바둑판 값 초기화
	static void boardReset() {
		for(String[] value1 : board)
			for(String value2 : value1) value2 = "";
	}
	
	// X 위치 찾는 함수
	static void searchX() {
	loop : for(int i = 0; i<N; i++) {
			for(int j = 0; j<N;j++) {
				if(board[i][j].equals("X")) {
					x = i;
					y = j;
					break loop;
				}
			}
		}
	}
	
	// 답 찾는 함수
	static void searchAnswer() {
		// answerx, answery는 현재 처리중인 좌표 >> x 가로좌표 y 세로좌표
		// meetn은 알을 넘었는지 유무
		// while조건은 배열을 벗어나기 전까지 
		int answerx = x, answery = y;
		boolean b = true;
		// 왼쪽 검색
	boards1 :while(answerx >=0) {
			// 현재 칸의 알 비교
			switch(board[answerx--][y]) {
				case "L" : break; 			// 빈칸이면 넘어가기
				case "H" :	
					if(meetn) {AnswerN++;break boards1;}	// 알을 건넌 상태라면 만났다면 AnswerN 1 추가
					else meetn = true;	// 아직 안건넌 상태면 건넌 상태로
					break;
				case "Y" : break boards1;	// Y면 왼쪽 비교 종료
			}
		}
		//왼쪽 검색 끝
	
	
	
	
		answerx = x;
		answery = y;
		meetn=false;
		//오른쪽 검색
		boards2 :while(answerx < N) {
			// 현재 칸의 알 비교
			switch(board[answerx++][y]) {
				case "L" : break; 			// 빈칸이면 넘어가기
				case "H" :					// 일반 알을 만났을 때
					if(meetn) {AnswerN++;break boards2;}	// 알을 건넌 상태라면 만났다면 AnswerN 1 추가
					else meetn = true;	// 아직 안건넌 상태면 건넌 상태로
					break;
				case "Y" : break boards2;	// Y면 왼쪽 비교 종료
			}
		}
		//오른쪽 검색 끝
		
		
		
		
		answerx = x;
		answery = y;
		meetn = false;
		//아래쪽 검색
		boards3 :while(answery >=0) {
			// 현재 칸의 알 비교
			switch(board[x][answery--]) {
				case "L" : break; 			// 빈칸이면 넘어가기
				case "H" :					// 일반 알을 만났을 때
					if(meetn) {AnswerN++;break boards3;}	// 알을 건넌 상태라면 만났다면 AnswerN 1 추가
					else meetn = true;	// 아직 안건넌 상태면 건넌 상태로
					break;
				case "Y" : break boards3;	// Y면 왼쪽 비교 종료
			}
		}
		//아래쪽 검색 끝
		
		
		
		
		answerx = x;
		answery = y;
		meetn=false;
		//위쪽 검색
		boards4 :while(answery <N) {
			// 현재 칸의 알 비교
			switch(board[x][answery++]) {
				case "L" : break; 			// 빈칸이면 넘어가기
				case "H" :					// 일반 알을 만났을 때
					if(meetn) {AnswerN++;break boards4;}	// 알을 건넌 상태라면 만났다면 AnswerN 1 추가
					else meetn = true;	// 아직 안건넌 상태면 건넌 상태로
					break;
				case "Y" : break boards4;	// Y면 왼쪽 비교 종료
			}
		}
		meetn=false;
		answerx = x;
		answery = y;
	}
	
	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();	//테스트케이스 의 개수?

		for(int test_case = 1; test_case <= T; test_case++) {
			//바둑판 크기 입력
			N = sc.nextInt();	
			
			// 알 입력
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N;j++) board[i][j] = sc.next();
			}
			
			// X 좌표 찾기
			searchX();
			
			// 값 처리??
			searchAnswer();
			
			// == 출력 ==
			System.out.println("#"+test_case+" "+AnswerN);	// 출력
			
			//바둑판, 점수 리셋
			boardReset();
			AnswerN = 0;
		}
	}
}