import java.util.Scanner;

public class Ex18_do_while_Menu_Static {

	static Scanner scan = new Scanner(System.in);
	
	//���
	static void inputRecord() {
		System.out.println("���� ������ �Է�>>");
	}
	static void deleteRecord() {
		System.out.println("���� ������ ����");
	}
	static void sortRecord() {
		System.out.println("���� ������ ����");
	}
	
	static int displayMenu() {
		System.out.println("**********��������**********");
		System.out.println("1. �л����� �Է�");
		System.out.println("2. �л����� ����");
		System.out.println("3. �л����� �̸��� ����");
		System.out.println("4. ���α׷� ����");
		System.out.println("**************************");
		
		int menu = 0;
		do {
			try {
				menu = Integer.parseInt(scan.nextLine());
				if(menu >= 1 && menu <=4) {
					break;
				}else {
					// 1���� �۰ų� 4���� ū ��
					// �ڵ������δ� ����(����)�� �ƴ����� �̷� ��Ȳ�� ���ܷ� ����ڴ�.
					throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�.");	//����� ���� ���� >> catch�� ����
				}
			}catch (Exception e) {
				System.out.println("���� : " + e.getMessage());
				System.out.println("�޴� ���ÿ� ���� ������ �߻�");
				System.out.println("1 ~ 4 ������ ���� �Է��ϼ���");
			}
		}while(true);
		
		//1 ~ 4���� �� �ϳ��� �����ϸ�
		return menu;
	}
	
	
	public static void main(String[] args) {
		while(true) {
			switch (displayMenu()) {
			case 1: inputRecord();
				break;
			case 2: deleteRecord();
			break;
			case 3 : sortRecord();
				break;
			case 4: System.out.println("���α׷� ����");
				//return;	//main �Լ� ����
				System.exit(0); //���α׷� ���� ���� Kill
			}
		}

	}

}
