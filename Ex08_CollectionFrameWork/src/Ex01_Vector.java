import java.util.Calendar;
import java.util.Vector;

/*
	Collection FrameWork
	[다수의 데이터]를 다루는 [표준화된 인터페이스]를 구현하고 있는 [클래스의 집합]
	
	Collection 인터페이스 -> 상속 인터페이스 List (구현 : ArrayList), Set (구현 : HashSet..)
	
	>> ArrayList 의 부모타입은 List 이다. >> 다형성
	>> Collection 는 ArrayList 의 부모타입이다. >> 다형성
	
	Map 인터페이스 (key, value) 한쌍의 배열 (구현 : HashMap)
	
	1. List (줄서기)
	순서가 있음. 중복 허용. >> 내부적으로 데이터(자료)를 배열로 관리
	
	1.1 Vector(구버전) >> 동기화를 보장 (멀티 스레드) >> Lock 보호 >> 성능은 조금 약해짐
	1.2 ArrayList(신버전) >> 동기화 보장 (멀티 스레드) >> Lock 은 옵션 >> 성능 우선 
	
	기존 다수의 데이터를 다루는 방법 : Array (정적, 고정)
	 - 방의 개수가 한번 정해지면 변경 불가
	 - 데이터가 많아지면.. 새로운 크기의 배열을 만들고 데이터 이동 ( 코드로 직접 구현 **)
	
	List 인터페이스를 구현하고 있는 (Vector , ArrayList)
	1. 배열의 크기를 동적으로 확장 or 축소 가능 >> 진실은... 컴파일러가 새로운 배열을 만들고 데이터 이동을 알아서 해주는 것
	2. 순서를 유지 (내부적으로 Array 사용) , 중복값 사용 가능
	3. 데이터 저장 공간 : Array 사용
	
*/
public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 default 용량 : " + v.capacity()); //10
		System.out.println("size : " + v.size());	//0 (실 데이터의 크기)
		
		v.add(10);
		v.add("age");
		v.add('A');
		v.add(10.1);
		
		System.out.println("size : " + v.size());	//4 (실 데이터의 크기)
		System.out.println(v.toString());	//[10, age, A, 10.1] 데이터 출력 재정의
		//Array.length =/= Collection.size
		
		for(int i = 0; i<v.size(); i++) System.out.println(v.get(i));	//Collection에서 값을 받는 법 >> get(index)
									
		//개선된 for문
		for(Object value : v) System.out.println(value);
		
		//단점 : 작은데이터(같은 타입의 데이터)를 사용해도 ... 가장 큰타입(Object)을 사용하는 것... 불합리
		//제너릭 >> 타입을 강제
		Vector<String> v2 = new Vector<String>();
		v2.add("hello");
		v2.add("world");
		for(String str : v2) System.out.println(str);
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity()); //10
		
		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");
		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");
		
		System.out.println(v3.toString());
		System.out.println(v3.capacity()); //20
		
		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");
		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");		v3.add("A");
		
		System.out.println(v3.toString());
		System.out.println(v3.capacity()); //40		
	}

}









