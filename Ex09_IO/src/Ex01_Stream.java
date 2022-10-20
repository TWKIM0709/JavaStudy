import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
	IO
	
	Stream (통로)
	데이터 종류 : 이미지, 파일(바이너리) <==> 문자
	
	JAVA API
	
	추상클래스
	> InputStream, OutputStream (재정의 필요 추상함수 가지고 있음)
	
	당신이 Byte 단위의 데이터 작업을 할 때
	  입력 >> InputStream을 상속받는 클래스를 사용
		대상
		1. Memory : ByteArrayInputStream
		2. File   : FileInputStream
		
	  출력 >> OutputStream을 상속받는 클래스를 사용
		대상
		1. Memory : ByteArrayInputStream
		2. File   : FileInputStream
*/
public class Ex01_Stream {

	public static void main(String[] args) {
		//byte -128 ~ 127 정수를 저장
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		//데이터 read, write 하는 대상 memory
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(inSrc); // inSrc 대상으로부터 date를 read
		output = new ByteArrayOutputStream();
		
		System.out.println("outSrc before : " + Arrays.toString(outSrc));
		
		//공식 같은 로직 (암기!)
		int data = 0;
		while((data = input.read()) != -1) { // (배열에서)더 이상 read할 데이터가 없으면 -1
//			System.out.println("data : " + data);
			
			//read한 데이터를 write
			output.write(data); //출력통로(빨대?)안에 데이터를 가지고 있는 것
		}
		outSrc = output.toByteArray();
		System.out.println("outSrc after  : " + Arrays.toString(outSrc));
		
	}

}




