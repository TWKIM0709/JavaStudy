import java.util.Scanner;

public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
		// 입력할때 쓸 scan 만듬
		Scanner scan = new Scanner(System.in);
		
		// 값을 입력받을 변수들 생성
		int number1 = 0;	//숫자 1 입력받을 number1 만듬
		int number2 = 0;
		String ch = "";
		int value = 0;
		
		// 값 입력
		System.out.print("숫자를 입력 >> ");
		number1 = Integer.parseInt(scan.nextLine());	//sc.nextLine 입력받은 문자를 Integer.parseInt로 숫자로 바꿈 >> number1에 넣음
		System.out.print("기호를 입력 >> ");
		ch = scan.nextLine();
		System.out.print("숫자를 입력 >> ");
		number2 = Integer.parseInt(scan.nextLine());
		
		// switch로 사칙연산
		switch(ch){		// ch를 switch로 비교 
			case "+" : value = number1 + number2; break; //ch가 "+"면 number1 + nuber2 한거를 value에 넣음
			case "-" : value = number1 - number2; break;
			case "*" : value = number1 * number2; break;
			case "/" : value = number1 / number2; break;
			default : System.out.println("기호가 올바르지 않습니다");
		}

		//출력
//		System.out.println(number1 + " " + ch + " " + number2 + " = " + value);
		System.out.printf("%d %s %d = %d",number1,ch,number2,value);
		
	}

}
