import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import kr.or.kosa.ConnectionHelper;

/*
 * DML(insert delete update)
 * JDBC API ���
 * 1. ��� ������ ����(ResultSet �ʿ����)
 * 2. �ݿ� ��� Ȯ�� ���� ( return�� ���� �� ) >> ex) update 5�� - return 5 / insert 3�� - return 3
 * 
 * java �ڵ�
 * update emp set sal = 0 ���� > 14�� >> return 14
 * update emp set sal = 100 where empno = 4444 > 0�� (4444 ����) >> return 0
 * ��������� java�ڵ�� ����ó��
 * 
 * KeyPoint
 * 1. Oracle DML �۾� (developer , cmd(sqlplus), Tool) >> commit/rollback �� ����
 * 2. JDBC API�� ����ؼ�(java�ڵ带 ����) DML >> default : Auto commit
 * 3. �ʿ信 ���� commit , rollback ó���� �ʿ��� �ڵ�...Ʈ������
 * 4. JDBC >> autocommit �ɼ� ���� >> false ��ȯ >> java code���� DML �۾��� ���� commit , rollback ������ 
 * 
 * �ǽ��� ���̺� dmlemp ����
 * */
public class Ex02_Oracle_DML_update {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		try {
			//����̹� �ε��� ���� ����
			//Class.forName("oracle.jdbc.OracleDriver");
			
			//Connection �������̽��� �����ϰ� �ִ� ��ü�� �ּҸ� return
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KOSA","1004");
			stmt = conn.createStatement();
			
			//update
			int sal = 0;
			String ename = "";
			int deptno = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("�μ���ȣ�Է�");
			deptno = Integer.parseInt(sc.nextLine());
			System.out.print("�޿��Է�");
			sal = Integer.parseInt(sc.nextLine());
			//insert into dmlemp(empno,ename,deptno) values(100,'ȫ�浿',10) �������� ���
			 String sql="update dmlemp set sal = "+sal+" where deptno="+deptno;
			
			 //���� 
			 //values(?,?,?)  >> ? parameter ���� ����
			 //executeUpdate() >> insert , update , delete  ��� ����
			 int resultrow = stmt.executeUpdate(sql);
			 
			 if(resultrow > 0) {
				 System.out.println("�ݿ��� ���� �� : " + resultrow);
			 }else {
				 System.out.println("���ܰ� �߻��� ���� �ƴϰ� : �ݿ��� ���� ���� ");
			 }
			 
		} catch (Exception e) {
			// �ߺ������� insert �ؼ� ������ ����� executeUpdate() ���� �߻�
			System.out.println("SQL ���� �߻� " + e.toString());
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}





