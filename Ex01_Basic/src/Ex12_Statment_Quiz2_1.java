import java.util.Scanner;

public class Ex12_Statment_Quiz2_1 {

	public static void main(String[] args) {
		// ���� ���� �� ���� �����
		// �޴� ���·� ���� �ݺ�		ex) 1.���� 2.���� 3.�� 4.����
		
		// = = = ���� ����� = = =
		int input = 0; 			// �Է°�(�Է��� ����������)�� ������ input
		int random = 0;			// ������(��ǻ�Ͱ� ����)�� ������ random
		String str = "";		// ��� ����� ���ڿ��� ��� ��Ƶδ� str 
		Scanner scan = new Scanner(System.in); //�Է¿� ����� ���� 'Scanner'�� scan�̶�� �̸����� �����
		
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
			
			// if������ ���ؼ� �¸�, �й�, ���� ���ϱ�
			if(input == 1) {			//������ ���� ��
				if(random == 1) {
					str = "���º�!";
				}else if(random == 2) {
					str = "��ǻ���� �¸�!";
				}else if(random == 3) {
					str = "������ �¸�!";
				}
			}else if(input == 2) {		//������ ���� ��
				if(random == 1) {
					str = "������ �¸�!";
				}else if(random == 2) {
					str = "���º�!";
				}else if(random == 3) {
					str = "��ǻ���� �¸�!";
				}
			}else if(input == 3) {		//���� ���� ��
				if(random == 1) {
					str = "��ǻ���� �¸�!";
				}else if(random == 2) {
					str = "������ �¸�!";
				}else if(random == 3) {
					str = "���º�!";
				}
			}else if(input == 4) {		//���Ḧ ������ ��
				System.out.println("������������ �����մϴ�");
				break;
			}else {						// �̻��� ��(54891, 21)�� ������ ��
				System.out.println("�ùٸ� ���� �Է��ϼ���");
			}
			System.out.printf("���� : %d | ��ǻ�� : %d  >> %s\n\n",input,random,str);
		}
		
	}

}
