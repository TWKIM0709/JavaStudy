import java.util.Scanner;

public class Ex12_Statment_Quiz {

	public static void main(String[] args) {
		// �޴��� �����ְ� ����ڿ��� ���� ...
		// �ٸ� ���� �����ϸ� �ٽ� �����ϵ��� ����
		// 1. while(true)
		// 2. do~ while()
		
		boolean auto = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		while(auto) {
			//���
			System.out.println("*********************************");
			System.out.println(" 1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("*********************************");
			System.out.print("�����ϼ��� >> ");
			
			//�Է�
			int input = Integer.parseInt(scan.nextLine());
			
			//�Ǵ�
			switch(input) {
				case 1 : System.out.println("����ó��.. �ݾ��� �Է�");
						 balance += Integer.parseInt(scan.nextLine());
						 break;
				case 2 : System.out.println("���ó��.. �ݾ��� �Է�");
						 balance -= Integer.parseInt(scan.nextLine());
						 break;
				case 3 : System.out.println("�ܰ�� " + balance);
						 break;
				case 4 : System.out.println("�����մϴ�.");
						 auto = false;
						 break;
				default : System.out.println("�ùٸ� �޴��� �����ϼ���.");
			}
			
		}
		
		
	}

}








