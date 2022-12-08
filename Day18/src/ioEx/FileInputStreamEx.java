package ioEx;

import java.io.*;
import java.nio.Buffer;

public class FileInputStreamEx {

	public static void main(String[] args) {
		FileInputStream fis = null;

		byte _read[] = new byte[100];
		byte console[] = new byte[100];

		try {

			System.out.println("파일명 : ");
			System.in.read(console);
			String file = new String(console).trim(); 
			// .trim()은 바이트의 공백을 제거하고 순수한 텍스트만 읽는다.(파일 내용의 공백이 아님!)

			fis = new FileInputStream(file);
			fis.read(_read, 0, _read.length);
			System.out.print(new String(_read).trim()); 
			// 위의 파일을 읽어 들일 때도 시스템상 혹시 모를 바이트의 공백을 제거!(파일 내용의 공백이 아님!)
	

		} catch (FileNotFoundException fn) {

		} catch (IOException fn) {

		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException ee) {

			}
		}

	}

}
