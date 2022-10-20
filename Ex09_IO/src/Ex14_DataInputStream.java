import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex14_DataInputStream {

	public static void main(String[] args) {
		FileInputStream fs = null;
		DataInputStream ds = null;
		int sum = 0;
		int score = 0;
		try {
			fs = new FileInputStream("score.txt");
			ds = new DataInputStream(fs);
			
			while(true) {
				score = ds.readInt();
				System.out.println("readInt()·Î ÀÐÀº score : "+score);
				sum += score;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("sum : " + sum);
		}finally {
			try {
				ds.close();
				fs.close();
			}catch (Exception e) {
				
			}
		}
	}

}
