import java.util.Arrays;

/*
	배열은 '객체'다 (Array)
	1. new를 통해 생성
	2. heap 메모리에 올라간다 (관리자원이다)
	3. 고정배열(정적배열) : 배열을 한번 선언하면(크기가 정해지면) 변경이 불가능하다.  <<반대>> Collection(동적)
	4. 자료구조(알고리즘) 기초적인 학습

*/
public class Ex01_Array_Basic {

	public static void main(String[] args) {
		// 같은 타입의 변수 여러개를 선언해서 데이터를 처리하세요
		int s1;
		int s2;
		int s3;//...
		
		int a1, a2, a3;//...
		
		// 배열
		int[] score = new int[4];
		// >> int 타입의 방 4개 생성 ... heap 연속된 공간에 >> 방이름(index(첨자) : [0] [1] [2] [3] >> 0부터 시작한다)
		
		System.out.println(score[0]);
		score[0] = 100;
		score[1] = 500;
		score[2] = 700;
		score[3] = 200;
		//score[4] = 500;
		// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		// 배열은 0부터 시작한다 >> 배열의 크기는 index값보다 1 크다
		System.out.println(score[3]);
		
		//Array (배열) 궁합 제어문 (for문)
		for(int i = 0; i<4; i++) {
			System.out.printf("[%d]=[%d] \t", i, score[i]);
		}
		System.out.println();
		
		//배열의 크기 >> [배열.length]
		for(int i = 0; i < score.length; i++) {
			System.out.printf("[%d]=[%d] \t", i, score[i]);
		}
		System.out.println();
		
		//Tip
		//Arrays.toString(배열) >> 배열값 String 타입으로 return >> 배울때는 쓰지말것 >> 실력 안늘음
		String resultArray = Arrays.toString(score);
		System.out.println(resultArray);
		
		//Tip2
		//Array.sort(배열) >> 배열값 정렬 >> 배울때는 쓰지말것 >> 실력 안늘음
		Arrays.sort(score);
		resultArray = Arrays.toString(score);
		System.out.println(resultArray);
		
		//배열 생성 3가지
		int[] arr = new int[5]; // 기본
		int[] arr2 = new int[] {100,200,300};
		int[] arr3 = {11,22,33};
		//Tip) javascript : lec cararr = [1,2,3,4,5];
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		int[] arr4;
		arr4 = new int[] {21,22,23,24,25};
		System.out.println(arr4);
		
		int[] arr5 = arr4;
		System.out.println(arr4==arr5);
		
		//배열의 타입은 기본8가지 + String + 클래스 Ojbect
		String[] strarr = new String[] {"가","나","다라마"};
		for(int i = 0; i<strarr.length; i++)System.out.println(strarr[i]);
		
		char[] carr = new char[5];
		float[] farr = new float[5];
		
	}

}



