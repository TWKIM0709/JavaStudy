import kr.or.kosa.Emp;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("Hello");
		//Emp 설계도를 구채화 (객체를 만듦)
		Emp emp = new Emp(); 
		emp.setEmpno(-8888);
		int empno = emp.getEmpno();
		System.out.println(empno);
		emp.number = -100;
		
		emp.print();
	}

}
/*static: Ex01 ex = new Ex01() 를 하지 않아도 메모리에 올라감
void: 함수는 아무것도 return 하지 않는다.
main: 함수이름이 main이면 바로실행한다.
*/