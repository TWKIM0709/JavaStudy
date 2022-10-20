
public class Ex07_Operation {

	public static void main(String[] args) {
		// ======================== 대입연산자 ======================== \\
		// += , -= , *= , /=
		
		int sum = 0;
		sum += 1;	//sum = sum + 1;
//		System.out.println(sum);
		sum -= 1;	//sum = sum - 1;
//		System.out.println(sum);
		
		// ======================== 조건문 ======================== \\
		/*
			간단한 학점 계산기
			학점 : A+ , A- , B+ , B- , ... F
			점수 : 94점
			
			판단기준 : 	90점 이상인지 	>> A
						95점 이상인지	>> A+
						아니라면 		>> A-
						
						80점 이상인지	>> B
						85점 이상인지	>> B+
						아니라면		>> B-
			if문을 사용해서 학점을 계산하세요		 
		*/
		
		int score = 78;		//점수
		String grade = ""; 	//학점
		System.out.print("당신의 점수는 " + score + "점입니다.");
		
		//==if문 동작==
		if(score >= 90) {						//점수(score)가 90점 이상이면
			grade = "A";						//학점(grade)에 A 추가
			grade += (score>=95) ? "+" : "-";	//95점 이상이면 +, 아니면 - 를 grade에 추가
		}else if(score >= 80) {					// -- 이하 반복 --
			grade = "B";
			grade += (score>=85) ? "+" : "-";
		}else if(score >= 70) {
			grade = "C";
			grade += (score>=75) ? "+" : "-";
		}else if(score >= 60) {
			grade = "D";
			grade += (score>=65) ? "+" : "-";
		}else if(score >= 50) {
			grade = "E";
			grade += (score>=55) ? "+" : "-";
		}else {
			grade = "F";						//50점 미만이면 학점 F 부여
		}
		//==if문 종료==
		System.out.println(" 학점은 " + grade + "입니다.");
		
		// ======================== Quiz ======================== \\
		
		//대문자는 65 ~ 90
//		for(int i = 65; i<= 90; i++) {
//			System.out.print((char)i + " ");
//		}
		for(char i = 'A'; i<='Z'; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		// 1 ~ 100 출력
		for(int i = 1; i<= 100; i++) {
			System.out.print(i + "\t");
			if(i%10 == 0) System.out.println();
		}
		
		//주사위의 눈 합이 6이되는 경우 출력
		for(int i = 1; i<=6; i++) {
			for(int j = 1; j<=6; j++) {
				if(i+j == 6) System.out.print(i + " + " + j + "\t");
			}
		}
		
		
	}

}










