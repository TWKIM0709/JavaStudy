import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
	Byte �����͸� read , write >> ����� file
	FileInputStream
	FileOutputStream
	
	(�̹���, �������� ��) read, write
	
	File >> 1. txt (�����͸� ���Ͽ� ���)
	
	I/O Ŭ���� >> ��κ� ���� ó���� ����
	
	I/O �ڿ��� �����ڰ� ���������� �ڿ��� ���� �������
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
				1. write ������ �������� ������ >> �ڵ����� ����(Create)
				2. FileOutputStream("C:\\Temp\\new.txt", false/true);
				   false >> overwrite �����
				   true  >> append �̾��
			*/
			int data = 0;
			while((data = fs.read()) != -1) {
//				System.out.println("���� : " + data + " : " + (char)data);
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









