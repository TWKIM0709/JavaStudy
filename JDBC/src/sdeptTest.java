import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.or.kosa.SingletonHelper;

//sdept 테이블에 대해서
//전체조회
//조건조회
//삽입
//삭제
//수정
public class sdeptTest {
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement pstmt;
	
	//DB연결
	public void connect() {
		conn = SingletonHelper.getConnection("Oracle","KOSA","1004");
	}
	//DB연결해제
	public void close() {
		SingletonHelper.close(conn);
	}
	//전체조회
	public void select() {
		//DB연결
		connect();
		try {
			String sql = "select * from sdept";		
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			//데이터 한건 또는 한건 이상 또는 없는 경우에 대한 if else
			if(rs.next()) {
				do {
					System.out.println(rs.getInt(1) + "/" + rs.getString(2));
				}while(rs.next());
			} else {
				System.out.println("조회된 데이터가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//조건조회
	public void select(int deptno) {
		//DB연결
		connect();
		try {
			String sql = "select * from sdept where deptno=?";		
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, deptno);
			
			rs = pstmt.executeQuery();
			
			//데이터 한건 또는 한건 이상 또는 없는 경우에 대한 if else
			if(rs.next()) {
				do {
					System.out.println(rs.getInt(1) + "/" + rs.getString(2));
				}while(rs.next());
			} else {
				System.out.println("조회된 데이터가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		sdeptTest s = new sdeptTest();
		s.select();
		System.out.println();
		s.select(10);
	}
}





