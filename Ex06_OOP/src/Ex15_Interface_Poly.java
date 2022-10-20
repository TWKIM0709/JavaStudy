//�������̽� ����
// ~�� �� �� �ִ�
interface Irepairable{}
class Unit2{
	int hitpoint;
	final int MAX_HP;
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

//��������, ��������, �ǹ� ���...

//��������
class GroundUnit extends Unit2{
	public GroundUnit(int hp){
		super(hp);
	}
}
//��������
class AirUnit extends Unit2{
	public AirUnit(int hp) {
		super(hp);
	}
}
//�ǹ�
class CommandCenter implements Irepairable{
//	int hitpoint;
//	final int MAX_HP;
//	CommandCenter(int hp){
//		this.MAX_HP = hp;
//	}
}

//��ũ
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
//����
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
//SCV	>> ����ĳ��, ����
class Scv extends GroundUnit implements Irepairable{
	public Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Scv";
	}

	//�θ�ü�� ã�Ҵµ�... GroundUnit ... (Tank2, Marine, Scv)
	//Marine�� repair�� ����� �ȵ�
	//void repair(Unit2 unit) >> Tank2, Marine2, Scv ... Marine2 �ȵ�
	//void repair(GroundUnit unit) >> Tank2, Marine2, Scv ... Marine2 �ȵ�
	//+ �ǹ��� repair����� ��...
	//Tank2, Marine2, Scv, CommandCenter �� ������� ���� .. ���� �Ұ�
	// >> interface�� �̾��ָ� �ȴ�
	
	//1. void repair(Irepairable repair) >> ���ϴ� Object ���� �� ����
	//	 Irepairable �� �ڽ�Ÿ�� ...
	// hitpoint�� �ǵ鿩�ߵǴµ� �ڽ��� �ڿ��̶� ������ �� ��
	void repair(Irepairable repairunit) {
		//Tank, Scv : Unit Ÿ��
		//CommandCenter : ���� Ÿ��
		// instanceof : Ÿ���� ��ġ�ϴ��� ��
		
		if(repairunit instanceof Unit2) {
			//Tank2, Scv
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP)
				unit.hitpoint = unit.MAX_HP;
//				unit.hitpoint += ((unit.MAX_HP-unit.hitpoint) > 5) ? 5 : unit.MAX_HP-unit.hitpoint;
		}else {
			//Irepairable�� �����鼭 Unit2 Ÿ���� �ƴ� ���
			System.out.println("�ٸ� ��������� ���ؼ� repair ����");
		}
	}
}

public class Ex15_Interface_Poly {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		CommandCenter command = new CommandCenter();
		
		//����
		tank.hitpoint -= 20;
		System.out.printf("��ũ : %d\n",tank.hitpoint);
		System.out.println("Scv������û");
		scv.repair(tank);
		System.out.println("��ũ ���� �Ϸ� : " + tank.hitpoint);

		scv.hitpoint-=30;
		System.out.printf("scv : %d\n",scv.hitpoint);
		System.out.println("scv ������û");
		scv.repair(scv);
		System.out.println("scv ���� �Ϸ� : " + scv.hitpoint);
		
		scv.repair(command);
	}

}
