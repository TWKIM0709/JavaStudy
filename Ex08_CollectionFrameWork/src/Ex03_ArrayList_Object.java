import java.util.ArrayList;

import kr.or.kosa.Emp;

public class Ex03_ArrayList_Object {
	public static void main(String[] args) {
		//1. 사원 1명
		Emp emp = new Emp(1000,"홍길동","영업");
		System.out.println(emp);
		
		//2. 사원 2명
		Emp[] emp2 = {new Emp(100,"홍길동","병졸"),new Emp(200,"김유신","장군")};
		for(Emp e : emp2) System.out.println(e);
		System.out.println();
		//3. 사원이 한명 더 입사를 했다 ... (300,"이씨","IT")
		//3.1 방 3개 배열 생성 => 이사
		//이런게 싫어서 ArrayList 사용
		
		ArrayList elist = new ArrayList();
		elist.add(new Emp(100,"홍길동","영업"));
		elist.add(new Emp(200,"김유신","IT"));
		elist.add(new Emp(300,"이씨","IT"));
//		System.out.println(elist);
		
		for(int i = 0; i<elist.size(); i++) {
			System.out.println(elist.get(i));
		}
		elist.add(new Emp(400,"최씨","관리"));
		System.out.println();
		
		//toString 없이 사원들의 정보 출력
		for(int i = 0; i< elist.size(); i++) {
			Emp e = (Emp)elist.get(i);
			System.out.printf("사번 : %d\t이름 : %s\t직종 : %s\n",e.getEmpno(),e.getName(),e.getJob());
		}
		
		//현업 개발자 ... Object 타입 ... downcasting ... 불편함
		//Object 쓰지말고 타입 강제하자 >> 제너릭
		//제너릭 (객체 생성시 타입을 강제하는 방법)
		ArrayList<Emp> list2 = new ArrayList<Emp>();
		list2.add(new Emp(1,"A","IT"));
		for(Emp e : list2) System.out.println(e.getEmpno());
		
	}
}
