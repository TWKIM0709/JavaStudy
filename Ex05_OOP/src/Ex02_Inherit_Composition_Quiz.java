
class Animal{
	boolean alive; 
}

class Mammal extends Animal{	//������
	boolean breeding;	// ���� �ӽ� ����
}

class Elephant extends Mammal{
	int size;		//ũ��
	int nosecm;		//�ڱ���
}


class Bird extends Animal{	//����
	boolean wing;	//���� ����
}
class Penguin extends Bird{	//���
	int swimspeed;	//���� ���ǵ�
	int groupsize;	//�׷� ũ��
}

class Fish extends Animal{	//���
	String livingwater;	//��� ���� ����
}
class FlyingFish extends Fish{//��ġ
	int flyingtime;	//���� �ð�
}

public class Ex02_Inherit_Composition_Quiz {

	public static void main(String[] args) {
		System.out.println("�����Լ�");
	}
}
