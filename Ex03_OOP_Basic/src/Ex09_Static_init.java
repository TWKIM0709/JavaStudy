/*
 * static   ������ ��ü���� [���� ��]�� ������ �ϴ� ���� �������� ����
 * instance ������ ��ü���� [�ٸ� ��]�� ������ �ϴ� ���� �������� ����
 * 
 * 
 * �� ������ ���ؼ� �ʱ�ȭ �ϴ� ��� ...
 */

class InitTest{
	static int cv = 10;
	static int cv2;
	int iv = 11;
	//3���� ��� default ���� ������ �־� �ʱ�ȭ�� ���� ������ �ʾƵ� ��� X (�ʿ��ϸ� �ص� ��)	
	
	{
		// �ʱ��� �� ( �ʿ��ϸ� member field�� ���⼭ �ʱ�ȭ�ض�)
		// ��ü�� �����ǰ��� >> ������ �޸𸮿� �ö󰡰� >> �ٷ� ȣ�� { �� }
		// �������� �ڵ� ex) if(iv > 10) iv = 100;
//		iv = 2222;
		System.out.println("�ʱ��� ��");
		if(iv > 10) iv = 1000;
		
		// �ʱ�ȭ >> ��ü�� new ���� ������ ... >> �ʱ��� �� ���� ���� >> static �ʱ��� ���� ���� ����
		// cv = 30;
	}
	
	static {
		// static �ڿ��� ���� �ʱ�ȭ ��
		// ���� ����? : static int cv = 10; �� static int cv2; �� �޸𸮿� �ö� ����
		cv = 1111;
		cv2 = cv + 2222;	//���۵� ǥ���� ���� 
	}
	
}

public class Ex09_Static_init {

	public static void main(String[] args) {
//		InitTest t = new InitTest();
//		System.out.println(t.iv);
//		
//		System.out.println(t.cv);
		
		
		System.out.println(InitTest.cv + ", " + InitTest.cv2);
		
	}

}
