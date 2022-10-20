import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import kr.or.kosa.UserInfo;

/* 

	UserData.txt�� ����ȭ�� ������ 2�� ����
	�� ��ü���� read >> �����·� ����
*/
public class Ex16_ObjectDataInputStream {

	public static void main(String[] args) {
		String filename = "UserData.txt";
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			//���� ( ������ȭ )
			//�� ����� ��� ������ �˾ƾ� ��
//			UserInfo r1 = (UserInfo)ois.readObject();
//			UserInfo r2 = (UserInfo)ois.readObject();
//			System.out.println(r1);
//			System.out.println(r2);

			Object users = null;
			while((users = ois.readObject()) != null) {
				System.out.println((UserInfo)users);
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� ����");
		} catch (EOFException e) {
			System.out.println("��" + e.getMessage());
		} catch (IOException e) {
			System.out.println("������ ���� �� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("�ش� ��ü�� �������� ����");
		} catch (Exception e) {
			System.out.println("��Ÿ ���� �߻� " + e.getMessage());
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}




