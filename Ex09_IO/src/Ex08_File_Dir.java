import java.io.File;

public class Ex08_File_Dir {

	public static void main(String[] args) {
		//입력을 0 또는 여러개 하면 exit
		if(args.length != 1) {
			System.out.println("설명");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		// 존재하지 않거나 파일경로를 입력하면(폴더가 아니면) exit
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효 경로를 입력");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		System.out.println(files.length);
		
		for(File ff : files) {
			String name = ff.getName();
			System.out.println(ff.isDirectory() ? "[Dir]" + name : name);
		}
		
		
	}

}










