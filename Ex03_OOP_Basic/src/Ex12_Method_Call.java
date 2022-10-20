/*
   �Լ� ���� parameter ���� ����, �ּ� ����
   
   - ���� ���� - call by value
   void m(int x) { ... }	>> x ������ ���� �޴´�
   int y = 200;
   ȣ�� m(y);
   
   - �ּҰ��� ���� - call by ref
   void m2(Car c) { ... }	>> c ������ Car(�ּҰ�)�� �޴´�
   Car c2 = new Car();
   m2(c2);	���� Ÿ���� �ּҰ��� �����Ѵ�
   
*/

class Data{
	int i;
}


public class Ex12_Method_Call {

	static void scall(Data sdata) {	// default static
		System.out.println("�Լ� : " + sdata.i);
		sdata.i = 111;	// OxA������ i �� ����
	}
	
	static void vcall(int x) {		// default static
		System.out.println("before x : " + x);
		x = 8888;
		System.out.println("after x : " + x);
	}
	
	
	public static void main(String[] args) {
		// 
		Data d = new Data();	//d�� �ּҰ� OxA����
		d.i = 100;
		System.out.println("d.1 : " + d.i);
		
		scall(d);	// �ּҰ�(OxA) ����
		
		System.out.println("after d.i : " + d.i ); // 111
		
		vcall(d.i);	//'��'�� ����
		
		System.out.println("d.i : " + d.i);
	}

}
