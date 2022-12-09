package ioEx;

import java.io.*;

public class DataInputStreamEx {
	public static void main(String[] args) {
		DataInputStream dis = null; // 1차원 스트림
		// DataOutputStream : 기본 자료형 타입 그대로 스트림을 통해서 저장할 수 있다.

		FileInputStream fis = null;// 2차원 스트림 // 객체 선언

		try {
			// 객체 생성
			fis = new FileInputStream("C:\\TTEST\\data.txt");  // 파일을 경로에 맞게 생성
			dis = new DataInputStream(fis); // Data를 파일에 저장!

			// 기본자료형 // Data를 읽어 들일 때는 반드시 저장한 순서대로 읽어야함.
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();

			// 출력!
			System.out.println("i 값 : "+i);
			System.out.println("d 값 : "+d);
			System.out.println("S 값 : "+s);

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				dis.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}
