/*
	String Ŭ���� ( ���ڿ� )
	String �� ���� �Լ��� ������ ���� >> ���ڿ��� ����(�ڸ���, ��ġ�� ...)
	String >> static �Լ� + �Ϲ��Լ� (15 ~ 20�� ���)
	
	Point1) ���ڿ� �񱳴� str.equals("str") ���
*/

public class Ex05_String_Class {

	public static void main(String[] args) {
		// ����� : int, double ���� ��Ÿ��ó�� ���
		String str = "str";
		String[] strarr = { "aaa", "bbb", "ccc" };
		for (String s : strarr)
			System.out.println(s);

		// String Ŭ������ �Լ�
		String str2 = "ȫ�浿";
		System.out.println(str2.length());
		System.out.println(str2); 				//
		System.out.println(str2.toString());	// �ּҷΰ��� �����͸� �����ϵ��� override
		
		//����
		String str3 = new String("ddd");
		System.out.println(str3);
		
		String name = "�����ٶ�";
		//String�� ���������� char[] member field >> ['��']['��']['��']['��']['��'] �迭�� �ּҰ��� ������
		//class String extends Object { prviate char[] str ... @Override toString(){} ... } ���� �̷��� �����
		
		String str4 = "AAA";
		String str5 = "AAA";
		
		//���ڿ��� ��
		System.out.println(str4);
		System.out.println(str5.toString());	//toString() �����ǵǾ� '�ּҰ�'�� �ƴ� '��'�� ���´�
		
		System.out.println(str4==str5);
		// == ������ ���� �� >> str4(�ּҰ�), str5(�ּҰ�)
		// ���� �ּ� �Ǹ�
		//**�޸𸮿� ������ ���� ���ڿ��� ������ '����'�Ѵ�. >> ���� ���� ���� ���ڿ��� ������ ���� ����°� �ƴ϶� ���� �ִ��ſ� �̾����
		
		// ���ڿ� �񱳴� equals("")
		System.out.println(str4.equals(str5));	// �ּҸ� ã�ư��� �� �ȿ� �ִ� ���� ��
		
		// Why??	: ���ڿ��� �񱳴� == �� �ƴ� equals()�� ��� �ǳ�
		String str6 = new String("BBB");
		String str7 = new String("BBB");	// str = "aaa"�� ��ǻ�Ϳ� �ñ�� ����������
											// new�� ����ؼ� heap �޸𸮿� ���� ���� ���� ����?����? 
		System.out.println(str6 == str7);	// false >> �̷� ��찡 ���� �� �ִ�.
		
		System.out.println(str6.equals(str7));
		
		
	}

}






