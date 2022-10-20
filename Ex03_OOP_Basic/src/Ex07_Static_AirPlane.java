import kr.or.kosa.AirPlane;

public class Ex07_Static_AirPlane {

	public static void main(String[] args) {
		
		// 비행기 3대 만들고 확인하기
		AirPlane airplane1 = new AirPlane(101, "대한항공");
//		airplane1.makeAirPlane(101, "대한항공");
		airplane1.airplnePrint();
		airplane1.airPlaneTotalCount();

		AirPlane airplane2 = new AirPlane(707, "아시아나");
//		airplane2.makeAirPlane(707, "아시아나");
		airplane2.airplnePrint();
		airplane2.airPlaneTotalCount();

		AirPlane airplane3 = new AirPlane(808, "땅콩항공");
//		airplane3.makeAirPlane(808, "땅콩항공");
		airplane3.airplnePrint();
		airplane3.airPlaneTotalCount();
	}

}
