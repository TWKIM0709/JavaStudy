package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DTO.Dept;
import DTO.Emp;
import UTILS.SingletonHelper;
//전체조회
//조건조회 where empno=7788
//삽입  insert into emp( ....) values(...)
//삭제  delete from emp where empno=7788
//수정  update emp set ename=? , job=? , sal=? , hiredate=?  where empno=?
//Like 검색 이름 검색
public class EmpDao {
	Connection conn = null;
	
	public EmpDao() {
		conn = SingletonHelper.getConnection("oracle");
	}
	
	//1. 전체조회 >> select * from dept >> return multi row
	public List<Emp> getEmpAllList(){		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Emp> empList = new ArrayList<Emp>();
		try {			
//			EMPNO    NOT NULL NUMBER       
//			ENAME             VARCHAR2(10) 
//			JOB               VARCHAR2(9)  
//	ㅇ		MGR               NUMBER       
//			HIREDATE          DATE         
//			SAL               NUMBER       
//	ㅇ		COMM              NUMBER       
//			DEPTNO            NUMBER    
			String sql = "select empno, ename, job, mgr, hiredate,sal,nvl(comm,0),deptno from emp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				do {
					empList.add(new Emp(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5),rs.getInt(6),rs.getInt(7),rs.getInt(8)));
				}while(rs.next());
			} else {
				System.out.println("조회된 데이터가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println("전체조회 문제 발생 : " + e);
		} finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
		}
		return empList;
	}
	
	//2. 조건조회 (deptno pk) >> select * from dept where deptno = ? >> return single row
	public Dept getDeptListByDeptNo(int deptno) {		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from dept where deptno=?";
		Dept dept = null;
		try {			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, deptno);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
//				System.out.println(rs.getInt(1) + "/" + rs.getString(2) + "/" + rs.getString(3));
				dept = new Dept(rs.getInt(1),rs.getString(2),rs.getString(3));
			} else {
				System.out.println("조회된 데이터가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println("조건 조회 문제 발생 : " + e);
		} finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
		}
		return dept;
	}
	
	//3. 데이터 삽입 >> insert into dept(deptno, dname, loc) values (?,?,?)
	public int insertDept(Dept dept) {		
		PreparedStatement pstmt = null;
		String sql = "insert into dept(deptno, dname, loc) values (?,?,?)";
		int row = 0;
		try {			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("데이터 삽입 문제 발생 : " + e);
		} finally {
			SingletonHelper.close(pstmt);
		}
		return row;
	}
	
	//4. 데이터 수정 >> update dept set dname=?, loc=? where deptno=?
	public int updateDept(Dept dept) {		
		PreparedStatement pstmt = null;
		String sql = "update dept set dname=?, loc=? where deptno=?";
		int row = 0;
		try {			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("데이터 수정 문제 발생 : " + e);
		} finally {
			SingletonHelper.close(pstmt);
		}
		return row;
	}
	
	//5. 데이터 삭제 >> delete from dept where deptno=?
	public int deleteDept(int deptno) {		
		PreparedStatement pstmt = null;
		String sql = "delete from dept where deptno=?";
		int row = 0;
		try {			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, deptno);
			
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("데이터 수정 문제 발생 : " + e);
		} finally {
			SingletonHelper.close(pstmt);
		}
		return row;
	}
	//6. 전체조회 >> select * from dept >> return multi row
	public List<Dept> getDeptByLikeDname(String like){		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from dept where dname like ?";
		List<Dept> deptList = new ArrayList<Dept>();
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, like);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				do {
//					System.out.println(rs.getInt(1) + "/" + rs.getString(2) + "/" + rs.getString(3));
					deptList.add(new Dept(rs.getInt(1),rs.getString(2),rs.getString(3)));
				}while(rs.next());
			} else {
				System.out.println("조회된 데이터가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println("like조회 문제 발생 : " + e);
		} finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
		}
		return deptList;
	}
	
	//+ 필요에 따라서
	//검색 like.. 여러개의 조건 조회... 등
	
	public static void main(String[] args) {
//		EmpDao e = new EmpDao();
//		e.getEmpAllList();
		System.out.println(new Date());
	}
}












