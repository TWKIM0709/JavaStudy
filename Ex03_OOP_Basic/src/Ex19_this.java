/*
	= this =
	1. 객체 자신을 가르키는 this ( 앞으로 생성될 객체의 주소를 담을 곳이라고 가정)
	   인스턴스 자신을 가르키는 참조 변수. 인스턴스의 주소가 저장되어있음
	   모든 인스턴스 메소드에 지역변수로 숨겨진 채로 존재
	   
	2. this 객체 자신의 주소(생성자 호출) >> '원칙적으로 생성자 객체 생성시 한개'만 호출 가능
	   >> this를 사용하면 예외적으로 this를 통해서 '여러개의 생성자'를 호출할 수 있다.

*/

class Test1{
	int i;
	int j;
	Test1(){  //생성자
		
	}
	Test1(int i, int j){		//Test dd
		this.i = i;
		this.j = j;
	}
}

class Socar{
	String color;
	String geartype;
	int door;
	
	Socar(){	//기본 설정
		this.color = "black";	//member field 사용시 this를 쓰자
		this.geartype = "auto";
		this.door = 2;
	}
	Socar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	void print() {
		System.out.printf("%s, %s, %d\n",this.color, this.geartype, this.door);
	}
}

class Book2{
	String bookname;
	Book2(String bookname){
		this.bookname = bookname;
	}
}

public class Ex19_this {

	public static void main(String[] args) {
		Test1 t = new Test1(100, 200);
		
		Socar sc = new Socar();
		sc.print();
		
		Socar sc2 = new Socar("red", "auto", 4);
		sc2.print();
	}

}
