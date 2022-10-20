/*
 * static member field >> ��ü�� �����ڿ� ...
 * static method >> ��?
 * 1. ��ü ���� ���� ȣ�� ����
 * 2. ���� ����Ѵ�
 * 3. ���赵�� ���� �� ����ؾߵȴ� ( �� �ڿ�(���)�� ���� ����Ѵٸ� )
 * 4. ���� ���� �ڿ� ... new ���� �ٷ� ... ���ϰ� ����Ϸ��� ...
 */

class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {
		//�Ϲ��Լ�
		//new �� heap�� �÷��� ���
		//1. iv �����
		//2. cv �����	// static �ڿ��� ��ü ���� ������ memory load
	}
	
	static void print() {
		//static �Լ�
		//1. cv �����
		//2. iv ����Ұ���
		//iv = 100; // ���� ������ ���� >> static �ڿ��� �Ϲ� �ڿ����� �켱�Ѵ�
		
		//static �ڿ��� ������ ��� �ȴ�.
		cv = 100001;
	}
	
}

public class Ex10_Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass.print(); // new ���� ���
		System.out.println(StaticClass.cv);
		
		//�Ϲ��ڿ�(��ü ����)
		StaticClass sc = new StaticClass();
		sc.m();
		sc.print();
	}

}
