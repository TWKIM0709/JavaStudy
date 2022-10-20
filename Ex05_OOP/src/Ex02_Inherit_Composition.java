/*
	실무(현업) 환경
	한개의 클래스만 설계(사용)하는 경우 >> 절대 없음
	
	설계도 1장으로 모든 업무 구현 >> 현실적으로 불가능
	여러개로 나눈다... 기준, 관계 등에서 문제 발생
	
	ex)
	쇼핑몰 : 결재관리, 배송관리, 판매처, 회원관리, 상품관리 등등등..... >> 각각의 업무에 대해 별도의 설계도
	****기준****
	여러개의 설계도를 관계 ... 이어주는 기준
	
	- 관계 -
	1. 상속(is ~ a) 	>> '~은 ~이다'가 문제가 없으면 ('자식'은 '부모'이다)
	2. 포함(has ~ a)	>> '~은 ~을 가지고 있다'
	
	ex)
	is ~ a
	'원'은 '도형'이다 >> 원 extends 도형
	'삼각형'은 '도형'이다 >> 삼각형 extends 도형
	
	has ~ a
	[원]과 [점] 
	'원'은 '점'이다 (X)
	'원'은 '점'을 가지고 있다 (O)
	>> class 원 { [변수] '점 } >> member field
	
	경찰과 권총
	'경찰'은 '권총'이다 (X)
	'경찰'은 '권총'을 가지고 있다 (O)
	>> class 권총 { ... }
	>> class 경찰 { 권총 member filed }
	
	
	원은 도형이다
	삼각형은 도형이다
	사각형은 도형이다
	
	도형은 분모 공통자원( 공통적인 내용이 있어야 ) : 추상화, 일반화
	원은 본인만의 특징 : 구체화 , 특수화 
	
	점 : 좌표값(x,y)
	원은 점을 가지고 있다.
	삼각형은 점을 가지고 있다.
	사각형은 점을 가지고 있다.
	>> has ~ a >> 부품자원
	
	class Shape{ 그리다, 색상 } >> 상속관계에서 부모(원, 삼각형, 사각형의)
	class Point{ 좌표값 } >> 포함관계 (부품)
	
	구체화, 특수화 된 Circle , Triangle
*/

// 추상화, 일반화, 공통자원
class Shape{
	String color = "gold";
	void draw() {
		System.out.println("도형을 그린다");
	}
}

class Point{
	int x;
	int y;
	
	public Point() {
		this(1,1);	// 생성자를 호출하는 this
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

//원을 만드세요 (정의 : 원은 한 점과 반지름을 가지고 있다)
//1. 원은 도형이다. (is ~ a) : Shape를 상속
//2. 원은 점을 가지고 있다 (has ~ a) : Point를 member field로 가지고 있다.
//3. 원의 특수(구체)성 : 원은 반지름을 가지고 있다 (r)

//추가 요구사항
//1. 원의 반지름은 초기값 10을 가진다
//2. 점의 좌표는 초기값 (10,15)를 가진다
//3. 반지름과 점의 값을 입력받을 수 있다. (원이 만들어질때) 
class Circle extends Shape{ // 상속
	Point point;			// 포함(부품정보)
	int r;					// 특수성
	
	public Circle() {
		this(10,new Point(10,15));
	}
	public Circle(int r, Point point) {
		this.r = r;
		this.point = point;
	}
}

//문제2)
/*
 * 삼각형 클래스 생성
 * 삼각형은 3개의 점과 색상과 그리다 기능을 가지고 있다
 * 
 */

class Triangle extends Shape{
	Point[] point;
	
	public Triangle() {
		this(new Point[] {new Point(10,10),new Point(20,20), new Point(10,30)});
	}
	public Triangle(Point[] point) {
		this.point = point;
	}
	
	//구체화 , 특수화 >> 추가기능 >> 출력
	void trianglePoint(){
		int i = 0;
		for(Point p : point)System.out.printf("point[%d] : (%d,%d)\t",i++,p.x,p.y);
		System.out.println();
	}
	
}


public class Ex02_Inherit_Composition {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.r);
		System.out.println(c.color);	//상속자원
		System.out.println(c.point.x);
		System.out.println(c.point.y);
		c.draw();						//상속자원
		
		//반지름, 점 값을 입력
		Circle c2 = new Circle(20,new Point(100,200));
		System.out.println(c2.r);
		System.out.println(c2.color);	//상속자원
		System.out.println(c2.point.x);
		System.out.println(c2.point.y);
		c2.draw();
		
		Triangle tri = new Triangle();
		tri.trianglePoint();
		
		Triangle tri2 = new Triangle(new Point[] {new Point(1,2),new Point(3,4),new Point(5,6)});
		tri2.trianglePoint();
	}

}










