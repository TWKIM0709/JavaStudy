import java.io.File;

public class Ex08_File_Dir {

	public static void main(String[] args) {
		//�Է��� 0 �Ǵ� ������ �ϸ� exit
		if(args.length != 1) {
			System.out.println("����");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		// �������� �ʰų� ���ϰ�θ� �Է��ϸ�(������ �ƴϸ�) exit
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ ��θ� �Է�");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		System.out.println(files.length);
		
		for(File ff : files) {
			String name = ff.getName();
			System.out.println(ff.isDirectory() ? "[Dir]" + name : name);
		}
		
		
	}

}










