package kr.or.kosa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//요구사항
/*
 * 전체 프로젝트
 * 회원 : 전체조회 조건조회 삭제 수정 변경...
 * 각각의 페이지 5개
 * 1. 드라이버 로딩, 명령, 자원해제 ...
 * 2. 반복적인 코드 .. 제거
 * 
 * 제거되는 코드 .. 공통사항 << 이거 만들기
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
