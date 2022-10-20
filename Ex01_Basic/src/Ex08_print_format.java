import java.util.Scanner;

/*
  �������̵� >> �ϳ��� �Լ��� �Ķ���͸� �ٸ����ؼ� �ٸ� ��� ��� 
 */
public class Ex08_print_format {

	public static void main(String[] args) {
		// ����ϴ� �پ��� ���
		System.out.println();	// ��� �� �ٹٲ� (����)
		System.out.print("A");	// ����ϰ� 
		System.out.print("B");	// ����ϰ�
		System.out.print("C");	// ����ϰ�
		System.out.println();	// ����ϰ� �ٹٲ�
		System.out.print("D");	// ����ϰ�
		System.out.println();
		
		int num = 100;
		System.out.println("num ���� " + num + "�Դϴ�");
		
		//���� format ���� ���
		System.out.printf("num ���� %d�Դϴ�.\n", num);
		System.out.printf("num ���� [%d]�Դϴ� �� [%d]�� �ֽ��ϴ�\n",num,12345);
		//format ���Ĺ���
		/*
		   %d : 10���� ������ ����
		   %f : �Ǽ�
		   %s : ���ڿ�
		   %c : ����
		   \t : ��
		   \n : �ٹٲ�
		*/
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f������ %f �Դϴ�\n", f);
		
		// ======================== �Է¹ޱ� ======================== \\
		// cmd���� ����ڰ� �Է��� ����...
		Scanner sc = new Scanner(System.in);
		
		//String value = sc.nextLine();			// �Է��ϰ� Enter�� ĥ������ ��� (���α׷��� ������� �ʰ� ����)
		//System.out.println(value);			// �Է��� ���� ���ڿ��� ����
		
//		int number = sc.nextInt();				
//		System.out.println("number : " + number);
		
//		double number = sc.nextDouble();
//		System.out.printf("number : %d\n",number);

		// ������� : nextInt , nextFloat ���ٴ� nextLine�� ����ؼ� read�ϰ� Ÿ���� �ٲ���
		// Today Point
		// ���� => ���� ... �ٲٴ� �ɷ� (����, �Ǽ�)
		// Integer.parseInt("11111") >> ���� >> 11111
		// Float.parseFloat("3.14") >> �Ǽ� >> 3.14
		
//		System.out.print("���ڸ� �Է� >> ");
//		int number = Integer.parseInt(sc.nextLine());
//		System.out.printf("������ number : %d",number);
		
	}

}







