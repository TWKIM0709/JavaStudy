import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
	문자기반의 데이터 처리(char[])
	String 클래스 : String str = "ABC" : 내부적으로 char[]에 저장 >> [A][B][C]
	
	한글 1자, 영문 1자 >> 2byte >> 2byte 기반의 I/O처리 >> Reader, Writer (추상클래스)
	
	대상
	파일 : FileReader, FileWriter
*/
public class Ex05_Reader_Writer {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");//read
			fw = new FileWriter("copy_Ex01.txt");	//파일 생성 >> 파일에 같은 내용 write
			bw = new BufferedWriter(fw);
			int data = 0;
			while((data=fr.read()) != -1) {
				if(data != '\n' && data != '\r' && data != ' ' && data != '\t') {
					//엔터, 탭, 공백 제거 버전 (컴프레스 버전)
				}
//				System.out.print((char)data);
			}
			fw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
