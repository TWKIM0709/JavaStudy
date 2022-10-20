import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.or.kosa.SingletonHelper;

/*
		create table trans_A(
		    num number,
		    name varchar2(20)
		);
		create table trans_B(
		    num number constraint pk_trans_B_num primary key,
		    name varchar2(20)
		);
		
		JDBC >> DML default : autocommit >> 실반영
		JDBC >> autocommit false >> 반드시 [commit]|[rollback] 강제
*/
public class Ex07_Transaction {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		
		conn = SingletonHelper.getConnection();
		
		String sql = "insert into trans_A(num,name) values (100,'A')";
		String sql2 = "insert into trans_B(num,name) values (100,'B')";
		
		try {
			conn.setAutoCommit(false); //JDBC 개발자는 [commit]|[rollback]을 의무적으로 해야됨
			
			pstmt = conn.prepareStatement(sql);
			pstmt.executeQuery();
			
			pstmt2 = conn.prepareStatement(sql2);
			pstmt2.executeQuery();
			
			conn.commit();
			
		} catch (Exception e) {
			System.out.println("문제발생" + e);
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			SingletonHelper.close(pstmt);
			SingletonHelper.close(pstmt2);
			SingletonHelper.close(conn);
		}
	}

}







