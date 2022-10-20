import java.io.File;

/*
	[파일], [폴더]를 다루는 클래스 학습
	
	JAVA : 파일(생성, 삭제..), 폴더(생성,삭제) >> 하나의 클래스가 다함 >> File
		>> a.txt 	생성, 수정, 삭제, 정보 read >> File 클래스
		>> Temp 폴더 생성, 수정, 삭제, 정보 read >> File 클래스
	
	경로
	절대경로 : 'C:\\' 'D:\\' >> C:\\Temp\\a.txt
	상대경로 : 현재 파일을 중심으로 >> ../ >> /
	
	File 클래스
	
	목적 : 다양한 정보를 취득하기 위해 사용( 같은 폴더/파일이 있는지... 파일이 몇개 있는지... 폴더안에 폴더가 있는지... 등)
*/
public class Ex07_File {

	public static void main(String[] args) {
		String path = "C:\\Temp\\file.txt";
//		String path = "data.txt";
		File f = new File(path);
		
		System.out.println("파일(폴더)의 존재 여부 :: " + f.exists());
		System.out.println("파일인지 폴더인지 >> " + "폴더:" +f.isDirectory() + " 파일:" + f.isFile());
		
		System.out.println("선택한 파일(폴더)명 : " + f.getName());
		System.out.println("절대경로 : " + f.getAbsolutePath());
		System.out.println("파일의 크기(Byte) : " + f.length());
		
		System.out.println("부모경로 : " + f.getParent());
	}
}











