import java.util.Arrays;

public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		// ������ �л����� �⸻��� ���������Դϴ�.
		int[] score = {75,64,28,95,87};
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i<score.length; i++) {
			max = (score[i]>max) ? score[i] : max;
			min = (score[i]<min) ? score[i] : min;
		}
		System.out.printf("max : [%d] min = [%d]\n", max, min);
		
		
		
		int[] numbers = new int[10];
		//10���� ���� ���� 1���� 10���� �ʱ�ȭ �� ���
		for(int i = 0; i<numbers.length; i++) {			numbers[i] = i+1; 		}
		for(int i = 0; i<numbers.length; i++) {			System.out.println(numbers[i]);		}
		
		//��� �л��� �⸻��� ���� ���� (5����)
		int[] score1 = {100,55,90,60,78};
		int sum = 0;
		float avg = 0f;
		
		//1. �� ������ ��
		System.out.println("������ �� : " + score1.length);
		//2. ������ ��		//2, 3�� ������ �ϳ��� for��
		//3. ������ ���
		for(int i = 0; i < score1.length; i++) {
			sum += score1[i];
//			avg = (i>=score1.length-1) ? sum/(float)score1.length : avg;
			if(i>=score1.length-1) avg = sum / (float)score1.length;
		}
		System.out.printf("������ �� [%d] �� [%d] ��� [%f]",score1.length, sum,avg);
		
	}
	

}
