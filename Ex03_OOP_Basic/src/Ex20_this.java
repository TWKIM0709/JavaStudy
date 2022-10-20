/*
	��Ģ : ��ü�� ���鶧 �����ڴ� 1���� ȣ�� ����(new Car() or new Car(10) ... )
	
	this : ����ϸ� �������� �����ڸ� ȣ�� ����
	
	�ڵ差�� ����
*/

class Zcar {
	String color;
	String geartype;
	int door;

	Zcar() { // default constructor
		this("red", "auto", 4); // �̷������� �����ڸ� ������ ȣ�� ����
//		this.color = "red";			// �ݺ��Ǵ� �ڵ带 ���� �� �ִ�.
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

	Zcar2() { // �⺻�ɼ� ( red , 1 , auto )
		this("red", 1);
		System.out.println("default");
	}

	Zcar2(String color, int door) { // �ɼ�2 color, door ���� ����
		this(color, door, "auto");
		System.out.println("Overloading Option2");
	}

	Zcar2(String color, int door, String geartype) { // �ɼ�3 color, door, geartype ���� ����
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
