import java.util.Arrays;

/*
	1. [1 ~ 45까지의 난수]를 발생시켜서 [6개의 정수값]을 [배열]에 담아라
	
	2. 배열에 담긴 6개의 배열값은 [중복값이 나오면 안된다]. (중복값 검증)
	
	3. 배열에 있는 6개의 값을 [낮은 순으로 정렬]
	
	4. 위 결과를 담고 있는 배열을 [출력]하세요
	
	main 함수 안에서 모두 작성해도 되고 static 함수는 만들어도 된다.
	 - class로는 X -
*/
public class Ex03_Array_Lotto_Main {
	static void startFor() {
		// 변수 선언
		int[] lotto = new int[6]; // 로또 번호를 담을 크기 6 배열 변수
		int lottonum = 0; 	// 랜덤값을 담을 변수
		int temp = 0;		// 정렬용 변수
		// 반복문 시작
		for (int i = 0; i < lotto.length; i++) {
			//[1~45사이 랜덤값]을 lottonum 에 넣음 
			lottonum = (int) (Math.random() * 45) + 1;
			
			// 중복값 비교하는 부분
			for (int j = 0; j < lotto.length; j++) {
				//lotto[j]에 lottonum이 들어있으면 (중복이 있으면)
				if (lottonum == lotto[j]) {	//그 배열은 다시 뽑기
					i--;
				}
			}
			// 비교 끝남. lotto[i]에 뽑은 숫자 lottonum 넣기
			lotto[i] = lottonum;
		}
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for(int i = 0; i<lotto.length;i++) System.out.printf("[%d] ",lotto[i]);
		System.out.println();
	}
	static void startWhile() {
		int []lotto = new int[6];
		int randomnum = 0;
		int lottonum = 0;
		int temp = 0;
		do {
			boolean lot = true;
			randomnum = (int)(Math.random()*45)+1;
			
			for(int i = 0; i<lotto.length; i++) {
				if(randomnum == lotto[i]) lot = false;
			}
			
			if(lot) lotto[lottonum++] = randomnum;
		}while(lottonum <lotto.length);
		
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for(int i = 0; i<lotto.length;i++) System.out.printf("[%d] ",lotto[i]);
		System.out.println();
	}
	public static void main(String[] args) {
		startWhile();
	}
}
