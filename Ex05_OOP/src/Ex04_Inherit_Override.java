/*
	�����ε� 	: �ϳ��� �̸����� �������� ���
			::�Ķ������ Ÿ�԰� ����, ������ �޸��ؼ�
			
	Today Point
	[��Ӱ���]���� override : ��Ӱ��迡�� �ڽ��� �θ��� �Լ��� [������] �ϴ� ��
	[��Ӱ���]���� [�ڽ� Ŭ����]�� [�θ� Ŭ����]�� method�� [������] �ϴ� �� (������ �ٲٴ� ��)
	������ : Ʋ�� ��ȭ�� ���� (�Լ��� �̸�, Ÿ�� �� ��ȭ X) ������ �ٲٴ� �� {�߰�ȣ �� ���� ����}
	
	 ����)
	 1. �θ� �Լ��� �̸��� ����				
	 2. �θ� �Լ��� parameter ����
	 3. �θ� �Լ��� return type ����		//�� ���� �ǵ�� [override]�� �ƴ� [overloading]�̴�.
	 4. { ����� �ȿ� �ڵ带 �����ϴ� �� }�� �������̵��̶� �Ѵ�.
	 
	 override�� ��Ÿ�� ���� ������ ���� >> �׳� �ٸ� �Լ��� �Ǵ� �� ��
	 Annotation >> Java code������ ������ �� ���� �ΰ����� ������ �����Ϸ��� �������� ������ �� �ִ�.
	  			>> @Override �����Ϸ��� ���������� '���� �� �Լ��� ������ �Ǿ����� �����غ���'��� �����Ѵ�.
	  			
	 Spring�� 70%�� Annotation
	 ���� : ���ݸ� ¥�� ���� �� �������
	 ���� : ���信 ���� �������� ���� ���¸� �� �� �ִ°� ����
*/

class Point2{
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + "/" + this.y;
	}
}
class Point3D extends Point2{
	int z = 6;
	@Override
	String getPosition() {
		return this.x + "," + this.y + "," + this.z;
	}
}
public class Ex04_Inherit_Override {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		System.out.println(p.getPosition());
	}

}
