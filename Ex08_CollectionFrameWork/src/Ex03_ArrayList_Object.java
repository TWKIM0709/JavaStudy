import java.util.ArrayList;

import kr.or.kosa.Emp;

public class Ex03_ArrayList_Object {
	public static void main(String[] args) {
		//1. ��� 1��
		Emp emp = new Emp(1000,"ȫ�浿","����");
		System.out.println(emp);
		
		//2. ��� 2��
		Emp[] emp2 = {new Emp(100,"ȫ�浿","����"),new Emp(200,"������","�屺")};
		for(Emp e : emp2) System.out.println(e);
		System.out.println();
		//3. ����� �Ѹ� �� �Ի縦 �ߴ� ... (300,"�̾�","IT")
		//3.1 �� 3�� �迭 ���� => �̻�
		//�̷��� �Ⱦ ArrayList ���
		
		ArrayList elist = new ArrayList();
		elist.add(new Emp(100,"ȫ�浿","����"));
		elist.add(new Emp(200,"������","IT"));
		elist.add(new Emp(300,"�̾�","IT"));
//		System.out.println(elist);
		
		for(int i = 0; i<elist.size(); i++) {
			System.out.println(elist.get(i));
		}
		elist.add(new Emp(400,"�־�","����"));
		System.out.println();
		
		//toString ���� ������� ���� ���
		for(int i = 0; i< elist.size(); i++) {
			Emp e = (Emp)elist.get(i);
			System.out.printf("��� : %d\t�̸� : %s\t���� : %s\n",e.getEmpno(),e.getName(),e.getJob());
		}
		
		//���� ������ ... Object Ÿ�� ... downcasting ... ������
		//Object �������� Ÿ�� �������� >> ���ʸ�
		//���ʸ� (��ü ������ Ÿ���� �����ϴ� ���)
		ArrayList<Emp> list2 = new ArrayList<Emp>();
		list2.add(new Emp(1,"A","IT"));
		for(Emp e : list2) System.out.println(e.getEmpno());
		
	}
}
