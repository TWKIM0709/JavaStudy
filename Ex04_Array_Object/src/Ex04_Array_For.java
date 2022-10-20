
public class Ex04_Array_For {

	public static void main(String[] args) {
		/*
		   Today Point
		   for 문 쉽게 >> 향상된 for문, 개선된 for문
		   JAVA 		: for(Type 변수명 : 배열 or Collection) { 실행블럭 }
		   C#			: for(Type 변수명 in 배열 or Collection) { 실행블럭 }
		   JavaScript	: for(Type 변수명 in Collection) { 실행블럭 }
		 */

		int[] arr = {5,4,7,8,6,3};
		for(int value : arr) System.out.print(value + " ");
		System.out.println();
		
		String[] strarr = {"A","B","C","D","ffff"};
		for(String value : strarr) System.out.print(value + " ");
		System.out.println();
	}

}
