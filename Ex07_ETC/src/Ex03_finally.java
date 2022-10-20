import java.io.IOException;

/*
	try{
		...
		...
		...
	}catch(Exception e){
		...
	}finally{
		예외가 발생하던, 발생하지 않던 강제적으로 실행되는 블럭
	}

	>> 게임CD 설치 ...
	>> 1. 설치파일 >> C:\Temp >> 복사
	>> 2. 복사한 파일로 설치
	>> 3. 정상 설치	>> C:\Temp에 복사한 파일 삭제
	>> 4. 비정상 설치	>> 강제 종료 >> C:\Temp 복사한 파일 >> 정상이든 비정상이든 삭제하고 싶을 때 

*/

public class Ex03_finally {

	static void copyFile() {
		System.out.println("copy file");
	}

	static void startInstall() {
		System.out.println("install");
	}

	static void fileDelete() {
		System.out.println("file delete");
	}

	
	// 실제로 예외는 아니지만 개발자가 필요에 따라서
	// 어떤 상황을 예외적 상황이라고 정의하고 예외를 발생시킬 수 있다.
	// >> 사용자 정의 예외 처리 >> throw new [예외 객체]
	// throw new IOException
	public static void main(String[] args) {
		try {
			copyFile();
			startInstall();
			throw new IOException("install 문제가 발생");
		}catch (Exception e) {
			System.out.println("예외 메세지 출력 : " + e.getMessage());
			return;
		}finally {
			//예외가 발생해도 실행 , 발생하지 않아도 실행
			//**함수의 강제종료인 return을 만나도 실행됨 (finally가 먼저 실행됨)
			fileDelete();
		}
		
	}
}
