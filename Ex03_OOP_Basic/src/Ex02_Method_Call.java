import kr.or.kosa.Fclass;
import kr.or.kosa.TV;

public class Ex02_Method_Call {

	public static void main(String[] args) {
		//Fclass ���� ... �޸𸮿� �ø��� ... ��ü����
		Fclass fclass = new Fclass();
		
		fclass.m(); //ȣ���ߴ� : Call �ߴ�
		
		fclass.m2(23);
		
		int result = fclass.m3();
		System.out.println("m3 �Լ� ȣ��� ���� ���� �� result : " + result);	
		
		int result2 = fclass.m4(555);
		System.out.println("m4 �Լ� ȣ��� ���� ���� �� result2 : " + result2);
		
		result2 = fclass.sum(100, 200, 300);
		System.out.println("sum �Լ� ȣ��� ���� ���� �� result2 : " + result2);
		
		fclass.callSubSum();
		
		result2 = fclass.opSum(30);
		System.out.println("opSum(30) �Լ� ȣ��� ���� ���� �� result2 : " + result2);

		result2 = fclass.opSum(-30);
		System.out.println("opSum(-30) �Լ� ȣ��� ���� ���� �� result2 : " + result2);
		
		System.out.println(fclass.max(10, 5));
		
		System.out.println("asdfdsf");
		
	}

}
