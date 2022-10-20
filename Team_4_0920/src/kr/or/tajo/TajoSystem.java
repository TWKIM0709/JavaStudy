package kr.or.tajo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TajoSystem {
	//변수들 목록, 처리클래스 등
	//스캐너는 Utils 클래스에 static으로 있다.
	private Map<String, User> userList; //유저목록
	private Map<String, Product> productList; //기기목록
	private List<Log> logList; //대여내역목록
	private FileIO file; //파일 입출력 변수
	private String userId; //로그인된 유저 ID
	ProductProcess process;
	
	//생성자
	public TajoSystem() {
		this.userList = new HashMap<String, User>();
		this.productList = new HashMap<String, Product>();
		this.logList = new ArrayList<Log>();
		process = new ProductProcess(productList);
		file = new FileIO();
	}
	
	//run 함수:윤태호
	public void run() {
		File filelute = new File(Utils.BASICPATH);
		if (filelute.mkdir()) {//파일이 없는 경우 파일 생성
			try {
				filelute.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			file.userListSave(null);
			file.productListSave(null);
			file.logListSave(null);
			file.systemInfoListSave(null);
		}else {//파일들 전부 불러오기
			file.userListLoad();
			file.productListLoad();
			file.logListLoad();
			file.systemInfoListLoad();
		}
		//시작메뉴:윤태호
		int key = 0;
		boolean auto = true;
		while (auto) {
			switch (key) {//UserManagement 로그인, 회원가입 기능 사용
			case 1:
				break;
			case 2:
				break;
			case 3:
				System.exit(0);
				break;
			}
			if(!userList.isEmpty()) {
				break;
			}
		}
		if(userList.get(userId).isGrade()) {
			//관리자일 경우:윤태호
			int menu = 0;
			while ((menu = TajoPrint.adminMenu()) != 0) {
				switch (menu) {
				case 1://1. 시스템 조회
					TajoPrint.searchMenu();
					break;
				case 2://2. 기기관리
					TajoPrint.ManagementProductMenu();
					break;
				}
			}
		}else {
			//유저일 경우:윤태호
			int menu = 0;
			while ((menu = TajoPrint.userMenu()) != 0) {
				switch (menu) {
				case 1://1. 대여하기
					TajoPrint.productListPrint(productList,1);
					break;
				case 2://2. 반납하기
					TajoPrint.productListPrint(userList.get(userId)); //유저가 대여중인 기기 목록 출력
					System.out.print("기기번호를 입력해주세요 > ");
					String inputNum = Utils.scanner.nextLine(); //기기번호 입력받음
					
					//반납함수
					Log log = process.returnProduct(userList.get(userId), productList.get(inputNum));
					
					if(log != null) {
						//로그 목록 추가
						//파일에 기록
					}
					
					break;
				case 3://3. 종료
					System.exit(0);
					break;
				}
			}
		}
			
			
			
	}//run end:윤태호
	public static void main(String[] args) {
		new TajoSystem().run();
	}
}
