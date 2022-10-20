package kr.or.bit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/*
	1. 1 ~ 45 ������ �߻����� 6�� �迭�� ����
	2. �ߺ��� ������ �ȵ�
	3. ���������� �����ϴ� ���
	4. ��� ���
	
	- �޴� ��� ���
	- �޴� ���� ���
	
	
	�߰�����)
	��������, ���� ����, ¦orȦ�� ���� ���
	
	member field ( ���� )
	constructor ( ������ )
	method ( �Լ� )
	static, private ���
*/

public class Lotto {
	// ������
	private int lottoCount;	//�ζǸ� ��� �̾Ҵ��� ����
	private int[] lotto;			//�ζ� ���� �迭
	private int lottocheck;			//�ζ� �迭 ��ġ ����
	private int lottonum;			//�ζ� ������ ���� ����
	private int menu;				//�޴� �Է°� ���� ����
	private Scanner scanner;//��ĳ��
	private boolean auto;		//whlie�� �ݺ��� ����
	// I/O ����
	private FileReader lottoreader;
	private BufferedReader lottobufferreader;
	private FileWriter lottowriter;
	private BufferedWriter lottobufferwriter;
	
	//������
	public Lotto(){
		System.out.println("Lotto Program �����");
		this.lottoCount = 0;
		this.lotto = new int[6];
		this.lottocheck = 0;
		this.scanner = new Scanner(System.in);
		this.auto = true;
	}
	// �Լ�
	// �޴��Լ�
	private int menuPrint() {	//�޴��� ����ϰ�, �Է°��� �޾� return �մϴ�.
		System.out.println("*****************************");
		System.out.println(" 1. �ζǻ̱� 2. Count���� 3. ��� �̱� 4. ����");
		System.out.println("*****************************");
		
		//�Է� ����
		menu = Integer.parseInt(scanner.nextLine());
		//�Է°� ����
		return menu;
	}
	
	//�ζ� ��� �Լ�
	private void lottoCreate() {	//�ζǸ� �����ϰ�, �ߺ����� üũ�ϰ�(�Լ�), ����(�Լ�) �� ����մϴ�.
		//lotto �迭�� ���� ��ġ ����
		lottocheck = 0;
		//�ζ� �̱�
		do {
			lottonum = (int)(Math.random() * 45) + 1;	// 1 ~ 45 ���� �̱�
			
			// �ߺ��� üũ
			if(checkLotto(lotto,lottonum)) {
				//�ߺ��� ������ �� ����
				lotto[lottocheck++] = lottonum;
			}
			//�ߺ����� ������ ���� ���� do�� ���ư��� �ٽ� �̱�	
		}while(lottocheck <6);	//6�� �� �̾����� ���� ����
		
		// ���� �ζ� ����
		lottoSort(lotto);
		
		//���
		String lotto1 = "";
		for(int value : lotto) {
			System.out.printf("[%d]\t",value);
			lotto1 += "[" + value + "]";
		}
		System.out.println();
		lottoCount++;	//���� Ƚ�� �ø���
		System.out.println(lotto1);
		lottoWriter(lotto1);
	}
	
	// ��� �̱� ���
	private void lottoNumberCreate(int number) {	//�ζǸ� �����ϰ�, �ߺ����� üũ�ϰ�(�Լ�), ����(�Լ�) �� ����մϴ�.
		lottocheck = 0;
		//�ζ� �̱�
		do {
			lottonum = (int)(Math.random() * 45) + 1;
			//�Է��� ����(number)�� ����� �ƴϸ� �ٽ� �̴´�.
			if(lottonum % number != 0) continue;
			// �ߺ��� üũ
			if(checkLotto(lotto,lottonum)) {
				//�ߺ��� ������ �� ��¡
				lotto[lottocheck++] = lottonum;
			}
			
			//�ߺ����� ������ ���� ���� do�� ���ư��� �ٽ� �̱�	
		}while(lottocheck <6);
		
		// ���� �ζ� ����
		lottoSort(lotto);
		
		//���
		for(int value : lotto) {
			System.out.printf("[%d]\t",value);
		}
		System.out.println();
		
		lottoCount++;
	}
	
	// �ߺ� üũ �Լ�
	private boolean checkLotto(int[] lotto, int number) {	//�迭�� ���� �޾� �ߺ����� ������ false, ������ true return
		// �ߺ����� ����� ���� ck
		boolean ck = true;
		
		// ck�� �ߺ����� ������ false, ������ true ����
		for(int value : lotto) {
			if(value == number) ck = false;
		}
		
		// �ߺ� ���� ����
		return ck;
	}
	
	// �����Լ�
	private void lottoSort(int[] lotto) {
		for(int i = 0; i< lotto.length; i++) {
			for(int j = i; j<lotto.length;j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
	}
	
	private void lottoWriter(String lottonumber) {
		try {
			lottowriter = new FileWriter("lotto.txt",true);	// false : �����    true : �߰�
			lottobufferwriter = new BufferedWriter(lottowriter);
			
			lottobufferwriter.write(lottonumber);
			lottobufferwriter.newLine();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				lottobufferwriter.close();
				lottowriter.close();
			} catch (Exception e2) {
				
			}
			
		}
	}
	
	private void lottoRead() {
		try {
			lottoreader = new FileReader("lotto.txt");
			lottobufferreader = new BufferedReader(lottoreader);
			//���� : Line ���� ó�� ����
			String line = "";
			for(int i = 0 ; (line = lottobufferreader.readLine()) != null; i++) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				lottobufferreader.close();
				lottoreader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	// �����Լ�
	public void run() {
		while(auto) {	//auto�� false�� �ɶ�����(4. ���Ḧ �Է��Ҷ�����) ����
			switch(menuPrint()) {	//�޴� ��� �� �Է°��� �޾� switch���� �ø�
				case 1: lottoCreate();	//1. lottoCreate() >> �ζ� ��ȣ ��� �Լ� ����
					break;
				case 2: System.out.println("���ݱ��� ���� �ζǴ� " + lottoCount + "���Դϴ�.");
					break;
				case 3: //�Է��� ������ ����� �ش�Ǵ� �ζǹ�ȣ�� �̴� ���
						// ���� ����(1~45)�� �־� 1 ~ 7 ������ ����� �����ϴ�.
					System.out.print("���ϴ� ����� �Է�(1~7) >>");	
					int inputnum = Integer.parseInt(scanner.nextLine());
					if (inputnum <1 || inputnum >7) {	//�Է� ������ �Ѿ�� �޴��� ���ư���.
						System.out.println("�ùٸ� ���ڸ� �Է��ϼ���");
						break;
					}
					lottoNumberCreate(inputnum);	// �Է��� ���� ����� �ش��ϴ� ���ڷθ� �̷���� �ζ� �̱� �Լ�
					break;
				case 4: auto = false;	//����
					break;
				case 5: lottoRead();
					break;
				default : System.out.println("�ùٸ� ���ڸ� �Է��ϼ���");	//�� ������ �Ѿ�� �ٽ� �Է� �ޱ�
			}
		}
		System.out.println("���α׷� �����");
	}
	
	
	
	public static void main(String[] args) {
		new Lotto().run();
	}
	
}