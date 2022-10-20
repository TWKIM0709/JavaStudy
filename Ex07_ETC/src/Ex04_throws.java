import java.io.IOException;

import kr.or.kosa.ExClass;

public class Ex04_throws {

	public static void main(String[] args) {
		/*try {
			ExClass ex = new ExClass("temp");
		} catch (Exceptoin e) {			
			e.printStackTrace();
		} catch (IOException e) { //Exception ���� �̹� �� ��ƹ�����(����Ŭ����) �ʿ� ���ٰ� ������
			e.printStackTrace();
		}
		try {
			ExClass ex = new ExClass("temp");
		}catch (IOException e) { 
			e.printStackTrace();
		} catch (Exceptoin e) {			//���� Ŭ������ ������ ������ ���� ����
			e.printStackTrace();
		} */
		
		try {
			ExClass ex = new ExClass("temp");
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// ��Ƽ ĳġ 
		try {
			ExClass ex2 = new ExClass("temp");
		} catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}
	}

}
