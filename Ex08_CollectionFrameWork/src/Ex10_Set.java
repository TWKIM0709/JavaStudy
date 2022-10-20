import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
	Set 인터페이스	>>	순서 없음, 중복 불가
	순서가 없고 중복을 허락하지 않는 데이터 집합
	
	구현하는 클래스
	HashSet , TreeSet(자료구조에서 중요) , 
*/
public class Ex10_Set {

	public static void main(String[] args) {
		//순서가 없는 [중복되지 않은] 데이터 집합
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(100);
		boolean bo = hs.add(55);
		System.out.println("정상 : " + bo);
		
		bo = hs.add(1);
		System.out.println("결과 : " + bo);
		
		System.out.println(hs);
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("a");
		hs2.add("f");
		hs2.add("c");
		hs2.add("Z");
		hs2.add("a");
		hs2.add("H");
		hs2.add("b");
		hs2.add("b");
		System.out.println(hs2);
		
		String[] strobj = {"A","B","C","D","B","A"};
		HashSet<String> hs3 = new HashSet<String>();
		
		for(int i = 0; i<strobj.length; i++) {
			hs3.add(strobj[i]);
		}
		
		System.out.println(hs3);
		
		//Quiz       HashSet을 사용해 1 ~ 45 로또 
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size() < 6) {
			lotto.add((int) (Math.random() * 45) + 1);
		}
		System.out.println(lotto);
		
		lotto.clear();
		
		for(;lotto.size()<6;) {
			lotto.add((int)(Math.random() * 45) + 1);
		}
		System.out.println(lotto);
		
		//HashSet 다형성 >> 부모 >> Set
		Set set2 = new HashSet();
		
		ArrayList a = new ArrayList();
		
		
		Set<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("BB");
		set3.add("CC");
		set3.add("AA");
		System.out.println(set3);
		
		Iterator<String> st = set3.iterator();
		while(st.hasNext()) {
			System.out.println(st.next());
		}
	}

}



