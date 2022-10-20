/*
	String 클래스 ( 문자열 )
	String 수 많은 함수를 가지고 있음 >> 문자열을 조작(자르고, 합치고 ...)
	String >> static 함수 + 일반함수 (15 ~ 20개 사용)
	
	Point1) 문자열 비교는 str.equals("str") 사용
*/

public class Ex05_String_Class {

	public static void main(String[] args) {
		// 사용방법 : int, double 같은 값타입처럼 사용
		String str = "str";
		String[] strarr = { "aaa", "bbb", "ccc" };
		for (String s : strarr)
			System.out.println(s);

		// String 클래스의 함수
		String str2 = "홍길동";
		System.out.println(str2.length());
		System.out.println(str2); 				//
		System.out.println(str2.toString());	// 주소로가서 데이터를 리턴하도록 override
		
		//정식
		String str3 = new String("ddd");
		System.out.println(str3);
		
		String name = "가나다라마";
		//String은 내부적으로 char[] member field >> ['가']['나']['다']['라']['마'] 배열의 주소값을 가진다
		//class String extends Object { prviate char[] str ... @Override toString(){} ... } 대충 이렇게 생겼다
		
		String str4 = "AAA";
		String str5 = "AAA";
		
		//문자열의 비교
		System.out.println(str4);
		System.out.println(str5.toString());	//toString() 재정의되어 '주소값'이 아닌 '값'이 나온다
		
		System.out.println(str4==str5);
		// == 연산자 값을 비교 >> str4(주소값), str5(주소값)
		// 같은 주소 판명
		//**메모리에 실제로 같은 문자열이 있으면 '재사용'한다. >> 같은 값을 가진 문자열이 있으면 새로 만드는게 아니라 원래 있던거에 이어버림
		
		// 문자열 비교는 equals("")
		System.out.println(str4.equals(str5));	// 주소를 찾아가서 그 안에 있는 값을 비교
		
		// Why??	: 문자열의 비교는 == 가 아닌 equals()를 써야 되나
		String str6 = new String("BBB");
		String str7 = new String("BBB");	// str = "aaa"로 컴퓨터에 맡기면 재사용하지만
											// new를 사용해서 heap 메모리에 새로 만들 것을 강제?지정? 
		System.out.println(str6 == str7);	// false >> 이런 경우가 생길 수 있다.
		
		System.out.println(str6.equals(str7));
		
		
	}

}






