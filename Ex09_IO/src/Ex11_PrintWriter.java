import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/*
	��¿� ���� ������ �����ϴ� Ŭ����
	1. printf
	2. String.format
	3. PrintWriter (������)
	4. ���� : ������ ����Ʈ���� ���� ����(�����..��ǥ, ���ݰ�꼭, �λ���� ��)
	4.1 ũ����Ż ����Ʈ , ����
	
	�ζ� ��� .. PrintWriter
*/
public class Ex11_PrintWriter {

	public static void main(String[] args) {
		try {
//			PrintWriter pw = new PrintWriter("C:\\Temp\\hoework.txt");
//			
//			pw.println("******************************************");
//			pw.println("*                HOMEWORK                *");
//			pw.println("******************************************");
//			pw.printf( "%3s : %5d %5d %5d %5.1f", "ȫ�浿",100,99,50,(float)((100+99+50)/3));
//			pw.println();
//			pw.close();
			
			//read (line ������ ���� >> buffer)
			FileReader fr = new FileReader("C:\\Temp\\hoework.txt");
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
