package kr.or.kosa;

public class Stuff {
	private String name;
	private int money;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//잔액(돈) 출력
	public int getMoney() {
		return money;
	}
	// 넣기, 빼기
	public void setMoney(int money) {
		if(money <= 0) {
			System.out.println("제대로된 금액을 입력해주세요");
		}
		else {
			this.money = money;
			System.out.printf("넣은 돈은 %d, 현재 금액은 %d\n", money, this.money);
			}
	}
	//전액 환급
	public void resetMoney() {
		System.out.println("전액환급 " + money + "원 됨");
		money = 0;
	}
	
	//구매기능
	public void buyItem(Item item) {
		// 상품 수량이 있고 && 가지고 있는 돈이 상품 가격보다 많을 때
		if(item.getItemNum() > 0 && (money >= item.getItemP())) {
			item.itemSell();
			money -= item.getItemP();
			System.out.println(item.getItemName() + " 구매 되었습니다.");
		}
		else {
			System.out.println("문제가 발생했습니다.");
		}
	}
}
