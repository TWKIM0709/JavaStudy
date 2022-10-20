import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_SubList {

	static int totalfiles = 0;
	static int totaldirs = 0;
	
	static void printFileList(File dir) {
		System.out.println("Full Path : " + dir.getAbsolutePath());
		
		List<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();
		
		for(int i = 0; i< files.length; i++) {
			String filename = files[i].getName();
			if(files[i].isDirectory()) {
				filename = "[Dir]" + files[i].getName();
				subdir.add(i);
			}
			else {
				filename = filename + " / " + files[i].length() + "byte";
			}
		}
		
		int dirnum = subdir.size();
		int filenum = files.length - dirnum;
		
		//�������� (�������� �ȿ� �ڿ�) �� ���� ����/����
		totalfiles += filenum;
		totaldirs += dirnum;
		
		System.out.println("[Currnet Dirnum] : " + dirnum);
		System.out.println("[Currnet Filenum] : " + filenum);
		System.out.println("-----------------------------------------");
		
		//Point***** ������ ������ ������.... �� Ȯ���ϱ�
		for(int i = 0; i<subdir.size(); i++) {
			int index = subdir.get(i);
			printFileList(files[index]); //��� ȣ�� (���� �� �ڽ��� �� ȣ��
//			printFileList(files[subdir.get(i)]);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		//�Է� üũ
		if(args.length != 1) {
			System.out.println("���� : java [���������ϸ�] [��θ�]");
			System.out.println("���� : java Ex10_File_SubList C:\\Temp");
			System.exit(0);
		}
		//���� ����
		File file = new File(args[0]);
		
		// �������� �ʰų� || ���丮�� �ƴ϶��
		if(!file.exists() || !file.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮.");
			System.exit(0);
		}
		
		//�������� ��� + ����
		printFileList(file); //���ȣ��

		//���� ���� .. �� ����/���� ����
		System.out.println("���� �� ���� �� : " + totalfiles);
		System.out.println("���� �� ���� �� : " + totaldirs);
		
	}

}
