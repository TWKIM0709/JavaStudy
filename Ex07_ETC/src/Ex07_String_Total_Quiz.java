import java.util.Scanner;

public class Ex07_String_Total_Quiz {

	// substring()�� ���� ��
	// 14�ڸ� üũ �Լ�
	public static boolean checkSize(String jumin) {
		return (jumin.length() == 14) ? true : false;
	}
	
	// ���ڸ� ù��° 1~4 üũ�Լ� 123456
	public static boolean checkBack(String jumin) {
		int number = Integer.parseInt(jumin.substring(7, 8));
		return (number <= 4 && number > 0) ? true : false;
	}

	// ���ڸ� ���� ���� ���� ( 1 3 ���� // 2 4 ���� )
	public static void printGender(String jumin) {
		int number = Integer.parseInt(jumin.substring(7, 8));
		System.out.println((number%2==0) ? "����" : "����");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String jumin = "";
		while (true) {
			System.out.println("�ֹι�ȣ�� �Է��ϼ��� ex)123456-1234567");
			jumin = scan.nextLine();
			if (checkSize(jumin)) {
				System.out.println("�ڸ��� üũ ����");
			} else {
				System.out.println("�ڸ��� üũ ����");
				continue;
			}
			if (checkBack(jumin)) {
				System.out.println("�޹�ȣ ù��° �ڸ��� üũ ����");
			} else {
				System.out.println("�޹�ȣ ù��° �ڸ��� üũ ����");
				continue;
			}
			printGender(jumin);
//			
			System.out.println("�ڸ��� üũ"+ (checkSize(jumin) ? " ����" : " ����"));
			System.out.println("�޹�ȣ ù��° �ڸ��� üũ" + (checkBack(jumin) ? " ����":" ����"));
			printGender(jumin);
		}
	}
}