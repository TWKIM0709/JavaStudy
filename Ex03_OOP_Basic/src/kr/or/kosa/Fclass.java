package kr.or.kosa;

/**
 *  ��� ( ������ ����� ��� )
 *  �Լ� (Method)
 *  
 *  method : ���� �Ǵ� ����� �ּҴ��� ���� : �ϳ��� �Լ��� �ϳ��� ��ɸ� ����
 *  		 ex) �Դ´� , �޸��� , �ܴ� , �ȴ´�
 *  Ŭ���� : filed + method
 *  
 *  ex) �Ե����� : ���ӹ� :: �� , ����, �̱� ...
 *  
 *  >> method �Լ��� ȣ�⿡ ���ؼ��� ���۵ȴ�  :  ������ �̸��� �θ��� ������ �������� �ʴ´� ...
 *  
 *  
 *  
 *  JAVA �Լ�)
 *  1. void , parameter(O) 			: void print(String str) { .. }
 *  2. void , parameter(X) 			: void print() { ... }
 *  3. return type , parameter(O) 	: [type] print(int data) { ... return [type]; }
 *  4. return type , parameter(X)	: [type] print() { .... return [type]; }
 *  								   type >> int , double , String , class �� ������ Ÿ��
 *  								   ex) int print(int data) { ... return 100; }
 *  
 *  >> void >> �����ִ� ���� ���� >> ���� Ÿ���� ����
 *  >> return type >> �⺻ 8���� + String + Array(�迭) + class + collection + interface ��
 *  
 *  = return sample =
 *  boolean print() { ... return [true or false]}
 *  Car print() { Car c = new Car(); ... return c; } // Car [��ü�� �ּ�]�� return�ϰڴ�
 *  String print() { ... return "���ڿ�"; }
 *  
 *  >> parameter type >> void print( [�Ķ����] , [�Ķ����] ){ ... }
 *  >> �⺻ 8���� + String + Array(�迭) + class + collection + interface ��
 *  
 *  = parameter sample =
 *  void print(int i) {}
 *  void print(String str){}
 *  void print(Car car){}	// print �Լ��� parameter�� CarŸ���� �ּҰ��� �޴´�
 *  
 *  ex)
 *  Car c = new Car();
 *  
 *  void print(Car car) { ... }
 *  
 *  print(c);		//print �Լ��� ȣ���� �� c��� ������(�ּҰ�)�� �ִ´�
 *  
 *  ������� ... �Ķ���Ͱ� ������ ...
 *  
 *  void print(int a, int b, int c, int d){} ... ������ ����
 *  void print(Car c, String str, int i){} ... ���� Ÿ�Ե� ����
 *  
 *  
 *  >> �������� ǥ��
 *     �ڵ� ��Ģ : ������
 *     class �̸��� ù���ڴ� �빮�� 	: class Car , class Person
 *     method �̸��� ù�ܾ��� ù���ڴ� �ҹ���, �̾����� �ܾ��� ù���ڴ� �빮�� : void getNumber(){} , void empPrint(){}
 *     
 *     ex) �����ȣ�� ������ ����� ��� ������ ������Ͷ�
 *     void getEmpListByEmpno(int empNumber){} >> �Լ��� �̸����� �뷫���� �����ľ��� �����ϵ���
 *  
 *  
 * @author KOSA
 *
 */
public class Fclass {
	// void m(){} >> �����Ϸ��� default ������ >> default void m() >> ���� ��Ű�� �ȿ����� ...
	// �Լ��� ��κ� public���� ����
	// �������� private : ���� : Ŭ���� ���ο����� ���� �Լ� >> �����Լ� >> �ٸ� �Լ��� �����ִ°� ����
	
	// return X , parameter X
	public void m() {	
		// ��� ����
		// main �Լ� ó��
		System.out.println("�Ϲ��Լ� : void, parameter X");
	}
	
	//return X , parameter O
	public void m2(int i) {	
		System.out.println("�Ϲ��Լ� : void , parameter O");
		System.out.println("parameter �� �Լ� ������ �����Ӱ� Ȱ�� / parameter �� �Լ� �������� ��ȿ / parameter(i) :" + i);	
	}
	
	//return O , parameter X
	public int m3() {	
		// return type�� �����ϸ� �ݵ�� Ÿ�Կ� �´� ���� return ����ߵ�
		return 1000;
	}
	//return O , parameter O
	public int m4(int data) {
		return 100 + data;
	}
	
	// = = = = ��������� �⺻ 4���� = = = =
	
	// return O , parameter O ... parameter ������ ������
	public int sum(int i, int j, int k) {
		return i + j + k;
	}
	
	//�Լ��� ������
	//(default) int subSum(){}	// ���� package�� ����
	// private int subSum(){}	// ���� package�� �ȵ�
	// class ���ο��� �ٸ� �Լ��� �����ִ� �����Լ� ... private �Լ��� ���
	

	private int subSum(int i) {	// �ٸ� �Լ��� ȣ���ؼ� ����ϴ� ����
		return i + 100;			// ������ �ٸ� ���� �Լ��� ������ �ִٸ� ... ����� ������ ... ���������� ���� �����Լ��� ���δ� ��
	}
	
	public void callSubSum() {
		//�Լ��� �ٸ� �Լ��� ȣ���� �� �ִ�
		int result = subSum(100);
		System.out.println("call result : " + result);
	}
	
	private int operationMethod(int data) {
		return data*200;
	}
	
	public int opSum(int data) {
		int result = operationMethod(data);
		if(result > 0 ) return 1;
		else return -1;
	}
	
	/* 
	   = = = Quiz = = =
	   a�� b ���߿� ū ���� return�ϴ� �Լ��� ���弼��
	   ex) max(10,5) �� ������ 10�� return �Ǵ� �Լ�
	*/
	public int max(int a, int b) {
		return (a>b) ? a : b;
	}
	

	
}











