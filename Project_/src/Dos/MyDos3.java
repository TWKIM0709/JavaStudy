package Dos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyDos3 {
	static int totoalfiles = 0;//���� ����
	static int totaldirs = 0;//���� ����
	static String defaultPath = "C:" + File.separator;
	static String path = defaultPath;
	
	public static void main(String[] args) throws Exception{
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
	private static void displayHelp() {
		System.out.println("dir [Ž���� ���丮��]");
		System.out.println("mkdir [�������丮��]");
		System.out.println("rename [���ϸ�] [���ο� ���ϸ�]");
		System.out.println("rmdir [������ ���ϸ�]");
		System.out.println("type [�о���� txt���ϸ�]");
		System.out.println("Exit: ����");
		//System.exit(0);
	}
	private static void readTextFile(String[] input) {
		String path = "";
		path = MyDos3.path + "\\" + input[1];
		File readfile = new File(path);
		FileReader fr = null;
		BufferedReader br = null;
		if(readfile.exists() && readfile.isFile()) {
			try {
				fr = new FileReader(readfile);
				br = new BufferedReader(fr);
				String s = "";
				while((s = br.readLine()) != null){
					System.out.println(s);
				}
			} catch (Exception e) {
				System.out.println("��������: "+e);
			}finally {
				try {
					fr.close();
					br.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}else {
			System.out.println("������ �ƴմϴ�");
		}
	}
	private static void renameDirectory(String[] input) {
		String path = "";
		path = MyDos3.path + "\\" + input[1];
		File filebefore = new File(path);
		File fileafter = new File(MyDos3.path + "\\" + input[2]);
		
		if(filebefore.exists()) {
			filebefore.renameTo(fileafter);
			System.out.println("����Ϸ�");
		}else {
			System.out.println("�̸��� �����ϴ�");
		}
	}
	private static void removeDirectory(String[] input) {
		String path = "";
		path = MyDos3.path + "\\" + input[1];
		File deletefile = new File(path);
		
		if(!deletefile.exists()) {
			System.out.println("�������� �ʴ� ���丮�Դϴ�");
		}else {
			deletefile.delete();
			System.out.println("���丮 ����");
		}
	}
	private static void searchDirectory() {
		File file = new File(path);
		File[] files = file.listFiles();
		
		for(File ff : files) {
			String name = ff.getName();
			System.out.println(ff.isDirectory() ? "[Dir]" + name : name);
		}
		
	}
	private static void changeDirectory(String[] input) {
		String path = "";
		switch (input[0].toLowerCase()) {
		case "cd":
			path = MyDos3.path + "\\" + input[1];
			defaultPath = path;
			MyDos3.path = defaultPath;
			break;
		case "cd..": 
			File newFile = new File(defaultPath);
			defaultPath = newFile.getParent();
			MyDos3.path = defaultPath;
			break;
		case "cd\\": 
			defaultPath = "C:" + File.separator;
			MyDos3.path = defaultPath;
			break;
		case "cd/":
			defaultPath = "C:" + File.separator;
			MyDos3.path = defaultPath;
			break;
		
		}
	}
	private static void makeDirectory(String[] input) {
		String path = "";
		path = MyDos3.path + "\\" + input[1];
		File newfile = new File(path);
		
		if(newfile.exists()) {
			System.out.println("�̹� �����ϴ� ���丮�Դϴ�");
		}else {
			newfile.mkdir();
			System.out.println("�����Ϸ�");
		}
	}
	static void printFileList(File dir) {
		System.out.println("Full Path: "+dir.getAbsolutePath());

		//�ڵ� - ����(������� �ٸ�)
		List<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();//���� �ڿ������� ���� ��� �ϳ��ϳ��� ���� ��ü�� ��
		//[0] > a.txt >> �� ���� Ÿ���� File Ÿ��
		//[1] > aaa����
		//[2] > bbb����
		//[3] > java.jpg
		for(int i=0; i< files.length;i++) {
		String filename = files[i].getName();//������, ���ϸ�
		if(files[i].isDirectory()) {//����
		filename = "[ DIR ]" + filename;
		//POINT
		subdir.add(i); //why? >> ������ �༮�� index���� (i) > arraylist
		//subdir[0] > 1
		//subdir[1] > 2
		}else {
		filename = filename + " / " + files[i].length() + "byte";
		}
		}

		//��������?
		int dirnum = subdir.size(); //���� �־��� ������ ���� ���� ����
		int filenum = files.length - dirnum;//���ϰ���

		//��������(���� ���� ���� �ڿ�)
		totaldirs += dirnum;//�� ������ ���� ��(������ ��������)
		totoalfiles += filenum; //�� ���� ���� ����(������ ��������)

		System.out.println("[Current DirNum]: "+ dirnum);
		System.out.println("[Current FileNum]: "+ filenum);
		System.out.println("*****************************");

		//POINT(���� ������ �ٽ� ���� ����)
		//[0] > a.txt >> �� ���� Ÿ���� File Ÿ��
		//[1] > aaa���� > a-1����, a-2����
		//[2] > bbb���� > b-1����, b.txt, b-1.jpg
		//[3] > java.jpg
		for(int i=0; i< subdir.size(); i++) {//C:\\Temp ���� >> ���� ��������
		int index = subdir.get(i);//������ �� ��ġ�� 
		//������ �ڵ�
		printFileList(files[index]);//���ȣ��(���� �� �ڽ��� �� �θ���)
		//C:\\Temp\\aaa
		}

		}
}