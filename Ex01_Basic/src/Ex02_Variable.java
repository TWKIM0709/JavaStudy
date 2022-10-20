//�����ּ�
/* ���ּ�
 
   Ex02_Variable >> Ŭ���� >> ���赵 >> ������ Ÿ��
   
   // ===== Ŭ������ ���� =====
   1. class Car { ... } >> �������� ������ �Ұ��� >> �ٸ� Ŭ����(���赵)���� �����ϴ� Ŭ���� >> main �Լ��� ���� >> Lib (���̺귯��)
   2. class Car { public static void main(String[] args){ ... }} >> ���������� ���� ������ Ŭ����
   2.1 static void main(String[] args) >> main �̸��� ������ �Լ�  >> ���α׷��� ������(������) >> ����
   
   Tip) C#�� �ڹٴ� �θ� ���Ƽ� ������ �Ȱ���
   C# ��� ) public static void Main(String[] args)
   							   ^ �̰��ϳ� ����(��ҹ���)
   // ===== ������? =====
   ���� : Variable
    ������(�ڷ�)�� ���� �� �ִ� ������ �̸� ( �޸� )
    ����(ũ��) : �������� Ÿ��(�ڷ���) >> �޸��� ������ �����Ǿ� �ִ� >> �ּ����� ����, �ִ����� ������
   - ����� ��
   [������ Ÿ��] [������] = [��] >> Ex) int i = 100
   
   // ===== Ŭ���� ���� =====
   public class [Ŭ���� �̸�] {
   	  public static void main(String[] args){
   	    ��(�Լ�) �ȿ� �ִ� ���� >> ��������
   	    int num = 100; //�ʱ�ȭ
   	  }
   }
   
   // ===== ��ġ�� ���� ������ ���� =====
   ������ ����Ǵ� ��ġ (scope : ��ȿ����)
    > ������ ������ ����
    1. instance variable	(��ü����) 			>> class Car { int number = 2000; }
    2. local variable 		(�������� / �Լ��ȿ�) 	>> class Car { public void run() { int speed = 0; } }
    3. block variable 		(������)			>> �Լ��ȿ� - �����(if, for ��) �ȿ� �ִ� ���� >> class Car { public void run() { for(int i = 0; i...){ ... } } } 
    4. static variable		(�����ڿ� / ��ü��)		>> class Car { public static num = 100; }
   
*/

// class�� ���赵�̴� == class�� Type�̴� ( �������� �ǹ� �ִ� ���� Ÿ���� ������ ū Ÿ�� ) : ����� ���� Ÿ��

// �ڹٴ� �ϳ��� �������� ���Ͼȿ� �������� Ŭ������ ��밡�� ... (����������)
// ���� ������ ���� �ϳ��� ���Ͽ� �ϳ��� Ŭ������ ����Ѵ�.

// ===== class ������ =====
class Car{	// ���赵�� ����ϱ� ���ؼ��� ��üȭ ���Ѿ� �ȴ� ... �޸� ���� �ø���(�����) ������ ���ؼ� >> ������ new
	int iv = 100;	// instance variable(��ü����)
	int window;		// instance variable�� �ʱ�ȭ�� ���� �ʾƵ� �ȴ�.
					// instance variable�� ���������� �⺻���� ���´�(default) >> int���� 0�� �⺻������ (int window = 0) >> float, double(�Ǽ�)�� �⺻���� 0.0
	/*
	 �ʱ�ȭ : ������ ó�� ���� ���� ��(�Ҵ��� ����)
	 ���� :	why int window �̷� ��ü������ �ʱ�ȭ�� ���� �ʾƵ� ������ ������ �ʴ´�.
	 		�ڵ����� ���� �� int window = 4 ... â�� 4��
	 		Car ��� ���赵�� ������ ���� ���� ����
	 		Car �ֿ��� = new Car(); //�ڵ����� ����� ����
	 		�ֿ���.window = 10;
	 		
	 		Car �Ｚ�� = new Car();
	 		�Ｚ��.window = 2;
	 		
	 		�����Ǵ� �ڵ������� â���� ������ �޸� �� �� �ִ�.
	 		
	 */
	public void stop() { //������ ����(�Լ�)
		window = 100;
		//speed = 200; ����� �������� �ľ��� �� �ִ� .. �˾ƾ� �� �� ..
	}
	public void start() {
		int speed = 100; //��������
	}
}



public class Ex02_Variable {

	public static void main(String[] args) {
		// ������ 
		// main �Լ� �ȿ� �ڵ尡 �־�� ����� ����� �� �� �ִ�.
		int lv = 100;
		System.out.println("lv(��������) : " + lv);
		
		int number = 0; //����� ���ÿ� �ʱ�ȭ
		System.out.println("number :" + number);
		number = 100;
		System.out.println("���� �� number :" + number);
		number = 200;
		System.out.println("���� �� number :" + number);
		
		// ===== ����� �ʱ�ȭ =====
		int a = 100;
		int b; //���� ( �ʱ�ȭ �ȵ� )
		System.out.println("a : "+a);
		//The local variable a may not have been initialized >> ���������� �ʱ�ȭ���� ����
		//main() { �Լ��ȿ� �ִ� ������ ����������� �ϴ� �� �� ���������� �ʱ�ȭ ���� ������ ��� �Ұ� }
		
		b = 200; // b �ʱ�ȭ
		System.out.println("b ���� �ʱ�ȭ �� ��� : "+b);
		
		// ===== ���� ��� =====
		int c, d; // ��ȣ���� ���� >> ���� Ÿ���� ������ �ߺ��Ǹ� >> �迭 ��� >> int[] c...
		
		// key point
		// local variable >> �Լ� �ȿ� �ִ� ���� >> main() { �ȿ� �ִ� ����(��������) } >> �ݵ�� �ʱ�ȭ�� �ʿ�
		int k = 100; //���������� ����� ���ÿ� �ʱ�ȭ�� �ϴ� ������ ������
		
		// ===== Ŭ���� ���� =====
		Car scar = new Car(); 	// scar ��� �ڵ����� ���� ...(���� ����Ʈ�� ���� ��)
								// java�� OS���� �Ҵ� ���� �޸� ������ ����� �� ��
		
		// ============
		//int k = 100;  ���� ���� �������� ���� �������� ������ �� ����
		
		int f = 100; // f ��� ������ 100�̶�� ���� ������ �ִ�.
		int f2 = f;  // �Ҵ�
		System.out.println("f : " + f);
		System.out.println("f2 : " + f2);
	}
}















