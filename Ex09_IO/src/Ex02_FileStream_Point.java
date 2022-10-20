import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
	Byte 데이터를 read , write >> 대상이 file
	FileInputStream
	FileOutputStream
	
	(이미지, 엑셀파일 등) read, write
	
	File >> 1. txt (데이터를 파일에 기록)
	
	I/O 클래스 >> 대부분 예외 처리를 강제
	
	I/O 자원은 개발자가 직접적으로 자원을 해제 해줘야함
	>> close()
*/
public class Ex02_FileStream_Point {

	public static void main(String[] args) {
		FileInputStream fs = null;
		FileOutputStream fos = null;
		
		String path = "C:\\Temp\\A.txt";
		
		try {
			fs = new FileInputStream(path);
			fos = new FileOutputStream("C:\\Temp\\new.txt");
			/*
				FileOutputStream
				1. write 파일이 존재하지 않으면 >> 자동으로 생성(Create)
				2. FileOutputStream("C:\\Temp\\new.txt", false/true);
				   false >> overwrite 덮어쓰기
				   true  >> append 이어쓰기
			*/
			int data = 0;
			while((data = fs.read()) != -1) {
//				System.out.println("정수 : " + data + " : " + (char)data);
				fos.write(data);
			}
			
		} catch (Exception e) {
			
		}finally {
			try {
				fs.close();
				fos.close();
			}catch (Exception e) {
				
			}
		}
	}

}









