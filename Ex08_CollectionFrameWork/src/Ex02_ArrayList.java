import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//All Day Point

public class Ex02_ArrayList {

	public static void main(String[] args) {
		//ArrayList : List �������̽��� ���� ( ���� ����, �ߺ� ��� )
		
		ArrayList arl = new ArrayList();
		//Object Ÿ��
		arl.add("asdf");
		arl.add(42);
		arl.add('a');
		arl.add(true);
		for(int i = 0; i<arl.size(); i++) {
			System.out.println(arl.get(i));
		}
		System.out.println(arl.toString());
		
		//add �Լ��� ���������� ������ �ֱ�
		arl.add(0,111); // ����°� �ƴ϶� �ڸ��̵��� �߻� [asdf, 42, a, true] -> [111, asdf, 42, a, true]
		System.out.println(arl);
		arl.add(4,444); //[111, asdf, 42, a, true] -> [111, asdf, 42, a, 444, true]
		System.out.println(arl);
		
		//** ��������� ������ �߰� , ���� >> ArrayList �ڷᱸ���� �������� �ʴ�.
		//** �������� �������� �߰�, ������ ����
		
//		arl.remove(111);
//		System.out.println(arl);
		
		//[111, asdf, 42, a, 444, true]
		//ArrayList �Լ� ����
		System.out.println("asdasfdsaffads");
		System.out.println(arl.contains(444));
		
		arl.clear(); // reset
		System.out.println(arl.size());
		System.out.println(arl.isEmpty()); //����ִ���
		
		arl.add(101);
		arl.add(102);
		arl.add(103);
		System.out.println(arl.isEmpty());
		System.out.println(arl.size());
		
		arl.remove(0);
		System.out.println(arl);
		
		//Point
		//�������̽� �θ� Ÿ��
		//�����ڴ� ���������� ������ �����ؾ� (Ȯ�强, ������)
		List li = new ArrayList();
		//ArrayListli = new ArrayList();
		li.add(4);
		li.add(6);
		li.add(8);
		li.add(10);

		List li2 = li.subList(0, 2);	//subList �Լ��� new ArrayList() ����
										//�������� ���� �θ�Ÿ��(List)�� �޴´�.
		System.out.println(li2);
		
		ArrayList arl2 = new ArrayList();
		arl2.add(50);
		arl2.add(1);
		arl2.add(7);
		arl2.add(40);
		arl2.add(46);
		arl2.add(3);
		System.out.println(arl2);
		
		Collections.sort(arl2);	// ���������� ����
		System.out.println(arl2);
		
		Collections.reverse(arl2);	// ������ (���������� �ƴ�!!)
		System.out.println(arl2);
	}

}









