package kr.or.kosa;

// ��Ģ������ >> �ǹ�ó��
// 1. ĸ��ȭ	(member field)
// 2. 		( ������ ó�� : getter setter )

public class Car {
	private int window;
	private int speed;
	
	// �ʿ信 ����
	// setter�� ����		: ���⸸
	// getter�� ����		: �б⸸
	// getter setter ����: �б�, ���� �� ��
	
	// getter �Լ�
	public int getWindow() {
		return window;
	}
	// setter �Լ�
	public void setWindow(int data) {
		window = data;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// ����
   /** 1. �� ��� IDE >> ��Ŭ�� >> source >> Generate getter and setter
	// 2. �Һ�(Lombok) >> Java ���̺귯���� �ݺ��Ǵ� getter, setter, toString .. ���� 
	//					 �ݺ� �޼��� �ۼ� �ڵ带 �ٿ��ִ� �ڵ� ���̾�Ʈ ���̺귯�� �̴�.*/
	// 	@Getter
	// 	@Setter 
	// 	�����Ϸ����� �ڵ����� getter,setter �� �����޶� ��û ...
	
	// 	�̷� �����͸� ���� �� �ִ� Ŭ������ ( VO, DTO , DOMAIN ) ValueObject, DataTransformObject, Domain ��� �θ���
	// 	>> MVC ���� >> Ʋ�� ������ �ִ�?
	
	/** 3. �ʿ��ϴٸ� ������ �Լ��� ����*/
	// ex) speed�� 10�� �ø��ų� �����ϴ� ����� ���弼��
	// �Ϲ������δ� �Ʒ�ó�� ������ �Լ��� ����� ���ٴ� read, write�� �Ѵٸ� setter�� getter�� ���� �����Ѵ�.
	public void speedUp() {
		speed+=10;
	}
	public void speedDown() {
		if(speed>0) {
			speed-=10;
		}else {
			speed = 0;
		}
	}
}



















