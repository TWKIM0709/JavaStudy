/*
	OOP : ��ü ���� ���α׷��� >> �������� ����(���赵)���� ���� �����ϴ� ����
	>> �������� ���赵�� �����ϴ� ���
	
	1. ��� (���뼺)
	2. ĸ��ȭ (����ȭ) : private ... getter setter (�����Ҵ��� ���� �����Ҵ��� ���� �����͸� ��ȣ)
	3. ������ : �ϳ��� Ÿ������ ������ ��ü�� �ּҸ� ���� �� �ִ� ��
	
	>>method overloading(�����ε�)
	  �ϳ��� �̸����� �������� ����� �ϴ� �Լ�
	ex) System.out.println() >> println()�Լ� �̸��� �Ѱ� ... ��� ����� ���
	1. �����ε��� ������� (X)
	2. ���ϰ� ����Ϸ��� ... �����ڰ� �����ڸ� ���
	3. �����ε��� ������� �ʾƵ� �������� �ʴ´�
	
	
	����) �Լ� �̸��� ���� parameter�� [����]�� [Ÿ��]�� �ٸ����ϸ� Overloading�̶� �Ѵ�.
	1. �Լ� �̸��� �����ؾ��Ѵ�.
	2. parameter�� ���� �Ǵ� Ÿ���� �޶���Ѵ�.
	3. return type�� Overloading �� �����ϴ�(�Ǵ� ������ �ƴϴ�).
	4. parameter�� [����]�� �ٸ��� ����***  
*/
class Human{
	String name;
	int age;
}

class OverTest{
	int add(int i) {
		return 100 + i;
	}
	//int add(int s) { ... } �浹���� ... Ÿ���� ���Ƽ� ... parameter �̸��� ��� X
	
	int add(int i, int j) {	//parameter�� ������ �޶� Overloading �ȴ�.
		return i + j;
	}
	String add(String s) {
		System.out.println("�����ε� : " + s);
		return "hello" + s;
	}
	String add(String s, int i) {
		return "�����ε�";
	}
	String add(int i, String s) { //������ �ٸ��� ���� ...
		return "�����ε�";
	}
	
	void add(Human human) {
		human.name = "ȫ�浿";
		human.age = 100;
		System.out.printf("�̸� %s, ���� %d", human.name,human.age);
	}
}

public class Ex13_Method_Overloading {

	public static void main(String[] args) {
		// println Overloading
		System.out.println();
		System.out.println("A"); // �ڵ����� parameter String ȣ��
		System.out.println('a'); // �ڵ����� parameter char ȣ��
		
		/*
		�����ε��� ���� �ʴ´ٸ� ... ����������
		System.out.println();
		System.out.printlnString("A");
		System.out.printlnChar('a');
		*/
		
		OverTest ot = new OverTest();
		
		int result = ot.add(100);
		System.out.println(result);
		result = ot.add(200,300);
		System.out.println(result);
		
	}

}
