package ioEx;

import java.io.*;

public class FileEx04_delete {
	public static void main(String[] args) throws IOException {

		File f3 = new File("C:\\TTEST\\newFile2.txt"); // 파일
		File f4 = new File("C:\\TTEST\\newDirectory"); // 디렉토리
		
		if (f3.exists()) {
			f3.delete();
		}
		if (f4.exists()) {
			f4.delete();
		}
	}
}
