package ioEx;

import java.io.*;

public class FileCopyEx02_UseBuffered {

	public static void main(String[] args) {
		System.out.println("파일 복사 시작....");
		long start = System.currentTimeMillis();
		System.out.println((start / 1000) / 60 / 60 / 60 / 60 / 60);

		FileInputStream src = null; // 원본
		FileOutputStream dest = null; // 복사본

		try {
			// 원본
			src = new FileInputStream(new File("C:\\TTEST\\newDirectory\\aa.log"));
			// 복사본
			dest = new FileOutputStream(new File("C:\\TTEST\\newDirectory\\bb.txt"));

			// 임시 저장소에 저장된 Data의 전체 개수를 저장할 변수를 선언.
			int length = 0;
			// 임시 저장소로 사용될 Byte 배열 선언
			byte[] buffer = new byte[1024 * 8]; // 8192 1KB*8 = 8KB == 8192byte
			/*
			 * inputStream을 통해서 읽어들인 Data를 임시저장소(buffer)에 저장하고, 저장된 Data에 개수를 length에 저장함.
			 */

			// 원본의 내용을 read(buffer)로 읽어서 length 변수에 저장 후
			// 복사한 파일에 write()로 내용을 저장!(copy)한다!!

			// OutputStream의 read()메소드를 통해서 읽어들인 값을 length에 저장함.
			while ((length = src.read(buffer)) != -1) { // -1은 파일의 끝을 의미! 즉 buffer의 끝이 아닐 때 까지 반복!
				
				// OutputStream을 통해서 buffer에 저장되어 있는 Data를 length만큼 파일에 기록한다.
				dest.write(buffer, 0, length); // byte 단위 혹은 byte[] 로 읽는다!
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
