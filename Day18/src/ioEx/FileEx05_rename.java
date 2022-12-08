package ioEx;

import java.io.*;

public class FileEx05_rename {

	public static void main(String[] args) throws IOException {

		File src = new File("C:\\TTEST\\알파벳.txt"); // 원본! (원본을 기준으로 바꿔준다!)

		File dest = new File("C:\\TTEST\\알파벳2.txt");

		File dest2 = new File("C:\\TTEST\\알파벳3.txt");

		if (src.exists()) {
			src.renameTo(dest);  //  가장 첫 번째의 코드만 먹힌다.
			// src.renameTo(dest2);  한 번 돌리면 원본의 기준이 바뀌므로
		}
	}

}
