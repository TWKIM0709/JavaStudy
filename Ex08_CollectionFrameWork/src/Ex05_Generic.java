import java.util.ArrayList;

/*
	Today Point
	Generic : jdk 1.5 �������� ����
	
	c#, Java..(��ü����) �ʼ����
	
	Why)
	Collection Ÿ�� Ŭ���� >> ������ �⺻ ���� ���� Ÿ�� : Object
	���� : � ���� �־ ��ȭ (String , Emp , int...)
	���� : ūŸ�Կ� ���� ���� , (������) ���ϴ� ������ Ÿ������ ����(downcasting)�ϴ°� ����
	
	Ÿ���� ó������ ���� ... 
	 ������ Ȯ��
	 ���� ����ȯ �ʿ� ����
	
	���ʸ� ������ ���ؼ��� ���赵���� ������ �Ǿ�...
	
	
*/

class MyGen<T>{	// T : type parameter ( T����ص� �ǰ� E��� �ص� �ǰ�.. )
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
		mygen.add("���ڿ�");
		String str = mygen.get();
		System.out.println(str);
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("ȫ�浿");
		list.add(new Person());
		
		//list �� ���
		//person ��ü�� ���̸� ���
		for(Object o : list) {
			if(o instanceof Person) {
				System.out.println(((Person)o).age);
			}
			else {
				System.out.println(o);
			}
		}System.out.println();
		
		
		//Generic : Ÿ�� ���� :: �� ������ �������� ��� ���� ����
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person());
		plist.add(new Person());
		
		for(Person person : plist) {
			System.out.println(person.age);
		}
	}

}










