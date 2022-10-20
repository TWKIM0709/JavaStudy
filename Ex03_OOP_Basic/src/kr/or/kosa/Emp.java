package kr.or.kosa;

public class Emp {
	
	//member field ( instance variable )
	private int empno;
	private String ename;
	private String job;
	private int sal;
	
	//setter , getter method
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	//method (기능)
	public void empDataPrint(){
		System.out.println("사원데이터 출력");
		
		//method
		//함수 안에 있는 변수는 지역 변수 >> 접근자를 붙이지 않음 >> 어차피 이 함수 안에서만 쓰는거라
		int data = 0;
		int input = 0;
		
		//Block Variable
		//for(int i = 0; i< 10; i++) {}
	}
}
