import java.util.HashMap;
import java.util.Scanner;

public class Ex14_Map_Quiz {

	public static void main(String[] args) {
		/*
		 * Map 사용해서 구현하는 데이터집합
		 * 지역번호, 우편번호, 회원가입(ID, PW)
		 * 
		 * HashMap으로 회원정보를 관리하는 사이트
		 * 
		 */
		
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "Tiger");
		loginmap.put("lee", "kim1004");

		/*
		 * 우리 시스템은 회원가입한 회원의 id,pw 정보를 가지고 있다.
		 * 로그인시 id, pw를 확인해서 회원이라면 사이트에 접속 가능하도록
		 * 
		 * id (O) pw (O) >> 로그인 성공, while 탈출
		 * id (O) pw (X) >> 재입력
		 * id (X) pw (x) >> 재입력
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("ID :");
			//ID는 공백을 제거하고 소문자로 변환 (String 함수 사용)
			String id = scan.nextLine().replace(" ", "").toLowerCase();
			//비밀번호는 공백제거만 
			System.out.print("PW :");
			String pw = scan.nextLine().replace(" ", "");
			
			if(loginmap.containsKey(id)) {
				if(loginmap.get(id).equals(pw)) {
					System.out.println("회원님 방가방가");
					break;
				}
				System.out.println("ID, PW 확인해주세요");
				continue;
			}
			
			System.out.println("id 재입력하세요");
		}
	}
}
