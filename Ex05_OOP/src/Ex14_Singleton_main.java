import kr.or.kosa.Singleton;

public class Ex14_Singleton_main {

	public static void main(String[] args) {
//		Singleton singleton = new Singleton();	�����ڴ� private�� new�� ���� �Ұ�
		Singleton singleton = Singleton.getInstance();	// Singleton ��ü�� �����ϰ� �ּҰ��� ���� �� �ִ� ������ ��� getInstance()
		Singleton singleton2 = Singleton.getInstance();	// ��ü�� ���� ��� ����, ������� �ش� ��ü�� return�ϱ� ������ 3���� �ּҴ� ����
		Singleton singleton3 = Singleton.getInstance();	// �ϳ��� �ּҰ��� ������ �����ϴ� ���������� Singleton
		
		System.out.println(singleton);
	}

}
