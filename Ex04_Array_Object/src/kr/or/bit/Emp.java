package kr.or.bit;

/**
 * 설계도 사원은 사원번호를 가지고 있다. 이름을 가지고 있다.
 * 
 * @author KOSA
 *
 */

public class Emp {
	private int empno;
	private String ename;

	// public Emp() {}
	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	// 기능 출력
	public void empInfoPrint() {
		System.out.println(this.empno + " / " + this.ename);
	}
}
