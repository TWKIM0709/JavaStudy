import java.util.Scanner;

public class Ex11_Statment {

	public static void main(String[] args) {
		// �ݺ��� (while, do ~while)
		int i = 10;
		while(i>=10) {
			//�ݵ��
			//������ ���
			//i--; ������ ��ġ�� �������
			System.out.printf("i : %d", i--);
		}
		
		// while 1���� 100������ ��
		i = 1;
		int sum = 0;
		while(i<=100) {
			sum+=i++;
		}
		System.out.println(sum);
		
		//while ������
		i = 2;
		int j = 0;
		
		while(i<=9) {
			j = 1;
			
			while(j<=9) {
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j++);
			}
			
			System.out.println();
			i++;
		}
		
		//==================================== ========================================
		// for(;;) {...} : ���ѷ���	while(true){ ... } : ���ѷ���		break�� ��������
		// do ~ while: �ϴ� �ѹ��� ���������� ���� ... �׸��� ������ ����
		// do { ���๮... } while(����)
		// ex) �޴���
		
		Scanner scan = new Scanner(System.in);
		int inputdata = 0;
		do {
			System.out.print("���ڸ� �Է�(0~9) >>");
			inputdata = Integer.parseInt(scan.nextLine());
		}while(inputdata<0 || inputdata>9);	//1~9������ ���� '�ƴϸ�' do �ݺ�
		
		System.out.println("�Է��� ���ڴ� " + inputdata);
	}
}
