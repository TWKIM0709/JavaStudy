/*
> Ŭ������ ���赵�̴�, Ŭ�����z ������ Ÿ���̴�
  Ŭ���� == ���赵 == Ÿ��
  
> Ŭ������ ��üȭ�� ���ؼ� ��� ( ���� ���� ���� )
  ���α׷������� [new ������]�� ���ؼ� memory �� ���� ���´� >> ��ü(�ν��Ͻ�)
  
> ���赵�� ���� 2����
  1. ���������� ���� ����	>> public static void main(String[] args) {} �� ������ �ִ� Ŭ����
  2. ���������� ���� �Ұ���	>> main �Լ��� ���� ������ Ŭ���� >> ���� �����ִ� Ŭ����
  
> ���� ��Ű��(����) �ȿ� ���� �̸��� Class�� ������ �� ����


*/

class Apt2{	//main �Լ��� ����
	int door = 10;
	int window = 20;
}

public class Ex05_Ref_Type {

	public static void main(String[] args) {
		//Apt2��� ���赵�� ������ ��üȭ �� �깰 ����
		
		int num;
		num = 100;	// ����(Ÿ��)���� �־��ָ� ��...
		Apt2 apt2;	// �ּҰ��� ��ߵ�...
		apt2 = new Apt2();	// Apt2��� �ϴ� ���赵�� ������� ����Ʈ�� ������ (JVM�� OS�� ���� memory(heap) ����) 
		
		System.out.println("apt2 : "+apt2);	//Apt2@626b2d4a
		
		Apt2 ssapt = apt2;	//�ּҰ��� �Ҵ�... ssapt������ apt2�� ������ �ִ� �ּҰ����� �ʱ�ȭ ��
		ssapt.door = 100;	// . �����ڴ� �ּҸ� ã�ư��� ������
		
		System.out.println("apt2�� �ٶ󺸴� door : " + apt2.door);
	}

}
