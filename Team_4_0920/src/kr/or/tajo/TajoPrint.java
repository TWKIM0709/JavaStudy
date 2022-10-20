package kr.or.tajo;

import java.util.Collection;
import java.util.Map;

public class TajoPrint {
	
	//메뉴들
	//시작메뉴
	public static int startMenu() {
		//1. 로그인
		//2. 회원가입
		//3. 종료
		
		return 0;
	}
	//유저 메뉴
	public static int userMenu() {
		//1. 대여하기
		//2. 반납하기
		//3. 종료
		return 0;
	}
	//admin 기본 메뉴
	public static int adminMenu() {
		//1. 시스템 조회
		//2. 기기관리
		return 0;
	}
	//admin 조회 메뉴
	public static int searchMenu() {
		//시스템 정보 출력 후
		//1. 유저목록조회
		//2. 기기목록조회
		//3. 대여로그조회
		return 0;
	}
	//admin 기기관리 메뉴
	public static int ManagementProductMenu() {
		//1. 기기등록
		//2. 기기삭제
		//3. 기기충전
		return 0;
	}
	
	//기기 목록 
	public static void productListPrint(Map<String,Product> productList, int index) {
		//index 0 : 전체 출력
		//index 1 : 대여가능출력
		//index 2 : 충전필요기기출력
		
//		Collection clist = map.values();	//Value는 중복데이터가 있어서 순서가 있는 데이터 집합으로 관리
//		System.out.println(clist); 			//그 타입이 Collection
		
		Collection productValueList = productList.values();
		switch(index) {
		case 0 :
			for(Object o : productValueList) {
				System.out.println(((Product)o).toString());
			}
			break;
		case 1:
			for(Object o : productValueList) {
				//Product의 대여가능상태 true 일때만 출력
				if(((Product)o).isAble())
				System.out.println(((Product)o).toString());
			}
			break;
		case 2:
			break;
		}
	}
	public static void productListPrint(User user) {
		//파라미터로 받은 유저가 대여중인 기기 출력
	}
	//유저 목록
	public static void userListPrint(Map<String,User> userList) {
		//전체유저목록출력
	}
}
