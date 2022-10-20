import java.util.Scanner;

/*
 
 
 
 */
public class Ex06_Operation {

	public static void main(String[] args) {
		int result = 100/100;
		System.out.println(result);

		result = 13/2;	//�� �ִ� /
		System.out.println(result);
		
		result = 13%2;	// ������ ���ϴ� %
		System.out.println(result);
		
		
		// ======================== ������ ========================  \\
		
		// ���� , ���� ( ������ ������ : ++ 1�� ����, -- 1�� ����)
		// ȥ�� ������ ��ġ, ��ġ�� �ǹ̰� ����.
		int i = 10;
		++i;		//��ġ����
		System.out.println("��ġ���� i : "+i);
		
		i++;		//��ġ����
		System.out.println("��ġ���� i : "+i);
		
		//Today point ( ������ �����ڰ� �ٸ� �����ڿ� ���յǸ� [��ġ, ��ġ]�� �ǹ̰� ����
		int i2 = 5;
		int j2 = 4;
		//i2 : 5	j2 : 4
		
		int result2 = i2 + ++j2;	// ��ġ������ ��� �ø��� ����
		System.out.println("result2 : " + result2 + " || j2 : " + j2);
		// i2 : 5	j2 = 5	reuslt2 : 10
		
		result2 = i2 + j2++;	// ��ġ������ ���ϰ� �ø� ( ���ϱ� ���꿡�� ���� �ȵ� )
		System.out.println("result2 : " + result2 + " || j2 : " + j2);
		//i2 : 5	j2 = 6	result2 : 10
		
		// =====================================================
		
		// ======================== ��?�� ======================== \\
		
		byte b = 100;
		byte c = 1;
		
		// byte d = b + c;
		// Type mismatch: cannot convert from int to byte
		// Java�� ����� 4byte ������ ����ؼ� �����ϱ� ������ Ÿ�Թ̽���ġ ������ ���
		
		// ��� 1 ( casting )
		// byte d = (byte) (b + c);
		
		// ��� 2 ( ����� Ÿ���� ���� (�ս� �߻� X) )
		int d = b + c;
		System.out.println("d : " + d);
		
		//Today Point
		/*
		   1. ������ ��� ������ [int] Ÿ�� ��ȯ �Ŀ� ó��
		      ex) byte + short => �����Ϸ��� ���������� [int + int] �� ó��
		          char + char  => �����Ϸ��� ���������� [int + int] �� ó��
		          
		          ����ó���� ������ ���꿡�� [int] ���� ���� Ÿ���� [int]�� ��ȯ ���� ([int] ���� ū [long]�� ����
		          byte , char , short >> ����ÿ��� [int]�濡 �־ ��� >> [int]
		          
		          char + int >> int + int
		          int + long >> long + long ���������� ... ū Ÿ���� ����
		          
		          ���� + �Ǽ� >> Ÿ���� ũ��� ������� >> �Ǽ� �¸� 
		*/
		
		long ln = 10000000000L;
		float fl = 1.2f;
		//long lnresult = ln + fl  ���� + �Ǽ� >> Ÿ���� ũ��� ������� >> �Ǽ� �¸�
		
		//��� 1
		long lnresult = (long) (ln + fl); //�ս� �߻�
		System.out.println(lnresult);
		
		//��� 2
		//float lnresult = ln + fl;
		//System.out.println("lnresult : "+lnresult);
		
		
		float num2 = 10.34f;
		int num3 = 20;
		float result3 = num2 + num3;
		
		System.out.println(result3);
		
		char c2 = '!';
		char c3 = '!';
		
//		��� 1
//		char c4 = (char)(c2+c3);
//		System.out.println(c4);
		
//		��� 2
		int c4 = c2 + c3;
		System.out.println("c2 + c3 = (char)c4 : " + (char)c4);
		
		
		// =====================================================
		
		// ======================== ��� ======================== \\
		// �߼ұ�� ���蹮�� ( ������ ��� ) >> �ﰢ�� ����� >> ����
		int sum = 0;	//local variable
		for(int j = 1; j<=100; j++) {
			//sum += j;	//sum = sum + j;
			
			if(j%2 == 0) {	//j�� ¦���̸�
				sum += j;
			}
		}
		System.out.println("1 ~ 100 ���� ���� ��(sum) : " + sum);
		
		// == ������ ( ���� ���ϴ� ������ )
		// [Ÿ��]�� ���ϴ� ���� �ƴ� [��]�� ��
		if(10 == 10.0f) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		// ! ���� ������
		if('A' != 65) {
			System.out.println("���� �ʴ� : true");
		}else {
			System.out.println("���� : false");
		}
		
		
		//�ϱ����� (Today Point)
		//������ �� ��������� �ϴ� ... ������
		//���׿�����
		int p  = 10;
		int k = -10;
		int result8 = (p==k) ? p : k;	// p�� k�� ������(true) p(����) �ٸ���(false) k(false)�� �ִ´� 
		
		// �� ���׿����ڸ� if������ �ٲٸ�
		int result9 = 0;
		if(p==k) result9 = p;
		else result9=k;
		
		//����ǥ
		//������
		//0 : false
		//1 : true
		
		/* 			OR ����  	 ,	AND����
		   0 0		false 		false
		   0 1		true		false
		   1 0		true	 	false
		   1 1		true  		true
		   
		   DB (Oracle) SQL��� �ڿ��� (�ΰ� ģȭ�� .. )
		   
		   select * from emp where job='IT' and sal > 2000;		// �� �� ���� ���
		   
		   select * from emp where job='IT' or sal > 2000;		// �� �߿� �ϳ��� ���̾ ����
		   
		   ������
		   | ��Ʈ����(or)
		   & ��Ʈ����(and)
		   
		   || ������(or)
		   && ������(and)
		   
		*/
		
		// ======================== ��Ʈ���� ======================== \\
		//				  8421
		int x = 3;		//0011	>> 8*0 + 4*0 + 2*1 + 1*1 >> 0 + 0 + 2 + 1	= 3
		int y = 5;		//0101	>> 8*0 + 4*1 + 2*0 + 1*1 >> 0 + 4 + 0 + 1	= 5 
					//OR  0111 	>> 8*0 + 4*1 + 2*1 + 1*1 >> 0 + 4 + 2 + 1 	= 7
					//AND 0001 	>> 8*0 + 4*0 + 2*0 + 1*1 >> 0 + 0 + 0 + 1	= 1
		/* *��Ʈ���� �ϴ� ��
		 
		  	������ -> 2����(0, 1)
		  	8bit
		  	256 128 64 32 16 8 4 2 1
		  	
		  		10���� 3	>>	 0 0 1 1
		  		10���� 5 >>	 0 1 0 1
		  		
		  		OR  ��Ʈ	>>	 0 1 1 1
		  		AND ��Ʈ >>	 0 0 0 1
		*/
		System.out.println("x|y : " + (x|y));	// OR  ��Ʈ����
		System.out.println("x&y : " + (x&y));	// AND ��Ʈ����
		
		//Today Point ( && : AND ... || : OR )
		//if(10 > 1 && -1 > 1 && 100 > 1) { A } else { B }
		//   [true]   [false] ... AND ������ : ������ ������ ���� ó���ȴ�. 	** AND�� ���� �� **
		
		//if(10 > 1 || -1 > 1 || 100 > 1) { A } else { B }
		//   [true] ... OR ������ : ���� ������ ���� ó���ȴ�.
		
		// ======================== switch ======================== \\
		
		int data = 80;
		
		switch(data) {
			case 100 : System.out.println(data + "�Դϴ�");
				break;
			case 90 : System.out.println(data + "�Դϴ�");
				break;
			case 80 : System.out.println(data + "�Դϴ�");
				break;
			case 70 : System.out.println(data + "�Դϴ�");
				break;
			default : System.out.println("��ġ�ϴ� �� ����");
		}
		
		// break Ȱ��
		//int month = new Scanner(System.in).nextInt();
		int month = 5;
		String res = "";
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: res = "31"; break;
			case 4:
			case 6:
			case 9:
			case 11: res = "30"; break;
			case 2: res = "29"; break;
			default : res ="���� �ƴմϴ�.";
		}
		System.out.println(month + "���� " + res + "�ϱ��� �Դϴ�.");
		/*
		>���� (������ : ������ ���Ⱚ)
		 java >> ����ϰ��� �ϴ� �پ��� �ڿ��� �̸� ������ ���� >> ã�Ƽ� ����ϸ� �� >> JAVA API
		 ���� ( ã�Ƽ� ��� ) >> API ����
		 https://docs.oracle.com/javase/8/docs/api/index.html
		 ���ϴ� �ڿ��� ã�Ƽ� ��� ����� �ľ��ϰ� ó���ϴ°� FM 
		 java.lang.Math Ŭ������ ã��	>> public static double random()  >> double Ÿ�� ����
									>> equal to 0.0 and less than 1.0 >> ������ ������ ���� �� �ִ�.
									>> double Ÿ���� 0.0 ~ 1.0 ���� ���� ���� ���� �� �ִ�.
		
		>API ����
		 ������ �ϴ� �ڿ��� �ִ� ������ open ( import )
		  ex) import java.lang.*;	>> java �ȿ� lang �ȿ� �ִ� ��� �ڿ��� ����� �� �ִ�
		 
		 Tip) java.lang �� ���� ���� ���̴� ���� import ���� �ʾƵ� ����Ǿ� �ִ�.
		*/
		//Math.random �� ���
		System.out.println("Math.random() : " + Math.random());
		//���� ���
		System.out.println("���ϴ� ���� ���� ���(0 ~ 100) : "+ (int)((Math.random()) * 100) + "  (int)(Math.random() * 10)");
		//���� �ⷰ
		System.out.println("���ϴ� ���� ���� ���(10 ~ 20) : "+ ((int)((Math.random()* 10))+10) + "  ((int)(Math.random() * 10)+10");
		
		/*Quiz
		 �츮�� ��ȭ�� ��ǰ �ý����� ������� �Ѵ�
		   ��ǰ �ý����� ������ ������ ���� ��ǰ�� �����ϴ� �ý����̴�
		   ��ǰ ��÷�� 1000 ������ ������
		   ��ǰ���� TV , NoteBook , ����� , �ѿ켼Ʈ , ����
		   ��ǰ ��÷�� 900 ������ ������
		   ��ǰ����  NoteBook , ����� , �ѿ켼Ʈ , ����
		   ��ǰ ��÷�� 800 ������ ������
		   ��ǰ����  ����� , �ѿ켼Ʈ , ����
		   ��ǰ ��÷�� 700 ������ ������
		   ��ǰ����  �ѿ켼Ʈ , ����
		   ��ǰ ��÷�� 600 ������ ������
		   ��ǰ����  ����
		   �׿� ������ 100 ~ 500 ������ ĩ�� 
		   ��ǰ�ý����� ���� ������ 100 ~ 1000 ������ �����Ǿ� �ִ�
		   ����ڰ� ��ǰ �ý����� ���� �����ϰ� 100 ~ 1000������ ���� ������ �Ǿ� �ֽ��ϴ�. 
		*/
		int score = (int)(Math.random()*10 + 1) * 100;	//100 ~ 1000 ���� �� ����
		System.out.print(score +"�� >> ");				//���� ���
		String res2 = "";
		switch(score) {								//���� �� �� ��ǰ ���
			case 1000: res2 += "TV, ";
			case 900 : res2 += "��Ʈ��, ";
			case 800 : res2 += "�����, ";
			case 700 : res2 += "�ѿ켼Ʈ, ";
			case 600 : res2 += "����";
					   break;
			default  : res2 += "ĩ�� ";
		}
		System.out.println(res2 + " ȹ��");
		
		
		//switch([���ǽ�]) ������...X
		//[���ǽ�]�� "���ڿ�", '����'�� ����
		String m = "F";
		String f = "";
		switch(m) {
			case "A":
			case "B":
			case "C":
			case "D":
			case "E":
			case "F":
			case "G": f = "OK"; 
				break;
			case "H":
			case "K": f = "NO";
				break;
			default : f = "no data";
		}
		System.out.println("��� : " + f);
	}

}







