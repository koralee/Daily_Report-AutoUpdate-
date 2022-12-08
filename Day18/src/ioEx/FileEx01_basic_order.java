package ioEx;

import java.io.*;

public class FileEx01_basic_order {
	public static void main(String[] args) {
		
		File file = new File("c:\\알파벳.txt");
		System.out.println("파일 맞는지 여부 	: "+file.isFile());
		System.out.println("디렉토리 맞는지 여부 	: "+file.isDirectory());
	
		System.out.println("경로 			: "+file.getPath());
		System.out.println("파일 이름 		: "+file.getName());
		System.out.println("파일의 길이 		: "+file.length());
	
		System.out.println("파일의 최종 수정 날짜	: "+file.lastModified());
	}
}
