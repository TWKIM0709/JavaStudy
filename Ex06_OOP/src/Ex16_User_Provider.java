/*
	user ����� <==> provider ������
	
	class A(){}
	class B(){}
	���� : A�� B�� ����մϴ�.	>> ���, ����
	
	1. ��� : A extends B
	2. ���� : A Ŭ������ member field�� B�� ��� >> class A{ B b; }
		2.1 �κ�
		2.2 ��ü
		
	-------------------------------------------------------------------(��ü����)
	public class B{}
	public class A{
		public int i;
		public B b;		//A�� B�� ����Ѵ� (���� ������ ���·�)
		public A(){ this.b = new B(); }
	}
	
	>> main�Լ�
	A a = new A();
	a.b.�ڿ�;	//B��ü�� �����ϴ� ���
	
	B�� �������� ������ �Ұ��� >> A��� ��ü�� ��������� B�� ���� ���� >> new A();�� �ؾ� B ��ü�� �����ȴ�.
						  >> A�� B�� ���� ��� ����ü (��ü����) >> �ڵ����� ����, ��Ʈ�ϰ� CPU ��
	------------------------------------------------------------(�κ�����)
	public class B{}
	public class A{
		public int i;
		public B b;		//A�� B�� ����Ѵ�.
		public A(){}
		void m(B b){
			this.b = b;
		}
	}
	-------------------------------------------------------------
	
	���� : A�� B�� ����մϴ� >> A�� B�� �����մϴ� >> ���԰���
		  B�� Member Field��
*/

interface Icall{
	void m();
}


class D implements Icall{
	@Override
	public void m() {
		System.out.println("D�� Icall �������̽��� m() ������");
	}
}
class F implements Icall{
	@Override
	public void m() {
		System.out.println("F�� Icall �������̽��� m() ������");
	}
}


// �������� ���α׷��� ��� (Interface �� ���) >> ������ >> ��Ŀ�ø�(�����ϰ�?)
class C {
	/*���� ���
	void method(D d){...} or void method(F f){...} >> Ȯ�强 ����
	*/
	void method(Icall ic) {	//Icall�� �����ϴ� ��� ��ü�� �ּҸ� ���� �� �ִ�.
		ic.m();
	}
	
	
	
}







public class Ex16_User_Provider {

	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		F f = new F();
		
		c.method(d);
		c.method(f);
	}

}








/*

 ���� : ������
 
  
  		�������̽�
  		I����, I�ʽ�
  
 		- ����(�߻�Ŭ����)
 			���� extends ���� implements ����
 			�䳢 extends ���� implements �ʽ�
 			�� extends ���� implements �ʽ�
 		
 		- ������
 			���ִ� ��� (�������̽��� ����, �ʽ� ����)

[����]
������ ����, ������ ��� ������ �ִ�.
������ ������ ������ ������ ������ �ִ�.
������ �̵��ϴ� ����� ������ �ִ�.

ex)
���� : 1 , 3, 6
�̸� : ����, ����� ���
���� : �䳢, ����, �罿

[������]
������� �̸��� ������ �ִ�
������� ������ ������ ���ϴ� ����� ������ �ִ�.
������� ���� �ִ� ����� ������ �ִ�. (����, �ʽ� ����)


*/