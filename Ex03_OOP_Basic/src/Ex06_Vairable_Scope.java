/**
 * instance variable     >> class Car {private Strin [color];}
 * >> ��ü���� ���� �� �ִ� �� >> �����Ǵ� ��ü���� �ٸ� ������ ���� �� �ִ�
 * 
 * local variable >> class Car{ public void move(){ int [speed] = 0; �ݵ�� �ʱ�ȭ } }
 * 
 * block variable >> class Car{ public void move(){ for(int [i] = 0; i<10...}{ ��� ���� �Ǹ� ����, ������ �Ҹ� } } }
 * 
 * static variable >> �����ڿ� (��ü��) , ��ü ���� ������ memory �� �ö󰡴� �ڿ� (���� : class area, method area)
 * 
 * ��ü�� ����� ������ ��� : new�� ���� �޸𸮿� �ø��� ��
 * static : new ���̵� �޸𸮿� �ö󰣴� ... ?
 * 
 * public class Ex06_VairableScope >> Ŭ���� >> ��üȭ(�޸𸮿� �÷���) ��� �����ϴ� >> main�Լ��� �ִ� Ŭ������ new�� ���� ����
 * 
 * 1. ���α׷� ���۽� class ������ class area�� �ִ´�.
 * 2. class ������ ���� �� static �� ���� �ڿ��� ������ �ش� �ڿ��� �޸𸮿� �ø���.
 * 3. static �ڿ��� �̸��� main�̸� �޸𸮿� �÷ȴ��� stack�� �ٷ� �ø���. (new�� �������� �ʾƵ�) >> �����Ѵ�  
 * 
 * @author KOSA
 *
 */
class test{
	static int cv;
}
class Variable {
	int iv;
	/*
	 * 1. member field, instance variable
	 * 2. iv�� ���� ��� ����(�޸𸮿� �ö󰥶�)�ұ�
	 * 2.1 Variable v1 = new Variable();>> heap �޸𸮿� ��ü�� �����ȴ�. >> v1 ��ü �ȿ� iv�� �����ȴ�
	 *     Variable v2 = new Variable();>> heap �޸𸮿� ��ü�� �����ȴ�. >> v2 ��ü �ȿ� iv�� �����ȴ�
	 * 3. ���� : ������ (����), �ڷḦ ���� ����
	 * 3.1 ���� : ���� , ���� , ��ǰ(class)
	 * 	- �����Ǵ� ��ü���� �ٸ� ���� ������ �ִ�.
	 *  - �׷��� �ʱ�ȭ�� ���� �������� �ʴ´�
	 *  - default ���� ������ �ִ�. ( int : 0 		| double : 0.0 		| char : ���� '\u0000' 
	 *  						  String : null | boolean : false 	| Car : null
	 *  - ������ ���� ������ new��� �����ڸ� ���ؼ� heap�� Variable�̶�� �̸��� ��ü�� ��������� ���� �ٷ� ������(�� ��ü �ȿ�)
	 * */
	static int cv;
	/**
	 * 1. class variable (Ŭ���� ����) , �Ϲ������δ� static variable (��ü�� �����ڿ�)
	 * 2. ���� : ���� ��� �� >> �����Ǵ� ��� ��ü�� �����ϴ� �ڿ�
	 *    >> �����Ǵ� ��� ��ü >> heap�̶�� ������ ������ ��ü���� �����ϴ� �ڿ�
	 * 3. ���ٹ��
	 * 		1. [class�̸�].[static������] >> ex) Varialbe.cv >> ��ü�� �����Ǳ� ���� (Ŭ���� �ܰ迡��?)�ö� ... ���ٵ� Ŭ������ ..
	 * 		2. Variable v  = new Variable(); >> v.cv  >> [v�� ���� cv]�� [class area]�� [Variable]�� [cv�� �ּ�]�� ������ �ִ�.
	 * 		   Variable v2 = new Variable(); >> v2.cv >> [v2�� ���� cv]�� [class area]�� [Variable]�� [cv�� �ּ�]�� ������ �ִ�.
	 * 		   >> v.cv == v2.cv   >> ���� �ּҸ� �ٶ󺻴�(static ������ �ּ�) >> ��ü���� �����ϴ� �ڿ� >> static
	 * 4. �������� ( JAVA�� ���� ���� )
	 * 	  Hello.java > javac Hello.java > Hello.class
	 *    java.exe Hello > ���� ����
	 *    > JVM > OS > MEMORY�� ���� > ���� MEMORY ����(������ ����) > class Loader System�� �м��� 
	 *    > Ŭ���� ����(metadata:����) > class arda(method area) memory�� Ŭ��������(metadata)�� �ø� (����, �, ���� ���� ������)
	 *    > �� Ŭ���� �ȿ� static varialbe �Ǵ� static method�� �ִٸ�
	 *    > static �ڿ��� class area(method area) memory ������ �Ҵ��Ѵ�.
	 *    > �� �ڿ��� main(�Լ�)�̶�� �����Ѵ� (stack ������ main �Լ��� �ø���) : ������ ��Ģ
	 */
	void method() {
		iv = 0;
		/**
		 * local variable (�Լ� �ȿ� >> �������� >> ������� �ݵ�� �ʱ�ȭ)
		 * �����ֱ� : �Լ��� ȣ��Ǹ� ����(stack�޸𸮿� ����) >> �Լ��� ������ (�Ǵ� ������ return�Ǹ�) ���� �Ҹ�ȴ� >> �Լ��� ������ü 
		 */
		for(int i = 0; i< 10; i++) {
			/*
			 	int i >> block ���� >> for�� ���۵Ǹ� ����.. for�� ������ �Ҹ�
			 */
		}
	}
}

class abc{
	int a;
	static int b;
}

public class Ex06_Vairable_Scope {

	public static void main(String[] args) {
		Variable.cv = 100;
		
		Ex06_Vairable_Scope ex06 = new Ex06_Vairable_Scope();
		ex06.method();
		
		Variable v = new Variable();
		System.out.println("v.cv : " + v.cv);
		
	}
	public void method() {
		System.out.println("asdf");
	}

}
