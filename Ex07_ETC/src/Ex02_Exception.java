
public class Ex02_Exception {

	public static void main(String[] args) {

		System.out.println("main start");
		int num = 100;
		int result = 0;

		// ���� �м� (�ڵ� ������)
		try {
			for (int i = 0; i < 10; i++) {
				result = num / (int) (Math.random() * 10); // 0~9
				System.out.println("result : " + result + " i : " + i);
			}
		} catch (ArithmeticException e) {	//������ �߻��Ǹ� �߻� ��ü�� �ּҸ� �޾Ƽ� ������ �м� ...
			System.out.println("������ �߻��ϸ� �����ڿ��� ���������� ���� �߼�");
			System.out.printf("���� : %s", e.getMessage());
		}

		System.out.println("main end");
	}

}
