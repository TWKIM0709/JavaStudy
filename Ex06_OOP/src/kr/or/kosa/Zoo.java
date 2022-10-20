package kr.or.kosa;

//�������̽��� �ʽĵ���, ���ĵ��� ���п� ����Ѵ�. ( �ܼ� ���п� �������̽� )
//���ĵ����� �������̽�
interface Icarnivore{}
//�ʽĵ����� �������̽�
interface Iherbivore{}

// �߻�Ŭ���� Aniaml - �������� ���������� ������ �ִ� age, color, ������ ����� ������ �ְ�
//					 move() �Լ��� �߻��Լ��� �� �����Ǹ� �����Ѵ�.
abstract class Animal{
	int age;
	String color;
	Animal(int age, String color){
		this.age = age;
		this.color = color;
	}
	void breath(){
		System.out.println("������ ��");
	}
	//������ ��� >> �������� �ٸ� >> �߻��Լ��� ������ ����
	abstract void move();
}

// Animal Ŭ������ ��ӹް� Iherbivore �������̽��� �޴� Rabbit
//Iherbivore �������̽��� �޾� �ʽĵ����� ���� ����
class Rabbit extends Animal implements Iherbivore{
	public Rabbit(int age, String color){
		super(age,color);	//super�� ����� Animal�� ������ ȣ��
	}
	@Override	
	void move() {	//�߻�Ŭ�������� �߻��Լ��� ���� move() override
		System.out.println("�䳢�� ���ѱ��� �̵�");
	}
	@Override	// ������ �̸� ǥ�� ( toString ������ )
	public String toString() {
		return "�䳢";
	}
}

//Animal Ŭ������ ��ӹް� Icarnivore �������̽��� �޴� Lion
//Icarnivore �������̽��� �޾� ���ĵ����� ���� ���� ( Rabbit �ʽ��������̽� || Lion,Dove �����������̽� ����)
//Lion, Dove Ŭ������ ������ �κ��� Rabbit Ŭ������ ���� ����...
class Lion extends Animal implements Icarnivore{
	public Lion(int age, String color){
		super(age,color);
	}
	@Override
	void move() {
		System.out.println("���ڴ� ������ �̵�");
	}
	@Override
	public String toString() {
		return "����";
	}
}
class Dove extends Animal implements Iherbivore{
	public Dove(int age, String color){
		super(age,color);
	}
	@Override
	void move() {
		System.out.println("��ѱ�� ���Ƽ� �̵�");
	}
	@Override
	public String toString() {
		return "��ѱ�";
	}
}


//������ Ŭ����
class Zookeeper{
	String name;
	public Zookeeper(String name) {
		this.name = name;
	}
	// ������ �θ��� ���
	// Animal(�θ�) Ÿ���� �Ķ���ͷ��ؼ� Rabbit, Lion, Dove ��� ���� �� �ְ� ó��
	void call(Animal a) {
		System.out.println(a.color + a + " �θ�");
	}
	//�������� ���� �ִ� ���
	// Animal(�θ�) Ÿ���� �Ķ���ͷ��ؼ� Rabbit, Lion, Dove ��� ���� �� �ְ� ó��
	// instanceof�� �������̽� Ÿ���� ���� �ʽĵ���, ���ĵ��� ���� �� �ٸ� ���� ��
	void feeding(Animal a) {		
		if(a instanceof Icarnivore) {	// Ÿ�Ժ� ( �����̶�� )
			System.out.println(a.color + a + "����ֱ�");
		}
		else if(a instanceof Iherbivore) {// Ÿ�Ժ� ( �ʽ��̶�� )
			System.out.println(a.color + a + "ä���ֱ�");
		}
		else {// ���ĵ� �ʽĵ� �ƴϸ�
			System.out.println("���� �Ǵ� �ʽ� ������ �ƴմϴ�.");
		}
	}
}

public class Zoo {

	public static void main(String[] args) {
		Lion l = new Lion(10, "���");
		Rabbit r = new Rabbit(3, "����");
		Dove d = new Dove(1, "ȸ��");
		d.move();
		r.move();
		
		Zookeeper z = new Zookeeper("ȫ�浿");
		z.feeding(l);
		z.feeding(r);
		
		z.call(d);
	}

}
