import java.util.ArrayList;
import java.util.List;

//https://cafe.naver.com/kosait/329
/*
	�ڹ� 8���� �⺻ Ÿ��(��Ÿ��) : JAVA API�� ����
	
	8���� �⺻ Ÿ�Կ� ���ؼ� ��ü ���·� ��� �����ϵ��� ���� Ŭ����(Wrapper class)
	
	��� ����
	1. �Ű������� ��ü�� �䱸�� ��
	2. �⺻�� ���� �ƴ� ��ü ���·� ������ �ʿ��� ��
	3. ��ü�� ���� ���� ��
	4. Ÿ�� ��ȯ�� ó��
	
	>> Generic ���� (��ü ����) ex) int => Integer
*/
public class Ex08_Wrapper_Class {

	public static void main(String[] args) {
		int i = 100;
//		Integer n = new Integer(500);
//		System.out.println(n);
//		System.out.println(n.MAX_VALUE);
//		System.out.println(n.MIN_VALUE);
		
		//Point
		//parameter Ȱ��
		//Generic����** : ��ü ������ Ÿ�� ���� ��� >> wrapper class
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(100);
//		li.add("200");
		for(int value : li) {
			System.out.println(value);
		}
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2==i3);//false ( �ּҰ� �� )
		System.out.println(i2.equals(i3));	// true (�ּҿ� �ִ� [��]�� ���ϵ��� �����ǵǾ��ִ�.)
		
		int i4 = 100;
		int i5 = 100;
		System.out.println(i4==i5); //true ����
	}

}









