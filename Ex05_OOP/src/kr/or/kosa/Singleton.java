package kr.or.kosa;
//������ ���� >> ���� ���� >> new

// �̱��� ...(��ü �ϳ��� ���� ����)
// �ǵ� : �ϳ��� ��ü�� �����ϴ� ���强 �ڵ带 ����

// ����IP , ���������� �� ���迡 ���

// �ϳ��� �ּҰ��� ������ �����ϴ� ���������� Singleton

public class Singleton {
	private static Singleton p;	//p��� ������ �ּҸ� ������ ... new �ؾ� ...
	
	private Singleton() {
		//������ �����ڸ� private .. ������ �Լ� ȣ�� �Ұ� .. ��ü ���� �Ұ� (new Singleton �Ұ�)
	}
	public static Singleton getInstance() {
		if(p == null) {
			p = new Singleton();	//���� Ŭ���� ���ο��� public�� private�� ����
		}
		return p;
	}
}
