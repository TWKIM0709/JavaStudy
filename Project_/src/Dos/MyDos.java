package Dos;

import java.io.File;
import java.util.Scanner;

public class MyDos {

	static String defaultPath = "C:" + File.separator;
	static String path = defaultPath;

	public static void main(String[] args) {

		System.out.println("Bitamp Microsoft Windows DOS 명령어 [Version 1.1]");
		System.out.println("2020 Bitcamp. All rights reserved\n");

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
//			case "dir":
//				searchDirectory();
//				break;
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
//				removeDirectory(input);
				break;
			case "ren":
			case "rename":
//				renameDirectory(input);
				break;
			case "type":
//				readTextFile(input);
				break;
			case "help":
//				displayHelp();
				break;
			default: System.out.println("ㅁㄴㅇㄹ");
			}
		}
	}
	
	public static void changeDirectory(String[] input) {
		File file = null;
		switch (input[0].toLowerCase()) {
			case "cd":
				file = new File(path + "\\" + input[1]);
				if(!file.isDirectory()) {
					System.out.println("폴더를 입력하세요");
					return;
				}
				path+= "\\" + input[1];
				break;
			case "cd..":
				try {
					file = new File(path);
					path = file.getParent();
				}catch (Exception e) {
					// TODO: handle exception
				}
			case "cd\\":
			case "cd/":
				path = defaultPath;
		}
	}
	public static void makeDirectory(String[] input) {
		File file = new File(path);
	}
	
}