import java.util.Scanner;

public class Ex12_Statment_Quiz2_3 {

	public static void main(String[] args) {

		// ���� ����
		// UNIT : ȭ�����
		// NUM : ȭ��ż�
		// SW : ����Ī ���� , ���� ���� ���濡 ���
		// MONEY: �� �Է� �޴� ����
		// ���� : 10000 >> 5000 >> 1000 >> 500 >> 100 >> 50 >> 10 >> 5 >> 1
		// /2 /5 /2 /5 /2 /5 /2 /5
		int unit = 10000, num = 0, sw = 0, money = 0;
		Scanner scan = new Scanner(System.in);

		// Money �Է� �ޱ�
		System.out.print("���� �Է� >> ");
		money = Integer.parseInt(scan.nextLine());

		while (unit >= 1) {
			// Num ���ϱ�
			num = (int) (money / unit);
			// Unit, Num ����ϱ�
			System.out.printf("%d : %d ��\n", unit, num);
			// Money�� ���� Unit(����)���� ����ŭ(Num) ���̱�
			money -= unit * num;
			// SW ���� Ȯ���� Unit(����)�� ���� 1/5 �Ǵ� 1/2�� ���̰� sw �� �����ϱ�
			if (sw == 0) {
				unit /= 2;
				sw = 1;
			} else {
				unit /= 5;
				sw = 0;
			}
		}
	}

}
