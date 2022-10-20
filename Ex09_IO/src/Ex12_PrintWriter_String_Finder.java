import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex12_PrintWriter_String_Finder {
	String baseDir = "C:\\Temp";
	String word = "HELLO";
	String savetext = "result.txt";
	
	void find() throws IOException {
		File dir = new File(baseDir);
		if(!dir.isDirectory()) {
			System.out.println("Æú´õ¾Æ´Ô");
			System.exit(0);
		}
		
		PrintWriter writer = new PrintWriter(new FileWriter(savetext,true));
		BufferedReader br = null;
		
		File[] files = dir.listFiles();
		for(int i = 0; i<files.length; i++) {
			if(!files[i].isFile()) {
				continue;
			}
			br = new BufferedReader(new FileReader(files[i]));
			
			String line = "";
			while((line = br.readLine()) != null) {
				if(line.contains(word)) {
//					writer.write("word : " + files[i].getAbsolutePath() + "\n");
					writer.println("word : " + files[i].getAbsolutePath());
				}
			}
			br.close();
		}
		writer.close();
	}
	
	public static void main(String[] args) {
		Ex12_PrintWriter_String_Finder finder = new Ex12_PrintWriter_String_Finder();
		try {
			finder.find();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
