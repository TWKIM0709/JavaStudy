
//클래스 == 타입 == 설계도

class Person{
	String name;
	int age;
	//사람을 만들때 반드시 이름, 나이를 가지게
//	Person(String name, int age){
//		this.name = name;
//		this.age = age;
//	}
	void print() {
		System.out.println(this.name + ", " + this.age);
	}
}

public class Ex05_Array_Object {

	public static void main(String[] args) {
		int[] intarr = new int[10];		//값타입 배열
		boolean[] boo = new boolean[5];	//값타입 배열
		
		Person p = new Person();	// p : 참조변수 (주소값)
		Person[] persons = new Person[3];
		
		System.out.println("persons : " + persons);
		System.out.println("persons[0] : " + persons[0]);
		
		//객체 배열은 방을 만들고 방에 객체를 넣어주는 작업을 해야한다.
		//persons[0] 은 Person객체의 주소를 가진다
		persons[0] = new Person();
		persons[1] = p;
		persons[2] = new Person();
		
		persons[0].name = "홍길동";
		persons[0].age = 100;
		
		for(Person ps : persons) {
			System.out.println(ps.name);
		}
		
		//객체 배열 3가지 방법으로 만들기
		//1. int[] arr = new int[10];
		Person[] parr = new Person[10];	// 방만 생성
		for(Person value : parr) {		// 객체는 따로 만듬
			value = new Person();
			System.out.printf("주소값 : %s\n", value);
		}
		
		//2. int arr = new int[]{1,2,5,34,7};
		Person[] parr2 = new Person[] {new Person(), new Person(), new Person()};
		
		//3. int arr = {1, 5, 3, 7, 8};
		Person[] parr3 = {new Person(), new Person(), new Person()};
		
	}

}
