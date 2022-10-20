import java.util.Arrays;

/*
	1. [1 ~ 45������ ����]�� �߻����Ѽ� [6���� ������]�� [�迭]�� ��ƶ�
	
	2. �迭�� ��� 6���� �迭���� [�ߺ����� ������ �ȵȴ�]. (�ߺ��� ����)
	
	3. �迭�� �ִ� 6���� ���� [���� ������ ����]
	
	4. �� ����� ��� �ִ� �迭�� [���]�ϼ���
	
	main �Լ� �ȿ��� ��� �ۼ��ص� �ǰ� static �Լ��� ���� �ȴ�.
	 - class�δ� X -
*/
public class Ex03_Array_Lotto_Main {
	static void startFor() {
		// ���� ����
		int[] lotto = new int[6]; // �ζ� ��ȣ�� ���� ũ�� 6 �迭 ����
		int lottonum = 0; 	// �������� ���� ����
		int temp = 0;		// ���Ŀ� ����
		// �ݺ��� ����
		for (int i = 0; i < lotto.length; i++) {
			//[1~45���� ������]�� lottonum �� ���� 
			lottonum = (int) (Math.random() * 45) + 1;
			
			// �ߺ��� ���ϴ� �κ�
			for (int j = 0; j < lotto.length; j++) {
				//lotto[j]�� lottonum�� ��������� (�ߺ��� ������)
				if (lottonum == lotto[j]) {	//�� �迭�� �ٽ� �̱�
					i--;
				}
			}
			// �� ����. lotto[i]�� ���� ���� lottonum �ֱ�
			lotto[i] = lottonum;
		}
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for(int i = 0; i<lotto.length;i++) System.out.printf("[%d] ",lotto[i]);
		System.out.println();
	}
	static void startWhile() {
		int []lotto = new int[6];
		int randomnum = 0;
		int lottonum = 0;
		int temp = 0;
		do {
			boolean lot = true;
			randomnum = (int)(Math.random()*45)+1;
			
			for(int i = 0; i<lotto.length; i++) {
				if(randomnum == lotto[i]) lot = false;
			}
			
			if(lot) lotto[lottonum++] = randomnum;
		}while(lottonum <lotto.length);
		
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for(int i = 0; i<lotto.length;i++) System.out.printf("[%d] ",lotto[i]);
		System.out.println();
	}
	public static void main(String[] args) {
		startWhile();
	}
}
