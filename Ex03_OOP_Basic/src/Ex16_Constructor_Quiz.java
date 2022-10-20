import kr.or.kosa.Book;

/*
�ڵ��� ������ �Դϴ�.
��������� ������ �ڵ����� �ȷ��� �մϴ�.
���� �ڵ����� [�⺻ ���]�� �� �� �� �ְ� ....  �������� [���� �ɼ�]�� ���� �� �� �ֽ��ϴ�.
�ڵ����� �⺻��
���� ���� [4��] , �ڵ����� ���� [�⺻�� red]  4���� �⺻ �Դϴ�
�׷��� ����
���� ������ ���� �����ϰ�  �ڵ����� ���� �⺻�� red  ���� �� �� �ְ�	����
���� ������ �⺻���� �ϰ� �ڵ����� ���� ���� �����ϰ�					����
���� ������ �ڵ����� ���� ��� ���� �Ͽ� ���� ������ �� �ֽ��ϴ�			���� ����
�ڵ��� ����
1. �⺻ ���  
2. �ɼ� : �� ���� , �ڵ����� ���� �⺻
3. �ɼ� : �ڵ����� ���� ���� , �� �⺻
4. �ɼ� : �ڵ����� ���� ���� , �� ����
*/
class Car6{
	int door;
	String color;
	// �⺻���
	public Car6(){
		door = 4;
		color = "red";
	}
	// 1�ɼ� ������, �⺻����
	public Car6(int door){
		this.door = door;
		color = "red";
	}
	// 2�ɼ� ���󺯰�, �� �⺻
	public Car6(String color){
		door = 4;
		this.color = color;
	}
	// 3�ɼ� ����,�� ����
	public Car6(int door, String color){
		this.door = door;
		this.color = color;
	}
	// ���� ��� �Լ�
	public void printCar() {
		System.out.printf("�� [%d]�� �޸� [%s]�� ��\n",door,color);
	}
	
}

public class Ex16_Constructor_Quiz {

	public static void main(String[] args) {
		// �⺻ �ɼ�
		Car6 c1 = new Car6();
		
		// �ɼ�1 �� ����
		Car6 c2 = new Car6(6);
		
		// �ɼ�2 ���� ����
		Car6 c3 = new Car6("green");
		
		// �ɼ�3 ��, ���󺯰�
		Car6 c4 = new Car6(1,"gold");
		
		//��º�
		c1.printCar();
		c2.printCar();
		c3.printCar();
		c4.printCar();
		
		Book book = new Book("ȫ�浿��",5000);
		book.bookInfo();
		System.out.println(book.getName());
		System.out.println(book.getPrice());
	}

}
