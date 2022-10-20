import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_File_Dir_Format {

	public static void main(String[] args) {
		File dir = new File("C:\\Temp");
		File[] files = dir.listFiles();
		
		for(int i = 0; i<files.length; i++) {
			File file = files[i];
			
			String name = file.getName();
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH-mma");
			String attribute = "";
			String size = "";
			
			if(file.isDirectory()) { //Æú´õ¸é
				attribute = "<Dir>";
			}else {
				size = file.length() + "byte";
				attribute = file.canRead() ? "R" : "";
				attribute += file.canWrite() ? "W" : "";
				attribute += file.isHidden() ? "H" : "";
			}
			System.out.printf("%s %3s %10s %s \n",dt.format(new Date(file.lastModified())), attribute, size, name);			
		}
		
	}
}

/*
 * Å±º¸µå Å±º¸µå °ü¸® + ´ë¿©, ¹Ý³³
 */











