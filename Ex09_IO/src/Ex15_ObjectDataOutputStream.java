import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.kosa.UserInfo;

public class Ex15_ObjectDataOutputStream {

	public static void main(String[] args) {
		String filename = "UserData.txt";
		
		FileOutputStream fos = null;		//�ϳ��� ����
		BufferedOutputStream bos = null;	//������ �ѹ��� ����
		ObjectOutputStream oos = null;		//��ü ��� ����
		
		
		try {
			fos = new FileOutputStream(filename,true);
			bos = new BufferedOutputStream(fos);
			
			//����ȭ ��ü
			oos = new ObjectOutputStream(bos);
			
			//����ǰ ( ��ü )
			UserInfo u1 = new UserInfo("ȫ�浿","super",500);
			UserInfo u2 = new UserInfo("scott","tiger",50);
			
			//����ȭ ����
			oos.writeObject(u1);	//UserInfo ��ü�� �����ؼ� ���ٷ� ���� ���Ͽ� ���
			oos.writeObject(u2);	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
				System.out.println("���� ���� -> buffer -> ����ȭ -> ���Ͽ� write");
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
