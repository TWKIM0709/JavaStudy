import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
	File 처리 (DISK) : 입출력은 Byte 단위로 (한 Byte씩) read, write
					  한명씩 보낸다..
					  
	여러 학생을 모아서 하나의 버스에 태워서 가면 좋지 않을까	>> 버스 : buffer
	1. I\O 성능 개선
	2. Line단위 처리 가능 (Enter를 기준으로 한줄씩 가능)
	
	BufferedInputStream (보조 스트림) >> 주 클래스(FileInputStream)에 의존한다
*/
public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("data.txt");
			bos = new BufferedOutputStream(fos);

			for (int i = 0; i < 10; i++) {
				bos.write('A');
			}
//			bos.flush();
			// buffer 의 크기는 8192 (8kb)
			/*
			 * JAVA Buffer 크기 : 8kb (8192byte) 1. buffer 안에 내용이 모두 채워지면 스스로 출발 (buffer를 비우는
			 * 작업) 2. 강제 출발 기능 (buffer를 강제로 비울 수 있는) : flush() or close() 3. close() 자원해제 >>
			 * 내부적으로 flush()호출 후 자원해제
			 */
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}