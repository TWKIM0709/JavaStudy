import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_SubList {

	static int totalfiles = 0;
	static int totaldirs = 0;
	
	static void printFileList(File dir) {
		System.out.println("Full Path : " + dir.getAbsolutePath());
		
		List<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();
		
		for(int i = 0; i< files.length; i++) {
			String filename = files[i].getName();
			if(files[i].isDirectory()) {
				filename = "[Dir]" + files[i].getName();
				subdir.add(i);
			}
			else {
				filename = filename + " / " + files[i].length() + "byte";
			}
		}
		
		int dirnum = subdir.size();
		int filenum = files.length - dirnum;
		
		//누적개수 (하위폴더 안에 자원) 총 누적 폴더/파일
		totalfiles += filenum;
		totaldirs += dirnum;
		
		System.out.println("[Currnet Dirnum] : " + dirnum);
		System.out.println("[Currnet Filenum] : " + filenum);
		System.out.println("-----------------------------------------");
		
		//Point***** 폴더의 하위의 하위의.... 다 확인하기
		for(int i = 0; i<subdir.size(); i++) {
			int index = subdir.get(i);
			printFileList(files[index]); //재귀 호출 (내가 내 자신을 또 호출
//			printFileList(files[subdir.get(i)]);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		//입력 체크
		if(args.length != 1) {
			System.out.println("사용법 : java [실행할파일명] [경로명]");
			System.out.println("예시 : java Ex10_File_SubList C:\\Temp");
			System.exit(0);
		}
		//파일 생성
		File file = new File(args[0]);
		
		// 존재하지 않거나 || 디렉토리가 아니라면
		if(!file.exists() || !file.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리.");
			System.exit(0);
		}
		
		//정상적인 경로 + 폴더
		printFileList(file); //재귀호출

		//하위 포함 .. 총 파일/폴더 개수
		System.out.println("누적 총 파일 수 : " + totalfiles);
		System.out.println("누적 총 폴더 수 : " + totaldirs);
		
	}

}
