package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

/*
	��ȭ�� �����
	1. ���� ���
	2. ��ȸ ���
	3. ��� ���
	4. ���� ���
	
	����
		�¼� ���� [4][5] 	: int seat[][]
		�¼� �Է� ����		: String seatnum
		���Ź�ȣ ����		: String resnum
		�޴��Է� ����		: int menuinput
	
	���
		���� ���
		��ȸ ���
		��� ���
		
		 
*/
public class Cinema {
	// ���� ����
	private String seat[][];	// �¼� �迭 ����
	private String seatinput;	// �¼� �Է� ����
	private String res[][];		// ���Ź�ȣ �迭 ����
	private String resinput;	// ���Ź�ȣ �Է� ����
	private int menuinput;		// �޴� �Է� ����
	private boolean auto;		// while�� ���� ����
	private Scanner scan;		// Scannner ����
	private Random r;			// ���� ����
	
	private int point[];		// �ڵ� ������ ��� ����� �������� ���� ���� ...
								// ������ �¼�(�迭��ġ) ������ ��´�.
	
	//������ >> �ʱ�ȭ
	public Cinema(){
		seat = new String[4][5];
		seatinput = "";
		res = new String[4][5];
		resinput = "";
		menuinput = 0;
		auto = true;
		scan = new Scanner(System.in);
		r = new Random();
		point = new int[] {0,0};
	}
	
	// �޴� ��� �Լ�
	private int menuPrint() {
		// �޴� ����ϱ�
		System.out.println("*********************");
		System.out.println("****��ȭ ���� �ý���****");
		System.out.println("**********************");
		System.out.println("1. �����ϱ�");
		System.out.println("2. ��ȸ�ϱ�");
		System.out.println("3. ����ϱ�");
		System.out.println("4. �����ϱ�");
		
		// ��� �����ߴ��� menuinput ������ �ְ�
		menuinput = Integer.parseInt(scan.nextLine());
		
		// �Է¹��� ��(menuinput)�� return
		return menuinput;
	}
	
	//�޴����� [1] >> �����ϱ� �ϸ� �۵��Ǵ� �Լ�
	// �¼� ���, �¼� �Է�, ���ű���� ���� ��Ű�� �Լ�
	private void seatRun() {
		//�¼���� �Լ��� �¼��� ����ϰ�
		seatPrint();
		
		// �¼��� �Է� �޾Ƽ�
		System.out.println("�¼��� �������ּ���. ��) 1-1");
		System.out.println("�̹� ���ŵ� �¼��� '����'��� ǥ�õ˴ϴ�.");
		seatinput = scan.nextLine();
		
		// ���� �Լ��� ����ؼ� ���� �õ�
		// ���� �Լ��� �Է¹��� �¼����� �־� ���� >> ����/���н� �ȳ��޽��� ���
		if(seatCheck(seatinput)) {
			//���� ������
			System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
			System.out.printf("�¼���ȣ : [%s], ���Ź�ȣ : %s\n",seatinput,res[point[0]][point[1]]);
		}else {
			//���� ���н�
			System.out.println("�̹� ���ŵ� �¼� �Ǵ� ���� �¼��Դϴ�.");
		}
	}
	
	// �¼� ��� �Լ�
	private void seatPrint() {
		//�¼� ��ü ���
		for(int i = 0; i< seat.length; i++) {
			for(int j = 0; j< seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j]);
			}
			System.out.println();
		}
	}
	
	// �Է��� �¼�(input)�� �޾� ���Ÿ� �ϰ� ... ����/���и� return �ϴ� �Լ�
	private boolean seatCheck(String input) {
		// �������� �������� �����ϴ� ����
		boolean ck = false;
		// �¼� ã��
		for(int i = 0; i <seat.length; i++) {
			for(int j = 0; j<seat[i].length; j++) {
				if(seat[i][j].equals(input)) { 	//�Է��� �¼��� ���� ������ �¼��̸�
					
					point[0] = i; point[1] = j; //���õ� �¼����� ���� ( ��¿� )
					
					seat[i][j] = "����";		//�� �¼��� "����"�� �ٲٰ�
					
					// ���� ���Ź�ȣ ����
					String ran = Integer.toString(r.nextInt(8) + 1);
					for (int k = 0; k < 7; k++) {
						ran += Integer.toString(r.nextInt(9));
					}
					
					//������ ���Ź�ȣ�� �迭��(�ش� �¼� ��ġ) ����
					res[i][j] = ran;
					
					//���� ����!
					ck = true;
				}
			}
		}
		return ck;	//���� ���� true, ���� false return 
	}
	
	// �޴����� [2] >> ��ȸ�ϱ� �ϸ� �۵��Ǵ� �Լ�
	private void resSearch() {
		// ���Ź�ȣ�� �Է� ����
		System.out.println("���Ź�ȣ�� �Է����ּ���");
		resinput = scan.nextLine();
		
		// �Է��� ���Ź�ȣ(resinput)�� ���Ź�ȣ�迭(res[][])�� �ִ��� ã�ƺ��� ���
		for(int i = 0; i < res.length; i++) {
			for(int j = 0; j<res[i].length; j++)
				// �Է��� ���Ź�ȣ�� ������
				if(res[i][j].equals(resinput)) {
					// �¼� ��� �� �Լ� ����
					System.out.printf("������ �����Ͻ� �¼��� [%d-%d]�Դϴ�.\n",i+1,j+1);
					return;
				}
		}
		//������ ���ٰ� ���
		System.out.println("�Է��Ͻ� ���Ź�ȣ�� ���� ��ȣ�Դϴ�.");
	}
	
	// �޴����� [3] >> ����ϱ� �ϸ� �۵��Ǵ� �Լ�
	private void resDelete() {
		// ���� ��ȣ �Է¹ޱ�
		System.out.println("���Ź�ȣ�� �Է����ּ���");
		resinput = scan.nextLine();
		// �Է¹��� ��ȣ�� �ִ��� Ȯ��
		for(int i = 0; i < res.length; i++) {
			for(int j = 0; j<res[i].length; j++)
				// �Է��� ���Ź�ȣ�� ������
				if(res[i][j].equals(resinput)) {
					// �¼� ���� ��� �� ������� �����
					System.out.printf("������ �����Ͻ� �¼��� %d-%d�Դϴ�. ����Ͻðڽ��ϱ�?\n", i+1,j+1);
					System.out.println("1. ��\t2.�ƴϿ� �� �ϳ��� �Է�");
					// ���� ��Ҹ� (1�� �Է��ϸ�)
					if(Integer.parseInt(scan.nextLine()) == 1){
						// �ش��ϴ� �¼��迭�� ���Ź�ȣ �迭�� �ʱⰪ���� �ǵ����� >> ���� �����
						res[i][j] = "";
						seat[i][j] = (i+1) + "-" + (j+1);
						System.out.print("���Ű� ��ҵǾ����ϴ�.\n");
						return;
					}else {
						//��� ���Ѵٰ��ϸ� �޴��� ���ư�
						System.out.println("[�ƴϿ�] ���õ�");
						return;
					}
				}
		}
		// �Է��� ���� ��ȣ�� ���� ��ȣ�� 
		System.out.println("�Է��Ͻ� ���Ź�ȣ�� ���� ��ȣ�Դϴ�.");
	}
	
	// �迭 �ʱⰪ �ִ� �Լ�
	private void vSetup() {
		for(int i = 0; i<seat.length; i++) {
			for(int j = 0; j<seat[i].length;j++) {
				seat[i][j] = (i+1) + "-" + (j+1);
			}
		}
		for(int i = 0; i<seat.length; i++) {
			for(int j = 0; j<seat[i].length;j++) {
				res[i][j] = "";
			}
		}
	}
	
	// ���� �Լ�
	public void run() {
		vSetup();
		while(auto) {
			// �޴� ��� �� �Է� �޾Ƽ� �ش��ϴ� ��� ����
			switch(menuPrint()) {
				case 1: seatRun();
					break;
				case 2:resSearch();
					break;
				case 3:
					resDelete();
					break;
				case 4:
					auto = false;
					break;
				default:
					System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���.");
			}
		}
		System.out.println("���α׷� �����");
	}
}