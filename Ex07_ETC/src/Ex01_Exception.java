
/*
	����
	1. ����(Error)		>> ��Ʈ��ũ ���, �޸� ����, �ϵ���� �� �� >> �����ڰ� �ڵ������� �ذ� �Ұ�
	2. ����(Exception)	>> �������� �ڵ� �Ǽ��� ���� �߻� >> ���� �ڵ带 ã�Ƽ� ���� >> ����
						>> ������ �ð� �ƴ϶� ... ������ �� ... �˱� ����
						>> ������ �߻��ϸ�(Exception) ���α׷� ���� ����
	3. ����ó�� 			>> ���ܹ߻��� ���� �ڵ带 �����ϴ� ���� �ƴϰ� >> �ӽ� �������� ������ ������� ���α׷��� ���������� ���� �Ǵ� ���� ó��
						>> �ᱹ���� ����ó���� ���ؼ� ������ ���� �κ��� ã�� >> �ٽ� �ڵ带 �����ؾ��Ѵ�.
	   try {
	   	 >> ������ �ǽɵǴ� �ڵ� ����
	   	 >> ������ �߻�(exception)
	   }catch(Exception e){
	   	 >> ������ �߻��� ���ܺκ��� �ľ� ...
	   	 >> ó�� (�ڵ带 �����ϴ� ���� �ƴϰ� �����ϴ� ��)
	   	 >> �� �κп��� ���ϴ� ��
	   	 >> 1. ������ email
	   	    2. �α����Ͽ� ��� (��� �߻� ���)
	   	    3. ������ ���α׷��� ����Ǵ� �� ����
	   	 >> �����ڰ� ������ �ް� �����ϰ� �Ǵ� ���� ��...
	   }finally{
	   	 >> ������ �߻��ϴ�, �߻����� �ʴ� ���������� �����ؾ� �� �ڵ�
	   	 >> Ư�� �ڿ��� ���� ���Ḧ ����
	   }
*/

public class Ex01_Exception {

	public static void main(String[] args) {
		/*
		System.out.println("Main Start");
		
		System.out.println(0/0); //java.lang.ArithmeticException: / by zero
		//���α׷��� ���� ����
		
		//main end ������ ȭ�鿡 ��µ��� ����
		System.out.println("Main End");
		*/

		System.out.println("Main Start");
		try {
			System.out.println(0/0);
			
			//e ������ >> Exception e >> Exception ��ü�� �ּҰ�
			
			//ArithmeticException ������ �߻�
			//>> �����Ϸ��� ���ؼ� ArithmeticException ��ü�� ����
			//>> �� ��ü���� ������ �Ǵ� �޼���, �ڵ� ����
		}catch(Exception e) {	// �θ�Ÿ���� ������ �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�.
			System.out.println(e.getMessage());
		}
		System.out.println("Main End");
	}

}








