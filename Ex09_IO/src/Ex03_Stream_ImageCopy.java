import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_Stream_ImageCopy {

	public static void main(String[] args) {
		String filepath = "C:\\Temp\\book.jpg";
		String targetFile = "copy.jpg";
		
		FileInputStream fs = null;
		FileOutputStream fos = null;

		try {
			fs = new FileInputStream(filepath);
			fos = new FileOutputStream(targetFile,false);
			
			int data = 0;
			while((data = fs.read()) != -1) {
				fos.write(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fs.close();
				fos.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
