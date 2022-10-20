import java.util.ArrayList;
import java.util.List;

//https://cafe.naver.com/kosait/329
/*
	자바 8가지 기본 타입(값타입) : JAVA API가 제공
	
	8가지 기본 타입에 대해서 객체 형태로 사용 가능하도록 만든 클래스(Wrapper class)
	
	사용 목적
	1. 매개변수로 객체가 요구될 때
	2. 기본형 값이 아닌 객체 형태로 저장이 필요할 때
	3. 객체간 값을 비교할 때
	4. 타입 변환시 처리
	
	>> Generic 설계 (객체 형태) ex) int => Integer
*/
public class Ex08_Wrapper_Class {

	public static void main(String[] args) {
		int i = 100;
//		Integer n = new Integer(500);
//		System.out.println(n);
//		System.out.println(n.MAX_VALUE);
//		System.out.println(n.MIN_VALUE);
		
		//Point
		//parameter 활용
		//Generic에서** : 객체 생성시 타입 강제 방식 >> wrapper class
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(100);
//		li.add("200");
		for(int value : li) {
			System.out.println(value);
		}
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2==i3);//false ( 주소값 비교 )
		System.out.println(i2.equals(i3));	// true (주소에 있는 [값]을 비교하도록 재정의되어있다.)
		
		int i4 = 100;
		int i5 = 100;
		System.out.println(i4==i5); //true 값비교
	}

}









