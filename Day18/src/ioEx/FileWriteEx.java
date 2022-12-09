package ioEx;

import java.io.*;

public class FileWriteEx {

	public static void main(String[] args) {

		FileWriter writer = null;

		try {
			writer = new FileWriter("C:\\TTEST\\fw.txt");
			String str = "학교 종이 깨졋다 엿을 사먹자 !!!!!";

			writer.write(str); // 파일 객체에 작성하는 것
			/*
			 * 	한글자 단위로 읽고 쓸 수 있는 Reader, Writer 계열의 스트림은
			 * 내부적으로 버퍼를 내장하고 있다.
			 * 내장된 버퍼는 가득 채워질 때만 스트림을 통해서 내보낸다.
			 * but, 버퍼가 채워지지 않았을 경우 flush() 메소드를 이용해서
			 * 버퍼를 비울 수 있다! 
			 * #flush : 물로 깨끗하게 씻어내다.
			 */
			
			
			writer.flush(); // 새로운 내용을 입력받기 위해서 버퍼를 비우는 것!(다 안찼어도 강제로 비울 수 있는 명령)= flush();
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException ie) {
				// TODO: handle exception
			}
		}
	}

}
