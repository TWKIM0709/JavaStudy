import java.util.Scanner;

public class Ex12_Statment_Quiz2_2 {

	public static void main(String[] args) {
		// ���� ���� �� ���� �����
		// �޴� ���·� ���� �ݺ�		ex) 1.���� 2.���� 3.�� 4.����
		
		// = = = ���� ����� = = =
		int input = 0; 			// �Է°�(�Է��� ����������)�� ������ input
		int random = 0;			// ������(��ǻ�Ͱ� ����)�� ������ random
		String str = "";		// ��� ����� ���ڿ��� ��� ��Ƶδ� str 
		Scanner scan = new Scanner(System.in); //�Է¿� ����� ���� 'Scanner'�� scan�̶�� �̸����� �����
		int aa = 0;				// �� �񱳿� ���
		
		// while �ݺ���. ���� ������ ���� �ݺ�
		while(true) {
			// ��ǻ�� ���������� ���ϱ�
			random = (int)(3*Math.random()+1); // 1 ~ 3 ������ ���� �� ���ϱ�
			
			// �޴� ���
			System.out.println("************************************");
			System.out.println("[1] ���� | [2] ���� | [3] �� | [4] ����");
			System.out.println("************************************");
			
			// ���� ���� �� �Է� �ޱ�
			input = Integer.parseInt(scan.nextLine());
			if(input == 4) break;
			
			// ��Ģ����
			aa = input - random;
			if(aa == 0) str = "���";
			else if (aa == -2 || aa == 1) str = "�̱�";
			else if (aa == -1 || aa == 2) str = "��";
			
			// ���׿����ڷ�
//			if(input == random) str = "���";
//			else if(input > random) str = (input-random == 1) ? "�̱�" : "��";
//			else str = (random - input == 1) ? "��" : "�̱�";
			
			
			System.out.printf("���� : %d | ��ǻ�� : %d  >> %s\n\n",input,random,str);
		}
		
	}

}
