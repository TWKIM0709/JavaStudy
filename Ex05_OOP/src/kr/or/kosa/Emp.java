package kr.or.kosa;

// 데이터를 담을 수 있는 클래스 (1건)
// DTO , VO , DOMAIN 이라 부른다

public class Emp { // extends Object 생략되어 있음
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
	
	// Object >> toString() 함수는 일반적으로 재정의를 가장 많이 하는 함수 ...
	// 만약 재정의를 하지 않으면 >> toString()은 주소값을 출력하는 함수
	// toString() 일반적으로는 member field정보를 출력하는 형태로 재정의한다.
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", empname=" + empname + "]";
	}

	
	
	
	
	
	

	
}
