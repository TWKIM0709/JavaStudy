package kr.or.kosa;
//사원을 정의 하세요
public class Emp {//class Emp는 데이터 타입이다.(큰 타입)
	//접근자//타입/변수

	public int number;
	private int empno; //객채지향 - 캡슐화 노란색인이유: 다른클래스에서는 사용 x ->getter,setter
	
	//getter(read), setter(write) -함수
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		//전달하기 전에 검증
		if(empno <0 ) {
			this.empno = 0;
		}else {
			this.empno = empno;
		}
		
	}
	
	 
	public void print() { //void 안에 있는 것을 실행한다.
		
		System.out.println("사원 번호: "+empno);
	}

}
