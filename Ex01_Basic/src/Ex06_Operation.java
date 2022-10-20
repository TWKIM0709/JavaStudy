import java.util.Scanner;

/*
 
 
 
 */
public class Ex06_Operation {

	public static void main(String[] args) {
		int result = 100/100;
		System.out.println(result);

		result = 13/2;	//몫만 주는 /
		System.out.println(result);
		
		result = 13%2;	// 나머지 구하는 %
		System.out.println(result);
		
		
		// ======================== 증가감 ========================  \\
		
		// 증가 , 감소 ( 증가감 연산자 : ++ 1씩 증가, -- 1씩 감소)
		// 혼자 있으면 전치, 후치의 의미가 없다.
		int i = 10;
		++i;		//전치증가
		System.out.println("전치증가 i : "+i);
		
		i++;		//후치증가
		System.out.println("후치증가 i : "+i);
		
		//Today point ( 증가감 연산자가 다른 연산자와 결합되면 [전치, 후치]의 의미가 생김
		int i2 = 5;
		int j2 = 4;
		//i2 : 5	j2 : 4
		
		int result2 = i2 + ++j2;	// 전치증가의 경우 늘리고 더함
		System.out.println("result2 : " + result2 + " || j2 : " + j2);
		// i2 : 5	j2 = 5	reuslt2 : 10
		
		result2 = i2 + j2++;	// 후치증가의 더하고 늘림 ( 더하기 연산에는 적용 안됨 )
		System.out.println("result2 : " + result2 + " || j2 : " + j2);
		//i2 : 5	j2 = 6	result2 : 10
		
		// =====================================================
		
		// ======================== 연?산 ======================== \\
		
		byte b = 100;
		byte c = 1;
		
		// byte d = b + c;
		// Type mismatch: cannot convert from int to byte
		// Java는 연산시 4byte 공간을 사용해서 연산하기 때문에 타입미스매치 오류가 뜬다
		
		// 방법 1 ( casting )
		// byte d = (byte) (b + c);
		
		// 방법 2 ( 결과의 타입을 조정 (손실 발생 X) )
		int d = b + c;
		System.out.println("d : " + d);
		
		//Today Point
		/*
		   1. 정수의 모든 연산은 [int] 타입 변환 후에 처리
		      ex) byte + short => 컴파일러가 내부적으로 [int + int] 로 처리
		          char + char  => 컴파일러가 내부적으로 [int + int] 로 처리
		          
		          연산처리시 정수의 연산에서 [int] 보다 작은 타입은 [int]로 변환 연산 ([int] 보다 큰 [long]은 제외
		          byte , char , short >> 연산시에는 [int]방에 넣어서 계산 >> [int]
		          
		          char + int >> int + int
		          int + long >> long + long 예외적으로 ... 큰 타입을 따라감
		          
		          정수 + 실수 >> 타입의 크기와 상관없이 >> 실수 승리 
		*/
		
		long ln = 10000000000L;
		float fl = 1.2f;
		//long lnresult = ln + fl  정수 + 실수 >> 타입의 크기와 상관없이 >> 실수 승리
		
		//방법 1
		long lnresult = (long) (ln + fl); //손실 발생
		System.out.println(lnresult);
		
		//방법 2
		//float lnresult = ln + fl;
		//System.out.println("lnresult : "+lnresult);
		
		
		float num2 = 10.34f;
		int num3 = 20;
		float result3 = num2 + num3;
		
		System.out.println(result3);
		
		char c2 = '!';
		char c3 = '!';
		
//		방법 1
//		char c4 = (char)(c2+c3);
//		System.out.println(c4);
		
//		방법 2
		int c4 = c2 + c3;
		System.out.println("c2 + c3 = (char)c4 : " + (char)c4);
		
		
		// =====================================================
		
		// ======================== 제어문 ======================== \\
		// 중소기업 시험문제 ( 구구단 출력 ) >> 삼각형 별찍기 >> 연습
		int sum = 0;	//local variable
		for(int j = 1; j<=100; j++) {
			//sum += j;	//sum = sum + j;
			
			if(j%2 == 0) {	//j가 짝수이면
				sum += j;
			}
		}
		System.out.println("1 ~ 100 사이 수의 합(sum) : " + sum);
		
		// == 연산자 ( 값을 비교하는 연산자 )
		// [타입]을 비교하는 것이 아닌 [값]을 비교
		if(10 == 10.0f) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		// ! 부정 연산자
		if('A' != 65) {
			System.out.println("같지 않다 : true");
		}else {
			System.out.println("같다 : false");
		}
		
		
		//암기하자 (Today Point)
		//연산자 중 제어문역할을 하는 ... 연산자
		//삼항연산자
		int p  = 10;
		int k = -10;
		int result8 = (p==k) ? p : k;	// p와 k가 같으면(true) p(왼쪽) 다르면(false) k(false)를 넣는다 
		
		// 위 삼항연산자를 if문으로 바꾸면
		int result9 = 0;
		if(p==k) result9 = p;
		else result9=k;
		
		//진리표
		//논리연산
		//0 : false
		//1 : true
		
		/* 			OR 연산  	 ,	AND연산
		   0 0		false 		false
		   0 1		true		false
		   1 0		true	 	false
		   1 1		true  		true
		   
		   DB (Oracle) SQL언어 자연어 (인간 친화적 .. )
		   
		   select * from emp where job='IT' and sal > 2000;		// 둘 다 참인 경우
		   
		   select * from emp where job='IT' or sal > 2000;		// 둘 중에 하나만 참이어도 만족
		   
		   연산자
		   | 비트연산(or)
		   & 비트연산(and)
		   
		   || 논리연산(or)
		   && 논리연산(and)
		   
		*/
		
		// ======================== 비트연산 ======================== \\
		//				  8421
		int x = 3;		//0011	>> 8*0 + 4*0 + 2*1 + 1*1 >> 0 + 0 + 2 + 1	= 3
		int y = 5;		//0101	>> 8*0 + 4*1 + 2*0 + 1*1 >> 0 + 4 + 0 + 1	= 5 
					//OR  0111 	>> 8*0 + 4*1 + 2*1 + 1*1 >> 0 + 4 + 2 + 1 	= 7
					//AND 0001 	>> 8*0 + 4*0 + 2*0 + 1*1 >> 0 + 0 + 0 + 1	= 1
		/* *비트연산 하는 법
		 
		  	십진수 -> 2진수(0, 1)
		  	8bit
		  	256 128 64 32 16 8 4 2 1
		  	
		  		10진수 3	>>	 0 0 1 1
		  		10진수 5 >>	 0 1 0 1
		  		
		  		OR  비트	>>	 0 1 1 1
		  		AND 비트 >>	 0 0 0 1
		*/
		System.out.println("x|y : " + (x|y));	// OR  비트연산
		System.out.println("x&y : " + (x&y));	// AND 비트연산
		
		//Today Point ( && : AND ... || : OR )
		//if(10 > 1 && -1 > 1 && 100 > 1) { A } else { B }
		//   [true]   [false] ... AND 연산자 : 거짓이 나오는 순간 처리된다. 	** AND를 많이 씀 **
		
		//if(10 > 1 || -1 > 1 || 100 > 1) { A } else { B }
		//   [true] ... OR 연산자 : 참이 나오는 순간 처리된다.
		
		// ======================== switch ======================== \\
		
		int data = 80;
		
		switch(data) {
			case 100 : System.out.println(data + "입니다");
				break;
			case 90 : System.out.println(data + "입니다");
				break;
			case 80 : System.out.println(data + "입니다");
				break;
			case 70 : System.out.println(data + "입니다");
				break;
			default : System.out.println("일치하는 값 없음");
		}
		
		// break 활용
		//int month = new Scanner(System.in).nextInt();
		int month = 5;
		String res = "";
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: res = "31"; break;
			case 4:
			case 6:
			case 9:
			case 11: res = "30"; break;
			case 2: res = "29"; break;
			default : res ="월이 아닙니다.";
		}
		System.out.println(month + "월은 " + res + "일까지 입니다.");
		/*
		>난수 (랜덤값 : 임의의 추출값)
		 java >> 사용하고자 하는 다양한 자원을 미리 생성해 뒀음 >> 찾아서 사용하면 됨 >> JAVA API
		 도움말 ( 찾아서 써라 ) >> API 문서
		 https://docs.oracle.com/javase/8/docs/api/index.html
		 원하는 자원을 찾아서 사용 방법을 파악하고 처리하는게 FM 
		 java.lang.Math 클래스를 찾음	>> public static double random()  >> double 타입 리턴
									>> equal to 0.0 and less than 1.0 >> 범위의 난수를 얻을 수 있다.
									>> double 타입의 0.0 ~ 1.0 사이 값을 리턴 받을 수 있다.
		
		>API 사용법
		 쓰고자 하는 자원이 있는 폴더를 open ( import )
		  ex) import java.lang.*;	>> java 안에 lang 안에 있는 모든 자원을 사용할 수 있다
		 
		 Tip) java.lang 과 같이 자주 쓰이는 것은 import 하지 않아도 연결되어 있다.
		*/
		//Math.random 값 출력
		System.out.println("Math.random() : " + Math.random());
		//범위 출력
		System.out.println("원하는 범위 값을 출력(0 ~ 100) : "+ (int)((Math.random()) * 100) + "  (int)(Math.random() * 10)");
		//범위 출럭
		System.out.println("원하는 범위 값을 출력(10 ~ 20) : "+ ((int)((Math.random()* 10))+10) + "  ((int)(Math.random() * 10)+10");
		
		/*Quiz
		 우리는 백화점 경품 시스템을 만들려고 한다
		   경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
		   경품 추첨시 1000 점수가 나오면
		   경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
		   경품 추첨시 900 점수가 나오면
		   경품으로  NoteBook , 냉장고 , 한우세트 , 휴지
		   경품 추첨시 800 점수가 나오면
		   경품으로  냉장고 , 한우세트 , 휴지
		   경품 추첨시 700 점수가 나오면
		   경품으로  한우세트 , 휴지
		   경품 추첨시 600 점수가 나오면
		   경품으로  휴지
		   그외 점수는 100 ~ 500 까지는 칫솔 
		   경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
		   사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다. 
		*/
		int score = (int)(Math.random()*10 + 1) * 100;	//100 ~ 1000 사이 수 생성
		System.out.print(score +"점 >> ");				//점수 출력
		String res2 = "";
		switch(score) {								//점수 비교 후 경품 출력
			case 1000: res2 += "TV, ";
			case 900 : res2 += "노트북, ";
			case 800 : res2 += "냉장고, ";
			case 700 : res2 += "한우세트, ";
			case 600 : res2 += "휴지";
					   break;
			default  : res2 += "칫솔 ";
		}
		System.out.println(res2 + " 획득");
		
		
		//switch([조건식]) 정수만...X
		//[조건식]은 "문자열", '문자'도 가능
		String m = "F";
		String f = "";
		switch(m) {
			case "A":
			case "B":
			case "C":
			case "D":
			case "E":
			case "F":
			case "G": f = "OK"; 
				break;
			case "H":
			case "K": f = "NO";
				break;
			default : f = "no data";
		}
		System.out.println("결과 : " + f);
	}

}







