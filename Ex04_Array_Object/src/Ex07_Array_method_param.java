
class Human {
	String name;
}

class OverTest {
	int add(int i, int j) {
		return i + j;
	}

	void add(Human human) {
		System.out.println(human.name);
	}

	// Today point (배열도 타입이다 == 배열은 객체다)
	int add(int param) {
		return param + 100;
	}
	
	
	int[] add(int[] params) {	// params 는 int[] 배열의 '주소값'을 받는다 
		
		int [] target = new int[params.length];
		
		for(int i = 0; i<target.length; i++) {
			target[i] = params[i] + 1;
		}
		return target; //	int[] 배열의 '주소값'을 리턴한다
	}
	
	
}

public class Ex07_Array_method_param {
	public static void main(String[] args) {
		OverTest ot = new OverTest();
		
		int[] source = {10,20,30,40,50};
		
		int[] ta = ot.add(source);
		
		for(int value : ta) System.out.println(value);
		
	}
}















