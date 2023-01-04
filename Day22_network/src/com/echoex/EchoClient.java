package com.echoex;

import java.io.*;
import java.net.*;

public class EchoClient {

	public EchoClient() {

		try {

			Socket s = new Socket("localhost", 3000);

			// 소켓으로부터 Stream을 생성(입력, 출력)
			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			// 사용자에게 메시지 전동하기
			bw.write("헬로 아리가또! 그대로 뒤로 돌아~~~갓!\n");
			bw.flush();

			// 사용자가 전송한 메시지 읽기
			String message = br.readLine();
			System.out.println("서버가 보낸 메세지 : " + message);

		} catch (UnknownHostException ii) {
			System.out.println("서버를 찾을 수 없습니다.");
		} catch (IOException ii) {
			System.out.println("해당 port는 누군가에게 사용중입니다.");
		}
	}

	public static void main(String[] args) {
		new EchoClient();
	}

}
