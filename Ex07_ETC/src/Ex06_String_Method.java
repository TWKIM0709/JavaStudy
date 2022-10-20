import java.util.StringTokenizer;

public class Ex06_String_Method {

	public static void main(String[] args) {

		String str = "hello";
		String concatstr = str.concat(" world");

		boolean bo = str.contains("e"); // contains	>> 있는지 찾기
		boolean bo2 = str.contains("ell"); // 나열된 것도 찾음. true
		boolean bo3 = str.contains("elo"); // 없으니까 false

		System.out.println(bo + "," + bo2 + "," + bo3);
		
		String str2 = "a b c d";	// [a] [ ] [b] [ ] [c] [ ] [d] ... 공백도 문자
		System.out.println(str2.length());
		
		String filename = "hello java world";
		System.out.println(filename.indexOf("h"));		// indexOf	위치(or 시작위치)
		System.out.println(filename.indexOf("java"));	// 없으면 -1 return
		
		if(filename.indexOf("wo") != -1) System.out.println("wo 단어 하나라도 있다.");	// 근데 이걸 여기 쓰는건
		if(filename.contains("wo")) System.out.println("wo 단어 하나라도 있다."); 		// 이게 있는데 왜
		
		System.out.println(filename.lastIndexOf("a"));	//9번쨰 방에 마지막 a가 있다.
		
		// 외우면 좋은 String 함수
		// length(), indexOf(), substring(), replace(), split()
		
		
		// ========= substring =========
		String result = "superman";
		System.out.println(result.substring(0));	// 시작index ~
		System.out.println(result.substring(0,2));	 
//		Parameters:
//			beginIndex - the beginning index, inclusive.	시작index를 포함한다
//			endIndex - the ending index, exclusive.			끝index를 제외한다
//		[시작index] ~ [끝index]-1를 리턴
		
		//Quiz
		String filename2 = "home.jpge";	//조건) or 이 파일명이 h.png or aaaa.hwp 일 수도 있다.
		
		// 파일명과 확장자를 분리해서 출력하세요
		// 1. 마지막 .이 어디 있는지 찾기
		// 2. 찾은 .을 기준으로 출력하기
		int dot = filename2.lastIndexOf(".");
		System.out.println("파일 이름은 " + filename2.substring(0,dot));
		System.out.println("파일 확장자는 " + filename2.substring(dot+1,filename2.length()));
		
		
		// ========= replace =========
		// replace([찾을문자],[바꿀문자]);
		String str3 = "ABCCBADDDDDBCA";
		String result3 = str3.replace("DDDDD", "오늘은 금요일");
		System.out.println(result3);
		
		result3 = str3.replace("A","a");
		System.out.println(result3);
		
		//ETC .. charAt()
		System.out.println(str3.charAt(3));
		System.out.println(str3.charAt(0));
		System.out.println(str3.endsWith("DBCA"));
		System.out.println(str3.endsWith("BDBCA"));
		System.out.println(str3.equalsIgnoreCase("ABCCbADddDDBCA")); // 대소문자 구분 없이 비교해라
		
		// ========= Today Point =========
		String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
		String []str4arr = str4.split(",");
		for(String value : str4arr) System.out.println(value);
		

		String str5 = "슈퍼맨.팬티.노랑색.우하하.우하하";
		String []str5arr = str5.split("\\.");
		for(String value : str5arr) System.out.println(value);
		
		// 정규표현식 ( 문자들을 조합해서 규칙을 만들고 :: 그 규칙과 데이터를 비교해서 판단 ) 패턴이 맞으면 true
		// 정규표현식은 java, javascript, oracle, c# 등등 모두 다 표준으로 쓰고 있다
		// ex) 핸드폰, 차량번호, 도메인주소, 이메일 등 >> 입력한 데이터 유효성 검증
		// 우편번호 {\d3}-{\d3} >> 12-456(false), 123*456(false), 111-445(true)
		// 위키 : https://ko.wikipedia.org/wiki/%EC%A0%95%EA%B7%9C_%ED%91%9C%ED%98%84%EC%8B%9D
	 	
		// 여기서 문제 >> "." >> 정규표현식으로 인지 >> \. 으로 입력해야된다.
		//									  >> 자바에서는 역슬러시 인지문제 때문에 \\. 으로 사용
		
		// 다음주(09.05주) 과제로 나올 예정 ...
		
		String filename3 = "kosa.hwp";
		String [] filename3arr = filename3.split("\\.");
		for(String s : filename3arr) System.out.println(s);
		
		
		// 이런거는 split으로 분리 못하니까 
		String str6 = "a/b,c-d.f";
		//StringTokenizer로 분리함
		StringTokenizer sto = new StringTokenizer(str6,"/,-.");
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		
		// 넌센스 Quiz
		// 문자열 사이사이 공백을 제거하는 방법 >> replace로 " "공백을 ""로 치환		
		String str7 = "홍         길      동";
		//저장시 공백을 제거 >> "홍길동" 저장
		String strresult = str7.replace(" ","");
		System.out.println(strresult);
		
		// 앞뒤 공백 자르는건 trim()이라는 함수가 따로 있다.
		String str8 = "        홍길동         ";
		System.out.println(">" + str8 + "<");
		System.out.println(str8.trim());
		
		String str9 = "       홍      길        동        ";
		System.out.println(">" + str9 + "<");
		System.out.println(str9.replace(" ",""));
		
		// 공백이라 replace 하나로 해결 됐지만 섞여있을때
		// trim > replace 두개 쓰면 무식한거
		//*****여러개의 함수를 사용시 [method chain] 기법 사용
		// method chain기법 : str9.trim().replace(" ", "").substring(2) >> 이런식으로 연결해서
		System.out.println(str9.trim().replace(" ", "").substring(2));
		
		
		//Quiz
		String jumin = "123456-1234567";
		int sum = 0;
		//1. 위 주민번호의 각 자리의 합을 구하세요

		// 1번 방법
		String jumin2 =jumin.replace("-","");
		for(int i = 0; i< jumin2.length(); i++) sum+= jumin2.charAt(i)-48;
		System.out.println(sum);
		
		// 2번 방법
		sum = 0;
		for(int i = 0; i<jumin2.length(); i++) sum+= Integer.parseInt(jumin2.substring(i, i+1));
		System.out.println(sum);

		// 3번 방법
		sum = 0;
		for(int i = 0; i<jumin2.length(); i++) sum+= Integer.parseInt(Character.toString(jumin2.charAt(i)));
		System.out.println(sum);
		
		// 3번 풀어서
		char[] c = new char[13];
		for(int i = 0; i<jumin2.length(); i++) {
			c[i] = jumin2.charAt(i);
		}
		for(int i = 0; i<jumin2.length(); i++) {
			sum += Integer.parseInt(Character.toString(c[i]));
		}


		// === 종합 Quiz ===
	}

}





