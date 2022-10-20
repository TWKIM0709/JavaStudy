import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex12_Set_TreeSet {

	public static void main(String[] args) {
		//Set : 순서 X , 중복 X
		
		//TreeSet
		//순서 X , 중복 X , 정렬기능 O
		//검색하거나 .. 정렬이 필요한 자료구조
		//ex) 로또
		
		//특징
		//1. 이진 트리 구조 (뒤집은 나무) : root > leaf
		//2. 데이터 저장시 정렬기능 제공
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("D");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("P");
		System.out.println(hs);
		
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(;lotto.size()<6;) {
			lotto.add((int)(Math.random()*45 + 1));
		}
		System.out.println(lotto);
	}

}
