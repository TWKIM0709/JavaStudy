package Factory;

public  class ShapeFactory {
	public Shape getShape(String shapeType) {
		//팩토리 패턴의 공장
		//객체 타입을 입력받고 해당 객체를 생성해 return 해준다.
		//부모타입(Shape)을 상속 받는 자식타입 return ( 다형성 사용 )
		if(shapeType == null) return null;
		
		if(shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
		else if(shapeType.equalsIgnoreCase("SQUARE")) return new Square();
		
		return null;
	}
}
