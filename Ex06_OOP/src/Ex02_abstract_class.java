/*
	게임 : 유닛
	
	유닛 공통사항 : 이동좌표, 이동, 멈춘다... : 추상화, 일반화
	유닛 이동방법 : 난다, 달린다, 굴러간다... : 이럴때 추상abstract을 사용한다
	abstract class Unit{... abstract void move(); }
	
	instanceof 연산자
	어떤 객체가 어느 클래스의 인스턴스인지 확인 >> 오류 방지용
	[객체 instanceof 타입] 형태로 사용
*/

abstract class Unit{
	int x,y;
	void stop() {
		System.out.println("멈춘다");
	}
	abstract void move(int x, int y);
}

class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank 소리내며 이동 " + this.x + ", " + this.y);
	}
	//필요하다면 Tank만의 구체화, 특수화 된 내용 구현
	//...
	void changeMove() {
		System.out.println("탱크모드 변환");
	}
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine 달려서 이동 " + this.x + ", " + this.y);
	}
	void stimpack() {
		System.out.println("스팀팩 기능");
	}
}

class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip 날아서 이동 " + this.x + ", " + this.y);
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
		
		// 탱크 3대를 만들고 같은 좌표로 이동(600,800)
		Tank[] tanks = {new Tank(), new Tank(), new Tank()};
		for(Tank value : tanks) value.move(600, 800);
		
		// 탱크, 마린, 드롭쉽 을 생성하고 같은 좌표로 이동(666,888)
		Unit[] units = {new Tank(), new Marine(), new DropShip()};
		for(Unit value : units) value.move(666,888);
		
		//instanceof	객체의 타입을 확인하는 instanceof
		if(tank instanceof Unit) System.out.println("true");	// tank가 Unit타입인지 확인한다
		else System.out.println("false");						// tank의 타입 Tank는 Unit을 상속받았기 때문에 true
	}

}








