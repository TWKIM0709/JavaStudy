
public class Ex07_Operation {

	public static void main(String[] args) {
		// ======================== ���Կ����� ======================== \\
		// += , -= , *= , /=
		
		int sum = 0;
		sum += 1;	//sum = sum + 1;
//		System.out.println(sum);
		sum -= 1;	//sum = sum - 1;
//		System.out.println(sum);
		
		// ======================== ���ǹ� ======================== \\
		/*
			������ ���� ����
			���� : A+ , A- , B+ , B- , ... F
			���� : 94��
			
			�Ǵܱ��� : 	90�� �̻����� 	>> A
						95�� �̻�����	>> A+
						�ƴ϶�� 		>> A-
						
						80�� �̻�����	>> B
						85�� �̻�����	>> B+
						�ƴ϶��		>> B-
			if���� ����ؼ� ������ ����ϼ���		 
		*/
		
		int score = 78;		//����
		String grade = ""; 	//����
		System.out.print("����� ������ " + score + "���Դϴ�.");
		
		//==if�� ����==
		if(score >= 90) {						//����(score)�� 90�� �̻��̸�
			grade = "A";						//����(grade)�� A �߰�
			grade += (score>=95) ? "+" : "-";	//95�� �̻��̸� +, �ƴϸ� - �� grade�� �߰�
		}else if(score >= 80) {					// -- ���� �ݺ� --
			grade = "B";
			grade += (score>=85) ? "+" : "-";
		}else if(score >= 70) {
			grade = "C";
			grade += (score>=75) ? "+" : "-";
		}else if(score >= 60) {
			grade = "D";
			grade += (score>=65) ? "+" : "-";
		}else if(score >= 50) {
			grade = "E";
			grade += (score>=55) ? "+" : "-";
		}else {
			grade = "F";						//50�� �̸��̸� ���� F �ο�
		}
		//==if�� ����==
		System.out.println(" ������ " + grade + "�Դϴ�.");
		
		// ======================== Quiz ======================== \\
		
		//�빮�ڴ� 65 ~ 90
//		for(int i = 65; i<= 90; i++) {
//			System.out.print((char)i + " ");
//		}
		for(char i = 'A'; i<='Z'; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		// 1 ~ 100 ���
		for(int i = 1; i<= 100; i++) {
			System.out.print(i + "\t");
			if(i%10 == 0) System.out.println();
		}
		
		//�ֻ����� �� ���� 6�̵Ǵ� ��� ���
		for(int i = 1; i<=6; i++) {
			for(int j = 1; j<=6; j++) {
				if(i+j == 6) System.out.print(i + " + " + j + "\t");
			}
		}
		
		
	}

}










