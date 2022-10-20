import kr.or.kosa.Emp;

/*
 * 
 * */

class Test2{
	int x = 100;
	void print() {
		System.out.println("�θ� Test2");
	}
}
class Test3 extends Test2{
	int x = 300;	// �θ�� �Ȱ��� ������ ����� >> �θ𹫽��ϱ� >> ���� ���� ����
	@Override
	void print() {
		System.out.println("�ڽ��� �θ��� �Լ��� ������");
	}
	void print(String str) {
		System.out.println("�̰� �����ε�" + str);
	}
}

public class Ex05_Inherit_Override {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		System.out.println(t3.x);	// �θ�� �Ȱ��� ������ ����� >> �θ𹫽��ϱ� >> ���� ���� ����
		
		t3.print();
		t3.print("�����ε� String parameter");
		
		
		Emp emp = new Emp(1000, "ȫ�浿");
		System.out.println(emp);			//kr.or.kosa.Emp@cac736f
		System.out.println(emp.toString());	//kr.or.kosa.Emp@cac736f
		// emp�� ����ϸ� ����� ... emp.toString()�� ������ ȿ��
		// toString() �� Object�� �ڿ� ... �ּҰ��� return �ϰڴ�
		
		// toString() �� �������ϸ� ����� �����ǵ� �������� ��µȴ�. Emp [empno=1000, empname=ȫ�浿]
		
		// JAVA API�� ����ϴ� ������ Ŭ������ ObjectŬ������ toString()�� �������ϰ� �ִ�.
	}
}
