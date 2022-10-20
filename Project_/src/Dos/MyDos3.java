package Dos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyDos3 {
	static int totoalfiles = 0;//파일 갯수
	static int totaldirs = 0;//폴더 갯수
	static String defaultPath = "C:" + File.separator;
	static String path = defaultPath;
	
	public static void main(String[] args) throws Exception{
		System.out.println("Bitamp Microsoft Windows DOS 명령어 [Version 1.3]");
		System.out.println("2022 Bitcamp. All rights reserved\n");

		Scanner sc = new Scanner(System.in);

		String[] input = null;

		while (true) {
			System.out.print(path + ">");
			input = sc.nextLine().trim().split(" "); // input배열에 띄어쓰기 기준으로 각 방에 저장, 첫 번째 방 전에 공란 방지

			if (input[0].equalsIgnoreCase("exit")) { // 오직 exit로만 Dos 종료 가능
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
		System.out.println("dir [탐색할 디렉토리명]");
		System.out.println("mkdir [생성디렉토리명]");
		System.out.println("rename [파일명] [새로운 파일명]");
		System.out.println("rmdir [삭제할 파일명]");
		System.out.println("type [읽어들일 txt파일명]");
		System.out.println("Exit: 종료");
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
				System.out.println("오류내용: "+e);
			}finally {
				try {
					fr.close();
					br.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}else {
			System.out.println("파일이 아닙니다");
		}
	}
	private static void renameDirectory(String[] input) {
		String path = "";
		path = MyDos3.path + "\\" + input[1];
		File filebefore = new File(path);
		File fileafter = new File(MyDos3.path + "\\" + input[2]);
		
		if(filebefore.exists()) {
			filebefore.renameTo(fileafter);
			System.out.println("변경완료");
		}else {
			System.out.println("이름이 같습니다");
		}
	}
	private static void removeDirectory(String[] input) {
		String path = "";
		path = MyDos3.path + "\\" + input[1];
		File deletefile = new File(path);
		
		if(!deletefile.exists()) {
			System.out.println("존재하지 않는 디렉토리입니다");
		}else {
			deletefile.delete();
			System.out.println("디렉토리 삭제");
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
			System.out.println("이미 존재하는 디렉토리입니다");
		}else {
			newfile.mkdir();
			System.out.println("생성완료");
		}
	}
	static void printFileList(File dir) {
		System.out.println("Full Path: "+dir.getAbsolutePath());

		//코드 - 자유(사람마다 다름)
		List<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();//하위 자원정보를 전부 담기 하나하나를 파일 객체로 봄
		//[0] > a.txt >> 각 방의 타입은 File 타입
		//[1] > aaa폴더
		//[2] > bbb폴더
		//[3] > java.jpg
		for(int i=0; i< files.length;i++) {
		String filename = files[i].getName();//폴더명, 파일명
		if(files[i].isDirectory()) {//폴더
		filename = "[ DIR ]" + filename;
		//POINT
		subdir.add(i); //why? >> 폴더인 녀석의 index값을 (i) > arraylist
		//subdir[0] > 1
		//subdir[1] > 2
		}else {
		filename = filename + " / " + files[i].length() + "byte";
		}
		}

		//폴더갯수?
		int dirnum = subdir.size(); //현재 주어진 폴더의 하위 폴더 갯수
		int filenum = files.length - dirnum;//파일갯수

		//누적갯수(하위 폴더 안의 자원)
		totaldirs += dirnum;//총 누적된 폴더 수(하위의 하위까지)
		totoalfiles += filenum; //총 누적 파일 갯수(하위의 하위까지)

		System.out.println("[Current DirNum]: "+ dirnum);
		System.out.println("[Current FileNum]: "+ filenum);
		System.out.println("*****************************");

		//POINT(하위 폴더의 다시 하위 폴더)
		//[0] > a.txt >> 각 방의 타입은 File 타입
		//[1] > aaa폴더 > a-1폴더, a-2폴더
		//[2] > bbb폴더 > b-1폴더, b.txt, b-1.jpg
		//[3] > java.jpg
		for(int i=0; i< subdir.size(); i++) {//C:\\Temp 제어 >> 안의 하위폴더
		int index = subdir.get(i);//폴더의 방 위치값 
		//한줄의 코드
		printFileList(files[index]);//재귀호출(내가 내 자신을 또 부른다)
		//C:\\Temp\\aaa
		}

		}
}