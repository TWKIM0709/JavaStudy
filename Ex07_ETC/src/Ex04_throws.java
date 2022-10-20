import java.io.IOException;

import kr.or.kosa.ExClass;

public class Ex04_throws {

	public static void main(String[] args) {
		/*try {
			ExClass ex = new ExClass("temp");
		} catch (Exceptoin e) {			
			e.printStackTrace();
		} catch (IOException e) { //Exception 에서 이미 다 잡아버려서(상위클래스) 필요 없다고 빨간줄
			e.printStackTrace();
		}
		try {
			ExClass ex = new ExClass("temp");
		}catch (IOException e) { 
			e.printStackTrace();
		} catch (Exceptoin e) {			//상위 클래스를 밑으로 내리면 문제 없음
			e.printStackTrace();
		} */
		
		try {
			ExClass ex = new ExClass("temp");
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 멀티 캐치 
		try {
			ExClass ex2 = new ExClass("temp");
		} catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}
	}

}
