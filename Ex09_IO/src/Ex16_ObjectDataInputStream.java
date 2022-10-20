import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import kr.or.kosa.UserInfo;

/* 

	UserData.txt에 직렬화된 데이터 2개 저장
	이 객체들을 read >> 원상태로 복원
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
			
			//복원 ( 역직렬화 )
			//이 방법은 몇개를 썻는지 알아야 함
//			UserInfo r1 = (UserInfo)ois.readObject();
//			UserInfo r2 = (UserInfo)ois.readObject();
//			System.out.println(r1);
//			System.out.println(r2);

			Object users = null;
			while((users = ois.readObject()) != null) {
				System.out.println((UserInfo)users);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않음");
		} catch (EOFException e) {
			System.out.println("끝" + e.getMessage());
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없음");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 객체가 존재하지 않음");
		} catch (Exception e) {
			System.out.println("기타 예외 발생 " + e.getMessage());
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




