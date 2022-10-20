package Dos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyDos2 {
	static int totoalfiles = 0;// ���� ����
	static int totaldirs = 0;// ���� ����
	static String defaultPath = "C:" + File.separator;
	static String path = defaultPath;

	public static void main(String[] args) throws Exception {
		System.out.println("Bitamp Microsoft Windows DOS ��ɾ� [Version 1.3]");
		System.out.println("2022 Bitcamp. All rights reserved\n");

		Scanner sc = new Scanner(System.in);

		String[] input = null;

		while (true) {
			System.out.print(path + ">");
			input = sc.nextLine().trim().split(" "); // input�迭�� ���� �������� �� �濡 ����, ù ��° �� ���� ���� ����

			if (input[0].equalsIgnoreCase("exit")) { // ���� exit�θ� Dos ���� ����
				System.out.println("Exit");
				System.exit(0);
				return;
			}

			switch (input[0].toLowerCase()) {
			case "dir":
				searchDirectory();
				break;
			case "cd":
			case "cd..":
			case "cd\\":
			case "cd/":
				changeDirectory(input);
				break;
			case "md":
			case "mkdir":
				makeDirectory(input);
				break;
			case "rd":
			case "rmdir":
				removeDirectory(input);
				break;
			case "ren":
			case "rename":
				renameDirectory(input);
				break;
			case "type":
				readTextFile(input);
				break;
			case "help":
				displayHelp();
				break;
			default:
			}
		}

	}

	//����
	private static void displayHelp() {
		System.out.println("[dir] : ���� ������ ���� ���");
		System.out.println("[cd] [������] : ���� �̵�");
		System.out.println("[cd..] : ���� ������ �̵�");
		System.out.println("[cd\\]|[cd/] : �⺻����(C:\\\\)�� �̵�");
		System.out.println("[md]|[mkdir] [�������丮��] : �������� ����");
		System.out.println("[ren]|[rename] [���ϸ�] [���ο� ���ϸ�] : ����/������ ����");
		System.out.println("[rd]|[rmdir] [������ ���ϸ�] : ����/������ ����");
		System.out.println("[type] [�о���� txt���ϸ�] : txt������ ���� ���");
		System.out.println("[Exit] : ����");
	}

	//�ؽ�Ʈ���� ���� ���
	private static void readTextFile(String[] input) {
		if(!ckExists(input)) return;
		
		File readfile = new File(path+ "\\" + input[1]);
		FileReader fr = null;
		BufferedReader br = null;
		if (!readfile.exists() || !readfile.isFile()) {
			System.out.println("�ùٸ� ��θ� �Է��ϼ���");
			return;
		}
		try {
			fr = new FileReader(readfile);
			br = new BufferedReader(fr);
			String s = "";
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.println("��������: " + e);
		} finally {
			try {
				fr.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		back();
	}

	//�̸��ٲٱ�
	private static void renameDirectory(String[] input) {
		if(!ckExists(input)) return;
		
		path = path + "\\" + input[1];
		File filebefore = new File(path);
		if(!filebefore.exists()) {
			System.out.println("�Է� �����Դϴ�. ������ ���ų� ���� �̸��Դϴ�.");
			return;
		}
		filebefore.renameTo(new File(path + "\\" + input[2]));
		
		back();
	}

	//����|���� ���� (���� ���� ���� ��� �߰��ؾߵ�(����Լ���))
	private static void removeDirectory(String[] input) {
		if(!ckExists(input)) return;
		File deletefile = new File(path + "\\" + input[1]);

		deleteFileList(deletefile);	//������ ����Լ�
	}

	//���� ���� ���� ���
	private static void searchDirectory() {
		File file = new File(path);
		File[] files = file.listFiles();
		
		for(File ff : files) {
			String name = ff.getName();
			System.out.println(ff.isDirectory() ? "[Dir]" + name : name);
		}
	}

	//���� �̵� �Լ�
	private static void changeDirectory(String[] input) {
		
		if(!ckExists(input)) return;
		
		switch (input[0].toLowerCase()) {
		case "cd":
			path = path + "\\" + input[1];
			break;
		case "cd..":
			File newFile = new File(defaultPath);
			path = newFile.getParent();
			break;
		case "cd\\":
		case "cd/":
			path = defaultPath;
		}
	}

	//���� ���� �Լ�
	private static void makeDirectory(String[] input) {
		path = path + "\\" + input[1];
		File newfile = new File(path);
		if (newfile.exists()) {
			System.out.println("�̹� �����ϴ� ���丮�Դϴ�");
			return;
		}
		newfile.mkdir();
		System.out.println("�����Ϸ�");
		back();
	} 
	
	//�Է��� ����/������ ���� �ϴ��� üũ
	public static boolean ckExists(String[] index) {
		File file = new File(path + "\\" + index[1]);
		boolean ck = true;
		if(!file.exists()) {
			System.out.println("�ùٸ� ��θ� �Է��ϼ���");
			ck = false;
		}
		return ck;
	}
	
	//������������ ����µ� ���Ǵ� ����Լ�
	static void deleteFileList(File dir) {
		List<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();// ���� �ڿ������� ���� ��� �ϳ��ϳ��� ���� ��ü�� ��
		
		for (int i = 0; i < files.length; i++) {
			String filename = files[i].getName();// ������, ���ϸ�
			if (files[i].isDirectory()) {// ����
				subdir.add(i);
			} else {
				files[i].delete();
			}
		}
		for (int i = 0; i < subdir.size(); i++) {
			int index = subdir.get(i);
			deleteFileList(files[index]);// ���ȣ��(���� �� �ڽ��� �� �θ���)
		}
		dir.delete();
	}
	
	//��� Ctrl + Z �Լ�
	public static void back() {
		File file = new File(path);
		path = file.getParent();
	}
}