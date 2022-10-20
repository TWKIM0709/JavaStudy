package kr.or.kosa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//�䱸����
/*
 * ��ü ������Ʈ
 * ȸ�� : ��ü��ȸ ������ȸ ���� ���� ����...
 * ������ ������ 5��
 * 1. ����̹� �ε�, ����, �ڿ����� ...
 * 2. �ݺ����� �ڵ� .. ����
 * 
 * ���ŵǴ� �ڵ� .. ������� << �̰� �����
 */

public class ConnectionHelper {
	public static Connection conn;
	public static Connection getConnection(String dsn) {
		try {
			if(dsn.toLowerCase().equals("oracle")) {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KOSA","1004");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static Connection getConnection(String dsn,String id, String pw) { 
		Connection conn = null;
		try {
			if(dsn.toLowerCase().equals("oracle")) {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",id,pw);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void close(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void close(Statement stmt) {
		if(stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void close(PreparedStatement pstmt) {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}