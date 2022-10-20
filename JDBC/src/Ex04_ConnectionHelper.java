import java.sql.Connection;
import java.sql.SQLException;

import kr.or.kosa.ConnectionHelper;
import kr.or.kosa.SingletonHelper;

public class Ex04_ConnectionHelper {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		conn = ConnectionHelper.getConnection("Oracle");
		
		System.out.println(conn.toString());
		System.out.println(conn.getMetaData().getDatabaseProductName());
		System.out.println(conn.getMetaData().getDatabaseProductVersion());
		System.out.println(conn.isClosed());
		ConnectionHelper.close(conn);
		System.out.println(conn.isClosed());
		
		//////////////////////////////////////////////////////////////////////////////////
		Connection conn1 = null;
		conn1 = ConnectionHelper.getConnection("Oracle","HR","1004");
		
		System.out.println(conn1.toString());
		
		
		
		//////////////////////////////////////////////////////////////////////////////
		System.out.println("aaaaaaaaaaaaaaaaaaaaaa");
		Connection conn2 = null;
		conn2 = SingletonHelper.getConnection("Oracle","HR","1004");
		System.out.println(conn2.toString());
		
		conn2 = SingletonHelper.getConnection("Oracle","HR","1004");
		System.out.println(conn2.toString());
	}

}
