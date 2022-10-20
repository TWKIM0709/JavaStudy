package kr.or.kosa;

//인터페이스는 초식동물, 육식동물 구분에 사용한다. ( 단순 구분용 인터페이스 )
//육식동물용 인터페이스
interface Icarnivore{}
//초식동물용 인터페이스
interface Iherbivore{}

// 추상클래스 Aniaml - 동물들이 공통적으로 가지고 있는 age, color, 숨쉬기 기능을 가지고 있고
//					 move() 함수를 추상함수로 둬 재정의를 강제한다.
abstract class Animal{
	int age;
	String color;
	Animal(int age, String color){
		this.age = age;
		this.color = color;
	}
	void breath(){
		System.out.println("숨쉬는 중");
	}
	//움직임 기능 >> 동물마다 다름 >> 추상함수로 재정의 강제
	abstract void move();
}

// Animal 클래스를 상속받고 Iherbivore 인터페이스를 받는 Rabbit
//Iherbivore 인터페이스를 받아 초식동물로 구분 가능
class Rabbit extends Animal implements Iherbivore{
	public Rabbit(int age, String color){
		super(age,color);	//super를 사용해 Animal의 생성자 호출
	}
	@Override	
	void move() {	//추상클래스에서 추상함수로 받은 move() override
		System.out.println("토끼는 깡총깡총 이동");
	}
	@Override	// 동물의 이름 표현 ( toString 재정의 )
	public String toString() {
		return "토끼";
	}
}

//Animal 클래스를 상속받고 Icarnivore 인터페이스를 받는 Lion
//Icarnivore 인터페이스를 받아 육식동물로 구분 가능 ( Rabbit 초식인터페이스 || Lion,Dove 육식인터페이스 받음)
//Lion, Dove 클래스의 나머지 부분은 Rabbit 클래스와 같아 생략...
class Lion extends Animal implements Icarnivore{
	public Lion(int age, String color){
		super(age,color);
	}
	@Override
	void move() {
		System.out.println("사자는 어슬렁어슬렁 이동");
	}
	@Override
	public String toString() {
		return "사자";
	}
}
class Dove extends Animal implements Iherbivore{
	public Dove(int age, String color){
		super(age,color);
	}
	@Override
	void move() {
		System.out.println("비둘기는 날아서 이동");
	}
	@Override
	public String toString() {
		return "비둘기";
	}
}


//사육사 클래스
class Zookeeper{
	String name;
	public Zookeeper(String name) {
		this.name = name;
	}
	// 동물을 부르는 기능
	// Animal(부모) 타입을 파라미터로해서 Rabbit, Lion, Dove 모두 받을 수 있게 처리
	void call(Animal a) {
		System.out.println(a.color + a + " 부름");
	}
	//동물에게 밥을 주는 기능
	// Animal(부모) 타입을 파라미터로해서 Rabbit, Lion, Dove 모두 받을 수 있게 처리
	// instanceof로 인터페이스 타입을 비교해 초식동물, 육식동물 구분 후 다른 밥을 줌
	void feeding(Animal a) {		
		if(a instanceof Icarnivore) {	// 타입비교 ( 육식이라면 )
			System.out.println(a.color + a + "고기주기");
		}
		else if(a instanceof Iherbivore) {// 타입비교 ( 초식이라면 )
			System.out.println(a.color + a + "채소주기");
		}
		else {// 육식도 초식도 아니면
			System.out.println("육식 또는 초식 동물이 아닙니다.");
		}
	}
}

public class Zoo {

	public static void main(String[] args) {
		Lion l = new Lion(10, "흰색");
		Rabbit r = new Rabbit(3, "갈색");
		Dove d = new Dove(1, "회색");
		d.move();
		r.move();
		
		Zookeeper z = new Zookeeper("홍길동");
		z.feeding(l);
		z.feeding(r);
		
		z.call(d);
	}

}
