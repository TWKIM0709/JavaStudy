import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
	Collection FrameWork
	>> �� ���� �������̽�, Ŭ������ ����
	
	Iterator �������̽� (�ݺ���?)
	>> ������ �ڿ��� ���� ���������� �����ؼ� ���� �����ϴ� **'ǥ��'�� ����
	�߻��Լ��� �����ϰ� �ִ� >> ������(ArrayList)�� �߻��Լ��� ����
	
	Iterator �������̽��� ������ �ִ� �߻��Լ�
	>> hasNext() , Next() , remove()
	>> ArrayList implements Iterator { ... ������ ... ���� ... }
	
*/
public class Ex09_Collection_Iterator {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);

		//ǥ��ȭ�� ��� ( ������� ������ �����Ϳ� ���ؼ� )
		Iterator it =  list.iterator();	//ȣ���ϸ� �Լ� �ȿ��� �������̽��� �����ϴ� ��ü�� �����ǰ� �� �ּҸ� ����
		while(it.hasNext()) {
			System.out.println(it.next());
		}System.out.println();
		
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		
		//�̴������̽� Generic ��� (����**)
		Iterator<Integer> it2 = intlist.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}System.out.println();
		
		//���� : ���뼺�� ���� �̷��� �ȵȴ�
		for(int i = intlist.size()-1; i>=0; i--) {
			System.out.println(intlist.get(i));
		}
		
		/////////////////////////////////////////////////////////////////////
		// Iterator �������̽� ǥ��ȭ ... �����⸸?						6543210 �ٷδ� �ȵǰ�
		// �������� ... �ȵǾ� ���� ... ���������� ���� ���ƿ��� ������� ��	0123456 �� ���� 6543210 ���ƿ��� ���
		
		ListIterator<Integer> it3 = intlist.listIterator();
		
		while(it3.hasNext()) {	//�ѹ� �ڷ� �� ���� (������)
			System.out.println(it3.next());
		}
		
		while(it3.hasPrevious()) {	// ���������� ���ƿ´�..
			System.out.println(it3.previous());
		}
	}

}
