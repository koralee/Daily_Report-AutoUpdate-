package ioEx;

import java.io.*;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		FileOutputStream fos = null;

		byte _read[] = new byte[100];
		byte console[] = new byte[100];

		try {
			fos = new FileOutputStream("C:\\TTEST\\newDirectory\\newFile.txt");
			String msg = "자바야 쳐! 놀자!";
			fos.write(msg.getBytes());
			fos.close();
			
		} catch (FileNotFoundException fn) {

		} catch (IOException fn) {

		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException ee) {

			}
		}

	}
}
