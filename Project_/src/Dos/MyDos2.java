package Dos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyDos2 {
	static int totoalfiles = 0;// 파일 갯수
	static int totaldirs = 0;// 폴더 갯수
	static String defaultPath = "C:" + File.separator;
	static String path = defaultPath;

	public static void main(String[] args) throws Exception {
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

	//도움말
	private static void displayHelp() {
		System.out.println("[dir] : 현재 폴더의 내용 출력");
		System.out.println("[cd] [폴더명] : 폴더 이동");
		System.out.println("[cd..] : 이전 폴더로 이동");
		System.out.println("[cd\\]|[cd/] : 기본폴더(C:\\\\)로 이동");
		System.out.println("[md]|[mkdir] [생성디렉토리명] : 새폴더를 생성");
		System.out.println("[ren]|[rename] [파일명] [새로운 파일명] : 파일/폴더명 변경");
		System.out.println("[rd]|[rmdir] [삭제할 파일명] : 파일/폴더를 삭제");
		System.out.println("[type] [읽어들일 txt파일명] : txt파일의 내용 출력");
		System.out.println("[Exit] : 종료");
	}

	//텍스트파일 내용 출력
	private static void readTextFile(String[] input) {
		if(!ckExists(input)) return;
		
		File readfile = new File(path+ "\\" + input[1]);
		FileReader fr = null;
		BufferedReader br = null;
		if (!readfile.exists() || !readfile.isFile()) {
			System.out.println("올바른 경로를 입력하세요");
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
			System.out.println("오류내용: " + e);
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

	//이름바꾸기
	private static void renameDirectory(String[] input) {
		if(!ckExists(input)) return;
		
		path = path + "\\" + input[1];
		File filebefore = new File(path);
		if(!filebefore.exists()) {
			System.out.println("입력 오류입니다. 파일이 없거나 같은 이름입니다.");
			return;
		}
		filebefore.renameTo(new File(path + "\\" + input[2]));
		
		back();
	}

	//파일|폴더 삭제 (하위 폴더 있을 경우 추가해야됨(재귀함수로))
	private static void removeDirectory(String[] input) {
		if(!ckExists(input)) return;
		File deletefile = new File(path + "\\" + input[1]);

		deleteFileList(deletefile);	//삭제용 재귀함수
	}

	//현재 폴더 내용 출력
	private static void searchDirectory() {
		File file = new File(path);
		File[] files = file.listFiles();
		
		for(File ff : files) {
			String name = ff.getName();
			System.out.println(ff.isDirectory() ? "[Dir]" + name : name);
		}
	}

	//폴더 이동 함수
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

	//폴더 생성 함수
	private static void makeDirectory(String[] input) {
		path = path + "\\" + input[1];
		File newfile = new File(path);
		if (newfile.exists()) {
			System.out.println("이미 존재하는 디렉토리입니다");
			return;
		}
		newfile.mkdir();
		System.out.println("생성완료");
		back();
	} 
	
	//입력한 파일/폴더가 존재 하는지 체크
	public static boolean ckExists(String[] index) {
		File file = new File(path + "\\" + index[1]);
		boolean ck = true;
		if(!file.exists()) {
			System.out.println("올바른 경로를 입력하세요");
			ck = false;
		}
		return ck;
	}
	
	//하위폴더까지 지우는데 사용되는 재귀함수
	static void deleteFileList(File dir) {
		List<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();// 하위 자원정보를 전부 담기 하나하나를 파일 객체로 봄
		
		for (int i = 0; i < files.length; i++) {
			String filename = files[i].getName();// 폴더명, 파일명
			if (files[i].isDirectory()) {// 폴더
				subdir.add(i);
			} else {
				files[i].delete();
			}
		}
		for (int i = 0; i < subdir.size(); i++) {
			int index = subdir.get(i);
			deleteFileList(files[index]);// 재귀호출(내가 내 자신을 또 부른다)
		}
		dir.delete();
	}
	
	//경로 Ctrl + Z 함수
	public static void back() {
		File file = new File(path);
		path = file.getParent();
	}
}