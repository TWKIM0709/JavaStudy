/*
	오버로딩 	: 하나의 이름으로 여러가지 기능
			::파라미터의 타입과 개수, 순서를 달리해서
			
	Today Point
	[상속관계]에서 override : 상속관계에서 자식이 부모의 함수를 [재정의] 하는 것
	[상속관계]에서 [자식 클래스]가 [부모 클래스]의 method를 [재정의] 하는 것 (내용을 바꾸는 것)
	재정의 : 틀의 변화는 없고 (함수의 이름, 타입 등 변화 X) 내용을 바꾸는 것 {중괄호 블럭 내부 변경}
	
	 문법)
	 1. 부모 함수와 이름이 동일				
	 2. 부모 함수와 parameter 동일
	 3. 부모 함수와 return type 동일		//이 셋을 건들면 [override]가 아닌 [overloading]이다.
	 4. { 실행블럭 안에 코드를 변경하는 것 }을 오버라이딩이라 한다.
	 
	 override시 오타가 나도 문제가 없다 >> 그냥 다른 함수가 되는 것 뿐
	 Annotation >> Java code만으로 전달할 수 없는 부가적인 정보를 컴파일러나 개발툴로 전달할 수 있다.
	  			>> @Override 컴파일러나 개발툴에게 '지금 이 함수가 재정의 되었는지 검증해봐라'라고 전달한다.
	  			
	 Spring은 70%가 Annotation
	 장점 : 조금만 짜도 대충 다 만들어짐
	 단점 : 개념에 대해 이해하지 못한 상태면 할 수 있는게 없음
*/

class Point2{
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + "/" + this.y;
	}
}
class Point3D extends Point2{
	int z = 6;
	@Override
	String getPosition() {
		return this.x + "," + this.y + "," + this.z;
	}
}
public class Ex04_Inherit_Override {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		System.out.println(p.getPosition());
	}

}
