import java.io.File;

/*
	[����], [����]�� �ٷ�� Ŭ���� �н�
	
	JAVA : ����(����, ����..), ����(����,����) >> �ϳ��� Ŭ������ ���� >> File
		>> a.txt 	����, ����, ����, ���� read >> File Ŭ����
		>> Temp ���� ����, ����, ����, ���� read >> File Ŭ����
	
	���
	������ : 'C:\\' 'D:\\' >> C:\\Temp\\a.txt
	����� : ���� ������ �߽����� >> ../ >> /
	
	File Ŭ����
	
	���� : �پ��� ������ ����ϱ� ���� ���( ���� ����/������ �ִ���... ������ � �ִ���... �����ȿ� ������ �ִ���... ��)
*/
public class Ex07_File {

	public static void main(String[] args) {
		String path = "C:\\Temp\\file.txt";
//		String path = "data.txt";
		File f = new File(path);
		
		System.out.println("����(����)�� ���� ���� :: " + f.exists());
		System.out.println("�������� �������� >> " + "����:" +f.isDirectory() + " ����:" + f.isFile());
		
		System.out.println("������ ����(����)�� : " + f.getName());
		System.out.println("������ : " + f.getAbsolutePath());
		System.out.println("������ ũ��(Byte) : " + f.length());
		
		System.out.println("�θ��� : " + f.getParent());
	}
}











