import java.util.Arrays;

public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		// 국문과 학생들의 기말고사 시험점수입니다.
		int[] score = {75,64,28,95,87};
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i<score.length; i++) {
			max = (score[i]>max) ? score[i] : max;
			min = (score[i]<min) ? score[i] : min;
		}
		System.out.printf("max : [%d] min = [%d]\n", max, min);
		
		
		
		int[] numbers = new int[10];
		//10개의 방의 값을 1부터 10까지 초기화 후 출력
		for(int i = 0; i<numbers.length; i++) {			numbers[i] = i+1; 		}
		for(int i = 0; i<numbers.length; i++) {			System.out.println(numbers[i]);		}
		
		//어느 학생의 기말고사 시험 점수 (5과목)
		int[] score1 = {100,55,90,60,78};
		int sum = 0;
		float avg = 0f;
		
		//1. 총 과목의 수
		System.out.println("과목의 수 : " + score1.length);
		//2. 과목의 합		//2, 3번 문제는 하나의 for문
		//3. 과목의 평균
		for(int i = 0; i < score1.length; i++) {
			sum += score1[i];
//			avg = (i>=score1.length-1) ? sum/(float)score1.length : avg;
			if(i>=score1.length-1) avg = sum / (float)score1.length;
		}
		System.out.printf("과목의 수 [%d] 합 [%d] 평균 [%f]",score1.length, sum,avg);
		
	}
	

}
