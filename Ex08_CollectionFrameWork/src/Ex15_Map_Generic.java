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
	
	class Student{ } 클래스 == 데이터 타입
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
		
		//실무에서 Map
		//학생들의 성적 데이터
		// kim , [국, 영, 수] Array, Collection
		// 		또는 Class
		
		//Today Point - Generic에 클래스, Collection, 배열 등 사용 가능
		HashMap<String, Student> smap = new HashMap<String, Student>();

		smap.put("hong", new Student(100, 80, 50, "홍길동"));
		smap.put("kim", new Student(50, 30, 60, "김유신"));
		
		Student s = smap.get("hong");
		System.out.println(s.kor + ", " + s.math + ", " + s.eng);
		
		//Generic - 타입에 배열 가능
		ArrayTest at = new ArrayTest();
		at.al.add(new String[] {"A","B","C"});
		
		
		// - - - Tip - - - //
		//entrySet() >> Map의 Key, Value를 가공 >> key + "=" + value 형식의 Set 객체 return
		Set set = smap.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) 
			System.out.println(it.next());
		
		//Key값, Value값 분리해서 받기
		//class Entry{ Object key, Object value } 	//Entry 클래스 구성요소
		//Map { Entry[] elements }					//Map인터페이스가 가지고 있는 Entry[] 객체
		for(Map.Entry m : smap.entrySet()) {		//Map.Entry 객체에 entrySet()을 담으면 분리해서 사용 가능
			System.out.println(m.getKey() + " / " + ((Student)m.getValue()).name);	//기본 타입이 Object라 downcast해줘야됨
		}
		////////////////////////////////////////////////////
		System.out.printf("가나다 %d 문장 %s", 1, "wjr");
		System.out.print("프린트");
		
	}

}
