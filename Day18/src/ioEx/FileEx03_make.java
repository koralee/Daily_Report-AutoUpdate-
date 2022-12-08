package ioEx;

import java.io.*;

public class FileEx03_make {
	public static void main(String[] args) throws IOException {
		// 파일 생성
		File f1 = new File("C:\\TTEST\\newFile.txt"); // 빈(空) 파일을 만듦.

		if (f1.exists()) {
			System.out.println("파일 이름 : " + f1.getName());
		} else {
			if (f1.createNewFile()) {
				System.out.println("새로운 파일을 만들었습니다.");
			}
		}

		// 디렉토리 생성(= 폴더)
		File f2 = new File("C:\\TTEST\\newDirectory");

		if (!f2.exists()) {// 존재하지 않으면
			f2.mkdir();
			System.out.println("새로운 폴더를 만들었습니다.");
		} else {
			System.out.println("디렉토리 : " + f2.getName() + "는 " + f2.getPath() + " 에 이미 존재합니다.");
		}
	}
}
