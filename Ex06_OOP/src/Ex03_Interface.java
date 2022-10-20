/*
	�߻�Ŭ������ �������̽�
	
	�� �������̽�
	���, ǥ���� ����� �� (��Ģ, �Ծ�)
	����Ʈ���� ������ �ֻ��� �ܰ�
	�����θ� ������ �ʴ´�.. ��ӿ� ���� ���Ǹ�...
	
	�� �߻�Ŭ������ �������̽��� ������
	1. ������ ��ü ������ �Ұ���
	2. ���
	 �߻�Ŭ���� extends			ex) class Car extends Abclass
	 �������̽� implements		ex) class Car implements Abinterface
	�� �� �߻��ڿ��� ������ �ִ� >> extends�� �ϴ� implements�� �ϴ� >> ������ ����(������)�� ����
	
	�� �߻�Ŭ������ �������̽��� �ٸ���
	1. �߻�Ŭ����(�ϼ� + �̿ϼ�) <==> �������̽�(��ü�� �̿ϼ�)
	2. ��Ģ������ Ŭ������ [���߻�� �Ұ�](������ ��� ���)
	   		   �������̽��� [���� ���� ����]	>>	����� ���� ������ >> �������� ���� >> ��Ƽ� ū ���
	   class Test extends Object implements Ia, Ib, Ic{ ... }
	   Tip) �������̽��� �������̽������� ����� �����ϴ� >> ����� ũ�� ���� �� �ִ�.
	3. �������̽�(����� ������ �������� �̿ϼ� �Լ�) >> JDK8���ʹ� Default, static�� �� �� �ְ� �Ǿ��µ� �� �Ⱦ�..
	
	�� �ʱ� �������� �ü�
	1. �������̽��� [[[[������]]]] �������� �������� ( �������̽��� �θ� Ÿ�� ) ***
	2. �������̽��� ���� �������� ���� Ŭ������ �ϳ��� �����ִ� ����� �Ѵ� (���� �θ� ������ �����ν�)
	3. Java API >> �� ���� (�̸� �������) �������̽��� ���� >> �������� �ʾƵ� ����� �� �ִ� �ڿ��� �̹� �ִ�
	4. �������̽� (~able) : ~ �� �� �ִ� >> �� �� �ִ�, �޸� �� �ִ�
	5. ��ü�� ����� (��ü�� ����) >> [[[[������]]]]
	
	
	
	
	�� ����
	1. ���� �����θ� ������ ���� �ʴ� : ���� ���� ���� : ��Ģ�� ��Ӹ� �ִ�
	�ý��ۿ��� �̵� ����� move ��� �̸��� ����ϰ� ��ǥ���� �޾ƾ� �ȴ�.
	>> ���� void move(int x, int y);	//������ �˾Ƽ�
	>> JAVA API �������̽� >> ����, ���� Ŭ���� �� ����
	>> Collection(�����迭) >> Vector , ArrayList , HashSet , HashMap
	�̷� Ŭ������ �� ���� �������̽��� �����ϰ� �ִ� Ŭ�����̴�.
	
	2. �������
	interface �̸� { ... }
	2.1 ���(final)	>> [public static final] int VERSION = 1;
	2.2 �߻��Լ�		>> [public abstract] void message(String args);
	
	������
	interface Aable{}	//�ƹ� �ڿ��� ������ �ʾƵ� �ȴ�.
	interface Aable{ int NUM = 10; }
	interface Aable{ void run(); }
	
	class Test extends Object implement Ia, Ib, Ic{ .... }
	class Test implement Ia, Ib, Ic{ .... }
*/

interface Ia{
	//������ �������̽��� [��� or �߻��Լ�]�� �����ϴ� ���� >> �����Ϸ��� �˾Ƽ� ���ش� 
	int AGE = 100;	//���		>> [public static final] int AGE
	String GENDER = "��";		// [public static final] String GENDER
	
	// { } �� ���� �߻��Լ��� �ִ�.
	
	String print();				// [public abstract] String print();
	void message(String args);	// [public abstract] void message(String args);
}

interface Ib{
	int AGE = 10;
	void info();
	String val(String s);
}


class Test2 extends Object implements Ia{

	@Override
	public String print() {
		
		return null;
	}

	@Override
	public void message(String args) {
		
	}
	
}

class Test3 extends Object implements Ia, Ib{
	
	@Override
	public void info() {
		
	}

	@Override
	public String val(String s) {
		return null;
	}

	@Override
	public String print() {
		return null;
	}

	@Override
	public void message(String args) {
		
	}
}
public class Ex03_Interface {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		Ia ia = t2;	//������ >> �θ�� �ڽİ�ü�� �ּҸ� ���� �� �ִ�.
		ia.message("�����ǵǾ� ��� ����");
		System.out.println(ia.GENDER);
		
		
		Test3 t3 = new Test3();
		Ia ia2 = t3;
		Ib ib2 = t3;
		System.out.println(ia2.GENDER);
		System.out.println(ib2.AGE);
	}

}
