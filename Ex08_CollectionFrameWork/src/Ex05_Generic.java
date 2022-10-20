import java.util.ArrayList;

/*
	Today Point
	Generic : jdk 1.5 버전부터 나옴
	
	c#, Java..(객체지향) 필수기능
	
	Why)
	Collection 타입 클래스 >> 데이터 기본 저장 공간 타입 : Object
	장점 : 어떤 값을 넣어도 소화 (String , Emp , int...)
	단점 : 큰타입에 대한 문제 , (꺼낼때) 원하는 데이터 타입으로 변경(downcasting)하는게 불편
	
	타입을 처음부터 강제 ... 
	 안정성 확보
	 강제 형변환 필요 없음
	
	제너릭 적용을 위해서는 설계도부터 적용이 되야...
	
	
*/

class MyGen<T>{	// T : type parameter ( T라고해도 되고 E라고 해도 되고.. )
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class Person{
	int age = 100;
}

public class Ex05_Generic {

	public static void main(String[] args) {
		MyGen<String> mygen = new MyGen<String>();
		mygen.add("문자열");
		String str = mygen.get();
		System.out.println(str);
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("홍길동");
		list.add(new Person());
		
		//list 값 출력
		//person 객체는 나이를 출력
		for(Object o : list) {
			if(o instanceof Person) {
				System.out.println(((Person)o).age);
			}
			else {
				System.out.println(o);
			}
		}System.out.println();
		
		
		//Generic : 타입 강제 :: 다 먹지는 못하지만 사용 편의 ↑↑↑
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person());
		plist.add(new Person());
		
		for(Person person : plist) {
			System.out.println(person.age);
		}
	}

}










