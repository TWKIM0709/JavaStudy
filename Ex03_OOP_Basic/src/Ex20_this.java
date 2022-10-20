/*
	원칙 : 객체를 만들때 생성자는 1개만 호출 가능(new Car() or new Car(10) ... )
	
	this : 사용하면 여러개의 생성자를 호출 가능
	
	코드량도 감소
*/

class Zcar {
	String color;
	String geartype;
	int door;

	Zcar() { // default constructor
		this("red", "auto", 4); // 이런식으로 생성자를 여러개 호출 가능
//		this.color = "red";			// 반복되는 코드를 줄일 수 있다.
//		this.geartype = "auto";
//		this.door = 2;
		System.out.println("default");
	}

	Zcar(String color, String geartype, int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("Overloading");
	}

	void print() {
		System.out.println(this.color + ", " + this.geartype + ", " + this.door);
	}
}

class Zcar2 {
	String color;
	String geartype;
	int door;

	Zcar2() { // 기본옵션 ( red , 1 , auto )
		this("red", 1);
		System.out.println("default");
	}

	Zcar2(String color, int door) { // 옵션2 color, door 변경 가능
		this(color, door, "auto");
		System.out.println("Overloading Option2");
	}

	Zcar2(String color, int door, String geartype) { // 옵션3 color, door, geartype 변경 가능
		this.color = color;
		this.door = door;
		this.geartype = geartype;
		System.out.println("Overloading Option3");
	}

	void print() {
		System.out.println(this.color + ", " + this.geartype + ", " + this.door);
	}
}

public class Ex20_this {

	public static void main(String[] args) {
		Zcar zcar = new Zcar();
		zcar.print();
//		Zcar zcar2 = new Zcar("gold", "auto", 4);

		Zcar2 zcar2 = new Zcar2();
	}

}
