package ioEx;

import java.io.*;	
public class FileEx02_Exist_Check {

	public static void main(String[] args) {

		File dir = new File("c:/");
		if(dir.exists()) {
			if(dir.isDirectory()) {
				String[] fileList = dir.list(); // 디렉토리 안에 있는 모든 디렉토리 or 파일 목록!을 의미!
				for(String fileName : fileList) {
					System.out.println("파일 이름 : "+fileName);
				}
			}
		}
	
	}

}
