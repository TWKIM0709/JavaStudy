import java.util.Scanner;

import kr.or.kosa.Item;
import kr.or.kosa.Stuff;

public class Ex04_Modifier_Quiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;	// ���� �Է¿� ����
		int inputMoney = 0; // ���� �� ����
		int moneyT = 0;
		boolean auto = true;
		int itemV = 0;
		int inputItemP = 0;
		
		Stuff stuff = new Stuff(); 
		Item item = new Item();
		
		//���Ǳ� �ʱ⼳��
		stuff.setName("4�����Ǳ�");
		
		//��ǰ ����
		item.setItemName("�Ƹ޸�ī��");
		item.setItemP(2500);
		item.setItemNum(5);
		
		while(auto) {
			// �޴� ���
			System.out.println("***************************************************");
			System.out.println("1. ���ֱ�  \t2. �Ž������ޱ�\t3. ��ǰ���� \t4. ����");
			System.out.println("5. �ܾ�Ȯ��\t6. ��ǰ������\t7. ��ǰ���ݺ���\t8. ����");
			System.out.println("***************************************************");
			System.out.printf("���� �ܾ� : %d\n", stuff.getMoney());
			
			System.out.print("��ȣ�� �Է� >>");
			input = Integer.parseInt(scan.nextLine());
			
			switch(input) {
				case 1:
					System.out.print("���� ���� �Է��ϼ��� >>");
					inputMoney = Integer.parseInt(scan.nextLine());
					stuff.setMoney(inputMoney);
					break;
				case 2:
					moneyT =stuff.getMoney();
					stuff.resetMoney();
					System.out.println("�Ž����� " + moneyT + "�� ���Խ��ϴ�.");
					break;
				case 3:
					item.itemPrint();
					break;
				case 4:
					stuff.buyItem(item);
					break;
				case 5 :
					System.out.println("���� �ݾ� : " + stuff.getMoney());
					break;
				case 6 :
					System.out.printf("== ��ǰ ��� ���� ==\n �������� ���ڸ� �Է�>>");
					itemV = Integer.parseInt(scan.nextLine());
					item.setItemNum(itemV);
					System.out.printf("��ǰ %d�� �Էµ�. ���� ���� %d\n", itemV, item.getItemNum());
					break;
				case 7 :
					item.itemPrint();
					System.out.print("������ ������ �Է��ϼ��� >> ");
					inputItemP = Integer.parseInt(scan.nextLine());
					item.setItemP(inputItemP);
					break;
				case 8:
					auto = false;
					break;
				default :
					System.out.println("�ùٸ� ���� �Է����ּ���");
			}
		}
		System.out.println("�����");
	}

}
