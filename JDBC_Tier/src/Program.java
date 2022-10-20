import java.util.List;

import DAO.DeptDao;
import DTO.Dept;

/*
	MVC 패턴
	
	Model   	: 데이터 : DTO, DAO	>> java
	View    	: 화면				>> jsp
	Controller 	: 조종, 제어			>> servlet
	
	지금은..(10.05)
	Model : DTO(vo) 데이터를 한건 담을 수 있는 클래스 , DAO DB작업 >> java
	View  : java(console)
	...
*/
public class Program {

	public static void main(String[] args) {
		//main 함수
		DeptDao d = new DeptDao();
		//전체조회
		System.out.println("\t\t[전체조회]");
		List<Dept> deptlist = d.getDeptAllList();
		if(deptlist != null) {
			DeptPrint(deptlist);
		}
		
		//조건조회
		System.out.println("\t\t[조건조회]");
		Dept dept = d.getDeptListByDeptNo(10);
		if(dept!= null) {
			DeptPrint(dept);
		}
		
		//데이터삽입
		System.out.println("\t\t[데이터삽입]");
		int row = d.insertDept(new Dept(100,"IT","SEOUL"));
		if(row > 0) {
			System.out.println("insert row count : " + row);
		}
		//insert 후 전체조회
		System.out.println("\t\t[데이터 insert 후 전체조회]");
		deptlist = d.getDeptAllList();
		if(deptlist != null) {
			DeptPrint(deptlist);
		}
		
		//insert 후 수정하기
		row = d.updateDept(new Dept(100,"IT_UP","SEOUL_UP"));
		if(row > 0) {
			System.out.println("update row count : " + row);
		}
		//update 후 전체조회
		System.out.println("\t\t[데이터 update후 전체조회]");
		deptlist = d.getDeptAllList();
		if(deptlist != null) {
			DeptPrint(deptlist);
		}
		
		//update 데이터 삭제
		row = d.deleteDept(100);
		if(row > 0) {
			System.out.println("delete row count : " + row);
		}
		//delete 후 전체조회
		System.out.println("\t\t[데이터 Delete 후 전체조회]");
		deptlist = d.getDeptAllList();
		if(deptlist != null) {
			DeptPrint(deptlist);
		}
//		d.getDeptByLikeDname("A%");
	}
	public static void DeptPrint(Dept dept) {
		System.out.println(dept.toString());
	}
	public static void DeptPrint(List<Dept> list) {
		for(Dept dept : list) {
			System.out.println(dept.toString());
		}
	}
}
