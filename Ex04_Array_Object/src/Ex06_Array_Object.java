import kr.or.bit.Emp;

/*
	사원 3명을 만들어라.
	단.. 배열을 사용해라
	
	사원 정보
	1000 홍길동
	2000 김유신
	3000 유관순
	
	타입[] 이름 = new 타입[배열크기];
	이름.name = "가나다"
	이름.번호 = 123
	
*/
public class Ex06_Array_Object {

	public static void main(String[] args) {
		Emp[] emp = { new Emp(1000,"홍길동"), new Emp(2000,"김유신"), new Emp(3000,"유관순") };
		
		for(Emp value : emp) value.empInfoPrint();
		
//		첫번째(기본)방법
//		Emp[] emp2 = new Emp[3];
//		emp2[0] = new Emp(1000,"홍길동");
//		emp2[1] = new Emp(2000,"길동");
//		emp2[2] = new Emp(3000,"홍동");
	}

}
