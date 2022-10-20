import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//All Day Point

public class Ex02_ArrayList {

	public static void main(String[] args) {
		//ArrayList : List 인터페이스를 구현 ( 순서 보장, 중복 허락 )
		
		ArrayList arl = new ArrayList();
		//Object 타입
		arl.add("asdf");
		arl.add(42);
		arl.add('a');
		arl.add(true);
		for(int i = 0; i<arl.size(); i++) {
			System.out.println(arl.get(i));
		}
		System.out.println(arl.toString());
		
		//add 함수는 순차적으로 데이터 넣기
		arl.add(0,111); // 덮어쓰는게 아니라 자리이동이 발생 [asdf, 42, a, true] -> [111, asdf, 42, a, true]
		System.out.println(arl);
		arl.add(4,444); //[111, asdf, 42, a, true] -> [111, asdf, 42, a, 444, true]
		System.out.println(arl);
		
		//** 비순차적인 데이터 추가 , 삭제 >> ArrayList 자료구조에 적합하지 않다.
		//** 순차적인 데이터의 추가, 삭제에 좋음
		
//		arl.remove(111);
//		System.out.println(arl);
		
		//[111, asdf, 42, a, 444, true]
		//ArrayList 함수 공부
		System.out.println("asdasfdsaffads");
		System.out.println(arl.contains(444));
		
		arl.clear(); // reset
		System.out.println(arl.size());
		System.out.println(arl.isEmpty()); //비어있는지
		
		arl.add(101);
		arl.add(102);
		arl.add(103);
		System.out.println(arl.isEmpty());
		System.out.println(arl.size());
		
		arl.remove(0);
		System.out.println(arl);
		
		//Point
		//인터페이스 부모 타입
		//개발자는 습관적으로 다형성 생각해야 (확장성, 유연성)
		List li = new ArrayList();
		//ArrayListli = new ArrayList();
		li.add(4);
		li.add(6);
		li.add(8);
		li.add(10);

		List li2 = li.subList(0, 2);	//subList 함수는 new ArrayList() 생성
										//다형성을 위해 부모타입(List)로 받는다.
		System.out.println(li2);
		
		ArrayList arl2 = new ArrayList();
		arl2.add(50);
		arl2.add(1);
		arl2.add(7);
		arl2.add(40);
		arl2.add(46);
		arl2.add(3);
		System.out.println(arl2);
		
		Collections.sort(arl2);	// 내부적으로 정렬
		System.out.println(arl2);
		
		Collections.reverse(arl2);	// 뒤집기 (역순정렬이 아님!!)
		System.out.println(arl2);
	}

}









