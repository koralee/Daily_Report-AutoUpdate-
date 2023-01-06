package com.multicastingEx;

import java.io.*;
import java.net.*;


//클라이언트이므로 ArrayList가 필요없음.
public class MultiClient {

	private Socket socket = null;;
	private BufferedReader in = null;
	private PrintWriter out = null;
	private BufferedReader keyboard = null;

	public MultiClient() {
		try {
			socket = new Socket("192.168.0.113", 5000); //"localhost"
			System.out.println("서버와 성공적으로 연결되었습니다. 즐거운 시간이 되십시오...");

			// Stream연결

			keyboard = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(socket.getOutputStream(), true); // 버퍼를 사용할 것인지 true
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			/*		
			 * 		서버가 전송한 메시지를 읽어들일 읽기전용 쓰레드를 생성함.
			 * 		MultiClientThread 생성시에 서버가 전송한 메시지를 읽어들일 수 있는 Stream을 전달함.
			 */
			
			MultiClientThread mt = new MultiClientThread(in);
			mt.start();
			
			while(true) {
				String text = keyboard.readLine();
				out.println(text);
			}
			
			
		} catch (UnknownHostException ue) {
			ue.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MultiClient();
	}
}
