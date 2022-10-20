
public class Ex10_Statement {

	public static void main(String[] args) {
		// 제어문
		// 조건문 : if ( if , else if , else ) || switch(조건) { case [값] : ... }
		// 반복문 : for(반복횟수가 명확하다){ ... } , while(진위여부에 따라){ ... } , do{ .. }while()
		// 분기문 : break(블럭을 탈출) , continue(아래 구문을 스킵해라)

		// = = 단일 if 문 = =
		int count = 0;
		
		if(count < 1) System.out.println("true");
		
		if(count > 0) {
			System.out.println("false");
		}
		
		// = = switch = =
		char data = 'A';
		switch(data) {
			case 'A' : System.out.println("SAME");
				break;
			case 'B' :
				break;
			default : System.out.println("나머지 처리");
		}
		
		
		// = = for = =
		// 1 ~ 100 누적합
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum+=i;
		}
		
		System.out.printf("1 ~ 100의 누적합 : %d\n", sum);
		
		//1~5까지의 합
		//for문과 while문 안쓰고
		//개수 * (시작 + 끝) / 2
		sum = 5 * (1 + 5) / 2;	//할 필요 없다 ( 원리니까 ) ...
		
		//응용 for문을 사용해서 1부터 10까지 홀수의 합
		//for([초기값] ; [조건] ; [증가감(처리)]){ }
		int sum2 = 0;
		for(int i = 1; i<=10; i+=2) {
			sum2 += i;
		}
		System.out.println(sum);
		
		//for문안에 if문을 사용해서 1 ~ 1000까지의 짝수의 합
		int sum3 = 0;
		for(int i = 1; i<=1000; i++) {
			if(i%2 == 0) {
				sum3 += i;
			}
		}
		System.out.println(sum3);
		
		//입사시험 필수문제? 구구단
		//중첩 for ...
		//한개의 값을 고정 ... 반복 ( 1...1~9   2...1~9   3...1~9 ......)
		for(int i = 1; i<=9; i++){
			for(int j = 1; j<=9; j++) {
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
			}
			System.out.println();
		}
		
		// 이렇게는 단순해서 안냄
		// for문 + 분기문 섞어서 ( continue + break )
		// Today Point : continue >> 아래구문스킵		break >> for, while 블럭 탈출
		
		//break
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				if(i==j) { break; }
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		//continue
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				if(i==j) { continue; }
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
			}
			System.out.println();
		}
		
		
		//별찍기
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		//for문 -
		for(int i = 100; i>=0; i--) {
			System.out.println(i);
		}
		
		
		//전공자 피보나치
		int a = 0, b = 1, c = 0;
		for(int i = 0; i<10; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.printf("%d %d %d ",a,b,c);
			System.out.println(c);
		}
	}

}




