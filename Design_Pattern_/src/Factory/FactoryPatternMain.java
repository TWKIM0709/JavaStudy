package Factory;

public class FactoryPatternMain {

	public static void main(String[] args) {
		
		//팩토리 패턴 객체 - 객체 생성을 대신해주는 역할을 한다.
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//리턴 타입을 입력받아 리턴해주는 getShape() 함수
		//(다형성) 부모타입에 자식타입 넣음 >> (Shape)shape1에 Circle 타입 담음
		//부모타입리턴함수에 자식타입을 담아 리턴해줌 >> public Shape...함수에서 Circle 타입 리턴
		
		Shape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("square");
		shape3.draw();
	}

}
