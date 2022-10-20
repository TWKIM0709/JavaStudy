import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.or.kosa.SingletonHelper;

public class Ex06_Oracle_Prepare_DML {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = SingletonHelper.getConnection("Oracle","KOSA","1004");
			String sql = "update dmlemp set ename=?, sal=?,job=?,deptno=? where empno=?";
			pstmt = conn.prepareStatement(sql);
			// delete from sdept where deptno = 10;
			//parameter
			pstmt.setString(1, "아무개");
			pstmt.setInt(2, 22222);
			pstmt.setString(3, "백수");
			pstmt.setInt(4, 10);
			pstmt.setInt(5, 1000);
			
			int row = pstmt.executeUpdate();
			if(row>0) {
				System.out.println("update row count : " + row);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			SingletonHelper.close(pstmt);
		}
	}
}
