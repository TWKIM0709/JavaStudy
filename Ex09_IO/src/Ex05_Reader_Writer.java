import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
	���ڱ���� ������ ó��(char[])
	String Ŭ���� : String str = "ABC" : ���������� char[]�� ���� >> [A][B][C]
	
	�ѱ� 1��, ���� 1�� >> 2byte >> 2byte ����� I/Oó�� >> Reader, Writer (�߻�Ŭ����)
	
	���
	���� : FileReader, FileWriter
*/
public class Ex05_Reader_Writer {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");//read
			fw = new FileWriter("copy_Ex01.txt");	//���� ���� >> ���Ͽ� ���� ���� write
			bw = new BufferedWriter(fw);
			int data = 0;
			while((data=fr.read()) != -1) {
				if(data != '\n' && data != '\r' && data != ' ' && data != '\t') {
					//����, ��, ���� ���� ���� (�������� ����)
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
