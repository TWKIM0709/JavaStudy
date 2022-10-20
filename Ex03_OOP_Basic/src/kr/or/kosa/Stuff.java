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
	//�ܾ�(��) ���
	public int getMoney() {
		return money;
	}
	// �ֱ�, ����
	public void setMoney(int money) {
		if(money <= 0) {
			System.out.println("����ε� �ݾ��� �Է����ּ���");
		}
		else {
			this.money = money;
			System.out.printf("���� ���� %d, ���� �ݾ��� %d\n", money, this.money);
			}
	}
	//���� ȯ��
	public void resetMoney() {
		System.out.println("����ȯ�� " + money + "�� ��");
		money = 0;
	}
	
	//���ű��
	public void buyItem(Item item) {
		// ��ǰ ������ �ְ� && ������ �ִ� ���� ��ǰ ���ݺ��� ���� ��
		if(item.getItemNum() > 0 && (money >= item.getItemP())) {
			item.itemSell();
			money -= item.getItemP();
			System.out.println(item.getItemName() + " ���� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("������ �߻��߽��ϴ�.");
		}
	}
}
