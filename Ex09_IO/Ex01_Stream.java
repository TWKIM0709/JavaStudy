import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
	IO
	
	Stream (���)
	������ ���� : �̹���, ����(���̳ʸ�) <==> ����
	
	JAVA API
	
	�߻�Ŭ����
	> InputStream, OutputStream (������ �ʿ� �߻��Լ� ������ ����)
	
	����� Byte ������ ������ �۾��� �� ��
	  �Է� >> InputStream�� ��ӹ޴� Ŭ������ ���
		���
		1. Memory : ByteArrayInputStream
		2. File   : FileInputStream
		
	  ��� >> OutputStream�� ��ӹ޴� Ŭ������ ���
		���
		1. Memory : ByteArrayInputStream
		2. File   : FileInputStream
*/
public class Ex01_Stream {

	public static void main(String[] args) {
		//byte -128 ~ 127 ������ ����
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		//������ read, write �ϴ� ��� memory
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(inSrc); // inSrc ������κ��� date�� read
		output = new ByteArrayOutputStream();
		
		System.out.println("outSrc before : " + Arrays.toString(outSrc));
		
		//���� ���� ���� (�ϱ�!)
		int data = 0;
		while((data = input.read()) != -1) { // (�迭����)�� �̻� read�� �����Ͱ� ������ -1
//			System.out.println("data : " + data);
			
			//read�� �����͸� write
			output.write(data); //������(����?)�ȿ� �����͸� ������ �ִ� ��
		}
		outSrc = output.toByteArray();
		System.out.println("outSrc after  : " + Arrays.toString(outSrc));
		
	}

}




