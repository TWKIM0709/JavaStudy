package kr.or.kosa;

// �����͸� ���� �� �ִ� Ŭ���� (1��)
// DTO , VO , DOMAIN �̶� �θ���

public class Emp { // extends Object �����Ǿ� ����
	private int empno;
	private String empname;

	public Emp(int empno, String empname) {
		this.empno = empno;
		this.empname = empname;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	// Object >> toString() �Լ��� �Ϲ������� �����Ǹ� ���� ���� �ϴ� �Լ� ...
	// ���� �����Ǹ� ���� ������ >> toString()�� �ּҰ��� ����ϴ� �Լ�
	// toString() �Ϲ������δ� member field������ ����ϴ� ���·� �������Ѵ�.
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", empname=" + empname + "]";
	}

	
	
	
	
	
	

	
}
