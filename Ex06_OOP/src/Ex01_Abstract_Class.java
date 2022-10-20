/*
	�߻�Ŭ����
	>> �̿ϼ� Ŭ����(���赵)
	1. �ϼ��� �ڵ� + �̿ϼ� �ڵ�
	2. �ϼ�(�Լ�) ������� �ִ� �Լ� + �̿ϼ�(�Լ�) ������� ���� �Լ� >> public void run() ����;
	�����Լ�) public void run(){�����}
	3. �ϼ��� Ŭ���� (new ����) <==> �̿ϼ� Ŭ����(������ ��ü ���� �Ұ�)
	
	������ ���忡��..
	>> �ݵ�� �������ض� >> ������ ������ ��������(�� �Ͼ) ����(������)�� ����
*/

class Car{
	//������ �ȿ� ���� ��� {������� ������} �ϼ��� �ڵ��
	void run() {
		
	}
}
class Hcar extends Car{
	
}
//Car >> run�� �������ϰ� ����� �ʹ� >> �������� ������ ���û���
//�� �ڵ�� [������]�� ����

abstract class Abclass{	// Ŭ���� �ȿ� �ּ� 1�� �̻��� �߻��Լ�(�̿ϼ��Լ�)�� ������ �ִ� Ŭ����
	//�ϼ��� �ڵ�
	int pos;
	void run() {
		pos++;
	}
	
	//�̿ϼ� �ڵ� (�̿ϼ� �Լ� : �߻��Լ�)
	abstract void stop();	// �������� ���� >> �����Ǹ� ����
}

class Child extends Abclass{

	@Override
	void stop() {
		this.pos = 0;
		System.out.println("stop : " + this.pos);
	}
}

class Child2 extends Abclass{

	@Override
	void stop() {
		this.pos = -1;
		System.out.println("stop : " + this.pos);
	}
}

public class Ex01_Abstract_Class {

	public static void main(String[] args) {
		Child ch1 = new Child();
		Child2 ch2 = new Child2();
		
		ch1.run();ch1.run();ch1.run();
		ch1.stop();

		ch2.run();ch2.run();ch2.run();
		ch2.stop();
		////////////////////////////////////////
		Abclass ab = ch1;
		//��� ���迡�� �θ�Ÿ���� ���������� �ڽ�Ÿ�԰�ü���� �ּҸ� ���� �� �ִ�. (������)
		//�θ�� �ڽ��� �ڿ��� �� �� �ִ�.
		//�����ǰ� �� �ڿ��� �� �� �ִ�.
		ab.run();
		ab.stop();
	}

}







