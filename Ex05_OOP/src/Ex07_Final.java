/*
 	���� <-> ���
 	��� : �ѹ� ���� [�ʱ�ȭ]�Ǹ� �� ���� ���� �Ұ����ϴ�.
 	����ڿ� : ������ ex) �ֹε�Ϲ�ȣ, PI��(3.141592...), �ý��۹�ȣ(������ȣ ��)
 	����� ���������� [�빮��]�� ����.
 	
 	java : final int NUM = 10;
 	TIP) c# : const integer NUM = 10;
 	
 	final Ű����
 	1. final class Car{ } >> class �տ� final >> ��� ����
 	2. public final void print(){} >> �Լ� �տ� final >> override ����
 	3. final int number = 10 >> member field �տ� final >> �� ���� ����
 	
*/

class Vcard{
	final String KIND = "heart";
	final int NUM = 10;
	
	void method() {
		System.out.println(Math.PI);
	}
}

class Vcard2{		//������ ���忡�� ... ���� ī�帶�� �ٸ� ������� ������ �ϰڴ�.(�������� �ְڴ�.)
	final String KIND;
	final int NUM;
//	public Vcard2() {}
	public Vcard2(String KIND, int NUM) {
		this.KIND = KIND;
		this.NUM = NUM;
	}
	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
}

public class Ex07_Final {

	public static void main(String[] args) {
		Vcard vc = new Vcard();
//		vc.KIND = "ss";	//����Ұ�
		System.out.println(vc.KIND);
		vc.method();
		
		Vcard2 vc2 = new Vcard2("���̾Ƹ��",1);
		System.out.println(vc2);
		Vcard2 vc3 = new Vcard2("�����̵�",2);
		System.out.println(vc3);
		Vcard2 vc4 = new Vcard2("Ŭ�ι�",3);
		System.out.println(vc4);
	}

}
