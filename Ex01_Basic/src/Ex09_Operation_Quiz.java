import java.util.Scanner;

public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
		// �Է��Ҷ� �� scan ����
		Scanner scan = new Scanner(System.in);
		
		// ���� �Է¹��� ������ ����
		int number1 = 0;	//���� 1 �Է¹��� number1 ����
		int number2 = 0;
		String ch = "";
		int value = 0;
		
		// �� �Է�
		System.out.print("���ڸ� �Է� >> ");
		number1 = Integer.parseInt(scan.nextLine());	//sc.nextLine �Է¹��� ���ڸ� Integer.parseInt�� ���ڷ� �ٲ� >> number1�� ����
		System.out.print("��ȣ�� �Է� >> ");
		ch = scan.nextLine();
		System.out.print("���ڸ� �Է� >> ");
		number2 = Integer.parseInt(scan.nextLine());
		
		// switch�� ��Ģ����
		switch(ch){		// ch�� switch�� �� 
			case "+" : value = number1 + number2; break; //ch�� "+"�� number1 + nuber2 �ѰŸ� value�� ����
			case "-" : value = number1 - number2; break;
			case "*" : value = number1 * number2; break;
			case "/" : value = number1 / number2; break;
			default : System.out.println("��ȣ�� �ùٸ��� �ʽ��ϴ�");
		}

		//���
//		System.out.println(number1 + " " + ch + " " + number2 + " = " + value);
		System.out.printf("%d %s %d = %d",number1,ch,number2,value);
		
	}

}
