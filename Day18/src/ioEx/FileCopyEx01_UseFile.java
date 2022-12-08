package ioEx;

import java.io.*;

public class FileCopyEx01_UseFile {

	public static void main(String[] args) {
		// 복사할 원본은 Input으로 복사본이 될 파일은 Output으로!

		System.out.println("파일 복사 시작....");
		long start = System.currentTimeMillis();
		System.out.println((start / 1000) / 60 / 60 / 60 / 60 / 60);

		FileInputStream src = null; // 원본
		FileOutputStream dest = null; // 복사본

		try {
			// 원본
			src = new FileInputStream(new File("C:\\TTEST\\newDirectory\\newFile.txt"));
			// 복사본
			dest = new FileOutputStream(new File("C:\\TTEST\\newDirectory\\newFileCopy.txt"));

			int readValue = 0; // 내용을 저장할 변수

			// 원본의 내용을 read()로 읽어서 readValue 변수에 저장 후
			// 복사한 파일에 write()로 내용을 저장!(copy)한다!!
			while ((readValue = src.read()) != -1) { // -1은 파일의 끝을 의미! 즉 파일의 끝이 아닐 때 까지 반복!
				dest.write(readValue); // byte 단위 혹은 byte[] 로 읽는다!
			}
		} catch (FileNotFoundException fn) { // 파일이 없을 때의 에러 출력을 위함!
			fn.printStackTrace();
		} catch (Exception ee) {// 모든 에러에 대한 출력을 위함!
			ee.printStackTrace();
		} finally { // 반드시 실행되는 것!
			try {
				if (src != null) // 원본에 내용을 다 읽고! 연결을 끊는다!
					src.close();
			} catch (IOException ie) {

			}
			long end = System.currentTimeMillis();
			long copyTime = (end - start) / 1000;
			System.out.println("걸린시간 : " + copyTime + " 초"); // copy 하는데 걸리는 시간!
		}
	}

}
