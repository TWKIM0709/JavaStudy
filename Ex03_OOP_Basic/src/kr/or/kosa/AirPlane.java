package kr.or.kosa;
/**
 * 우리 회사는 비행기를 주문 제작 판매하는 회사입니다.
 * 우리 회사는 비행기를 생산하는 설계도를 만들려고 합니다.
 * 
 * [요구사항]
 * 1. 비행기를 생산하고 비행기의 [이름]과 [번호]를 부여해야한다.
 * 2. 비행기가 생산되면 비행기의 [이름]과 [번호]가 맞게 부여되었는지 확인하는 작업이 필요하다. (출력)
 * 3. 공장장은 현재까지 만들어진 [비행기의 총 누적개수]를 확인할 수 있다. 
 * 
 * @author KOSA
 *
 */
public class AirPlane {
	private String name;				//비행기의 이름
	private int number;					//비행기의 번호
	private static int airplaneTotalCount;	//생상 누적 개수
	
	// 생성자 0829 추가됨
	public AirPlane( int number,String name) {
		this.name = name;
		this.number = number;
		airplaneTotalCount++;
	}
	
	// 함수 -> 생성자로 바꿀예정 >> 0829 생성자 추가함
	public void makeAirPlane(int number, String name) {
		this.number = number;
		this.name = name;
		airplaneTotalCount++;
	}
	
	//비행기 정보 출력문
	public void airplnePrint() {
		System.out.printf("비행기의 이름은 %s, 비행기의 번호는 %d\n",name,number);
	}
	
	public void airPlaneTotalCount() {
		System.out.println(airplaneTotalCount + "대 만들어짐");
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
