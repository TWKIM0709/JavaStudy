import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
	Map �������̽�
	(key, value) ���� ������ ���� �迭
	ex) ������ȣ (02, ����) (031, ���) ��...
	
	����)
	key �ߺ� (X)
	value �ߺ� (O)
	
	Generic ����
	
	Map �������̽� ���� Ŭ����
	������ : HashTable 	( ����ȭ ���� )
	�Ź��� : HashMap		(����ȭ�� �������� ����)
*/

public class Ex13_Map_Interface {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger", "1004");
		map.put("Scott", "1004");
		map.put("Superman", "1007");
		
		System.out.println(map.containsKey("tiger")); // false : ��ҹ��� ������
		System.out.println(map.containsKey("Scott")); // true
		System.out.println(map.containsValue("1004"));// true
		
		System.out.println(map.get("Tiger"));
		System.out.println(map.get("Scott"));
		System.out.println(map.get("Superman"));
		
		System.out.println(map.get("hong"));	//������ null
		
		map.put("Tiger", "1008"); //value replace >> put���� Ű���� �̹� �ִ� Ű���̸� value�� �����Ѵ�.
		System.out.println(map.get("Tiger"));
		System.out.println(map.size());
		
		System.out.println(map);	//{Superman=1007, Tiger=1008, Scott=1004}
		
		map.remove("Superman");
		System.out.println(map);
		
		//���� (����)
		Set set = map.keySet();	//���� (Set �������̽��� �����ϰ� �ִ� ��ü�� �����ؼ� �ּҸ���)
		//���� X , �ߺ� X
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collection clist = map.values();	//Value�� �ߺ������Ͱ� �־ ������ �ִ� ������ �������� ����
		System.out.println(clist); 			//�� Ÿ���� Collection
	}

}





