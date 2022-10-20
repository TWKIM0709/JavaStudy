/*
	this : ��ü �ڽ��� ����Ű�� this( this.empno ...�� )
		 : �����ڸ� ȣ���ϴ� this ( this(100,"red"); ... )
		
	��Ӱ���
	�θ� <> �ڽ�
	
	super 	: ���� �ڽ��� �θ𿡰� ������ �� �ִ� �ּҰ��� ������ �ִ�.
			: ��Ӱ��迡�� �θ� ������ �� �ִ� ������ ���
		
	1. super >> ��Ӱ��迡�� �θ��ڿ��� ����
	2. super >> ��Ӱ��迡�� �θ��� �����ڸ� ȣ��(���������)
	
	TIP)
	Java : super();
	C#	 : base();
*/

class Base{
	String basename;
	Base(){
		System.out.println("Base �⺻ ������ �Լ�");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("basename : " + this.basename);
	}
	void method() {
		System.out.println("�θ�żҵ�");
	}
}

class Derived extends Base{
	String dname;
	Derived() {
		System.out.println("Derived �⺻ ������ �Լ�");
	}
	Derived(String dname){
		
		//�θ��� �����ڸ� ȣ���� �� �ִ� super
		super("super�� ����� �θ� ������ ȣ��");
		
		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	
	// ����� �񵵿��� ������ �ܲ��ϰ�.. �θ���� �׸��� ��...
	
	// ��Ӱ��迡�� override(������)�� �ϰԵǸ� method�� override�� �͸� ����� �� �ִ�
	@Override
	void method() {
		System.out.println("�θ��ڿ� ������");
	}
	//�� �� override�� method(�θ� Ŭ������ �żҵ�)�� ����ϰ� ������ super.[�Լ�]�� ����� �� �ִ�.
	void pmethod() {
		super.method(); // �θ��� �Լ� method()�� �����
	}
}

public class Ex06_Inherit_super {

	public static void main(String[] args) {
		Derived d = new Derived("ȫ�浿");
		d.method();
		d.pmethod();
	}

}
