import kr.or.kosa.common.Car;

/* 
   Ŭ���� == ���赵 == ������ Ÿ��
   
   Ŭ������ ���� ��� (���赵��� �Ǵ��Ϸ��� �ּ��� ������ ������ �־�� �Ѵ�)
   
   [�ʵ� + �Լ�] + ������ �Լ�
    �ʵ�(member field) >> ������, ������ ��ƾ� �Ѵ� >> ��������, ��������, ��ǰ���� >> Filed >> Variable
    �Լ�(method) >> ���(����) >> �ڵ��� - �޸���, �����, �Ҹ��� ����
    + �߰������� ������ >> Ư���� ������ �Լ� >> ��ü�� ������� �� member field �ʱ�ȭ �������� ���
    
    Ŭ���� , �ʵ� , ������ , �Լ� : �ڱ�鸸�� ����(����)�� ���� >> ������ , ������ , ������
    >> public , private , default , protected
    
    >> kr.or.kosa.common �ȿ� Car Ŭ���� ���� >> public class Car{} >> ���¸��ε�?
     
    >> kr.or.kosa.common �ȿ� AirPlane Ŭ���� ���� >> (������ ����) class AirPlane >> default class
    	>> default�� �ǹ� : [���� package �ȿ����� ����] [�ٸ� package������ ���� �Ұ�]
    	>> default ������ : ���� package ������ ���� ���������� ��� ... �ǹ������� �Ⱦ� ...
    	
    �ϳ��� �������� java ������ �������� Ŭ������ ���� �� �ִ�.
    >> Ex01_Main.java ������ Ex01_Main�̶�� Ŭ������ �ϳ� ������ �ִ�
    >> Ŭ������ �߰��� �ʿ��ϴ�
    >> �Ϲ������δ� �ʿ��� Ŭ������ ������ ���Ϸ� �����ؼ� ����Ѵ� ... Apt.java
    >>
    >> �׳� �������̸� ... ���� ���������� ������ ���� �ʿ䰡 �ֳ�? >> �����ҋ��� ������ ���� �ص� ��� ����
    >>
    >> �ϳ��� ������ ������ �������� Ŭ������ ���� �� ������ ... public�� �ϳ��� Ŭ������ ���� �� �ִ�(��ǥ) 
*/

class Emp{		// �����ϰų� �ǽ��Ҷ� �ٷ� Ȯ�� ���� ...
	
}
class Test{			 	 // �Ϲ������� �����Ϸ��� default class Test �� �ؼ�
	int data;			 // instance variable >> ������ ���� >> �����Ϸ��� default int data �� �ؼ�
	public int p_data; 	 // class Test�� �����ڰ� default >> public�� �ǹ̰� ����
	private int pri_data;// private ���ߴ� , ����� , ĸ��ȭ(����ȭ)
}

public class Ex01_Main {
	
	public static void main(String[] args) {
		Car car = new Car();
		
		//AirPlane air = new AirPlane();	Ŭ������ ���ٰ� �ؼ� ... package�� �޶� ������ ����
		
		Apt apt = new Apt();
		
		Test t = new Test();
		//t.pri_data ������ �־� ���� ���Ұ�
	}
}














