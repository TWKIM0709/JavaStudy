//인터페이스 설계
// ~을 할 수 있는
interface Irepairable{}
class Unit2{
	int hitpoint;
	final int MAX_HP;
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

//지상유닛, 공중유닛, 건물 등등...

//지상유닛
class GroundUnit extends Unit2{
	public GroundUnit(int hp){
		super(hp);
	}
}
//공중유닛
class AirUnit extends Unit2{
	public AirUnit(int hp) {
		super(hp);
	}
}
//건물
class CommandCenter implements Irepairable{
//	int hitpoint;
//	final int MAX_HP;
//	CommandCenter(int hp){
//		this.MAX_HP = hp;
//	}
}

//탱크
class Tank2 extends GroundUnit implements Irepairable{
	public Tank2() {
		super(200);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Tank2";
	}
}
//마린
class Marine2 extends GroundUnit{
	public Marine2() {
		super(30);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Marine2";
	}
}
//SCV	>> 광물캐기, 수리
class Scv extends GroundUnit implements Irepairable{
	public Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Scv";
	}

	//부모객체는 찾았는데... GroundUnit ... (Tank2, Marine, Scv)
	//Marine은 repair의 대상이 안됨
	//void repair(Unit2 unit) >> Tank2, Marine2, Scv ... Marine2 안됨
	//void repair(GroundUnit unit) >> Tank2, Marine2, Scv ... Marine2 안됨
	//+ 건물은 repair대상이 됨...
	//Tank2, Marine2, Scv, CommandCenter 의 연결고리가 없음 .. 진행 불가
	// >> interface로 이어주면 된다
	
	//1. void repair(Irepairable repair) >> 원하는 Object 넣을 수 있음
	//	 Irepairable 의 자식타입 ...
	// hitpoint를 건들여야되는데 자식의 자원이라 접근을 못 함
	void repair(Irepairable repairunit) {
		//Tank, Scv : Unit 타입
		//CommandCenter : 별개 타입
		// instanceof : 타입이 일치하는지 비교
		
		if(repairunit instanceof Unit2) {
			//Tank2, Scv
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP)
				unit.hitpoint = unit.MAX_HP;
//				unit.hitpoint += ((unit.MAX_HP-unit.hitpoint) > 5) ? 5 : unit.MAX_HP-unit.hitpoint;
		}else {
			//Irepairable에 있으면서 Unit2 타입이 아닌 경우
			System.out.println("다른 충전방식을 통해서 repair 제공");
		}
	}
}

public class Ex15_Interface_Poly {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		CommandCenter command = new CommandCenter();
		
		//돌림
		tank.hitpoint -= 20;
		System.out.printf("탱크 : %d\n",tank.hitpoint);
		System.out.println("Scv수리요청");
		scv.repair(tank);
		System.out.println("탱크 수리 완료 : " + tank.hitpoint);

		scv.hitpoint-=30;
		System.out.printf("scv : %d\n",scv.hitpoint);
		System.out.println("scv 수리요청");
		scv.repair(scv);
		System.out.println("scv 수리 완료 : " + scv.hitpoint);
		
		scv.repair(command);
	}

}
