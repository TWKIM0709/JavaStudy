import kr.or.kosa.AirPlane;

public class Ex07_Static_AirPlane {

	public static void main(String[] args) {
		
		// ����� 3�� ����� Ȯ���ϱ�
		AirPlane airplane1 = new AirPlane(101, "�����װ�");
//		airplane1.makeAirPlane(101, "�����װ�");
		airplane1.airplnePrint();
		airplane1.airPlaneTotalCount();

		AirPlane airplane2 = new AirPlane(707, "�ƽþƳ�");
//		airplane2.makeAirPlane(707, "�ƽþƳ�");
		airplane2.airplnePrint();
		airplane2.airPlaneTotalCount();

		AirPlane airplane3 = new AirPlane(808, "�����װ�");
//		airplane3.makeAirPlane(808, "�����װ�");
		airplane3.airplnePrint();
		airplane3.airPlaneTotalCount();
	}

}
