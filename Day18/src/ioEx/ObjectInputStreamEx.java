package ioEx;

import java.io.*;

public class ObjectInputStreamEx {
	public static void main(String[] args) {

		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("C:\\TTEST\\obj.sav"));

			Data data = (Data) ois.readObject(); // Data로 형변환
			System.out.println("번호 : " + data.getNo());
			System.out.println("이름 : " + data.getName());
			System.out.println("이메일 : " + data.getMail());

		} catch (ClassNotFoundException fefc) {
			fefc.printStackTrace();
		} catch (FileNotFoundException fefn) {
			fefn.printStackTrace();
		} catch (IOException ii) {
			ii.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}

			} catch (IOException ie) {
				// TODO: handle exception
			}
		}

	}
}
