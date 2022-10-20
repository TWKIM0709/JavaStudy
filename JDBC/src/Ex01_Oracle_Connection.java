import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
	JDBC
	1. Java �� ���ؼ� Oracle ���� �� CRUD
	2. Java : Oracle, My-sql, MS-sql ��� �����ϰ� �۾� ���� (CRUD)
	2.1 ������ ��ǰ�� �´� ����̹��� ������ �־�� �Ѵ�.
		Oracle	C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
				C:\KOSA_IT\DataBase\JDBC\ConnectionUtils\Oracle (�� �����ص�)
		Mysql	https://dev.mysql.com/downloads/windows/installer/8.0.html
	3. ����̹��� ���� >> ���� ������Ʈ���� ����ϵ���
		������Ʈ �Ӽ� > JavaBuildPath > Libraries > Add External ajr > �߰�
	3.1 ����̹� ��� �غ� �Ϸ� >> �޸𸮿� load�ؼ� ���
	3.2 Class.forName("oracle.jdbc.OracleDriver") >> ��ü�� new�ѰŶ� �����
	4. JAVA CODE (CROD) >> JDBC API ���� ����
	4.1 import java.sql.* >> interface, class ����
	4.2 �����ڴ� interface�� ���� ǥ��ȭ�� DB �۾� ���� ����
	Point) �� interface ���·� �����ұ� >> JDBC API�� ����� ������ >> Oracle, Mysql...���
		   �������� Ȱ��..OracleConnection , MysqlConnection ��� Connection���� ��밡��
	import java.sql.Connection
	import java.sql.ResultSet
	import java.sql.Statment ���
	5. �۾�����
	5.1 DB���� -> ���ɻ��� -> ���ɽ��� -> ó�� -> �ڿ�����
	5.2 ���� : DDL(create , alter , drop) ���� �Ⱦ�
			  CRUD(insert , select , update , delete) ���� ��
		���� : �������� DB������ ����
		ó�� : ����� �޾Ƽ� ȭ�鿡 ���, �Ǵ� �ٸ� ���α׷��� ���� ���..
		�ڿ����� : ��������
*/
public class Ex01_Oracle_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//DB ���� -> ���ɻ��� -> ���� -> ó��
		Class.forName("oracle.jdbc.OracleDriver"); //Class.forName(����̹� �̸�) ���ص���
		System.out.println("����Ŭ ����̹� �ε�....");
		
		//loading�� ����̹��� ���� oracle ����
		//DriverManager.getConnection("jdbc:oracle:thin:@�ּ�:��Ʈ��ȣ:�̸�(xe)","����","������ȣ");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KOSA","1004");
		System.out.println(conn.isClosed() + "(����Ǿ����� false)");
		
		//���� ��ü ������
		Statement stmt = conn.createStatement();
		
		String str = "select empno, ename, sal from emp";
		
		//���� �����ؼ� DB���� memory�� ���� ������ ResultSet��ü�� ����
		ResultSet rs =stmt.executeQuery(str);
		
		ResultSetMetaData rsmd=rs.getMetaData();  
		  
		System.out.println("Total columns: "+rsmd.getColumnCount());  
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
		System.out.println(conn.getMetaData().getDatabaseProductName());
		System.out.println(conn.getMetaData().getDatabaseProductVersion());
		
		//rs�� ���ؼ� DB���� memory�� ������ ������ ��ȸ
		//ó��(ȭ����ȸ)
		//���࿡ �߰��� DB������ close()..�ǹ����� ������..
		while(rs.next()) {
			System.out.println(rs.getInt("empno") + "/" + rs.getString("ename") + "/" + rs.getInt("sal"));
		}
		
		rs.close();
		stmt.close();
		conn.close();
		System.out.println("DB ���� : "+conn.isClosed());
	}

}










