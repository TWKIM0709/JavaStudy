import kr.or.kosa.Emp;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("Hello");
		//Emp ���赵�� ��äȭ (��ü�� ����)
		Emp emp = new Emp(); 
		emp.setEmpno(-8888);
		int empno = emp.getEmpno();
		System.out.println(empno);
		emp.number = -100;
		
		emp.print();
	}

}
/*static: Ex01 ex = new Ex01() �� ���� �ʾƵ� �޸𸮿� �ö�
void: �Լ��� �ƹ��͵� return ���� �ʴ´�.
main: �Լ��̸��� main�̸� �ٷν����Ѵ�.
*/