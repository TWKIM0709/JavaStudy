
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

	// Today point (�迭�� Ÿ���̴� == �迭�� ��ü��)
	int add(int param) {
		return param + 100;
	}
	
	
	int[] add(int[] params) {	// params �� int[] �迭�� '�ּҰ�'�� �޴´� 
		
		int [] target = new int[params.length];
		
		for(int i = 0; i<target.length; i++) {
			target[i] = params[i] + 1;
		}
		return target; //	int[] �迭�� '�ּҰ�'�� �����Ѵ�
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















