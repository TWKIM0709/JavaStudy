import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.kosa.UserInfo;

public class Ex15_ObjectDataOutputStream {

	public static void main(String[] args) {
		String filename = "UserData.txt";
		
		FileOutputStream fos = null;		//하나씩 보냄
		BufferedOutputStream bos = null;	//여러개 한번에 보냄
		ObjectOutputStream oos = null;		//객체 통신 가능
		
		
		try {
			fos = new FileOutputStream(filename,true);
			bos = new BufferedOutputStream(fos);
			
			//직렬화 객체
			oos = new ObjectOutputStream(bos);
			
			//완제품 ( 객체 )
			UserInfo u1 = new UserInfo("홍길동","super",500);
			UserInfo u2 = new UserInfo("scott","tiger",50);
			
			//직렬화 과정
			oos.writeObject(u1);	//UserInfo 객체를 분해해서 한줄로 세워 파일에 기록
			oos.writeObject(u2);	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
				System.out.println("파일 생성 -> buffer -> 직렬화 -> 파일에 write");
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
