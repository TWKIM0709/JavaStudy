import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
	보조 스트림
	DataOutPutStream
	DataInputStream
	
	이 두가지를 쓰면..
	Java 8가지 기본타입(타입별로 write, read 가능)
	단 조건..(DataOutPutStream, DataInputStream) 세트.. 이거끼리만 읽고 쓰기 가능
	
	만약
	성적.txt
	10,20,60,88 >> 문자열 >> split >> 배열 + 숫자로 변경 >> 처리...
	
*/
public class Ex13_DataOutPutStream {

	public static void main(String[] args) {
		int[] score = {100,60,55,95,50};
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("score.txt");
			dos = new DataOutputStream(fos);
			
			for(int i = 0; i<score.length; i++) {
				dos.writeInt(score[i]); //정수값 그대로 write
				//조건 - 읽을떄 반드시 DataInputStream 사용해야 됨
//				dos.writeUTF(null); //채팅 입출력 .. 한글 안깨짐
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				dos.close();
				fos.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
