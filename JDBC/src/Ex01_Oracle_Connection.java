import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
	JDBC
	1. Java 언어를 통해서 Oracle 연결 후 CRUD
	2. Java : Oracle, My-sql, MS-sql 등등 연결하고 작업 가능 (CRUD)
	2.1 각각의 제품에 맞는 드라이버를 가지고 있어야 한다.
		Oracle	C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
				C:\KOSA_IT\DataBase\JDBC\ConnectionUtils\Oracle (로 복사해둠)
		Mysql	https://dev.mysql.com/downloads/windows/installer/8.0.html
	3. 드라이버를 참조 >> 현재 프로젝트에서 사용하도록
		프로젝트 속성 > JavaBuildPath > Libraries > Add External ajr > 추가
	3.1 드라이버 사용 준비 완료 >> 메모리에 load해서 사용
	3.2 Class.forName("oracle.jdbc.OracleDriver") >> 객체를 new한거랑 비슷함
	4. JAVA CODE (CROD) >> JDBC API 제공 받음
	4.1 import java.sql.* >> interface, class 제공
	4.2 개발자는 interface를 통해 표준화된 DB 작업 수행 가능
	Point) 왜 interface 형태로 제공할까 >> JDBC API의 대상이 여러개 >> Oracle, Mysql...등등
		   다형성을 활용..OracleConnection , MysqlConnection 모두 Connection으로 사용가능
	import java.sql.Connection
	import java.sql.ResultSet
	import java.sql.Statment 등등
	5. 작업순서
	5.1 DB연결 -> 명령생성 -> 명령실행 -> 처리 -> 자원해제
	5.2 명령 : DDL(create , alter , drop) 많이 안씀
			  CRUD(insert , select , update , delete) 많이 씀
		실행 : 쿼리문을 DB서버에 전달
		처리 : 결과를 받아서 화면에 출력, 또는 다른 프로그램에 전달 등등..
		자원해제 : 연결해제
*/
public class Ex01_Oracle_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//DB 연결 -> 명령생성 -> 실행 -> 처리
		Class.forName("oracle.jdbc.OracleDriver"); //Class.forName(드라이버 이름) 안해도됨
		System.out.println("오라클 드라이버 로딩....");
		
		//loading된 드라이버를 통해 oracle 연결
		//DriverManager.getConnection("jdbc:oracle:thin:@주소:포트번호:이름(xe)","계정","계정암호");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KOSA","1004");
		System.out.println(conn.isClosed() + "(연결되었으면 false)");
		
		//명령 객체 얻어오기
		Statement stmt = conn.createStatement();
		
		String str = "select empno, ename, sal from emp";
		
		//명령 실행해서 DB서버 memory에 접근 가능한 ResultSet객체에 저장
		ResultSet rs =stmt.executeQuery(str);
		
		ResultSetMetaData rsmd=rs.getMetaData();  
		  
		System.out.println("Total columns: "+rsmd.getColumnCount());  
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
		System.out.println(conn.getMetaData().getDatabaseProductName());
		System.out.println(conn.getMetaData().getDatabaseProductVersion());
		
		//rs를 통해서 DB서버 memory에 생성된 정보를 조회
		//처리(화면조회)
		//만약에 중간에 DB연걸이 close()..되버리면 연결기반..
		while(rs.next()) {
			System.out.println(rs.getInt("empno") + "/" + rs.getString("ename") + "/" + rs.getInt("sal"));
		}
		
		rs.close();
		stmt.close();
		conn.close();
		System.out.println("DB 연결 : "+conn.isClosed());
	}

}











