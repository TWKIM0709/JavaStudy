import java.util.Scanner;

/*
  오버라이딩 >> 하나의 함수에 파라미터를 다르게해서 다른 기능 사용 
 */
public class Ex08_print_format {

	public static void main(String[] args) {
		// 출력하는 다양한 방법
		System.out.println();	// 출력 후 줄바꿈 (엔터)
		System.out.print("A");	// 출력하고 
		System.out.print("B");	// 출력하고
		System.out.print("C");	// 출력하고
		System.out.println();	// 출력하고 줄바꿈
		System.out.print("D");	// 출력하고
		System.out.println();
		
		int num = 100;
		System.out.println("num 값은 " + num + "입니다");
		
		//형식 format 정의 출력
		System.out.printf("num 값은 %d입니다.\n", num);
		System.out.printf("num 값은 [%d]입니다 또 [%d]도 있습니다\n",num,12345);
		//format 형식문자
		/*
		   %d : 10진수 형식의 정수
		   %f : 실수
		   %s : 문자열
		   %c : 문자
		   \t : 탭
		   \n : 줄바꿈
		*/
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f변수값 %f 입니다\n", f);
		
		// ======================== 입력받기 ======================== \\
		// cmd에서 사용자가 입력한 값을...
		Scanner sc = new Scanner(System.in);
		
		//String value = sc.nextLine();			// 입력하고 Enter를 칠때까지 대기 (프로그램이 종료되지 않고 대기됨)
		//System.out.println(value);			// 입력한 값을 문자열로 전달
		
//		int number = sc.nextInt();				
//		System.out.println("number : " + number);
		
//		double number = sc.nextDouble();
//		System.out.printf("number : %d\n",number);

		// 권장사항 : nextInt , nextFloat 보다는 nextLine을 사용해서 read하고 타입을 바꾸자
		// Today Point
		// 문자 => 숫자 ... 바꾸는 능력 (정수, 실수)
		// Integer.parseInt("11111") >> 정수 >> 11111
		// Float.parseFloat("3.14") >> 실수 >> 3.14
		
//		System.out.print("숫자를 입력 >> ");
//		int number = Integer.parseInt(sc.nextLine());
//		System.out.printf("정수값 number : %d",number);
		
	}

}







