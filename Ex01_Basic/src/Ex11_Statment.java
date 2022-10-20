import java.util.Scanner;

public class Ex11_Statment {

	public static void main(String[] args) {
		// 반복문 (while, do ~while)
		int i = 10;
		while(i>=10) {
			//반드시
			//증가감 명시
			//i--; 증가감 위치도 고민하자
			System.out.printf("i : %d", i--);
		}
		
		// while 1부터 100까지의 합
		i = 1;
		int sum = 0;
		while(i<=100) {
			sum+=i++;
		}
		System.out.println(sum);
		
		//while 구구단
		i = 2;
		int j = 0;
		
		while(i<=9) {
			j = 1;
			
			while(j<=9) {
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j++);
			}
			
			System.out.println();
			i++;
		}
		
		//==================================== ========================================
		// for(;;) {...} : 무한루프	while(true){ ... } : 무한루프		break로 빠져나옴
		// do ~ while: 일단 한번은 강제적으로 수행 ... 그리고 조건을 봐라
		// do { 실행문... } while(조건)
		// ex) 메뉴판
		
		Scanner scan = new Scanner(System.in);
		int inputdata = 0;
		do {
			System.out.print("숫자를 입력(0~9) >>");
			inputdata = Integer.parseInt(scan.nextLine());
		}while(inputdata<0 || inputdata>9);	//1~9사이의 수가 '아니면' do 반복
		
		System.out.println("입력한 숫자는 " + inputdata);
	}
}
