import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
	File ó�� (DISK) : ������� Byte ������ (�� Byte��) read, write
					  �Ѹ� ������..
					  
	���� �л��� ��Ƽ� �ϳ��� ������ �¿��� ���� ���� ������	>> ���� : buffer
	1. I\O ���� ����
	2. Line���� ó�� ���� (Enter�� �������� ���پ� ����)
	
	BufferedInputStream (���� ��Ʈ��) >> �� Ŭ����(FileInputStream)�� �����Ѵ�
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
			// buffer �� ũ��� 8192 (8kb)
			/*
			 * JAVA Buffer ũ�� : 8kb (8192byte) 1. buffer �ȿ� ������ ��� ä������ ������ ��� (buffer�� ����
			 * �۾�) 2. ���� ��� ��� (buffer�� ������ ��� �� �ִ�) : flush() or close() 3. close() �ڿ����� >>
			 * ���������� flush()ȣ�� �� �ڿ�����
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