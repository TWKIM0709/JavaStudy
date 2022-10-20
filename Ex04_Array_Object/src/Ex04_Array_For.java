
public class Ex04_Array_For {

	public static void main(String[] args) {
		/*
		   Today Point
		   for �� ���� >> ���� for��, ������ for��
		   JAVA 		: for(Type ������ : �迭 or Collection) { ����� }
		   C#			: for(Type ������ in �迭 or Collection) { ����� }
		   JavaScript	: for(Type ������ in Collection) { ����� }
		 */

		int[] arr = {5,4,7,8,6,3};
		for(int value : arr) System.out.print(value + " ");
		System.out.println();
		
		String[] strarr = {"A","B","C","D","ffff"};
		for(String value : strarr) System.out.print(value + " ");
		System.out.println();
	}

}
