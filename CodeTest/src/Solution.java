import java.util.Scanner;
import java.io.FileInputStream;

/*
 	��
 	 X �̵������� �� 	>> ����� ��
 	 Y �̵��Ұ����� �� 	>> ����
 	 L ��ĭ			
 	 H �Ϲݾ� 		>> �Ծ�� �Ǵ°�
 	
 	��Ģ
 	 1. Y�� �� ����
 	 2. ��ĭ�� �ǳʶ�
 	 3. H�� �Ծ�ߵ�.
 	 4. H�� �������� H�� �ϳ� �ǳ� �پ�ߵ�
 	 
 	 �ٵ����� ũ��� 8 ~ 100
  	
 	�Է�
 	 1. TestCase�� ���� �Է� >> �ݺ� Ƚ��
 	 
 	 2. �ٵ����� ũ�� �Է�
 	 3. �� �Է�?
 	 4. ���
 	 
 	 5. [1]��ŭ 2~4 �ݺ� 
 */
class Solution {
	static int AnswerN = 0;	// �� �ִ� ����
	static int N = 10;	// �ٵ��� ũ�� �Է� ���� 
	static String[][] board = new String[100][100];	// �ٵ���
	static int x = 0, y = 0;// ���� X�� ��ġ
	static boolean meetn = false;
	
	// �ٵ��� �� �ʱ�ȭ
	static void boardReset() {
		for(String[] value1 : board)
			for(String value2 : value1) value2 = "";
	}
	
	// X ��ġ ã�� �Լ�
	static void searchX() {
	loop : for(int i = 0; i<N; i++) {
			for(int j = 0; j<N;j++) {
				if(board[i][j].equals("X")) {
					x = i;
					y = j;
					break loop;
				}
			}
		}
	}
	
	// �� ã�� �Լ�
	static void searchAnswer() {
		// answerx, answery�� ���� ó������ ��ǥ >> x ������ǥ y ������ǥ
		// meetn�� ���� �Ѿ����� ����
		// while������ �迭�� ����� ������ 
		int answerx = x, answery = y;
		boolean b = true;
		// ���� �˻�
	boards1 :while(answerx >=0) {
			// ���� ĭ�� �� ��
			switch(board[answerx--][y]) {
				case "L" : break; 			// ��ĭ�̸� �Ѿ��
				case "H" :	
					if(meetn) {AnswerN++;break boards1;}	// ���� �ǳ� ���¶�� �����ٸ� AnswerN 1 �߰�
					else meetn = true;	// ���� �Ȱǳ� ���¸� �ǳ� ���·�
					break;
				case "Y" : break boards1;	// Y�� ���� �� ����
			}
		}
		//���� �˻� ��
	
	
	
	
		answerx = x;
		answery = y;
		meetn=false;
		//������ �˻�
		boards2 :while(answerx < N) {
			// ���� ĭ�� �� ��
			switch(board[answerx++][y]) {
				case "L" : break; 			// ��ĭ�̸� �Ѿ��
				case "H" :					// �Ϲ� ���� ������ ��
					if(meetn) {AnswerN++;break boards2;}	// ���� �ǳ� ���¶�� �����ٸ� AnswerN 1 �߰�
					else meetn = true;	// ���� �Ȱǳ� ���¸� �ǳ� ���·�
					break;
				case "Y" : break boards2;	// Y�� ���� �� ����
			}
		}
		//������ �˻� ��
		
		
		
		
		answerx = x;
		answery = y;
		meetn = false;
		//�Ʒ��� �˻�
		boards3 :while(answery >=0) {
			// ���� ĭ�� �� ��
			switch(board[x][answery--]) {
				case "L" : break; 			// ��ĭ�̸� �Ѿ��
				case "H" :					// �Ϲ� ���� ������ ��
					if(meetn) {AnswerN++;break boards3;}	// ���� �ǳ� ���¶�� �����ٸ� AnswerN 1 �߰�
					else meetn = true;	// ���� �Ȱǳ� ���¸� �ǳ� ���·�
					break;
				case "Y" : break boards3;	// Y�� ���� �� ����
			}
		}
		//�Ʒ��� �˻� ��
		
		
		
		
		answerx = x;
		answery = y;
		meetn=false;
		//���� �˻�
		boards4 :while(answery <N) {
			// ���� ĭ�� �� ��
			switch(board[x][answery++]) {
				case "L" : break; 			// ��ĭ�̸� �Ѿ��
				case "H" :					// �Ϲ� ���� ������ ��
					if(meetn) {AnswerN++;break boards4;}	// ���� �ǳ� ���¶�� �����ٸ� AnswerN 1 �߰�
					else meetn = true;	// ���� �Ȱǳ� ���¸� �ǳ� ���·�
					break;
				case "Y" : break boards4;	// Y�� ���� �� ����
			}
		}
		meetn=false;
		answerx = x;
		answery = y;
	}
	
	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();	//�׽�Ʈ���̽� �� ����?

		for(int test_case = 1; test_case <= T; test_case++) {
			//�ٵ��� ũ�� �Է�
			N = sc.nextInt();	
			
			// �� �Է�
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N;j++) board[i][j] = sc.next();
			}
			
			// X ��ǥ ã��
			searchX();
			
			// �� ó��??
			searchAnswer();
			
			// == ��� ==
			System.out.println("#"+test_case+" "+AnswerN);	// ���
			
			//�ٵ���, ���� ����
			boardReset();
			AnswerN = 0;
		}
	}
}