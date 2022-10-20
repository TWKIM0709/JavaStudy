import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
	Map 인터페이스
	(key, value) 쌍의 구조를 갖는 배열
	ex) 지역번호 (02, 서울) (031, 경기) 등...
	
	조건)
	key 중복 (X)
	value 중복 (O)
	
	Generic 지원
	
	Map 인터페이스 구현 클래스
	구버전 : HashTable 	( 동기화 보장 )
	신버전 : HashMap		(동기화를 강제하지 않음)
*/

public class Ex13_Map_Interface {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger", "1004");
		map.put("Scott", "1004");
		map.put("Superman", "1007");
		
		System.out.println(map.containsKey("tiger")); // false : 대소문자 구별함
		System.out.println(map.containsKey("Scott")); // true
		System.out.println(map.containsValue("1004"));// true
		
		System.out.println(map.get("Tiger"));
		System.out.println(map.get("Scott"));
		System.out.println(map.get("Superman"));
		
		System.out.println(map.get("hong"));	//없으면 null
		
		map.put("Tiger", "1008"); //value replace >> put에서 키값이 이미 있는 키값이면 value를 변경한다.
		System.out.println(map.get("Tiger"));
		System.out.println(map.size());
		
		System.out.println(map);	//{Superman=1007, Tiger=1008, Scott=1004}
		
		map.remove("Superman");
		System.out.println(map);
		
		//응용 (이해)
		Set set = map.keySet();	//이해 (Set 인터페이스를 구현하고 있는 객체를 생성해서 주소리턴)
		//순서 X , 중복 X
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collection clist = map.values();	//Value는 중복데이터가 있어서 순서가 있는 데이터 집합으로 관리
		System.out.println(clist); 			//그 타입이 Collection
	}

}





