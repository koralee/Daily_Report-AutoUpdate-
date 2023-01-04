package com.unicastingEx;
// 각각의 클라이언트와 연결된 소켓을 가지고 있으며

// 클라이언트와 접속을 유지하고 통신을 담당함.
// 서버가 아닌 쓰레드 인 것을 인지하고 있을 것!
// 즉, 서버와 연결을 해줘야한다.
import java.io.*;
import java.net.*;

public class UnicastServerThread extends Thread {

	Socket socket = null;;
	BufferedReader br = null;
	BufferedWriter bw = null;

	public UnicastServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// Stream 연결
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 사용자와 대화를 송수신
			while (true) {
				// 사용자가 전달한 메시지를 수신
				String msg = br.readLine();
				System.out.println(msg);

				// 사용자에게 메세지를 재전송함.
				bw.write(msg + "\n");
				bw.flush();
			}

		} catch (IOException ioe) {

			InetAddress ip = socket.getInetAddress();
			String addr = ip.getHostAddress();
			System.out.println("[" + addr + "]" + " 와의 연결이 끊어졌습니다.");
		}
	}
}
