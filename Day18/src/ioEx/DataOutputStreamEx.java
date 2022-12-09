package ioEx;

/*
 *   DataInputStream과 DataOutputStream // 두개는 한 쌍이다! 
 *   
 *   - 특정 데이터 타입과 포멧을 유지한 채 데이터를 기록하고 읽어올 수 있는 스트림
 *   - 특정 데이터 타입과 포멧에 맞게 읽고,  쓸수 있는 메소드를 제공함.
 *   	writeBoolean(boolean v),write(int i), writeUTF(String s)
 *   	readInt(), readUTF, readBoolean()
 */

import java.io.*;

public class DataOutputStreamEx {
	public static void main(String[] args) {

		DataOutputStream dos = null; // 1차원 스트림
		// DataOutputStream : 기본 자료형 타입 그대로 스트림을 통해서 저장할 수 있다.

		FileOutputStream fos = null;// 2차원 스트림 // 객체 선언

		try {
			// 객체 생성
			fos = new FileOutputStream("C:\\TTEST\\data.txt");  // 파일을 경로에 맞게 생성
			dos = new DataOutputStream(fos); // Data를 파일에 저장!

			// 기본자료형
			int i = 0;
			double d = 3.14;
			String s = "Again Java";

			// 특정 Data 타입으로 저장
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				dos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}
