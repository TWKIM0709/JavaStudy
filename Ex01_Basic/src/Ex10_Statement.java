
public class Ex10_Statement {

	public static void main(String[] args) {
		// ���
		// ���ǹ� : if ( if , else if , else ) || switch(����) { case [��] : ... }
		// �ݺ��� : for(�ݺ�Ƚ���� ��Ȯ�ϴ�){ ... } , while(�������ο� ����){ ... } , do{ .. }while()
		// �б⹮ : break(���� Ż��) , continue(�Ʒ� ������ ��ŵ�ض�)

		// = = ���� if �� = =
		int count = 0;
		
		if(count < 1) System.out.println("true");
		
		if(count > 0) {
			System.out.println("false");
		}
		
		// = = switch = =
		char data = 'A';
		switch(data) {
			case 'A' : System.out.println("SAME");
				break;
			case 'B' :
				break;
			default : System.out.println("������ ó��");
		}
		
		
		// = = for = =
		// 1 ~ 100 ������
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum+=i;
		}
		
		System.out.printf("1 ~ 100�� ������ : %d\n", sum);
		
		//1~5������ ��
		//for���� while�� �Ⱦ���
		//���� * (���� + ��) / 2
		sum = 5 * (1 + 5) / 2;	//�� �ʿ� ���� ( �����ϱ� ) ...
		
		//���� for���� ����ؼ� 1���� 10���� Ȧ���� ��
		//for([�ʱⰪ] ; [����] ; [������(ó��)]){ }
		int sum2 = 0;
		for(int i = 1; i<=10; i+=2) {
			sum2 += i;
		}
		System.out.println(sum);
		
		//for���ȿ� if���� ����ؼ� 1 ~ 1000������ ¦���� ��
		int sum3 = 0;
		for(int i = 1; i<=1000; i++) {
			if(i%2 == 0) {
				sum3 += i;
			}
		}
		System.out.println(sum3);
		
		//�Ի���� �ʼ�����? ������
		//��ø for ...
		//�Ѱ��� ���� ���� ... �ݺ� ( 1...1~9   2...1~9   3...1~9 ......)
		for(int i = 1; i<=9; i++){
			for(int j = 1; j<=9; j++) {
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
			}
			System.out.println();
		}
		
		// �̷��Դ� �ܼ��ؼ� �ȳ�
		// for�� + �б⹮ ��� ( continue + break )
		// Today Point : continue >> �Ʒ�������ŵ		break >> for, while �� Ż��
		
		//break
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				if(i==j) { break; }
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		//continue
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				if(i==j) { continue; }
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
			}
			System.out.println();
		}
		
		
		//�����
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		//for�� -
		for(int i = 100; i>=0; i--) {
			System.out.println(i);
		}
		
		
		//������ �Ǻ���ġ
		int a = 0, b = 1, c = 0;
		for(int i = 0; i<10; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.printf("%d %d %d ",a,b,c);
			System.out.println(c);
		}
	}

}




