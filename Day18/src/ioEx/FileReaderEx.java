package ioEx;

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		FileReader reader = null;

		try {
			// 파일로 부터 한 문자 단위로 읽어옮(=char)
			reader = new FileReader("C:\\TTEST\\fw.txt");
			// 스트림을 통해서 읽어들인 유니코드 값을 저장할 변수를 선언
			int readValue = 0; // 스트림은 바이너리 인 0과 1로 들어오는 것이므로 int형
			
			while((readValue = reader.read())!= -1) {
				System.out.print((char)readValue); //바이너리로 들어온 Data를 char로 변환해주는 것!
			}
			
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException ie) {
				// TODO: handle exception
			}
		}
	}

}
