
public class Ex11_Static_Method {

	public void method() {	// heap �޸𸮿� load �ǰ� ���� ��� ���� (new...)
		System.out.println("�Ϲ��Լ�");
	}
	
	public static void smethod() {
		System.out.println("����ƽ�Լ�");
	}
	
	public static void main(String[] args) {
		
		//�ȿ��� smethod() ���
		//Ex11_Static_Method.smethod();	������ �ڽ��� (Ex11_Static_Method) �� �ڿ�
		smethod();	// Ŭ���� ���� �ٷ� ����ص� ����
		
		Ex11_Static_Method ex11 = new Ex11_Static_Method();
		//ex11 �������� (�ּҸ� ������ �ִ� ����)�� stsatic ����, �Ϲ� ���� ����
		ex11.method();
	}

}
