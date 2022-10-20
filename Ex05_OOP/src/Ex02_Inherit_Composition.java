/*
	�ǹ�(����) ȯ��
	�Ѱ��� Ŭ������ ����(���)�ϴ� ��� >> ���� ����
	
	���赵 1������ ��� ���� ���� >> ���������� �Ұ���
	�������� ������... ����, ���� ��� ���� �߻�
	
	ex)
	���θ� : �������, ��۰���, �Ǹ�ó, ȸ������, ��ǰ���� ����..... >> ������ ������ ���� ������ ���赵
	****����****
	�������� ���赵�� ���� ... �̾��ִ� ����
	
	- ���� -
	1. ���(is ~ a) 	>> '~�� ~�̴�'�� ������ ������ ('�ڽ�'�� '�θ�'�̴�)
	2. ����(has ~ a)	>> '~�� ~�� ������ �ִ�'
	
	ex)
	is ~ a
	'��'�� '����'�̴� >> �� extends ����
	'�ﰢ��'�� '����'�̴� >> �ﰢ�� extends ����
	
	has ~ a
	[��]�� [��] 
	'��'�� '��'�̴� (X)
	'��'�� '��'�� ������ �ִ� (O)
	>> class �� { [����] '�� } >> member field
	
	������ ����
	'����'�� '����'�̴� (X)
	'����'�� '����'�� ������ �ִ� (O)
	>> class ���� { ... }
	>> class ���� { ���� member filed }
	
	
	���� �����̴�
	�ﰢ���� �����̴�
	�簢���� �����̴�
	
	������ �и� �����ڿ�( �������� ������ �־�� ) : �߻�ȭ, �Ϲ�ȭ
	���� ���θ��� Ư¡ : ��üȭ , Ư��ȭ 
	
	�� : ��ǥ��(x,y)
	���� ���� ������ �ִ�.
	�ﰢ���� ���� ������ �ִ�.
	�簢���� ���� ������ �ִ�.
	>> has ~ a >> ��ǰ�ڿ�
	
	class Shape{ �׸���, ���� } >> ��Ӱ��迡�� �θ�(��, �ﰢ��, �簢����)
	class Point{ ��ǥ�� } >> ���԰��� (��ǰ)
	
	��üȭ, Ư��ȭ �� Circle , Triangle
*/

// �߻�ȭ, �Ϲ�ȭ, �����ڿ�
class Shape{
	String color = "gold";
	void draw() {
		System.out.println("������ �׸���");
	}
}

class Point{
	int x;
	int y;
	
	public Point() {
		this(1,1);	// �����ڸ� ȣ���ϴ� this
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

//���� ���弼�� (���� : ���� �� ���� �������� ������ �ִ�)
//1. ���� �����̴�. (is ~ a) : Shape�� ���
//2. ���� ���� ������ �ִ� (has ~ a) : Point�� member field�� ������ �ִ�.
//3. ���� Ư��(��ü)�� : ���� �������� ������ �ִ� (r)

//�߰� �䱸����
//1. ���� �������� �ʱⰪ 10�� ������
//2. ���� ��ǥ�� �ʱⰪ (10,15)�� ������
//3. �������� ���� ���� �Է¹��� �� �ִ�. (���� ���������) 
class Circle extends Shape{ // ���
	Point point;			// ����(��ǰ����)
	int r;					// Ư����
	
	public Circle() {
		this(10,new Point(10,15));
	}
	public Circle(int r, Point point) {
		this.r = r;
		this.point = point;
	}
}

//����2)
/*
 * �ﰢ�� Ŭ���� ����
 * �ﰢ���� 3���� ���� ����� �׸��� ����� ������ �ִ�
 * 
 */

class Triangle extends Shape{
	Point[] point;
	
	public Triangle() {
		this(new Point[] {new Point(10,10),new Point(20,20), new Point(10,30)});
	}
	public Triangle(Point[] point) {
		this.point = point;
	}
	
	//��üȭ , Ư��ȭ >> �߰���� >> ���
	void trianglePoint(){
		int i = 0;
		for(Point p : point)System.out.printf("point[%d] : (%d,%d)\t",i++,p.x,p.y);
		System.out.println();
	}
	
}


public class Ex02_Inherit_Composition {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.r);
		System.out.println(c.color);	//����ڿ�
		System.out.println(c.point.x);
		System.out.println(c.point.y);
		c.draw();						//����ڿ�
		
		//������, �� ���� �Է�
		Circle c2 = new Circle(20,new Point(100,200));
		System.out.println(c2.r);
		System.out.println(c2.color);	//����ڿ�
		System.out.println(c2.point.x);
		System.out.println(c2.point.y);
		c2.draw();
		
		Triangle tri = new Triangle();
		tri.trianglePoint();
		
		Triangle tri2 = new Triangle(new Point[] {new Point(1,2),new Point(3,4),new Point(5,6)});
		tri2.trianglePoint();
	}

}










