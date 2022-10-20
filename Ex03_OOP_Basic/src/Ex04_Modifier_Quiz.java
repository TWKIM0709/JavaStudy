import java.util.Scanner;

import kr.or.kosa.Item;
import kr.or.kosa.Stuff;

public class Ex04_Modifier_Quiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;	// 유저 입력용 변수
		int inputMoney = 0; // 넣은 돈 변수
		int moneyT = 0;
		boolean auto = true;
		int itemV = 0;
		int inputItemP = 0;
		
		Stuff stuff = new Stuff(); 
		Item item = new Item();
		
		//자판기 초기설정
		stuff.setName("4조자판기");
		
		//상품 설정
		item.setItemName("아메리카노");
		item.setItemP(2500);
		item.setItemNum(5);
		
		while(auto) {
			// 메뉴 출력
			System.out.println("***************************************************");
			System.out.println("1. 돈넣기  \t2. 거스름돈받기\t3. 상품보기 \t4. 구매");
			System.out.println("5. 잔액확인\t6. 상품재고관리\t7. 상품가격변경\t8. 종료");
			System.out.println("***************************************************");
			System.out.printf("현재 잔액 : %d\n", stuff.getMoney());
			
			System.out.print("번호를 입력 >>");
			input = Integer.parseInt(scan.nextLine());
			
			switch(input) {
				case 1:
					System.out.print("넣을 돈을 입력하세요 >>");
					inputMoney = Integer.parseInt(scan.nextLine());
					stuff.setMoney(inputMoney);
					break;
				case 2:
					moneyT =stuff.getMoney();
					stuff.resetMoney();
					System.out.println("거스름돈 " + moneyT + "원 나왔습니다.");
					break;
				case 3:
					item.itemPrint();
					break;
				case 4:
					stuff.buyItem(item);
					break;
				case 5 :
					System.out.println("현재 금액 : " + stuff.getMoney());
					break;
				case 6 :
					System.out.printf("== 상품 재고 관리 ==\n 증가감할 숫자를 입력>>");
					itemV = Integer.parseInt(scan.nextLine());
					item.setItemNum(itemV);
					System.out.printf("상품 %d개 입력됨. 현재 수량 %d\n", itemV, item.getItemNum());
					break;
				case 7 :
					item.itemPrint();
					System.out.print("변경할 가격을 입력하세요 >> ");
					inputItemP = Integer.parseInt(scan.nextLine());
					item.setItemP(inputItemP);
					break;
				case 8:
					auto = false;
					break;
				default :
					System.out.println("올바른 값을 입력해주세요");
			}
		}
		System.out.println("종료됨");
	}

}
