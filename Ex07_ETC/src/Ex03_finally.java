import java.io.IOException;

/*
	try{
		...
		...
		...
	}catch(Exception e){
		...
	}finally{
		���ܰ� �߻��ϴ�, �߻����� �ʴ� ���������� ����Ǵ� ��
	}

	>> ����CD ��ġ ...
	>> 1. ��ġ���� >> C:\Temp >> ����
	>> 2. ������ ���Ϸ� ��ġ
	>> 3. ���� ��ġ	>> C:\Temp�� ������ ���� ����
	>> 4. ������ ��ġ	>> ���� ���� >> C:\Temp ������ ���� >> �����̵� �������̵� �����ϰ� ���� �� 

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

	
	// ������ ���ܴ� �ƴ����� �����ڰ� �ʿ信 ����
	// � ��Ȳ�� ������ ��Ȳ�̶�� �����ϰ� ���ܸ� �߻���ų �� �ִ�.
	// >> ����� ���� ���� ó�� >> throw new [���� ��ü]
	// throw new IOException
	public static void main(String[] args) {
		try {
			copyFile();
			startInstall();
			throw new IOException("install ������ �߻�");
		}catch (Exception e) {
			System.out.println("���� �޼��� ��� : " + e.getMessage());
			return;
		}finally {
			//���ܰ� �߻��ص� ���� , �߻����� �ʾƵ� ����
			//**�Լ��� ���������� return�� ������ ����� (finally�� ���� �����)
			fileDelete();
		}
		
	}
}
