import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/*
	출력에 대한 형식을 저장하는 클래스
	1. printf
	2. String.format
	3. PrintWriter (레포팅)
	4. 현업 : 레포팅 소프트웨어 따로 있음(양식지..전표, 세금계산서, 인사관리 등)
	4.1 크리스탈 레포트 , 오즈
	
	로또 출력 .. PrintWriter
*/
public class Ex11_PrintWriter {

	public static void main(String[] args) {
		try {
//			PrintWriter pw = new PrintWriter("C:\\Temp\\hoework.txt");
//			
//			pw.println("******************************************");
//			pw.println("*                HOMEWORK                *");
//			pw.println("******************************************");
//			pw.printf( "%3s : %5d %5d %5d %5.1f", "홍길동",100,99,50,(float)((100+99+50)/3));
//			pw.println();
//			pw.close();
			
			//read (line 단위가 편함 >> buffer)
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
