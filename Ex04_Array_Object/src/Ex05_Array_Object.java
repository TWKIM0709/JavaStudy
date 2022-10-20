
//Ŭ���� == Ÿ�� == ���赵

class Person{
	String name;
	int age;
	//����� ���鶧 �ݵ�� �̸�, ���̸� ������
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
		int[] intarr = new int[10];		//��Ÿ�� �迭
		boolean[] boo = new boolean[5];	//��Ÿ�� �迭
		
		Person p = new Person();	// p : �������� (�ּҰ�)
		Person[] persons = new Person[3];
		
		System.out.println("persons : " + persons);
		System.out.println("persons[0] : " + persons[0]);
		
		//��ü �迭�� ���� ����� �濡 ��ü�� �־��ִ� �۾��� �ؾ��Ѵ�.
		//persons[0] �� Person��ü�� �ּҸ� ������
		persons[0] = new Person();
		persons[1] = p;
		persons[2] = new Person();
		
		persons[0].name = "ȫ�浿";
		persons[0].age = 100;
		
		for(Person ps : persons) {
			System.out.println(ps.name);
		}
		
		//��ü �迭 3���� ������� �����
		//1. int[] arr = new int[10];
		Person[] parr = new Person[10];	// �游 ����
		for(Person value : parr) {		// ��ü�� ���� ����
			value = new Person();
			System.out.printf("�ּҰ� : %s\n", value);
		}
		
		//2. int arr = new int[]{1,2,5,34,7};
		Person[] parr2 = new Person[] {new Person(), new Person(), new Person()};
		
		//3. int arr = {1, 5, 3, 7, 8};
		Person[] parr3 = {new Person(), new Person(), new Person()};
		
	}

}
