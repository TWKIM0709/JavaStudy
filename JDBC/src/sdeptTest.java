import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.or.kosa.SingletonHelper;

//sdept ���̺��� ���ؼ�
//��ü��ȸ
//������ȸ
//����
//����
//����
public class sdeptTest {
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement pstmt;
	
	//DB����
	public void connect() {
		conn = SingletonHelper.getConnection("Oracle","KOSA","1004");
	}
	//DB��������
	public void close() {
		SingletonHelper.close(conn);
	}
	//��ü��ȸ
	public void select() {
		//DB����
		connect();
		try {
			String sql = "select * from sdept";		
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			//������ �Ѱ� �Ǵ� �Ѱ� �̻� �Ǵ� ���� ��쿡 ���� if else
			if(rs.next()) {
				do {
					System.out.println(rs.getInt(1) + "/" + rs.getString(2));
				}while(rs.next());
			} else {
				System.out.println("��ȸ�� �����Ͱ� �����ϴ�.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//������ȸ
	public void select(int deptno) {
		//DB����
		connect();
		try {
			String sql = "select * from sdept where deptno=?";		
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, deptno);
			
			rs = pstmt.executeQuery();
			
			//������ �Ѱ� �Ǵ� �Ѱ� �̻� �Ǵ� ���� ��쿡 ���� if else
			if(rs.next()) {
				do {
					System.out.println(rs.getInt(1) + "/" + rs.getString(2));
				}while(rs.next());
			} else {
				System.out.println("��ȸ�� �����Ͱ� �����ϴ�.");
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




