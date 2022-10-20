import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	HashMap<K,V>
	HashMap<String,String>
	HashMap<Integer,String>
	HashMap<String,Student>**
	>> put("kim",new Student());
	
	class Student{ } Ŭ���� == ������ Ÿ��
*/

class Student{
	int kor;
	int math;
	int eng;
	String name;
	public Student(int kor, int math, int eng, String name) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}
}

class ArrayTest{
	ArrayList<String[]> al = new ArrayList<String[]>();
}

public class Ex15_Map_Generic {

	public static void main(String[] args) {
		HashMap<String, String> sts = new HashMap<String, String>();
		sts.put("A", "AA");
		System.out.println(sts.get("A"));
		
		//�ǹ����� Map
		//�л����� ���� ������
		// kim , [��, ��, ��] Array, Collection
		// 		�Ǵ� Class
		
		//Today Point - Generic�� Ŭ����, Collection, �迭 �� ��� ����
		HashMap<String, Student> smap = new HashMap<String, Student>();

		smap.put("hong", new Student(100, 80, 50, "ȫ�浿"));
		smap.put("kim", new Student(50, 30, 60, "������"));
		
		Student s = smap.get("hong");
		System.out.println(s.kor + ", " + s.math + ", " + s.eng);
		
		//Generic - Ÿ�Կ� �迭 ����
		ArrayTest at = new ArrayTest();
		at.al.add(new String[] {"A","B","C"});
		
		
		// - - - Tip - - - //
		//entrySet() >> Map�� Key, Value�� ���� >> key + "=" + value ������ Set ��ü return
		Set set = smap.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) 
			System.out.println(it.next());
		
		//Key��, Value�� �и��ؼ� �ޱ�
		//class Entry{ Object key, Object value } 	//Entry Ŭ���� �������
		//Map { Entry[] elements }					//Map�������̽��� ������ �ִ� Entry[] ��ü
		for(Map.Entry m : smap.entrySet()) {		//Map.Entry ��ü�� entrySet()�� ������ �и��ؼ� ��� ����
			System.out.println(m.getKey() + " / " + ((Student)m.getValue()).name);	//�⺻ Ÿ���� Object�� downcast����ߵ�
		}
		////////////////////////////////////////////////////
		System.out.printf("������ %d ���� %s", 1, "wjr");
		System.out.print("����Ʈ");
		
	}

}
