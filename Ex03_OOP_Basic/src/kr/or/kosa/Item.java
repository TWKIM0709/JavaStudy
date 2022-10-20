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
		//0 �̻��� ���
		if(itemP>=0) this.itemP = itemP;
		else System.out.println("�ùٸ� ���� �Է��ϼ���");
	}
	
	public void itemSell() {
		itemNum--;
	}
	
	public void itemPrint() {
		System.out.printf("�̸��� %s | ������ %d�� | ������ %d��\n",itemName,itemP,itemNum);		
	}
	
	public int getItemNum() {
		return itemNum;
	}
	public void setItemNum(int itemNum) {
		if((this.itemNum + itemNum) <0) System.out.println("��ǰ ���� ����");
		else this.itemNum += itemNum;		
	}
	
	
}
