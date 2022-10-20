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
		
		JDBC >> DML default : autocommit >> �ǹݿ�
		JDBC >> autocommit false >> �ݵ�� [commit]|[rollback] ����
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
			conn.setAutoCommit(false); //JDBC �����ڴ� [commit]|[rollback]�� �ǹ������� �ؾߵ�
			
			pstmt = conn.prepareStatement(sql);
			pstmt.executeQuery();
			
			pstmt2 = conn.prepareStatement(sql2);
			pstmt2.executeQuery();
			
			conn.commit();
			
		} catch (Exception e) {
			System.out.println("�����߻�" + e);
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







