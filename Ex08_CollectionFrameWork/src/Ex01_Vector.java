import java.util.Calendar;
import java.util.Vector;

/*
	Collection FrameWork
	[�ټ��� ������]�� �ٷ�� [ǥ��ȭ�� �������̽�]�� �����ϰ� �ִ� [Ŭ������ ����]
	
	Collection �������̽� -> ��� �������̽� List (���� : ArrayList), Set (���� : HashSet..)
	
	>> ArrayList �� �θ�Ÿ���� List �̴�. >> ������
	>> Collection �� ArrayList �� �θ�Ÿ���̴�. >> ������
	
	Map �������̽� (key, value) �ѽ��� �迭 (���� : HashMap)
	
	1. List (�ټ���)
	������ ����. �ߺ� ���. >> ���������� ������(�ڷ�)�� �迭�� ����
	
	1.1 Vector(������) >> ����ȭ�� ���� (��Ƽ ������) >> Lock ��ȣ >> ������ ���� ������
	1.2 ArrayList(�Ź���) >> ����ȭ ���� (��Ƽ ������) >> Lock �� �ɼ� >> ���� �켱 
	
	���� �ټ��� �����͸� �ٷ�� ��� : Array (����, ����)
	 - ���� ������ �ѹ� �������� ���� �Ұ�
	 - �����Ͱ� ��������.. ���ο� ũ���� �迭�� ����� ������ �̵� ( �ڵ�� ���� ���� **)
	
	List �������̽��� �����ϰ� �ִ� (Vector , ArrayList)
	1. �迭�� ũ�⸦ �������� Ȯ�� or ��� ���� >> ������... �����Ϸ��� ���ο� �迭�� ����� ������ �̵��� �˾Ƽ� ���ִ� ��
	2. ������ ���� (���������� Array ���) , �ߺ��� ��� ����
	3. ������ ���� ���� : Array ���
	
*/
public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("�ʱ� default �뷮 : " + v.capacity()); //10
		System.out.println("size : " + v.size());	//0 (�� �������� ũ��)
		
		v.add(10);
		v.add("age");
		v.add('A');
		v.add(10.1);
		
		System.out.println("size : " + v.size());	//4 (�� �������� ũ��)
		System.out.println(v.toString());	//[10, age, A, 10.1] ������ ��� ������
		//Array.length =/= Collection.size
		
		for(int i = 0; i<v.size(); i++) System.out.println(v.get(i));	//Collection���� ���� �޴� �� >> get(index)
									
		//������ for��
		for(Object value : v) System.out.println(value);
		
		//���� : ����������(���� Ÿ���� ������)�� ����ص� ... ���� ūŸ��(Object)�� ����ϴ� ��... ���ո�
		//���ʸ� >> Ÿ���� ����
		Vector<String> v2 = new Vector<String>();
		v2.add("hello");
		v2.add("world");
		for(String str : v2) System.out.println(str);
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity()); //10
		
		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");
		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");
		
		System.out.println(v3.toString());
		System.out.println(v3.capacity()); //20
		
		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");
		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");
		
		System.out.println(v3.toString());
		System.out.println(v3.capacity()); //40		
	}

}









