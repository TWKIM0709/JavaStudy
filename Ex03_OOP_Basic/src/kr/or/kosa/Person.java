package kr.or.kosa;

/*
	class == ���赵 == ������ Ÿ��
	���赵�� ���� ... ��üȭ ���Ѿ� ��(�޸�) ... ��ü
	��üȭ �� �� : ��ü , �ν��Ͻ�
	
	���赵 : Field(����, ����, ��ǰ) + Method(���) + Constructor(�������Լ�)
	
	public class Ex01_Main {
		public static void main(String[] args) {
			���� �ȿ��� �ڵ� ����
			main �̸��� ���� �Լ��� ���� ����
			String name = "�ʱ�ȭ";	>>	local variable >> ������ X >> �Լ��� ȣ��Ǹ� �����Ǿ��ٰ� �Լ��� ����Ǹ� ���� �Ҹ��
			int age = 0;			
		}
}
*/

public class Person {
	public String name;		// ���ڿ��� 	default >> null
	public int age;			// ������		default >> 0
	public boolean power;	// boolean	default >> false	( ���α׷��� �װ�Ƽ���ϴ� )
	
	// member field (������) >> instance variable >> ��ü����
	// 1. instance variable >> �ʱ�ȭ�� ���� �ʾƵ� �ȴ� >> default ��
	// 	  �ʿ��ϴٸ� �ʱ�ȭ ���� : public int age = 100;
	// Today Point 	: �� �ʱ�ȭ�� ���� �ʾƵ� �ɱ�
	//	** �����Ǵ� ��ü(���)���� , [�ٸ� �̸��� ���� �� �ִ�]
	// Person member field >> ����� ���鶧���� �ٸ� ���� ������ �Ұǵ� ���� �ʱ�ȭ�� �� �ʿ䰡 ����
	/*
	   main(){
	   	 Person ���� = new Person(); ��� 1��
	   	 ����.name = "������";
	   	 ����.age = 100;
	   	 ����.power = true;
	   	 
	   	 Person ���� = new Person(); ��� 2��
	   	 ����.name =  "������";
	   	 ����.age = 20;
	   	 ����.power = false;  
	   }
	*/
	
	//���
	//������ ����ϴ� ���
	public void personPrint() {
		System.out.printf("�̸��� %s , ���̴� %d , �Ŀ��� %s",name,age,power);
	}
}










