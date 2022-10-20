package Template;

// 템플릿 메소드 패턴
// 추상 클래스를 통해서 메소드에 알고리즘의 골격을 정의해 사용하는 패턴이다.
// 소스코드의 중복을 줄이기 위해 하위클래스에서 빈번하고 공통적으로 나타나는 부분을 별도의 추상클래스를 정의해 사용하는 것이 핵심
// 추상 클래스 사용으로 상황에 맞게 확장 또는 변경을 해야 할 경우 유용

public abstract class HouseTemplate {
	
	//final 선언으로 override 방지
	//집 짓기 메소드
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}
	
	//기본으로 구현
	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}
	
	//서브클래스에서 직접 구현할 메소드
	public abstract void buildWalls();
	public abstract void buildPillars();
	
	private void buildFoundation() {
		System.out.println("Building foundation with cement, iron rods and snad");
	}
}
