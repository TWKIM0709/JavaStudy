import kr.or.bit.Emp;

/*
	��� 3���� ������.
	��.. �迭�� ����ض�
	
	��� ����
	1000 ȫ�浿
	2000 ������
	3000 ������
	
	Ÿ��[] �̸� = new Ÿ��[�迭ũ��];
	�̸�.name = "������"
	�̸�.��ȣ = 123
	
*/
public class Ex06_Array_Object {

	public static void main(String[] args) {
		Emp[] emp = { new Emp(1000,"ȫ�浿"), new Emp(2000,"������"), new Emp(3000,"������") };
		
		for(Emp value : emp) value.empInfoPrint();
		
//		ù��°(�⺻)���
//		Emp[] emp2 = new Emp[3];
//		emp2[0] = new Emp(1000,"ȫ�浿");
//		emp2[1] = new Emp(2000,"�浿");
//		emp2[2] = new Emp(3000,"ȫ��");
	}

}
