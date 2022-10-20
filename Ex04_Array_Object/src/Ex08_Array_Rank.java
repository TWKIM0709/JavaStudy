
public class Ex08_Array_Rank {

	public static void main(String[] args) {
		/*
		 * 다차원배열 (2차원) 
		 * [행][열] 
		 * 영화관 좌석, 엑셀표, 오목 등
		 */
		int[][] score = new int[3][2];
		score[0][0] = 100;
		score[0][1] = 200;

		score[1][0] = 300;
		score[1][1] = 400;

		score[2][0] = 500;
		score[2][1] = 600;

		// for문 (중첩 for문)
		// 행의 개수 : 배열이름.length >> score.length >> 3

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d점\t", i, j, score[i][j]);
			}
			System.out.println();
		}
		
		//쉽게 만드는 법
		int[][] score3 = new int[][] {{11,12},{13,14},{15,16}};
		int[][] score4 = {{11,12},{13,14},{15,16}};
		//커피퀴즈
		//개선된 for문
		for(int[] value : score3) {
			for(int value2 : value) {
				System.out.println(value2);
			}
		}
	}

}
