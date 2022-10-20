import java.util.List;

import DAO.DeptDao;
import DTO.Dept;

/*
	MVC ����
	
	Model   	: ������ : DTO, DAO	>> java
	View    	: ȭ��				>> jsp
	Controller 	: ����, ����			>> servlet
	
	������..(10.05)
	Model : DTO(vo) �����͸� �Ѱ� ���� �� �ִ� Ŭ���� , DAO DB�۾� >> java
	View  : java(console)
	...
*/
public class Program {

	public static void main(String[] args) {
		//main �Լ�
		DeptDao d = new DeptDao();
		//��ü��ȸ
		System.out.println("\t\t[��ü��ȸ]");
		List<Dept> deptlist = d.getDeptAllList();
		if(deptlist != null) {
			DeptPrint(deptlist);
		}
		
		//������ȸ
		System.out.println("\t\t[������ȸ]");
		Dept dept = d.getDeptListByDeptNo(10);
		if(dept!= null) {
			DeptPrint(dept);
		}
		
		//�����ͻ���
		System.out.println("\t\t[�����ͻ���]");
		int row = d.insertDept(new Dept(100,"IT","SEOUL"));
		if(row > 0) {
			System.out.println("insert row count : " + row);
		}
		//insert �� ��ü��ȸ
		System.out.println("\t\t[������ insert �� ��ü��ȸ]");
		deptlist = d.getDeptAllList();
		if(deptlist != null) {
			DeptPrint(deptlist);
		}
		
		//insert �� �����ϱ�
		row = d.updateDept(new Dept(100,"IT_UP","SEOUL_UP"));
		if(row > 0) {
			System.out.println("update row count : " + row);
		}
		//update �� ��ü��ȸ
		System.out.println("\t\t[������ update�� ��ü��ȸ]");
		deptlist = d.getDeptAllList();
		if(deptlist != null) {
			DeptPrint(deptlist);
		}
		
		//update ������ ����
		row = d.deleteDept(100);
		if(row > 0) {
			System.out.println("delete row count : " + row);
		}
		//delete �� ��ü��ȸ
		System.out.println("\t\t[������ Delete �� ��ü��ȸ]");
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