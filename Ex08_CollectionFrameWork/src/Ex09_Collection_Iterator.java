import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
	Collection FrameWork
	>> 수 많은 인터페이스, 클래스가 존재
	
	Iterator 인터페이스 (반복자?)
	>> 나열된 자원에 대해 순차적으로 접근해서 값을 리턴하는 **'표준'을 정의
	추상함수로 정의하고 있다 >> 누군가(ArrayList)는 추상함수를 구현
	
	Iterator 인터페이스가 가지고 있는 추상함수
	>> hasNext() , Next() , remove()
	>> ArrayList implements Iterator { ... 재정의 ... 구현 ... }
	
*/
public class Ex09_Collection_Iterator {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);

		//표준화된 방식 ( 순서대로 나열된 데이터에 대해서 )
		Iterator it =  list.iterator();	//호출하면 함수 안에서 인터페이스를 구현하는 객체가 생성되고 그 주소를 리턴
		while(it.hasNext()) {
			System.out.println(it.next());
		}System.out.println();
		
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		
		//이니터페이스 Generic 명시 (주의**)
		Iterator<Integer> it2 = intlist.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}System.out.println();
		
		//단점 : 융통성이 없어 이런게 안된다
		for(int i = intlist.size()-1; i>=0; i--) {
			System.out.println(intlist.get(i));
		}
		
		/////////////////////////////////////////////////////////////////////
		// Iterator 인터페이스 표준화 ... 순방향만?						6543210 바로는 안되고
		// 역방향은 ... 안되어 있음 ... 순방향으로 가서 돌아오는 방법으로 씀	0123456 간 다음 6543210 돌아오는 방법
		
		ListIterator<Integer> it3 = intlist.listIterator();
		
		while(it3.hasNext()) {	//한번 뒤로 간 다음 (순방향)
			System.out.println(it3.next());
		}
		
		while(it3.hasPrevious()) {	// 역방향으로 돌아온다..
			System.out.println(it3.previous());
		}
	}

}
