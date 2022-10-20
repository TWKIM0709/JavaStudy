/*
	OOP(��ü������)�� Ư¡ ( �������� ����(Ŭ����)���� �����ؼ� �ϳ��� ū ��ǰ�� ����� ���� )
	1. ���
	2. ĸ��ȭ (����ȭ) >> private
	3. ������ (��Ӱ��迡�� �θ� Ÿ���� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�.)

	= ��� =
	java : [child] 'extends' [Base]
	c#	 : [child] : [Base]
	
	Ư¡
	1. ���߻���� �Ұ���
	2. ���ϻ�Ӹ� ���� >> �������� ��� �޴� ��� >> ������ ��Ӱ���
	3. ���߻�� ����� ��� >> Interface (���� �ȹ��)
	
	���
	1. ������ �ǹ� : ���뼺
	2. ���� : �ʱ� ���� ���(��, �ð�)�� ���̵��
	3. ���뼺 >> ���� >> �ð��� (�������� ���赵 ���� ... �θ� , �ڽ� ... �Ҿƹ���... )
	4. ��� ���迡���� �θ� Ŭ�������� �޸𸮿� �ö󰣴� ... �θ� >> �ڽ� >> �ڽ��� �ڽ�
		GrandFather >> Father >> Child	: heap �޸𸮿� 3��ü
	5. �����(������)�� ����� ��� Ŭ���� >> default�� Object Ŭ������ ���
		>> �ֻ��� Ŭ������ Object ��� ( ���߻�� �ȵ� >> ��� Ŭ������ Object�� ���� ����ϴ°� �ƴϴ�)
		>> class Car extends Object { ... }
		Object : ��� Ŭ������ root(�ֻ���) >> ��� Ŭ������ �θ�
	6. private : ��Ӱ��迩�� ������ �� �����Ѵ�
*/

class Car{	//extends Object
	
}

class GrandFater extends Object{	
	public int gmoney = 5000;
	private int pmoney = 10000;
	public GrandFater() {
		System.out.println("GrandFater");
	}
}

class Fater extends GrandFater{
	public int fmoney = 3000;
	public Fater() {
		System.out.println("Fater");
	}
}

class Child extends Fater{
	public int cmoney = 1000;
	public Child(){
		System.out.println("Child");
	}
}

public class Ex01_Inherit {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
		
		Car car = new Car();
	}

}











