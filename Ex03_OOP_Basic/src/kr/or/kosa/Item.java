package kr.or.kosa;

public class Item {
	private String itemName;
	private int itemP;
	private int itemNum;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemP() {
		return itemP;
	}
	public void setItemP(int itemP) {
		//0 이상일 경우
		if(itemP>=0) this.itemP = itemP;
		else System.out.println("올바른 값을 입력하세요");
	}
	
	public void itemSell() {
		itemNum--;
	}
	
	public void itemPrint() {
		System.out.printf("이름은 %s | 가격은 %d원 | 수량은 %d개\n",itemName,itemP,itemNum);		
	}
	
	public int getItemNum() {
		return itemNum;
	}
	public void setItemNum(int itemNum) {
		if((this.itemNum + itemNum) <0) System.out.println("상품 수량 오류");
		else this.itemNum += itemNum;		
	}
	
	
}
