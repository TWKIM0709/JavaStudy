/*
	= this =
	1. ��ü �ڽ��� ����Ű�� this ( ������ ������ ��ü�� �ּҸ� ���� ���̶�� ����)
	   �ν��Ͻ� �ڽ��� ����Ű�� ���� ����. �ν��Ͻ��� �ּҰ� ����Ǿ�����
	   ��� �ν��Ͻ� �޼ҵ忡 ���������� ������ ä�� ����
	   
	2. this ��ü �ڽ��� �ּ�(������ ȣ��) >> '��Ģ������ ������ ��ü ������ �Ѱ�'�� ȣ�� ����
	   >> this�� ����ϸ� ���������� this�� ���ؼ� '�������� ������'�� ȣ���� �� �ִ�.

*/

class Test1{
	int i;
	int j;
	Test1(){  //������
		
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
	
	Socar(){	//�⺻ ����
		this.color = "black";	//member field ���� this�� ����
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
