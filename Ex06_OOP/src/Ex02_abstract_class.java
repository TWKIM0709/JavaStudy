/*
	���� : ����
	
	���� ������� : �̵���ǥ, �̵�, �����... : �߻�ȭ, �Ϲ�ȭ
	���� �̵���� : ����, �޸���, ��������... : �̷��� �߻�abstract�� ����Ѵ�
	abstract class Unit{... abstract void move(); }
	
	instanceof ������
	� ��ü�� ��� Ŭ������ �ν��Ͻ����� Ȯ�� >> ���� ������
	[��ü instanceof Ÿ��] ���·� ���
*/

abstract class Unit{
	int x,y;
	void stop() {
		System.out.println("�����");
	}
	abstract void move(int x, int y);
}

class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank �Ҹ����� �̵� " + this.x + ", " + this.y);
	}
	//�ʿ��ϴٸ� Tank���� ��üȭ, Ư��ȭ �� ���� ����
	//...
	void changeMove() {
		System.out.println("��ũ��� ��ȯ");
	}
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine �޷��� �̵� " + this.x + ", " + this.y);
	}
	void stimpack() {
		System.out.println("������ ���");
	}
}

class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip ���Ƽ� �̵� " + this.x + ", " + this.y);
	}
	void load() {
		System.out.println("Unit load");
	}
	void unload() {
		System.out.println("Unit unload");
	}
}

public class Ex02_abstract_class {

	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.move(500,200);
		tank.stop();
		tank.changeMove();
		
		Marine marine = new Marine();
		marine.move(200, 300);
		marine.stop();
		marine.stimpack();
		
		DropShip dropship = new DropShip();
		dropship.move(700, 300);
		dropship.stop();
		dropship.load();
		dropship.unload();
		
		// ��ũ 3�븦 ����� ���� ��ǥ�� �̵�(600,800)
		Tank[] tanks = {new Tank(), new Tank(), new Tank()};
		for(Tank value : tanks) value.move(600, 800);
		
		// ��ũ, ����, ��ӽ� �� �����ϰ� ���� ��ǥ�� �̵�(666,888)
		Unit[] units = {new Tank(), new Marine(), new DropShip()};
		for(Unit value : units) value.move(666,888);
		
		//instanceof	��ü�� Ÿ���� Ȯ���ϴ� instanceof
		if(tank instanceof Unit) System.out.println("true");	// tank�� UnitŸ������ Ȯ���Ѵ�
		else System.out.println("false");						// tank�� Ÿ�� Tank�� Unit�� ��ӹ޾ұ� ������ true
	}

}








