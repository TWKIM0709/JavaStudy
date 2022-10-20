import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
	���� ��Ʈ��
	DataOutPutStream
	DataInputStream
	
	�� �ΰ����� ����..
	Java 8���� �⺻Ÿ��(Ÿ�Ժ��� write, read ����)
	�� ����..(DataOutPutStream, DataInputStream) ��Ʈ.. �̰ų����� �а� ���� ����
	
	����
	����.txt
	10,20,60,88 >> ���ڿ� >> split >> �迭 + ���ڷ� ���� >> ó��...
	
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
				dos.writeInt(score[i]); //������ �״�� write
				//���� - ������ �ݵ�� DataInputStream ����ؾ� ��
//				dos.writeUTF(null); //ä�� ����� .. �ѱ� �ȱ���
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
