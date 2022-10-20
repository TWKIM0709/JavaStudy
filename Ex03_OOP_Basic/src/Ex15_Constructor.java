/*
	������ �Լ�(Constructor)
	1. �Լ�(Ư���� ����)
	2. ���� >> member field �ʱ�ȭ >> �ʱ��� ���� ���� ��ħ >> �����ڸ� ���̾���
	3. �Ϲ��Լ��� �ٸ� ��
	3.1 �Լ��� �̸��� ����(class �̸��� ����)
	3.2 return Ÿ���� ���� (��ü ������ ���ÿ� ȣ�� >> return ���� ����� ����.
	3.4. ������� >> new ��ü ���� >> heap ���� ���� >> member field �ö� >> �ڵ����� ������ �Լ� ȣ��
	3.5. return type (X) >> void >> [public] [void(����)] [Ŭ���� �̸�] >> public [Ŭ�����̸�](...) { ... }
	
	4. why >> �����Ǵ� '��ü����' '����������' member field ���� �ʱ�ȭ�ϱ� ����
	
	ex)
	class Car{	String color;	}
	
	A) ������ �Ķ��� ���� ����Ŵ� ... ó������ �Ķ������� �������ּ���
	class Car{ 	String color = "blue";	}
	
	B) �˾Ƽ� �ϰڴ�.
	class Car{	String color;	}
	Car car = new Car();
	car.color = "gold";
	
	����) ���� ���� ������ ���ϸ� >> null ����..(?)���� ���
	
	>> ������ ���� �� ������ ������ �Է��ϰ� �� �� �ִ� ��� ...
	>> �Լ� ... {�ʱ��ں�} ... �������� ����, �Է°��� ���� �� ����.
	
	5. ������ �Լ�(... overloading ���밡��)
	
 	6. ������ �����ε��� ���� �پ��� ���������� ���� ***
 	
 ******�����ڸ� ���� ���� �߿��� ������ ������ �ʱ�ȭ(member field)
*/

class Car{
	String carname = "����";
	// ����� ���� Car ���赵�� ���� ��.... ��� �����ڵ� ������ �ʴ´ٸ�
	// �����Ϸ��� �˾Ƽ� 'default ������ �Լ�'�� �����Ѵ�.
	// public Car() { } �ڵ� ����
	
	// �����ڰ� ���� �����Ѵٸ�
	public Car() {
		System.out.println("�⺻������ Car(){}  ȣ��");
		carname = "������";
	}
}

class Car4{
	String carname;
	// default constructor �� �����Ǿ� �ִ�.
}
class Car2{
	String carname;
	public Car2() {		//default constructor �ʱ�ȭ
		carname = "����";
	}
}

class Car3{			// �����ǵ� : �⺻ �ڵ��� �̸����� �ᵵ �ǰ� .. ���ϸ� �̸� �־ �����ص� �ȴ�.
	String carname;
	
	public Car3() {				//default constructor �� carname ������ ������ '�⺻�̸�'���� �ʱ�ȭ
		carname = "�⺻�̸�";
	}
	
	public Car3(String carname) {	// Point ************** ������ Overloading���� carname�� �޾� �ʱ�ȭ
		this.carname = carname;
	}
}

// '������' �̸��� �־�� ���� �� �ְ� �ϰ� ���� ��
class Car5{			// �����ǵ� : �⺻ �ڵ��� �̸����� �ᵵ �ǰ� .. ���ϸ� �̸� �־ �����ص� �ȴ�.
	String carname;
	public Car5(String carname) {	// Point ************** ������ Overloading���� carname�� �޾� �ʱ�ȭ
		this.carname = carname;
	}
}

// �� �ڵ�� default constructor�� �������� �ʾҴ�.	>> �������� �ʾƵ� �����Ϸ��� �ڵ� �������� �ʳ�??
// ���������� ... �����ڰ� Overloading�� �����ڸ� '�Ѱ��� ����ٸ�' �����Ϸ��� default constructor�� �ڵ� �������� �ʴ´�.


public class Ex15_Constructor {

	public static void main(String[] args) {
		Car car = new Car();	// new Car() ��ȣ : �Լ��� ��ȣ // defalut constructor

		System.out.println(car.carname);
		
		Car3 car3 = new Car3();
		System.out.println(car3.carname);
		
		Car3 car4 = new Car3("����");
		System.out.println(car4.carname);
	}

}






