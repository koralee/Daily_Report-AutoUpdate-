package com.unicastingEx;

import java.io.*;
import java.net.*;

public class UnicastClient {

	Socket socket = null;;
	BufferedReader br = null;
	BufferedWriter bw = null;
	BufferedReader keyboard = null;

	public UnicastClient() {
		
		try {
			socket = new Socket("localhost", 5000);
		} catch (UnknownHostException uhe) {
			System.out.println("서버를 찾을 수 없습니다.");
			System.exit(0);
		} catch (IOException ioe) {
			System.out.println("서버를 찾을 수 없습니다.");
			System.exit(0);
		}

		try {
			// 키보드와 연결된 스트림 얻기
			keyboard = new BufferedReader(new InputStreamReader(System.in));

			// 소켓으로부터 스트림 얻기
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 서버와 메세지 주고 받기
			while (true) {
				// 키보드로 내용 읽기
				System.out.println("전송할 메시지 : ");
				String msg = keyboard.readLine();

				// 메세지를 서버로 전송함.
				bw.write(msg + "\n");
				bw.flush();

				// 서버가 전송한 메시지 수진
				String getMsg = br.readLine();
				System.out.println("수신 메세지 : " + getMsg);

			}
		} catch (IOException e) {
		System.out.println("서버와의 연결이 끊어졌습니다.");
		System.exit(0);
		}
	}

	public static void main(String[] args) {
		new UnicastClient();

	}

}
