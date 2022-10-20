package kr.or.kosa;
/**
 * �츮 ȸ��� ����⸦ �ֹ� ���� �Ǹ��ϴ� ȸ���Դϴ�.
 * �츮 ȸ��� ����⸦ �����ϴ� ���赵�� ������� �մϴ�.
 * 
 * [�䱸����]
 * 1. ����⸦ �����ϰ� ������� [�̸�]�� [��ȣ]�� �ο��ؾ��Ѵ�.
 * 2. ����Ⱑ ����Ǹ� ������� [�̸�]�� [��ȣ]�� �°� �ο��Ǿ����� Ȯ���ϴ� �۾��� �ʿ��ϴ�. (���)
 * 3. �������� ������� ������� [������� �� ��������]�� Ȯ���� �� �ִ�. 
 * 
 * @author KOSA
 *
 */
public class AirPlane {
	private String name;				//������� �̸�
	private int number;					//������� ��ȣ
	private static int airplaneTotalCount;	//���� ���� ����
	
	// ������ 0829 �߰���
	public AirPlane( int number,String name) {
		this.name = name;
		this.number = number;
		airplaneTotalCount++;
	}
	
	// �Լ� -> �����ڷ� �ٲܿ��� >> 0829 ������ �߰���
	public void makeAirPlane(int number, String name) {
		this.number = number;
		this.name = name;
		airplaneTotalCount++;
	}
	
	//����� ���� ��¹�
	public void airplnePrint() {
		System.out.printf("������� �̸��� %s, ������� ��ȣ�� %d\n",name,number);
	}
	
	public void airPlaneTotalCount() {
		System.out.println(airplaneTotalCount + "�� �������");
	}
	
	
	
	
	
	
	
	//getter setter
	public static int getairplaneTotalCount() {
		return airplaneTotalCount;
	}

	public static void setairplaneTotalCount(int airplaneTotalCount) {
		AirPlane.airplaneTotalCount = airplaneTotalCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
