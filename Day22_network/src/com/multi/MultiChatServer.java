package com.multi;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiChatServer {

	// 서버 소켓과 클라이언트 연결 소켓
	private ServerSocket ss = null;
	private Socket s = null;

	// 연결된 클라이언트 스레드를 관리하는 ArrayList
	private ArrayList<ChatThread> chatlist = new ArrayList<>();

	// 채팅 프로그램을 실행하는 메인 프로그램
	public void start() {
		try {

			// 서버 소켓 생성함
			ss = new ServerSocket(6000);
			System.out.println("Server Started.....");

			// 무한 루프를 돌면서 클라이언트가 연결되기를 기다림.
			while (true) {

				s = ss.accept();

				// 연결된 클라이언트에게 스레드를 생성
				ChatThread chat = new ChatThread();

				// 클라이언트 리스트에 추가함.
				chatlist.add(chat);

				// 스레드 시작
				chat.start();

			}

		} catch (Exception e) {
			System.out.println("[MultiChatServer]start() Exception 발생함.....");
		}

	}

	// 연결된 모든 클라이언트에게 메세지를 전송함.
	public void msgSendAll(String msg) {

		for (ChatThread ct : chatlist) {
			ct.outMsg.println(msg);
		}
	}

	// 클라이언트 관리를 위핸 쓰레드 클레스
	class ChatThread extends Thread {
		// 수신 메시지와 파싱 메시지를 처리할 변수를 선언
		String msg;
		String[] rmsg;

		// 입출력 스트림을 생성
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;

		@Override
		public void run() {

			boolean status = true;
			System.out.println("##ChatThread start .....");
			try {
				// 입출력 스트림
				inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
				outMsg = new PrintWriter(s.getOutputStream(), true);

				// true 일때 루프를 돌명서 사용자한테서 수신된 메시지를 처리함
				while (status) {
					// 수신된 메시지를 msg 변수에 저장
					msg = inMsg.readLine();
					// '/' 구분자를 기준으로 메시지를 문자열 배열로 파싱
					rmsg = msg.split("/");

					// 파싱된 문자열 배열의 두 번째 요소값에 따라 처리
					// 로그아웃 메시지일 때
					if (rmsg[1].equals("logout")) {
						chatlist.remove(this);
						msgSendAll("server/" + rmsg[0] + "님이 종료했습니다.");
						// 해당 클라이언트 스레드 종료로 status를 false로 설정
						status = false;
					}
					// 로그인 메시지일 때
					else if (rmsg[1].equals("login")) {
						msgSendAll("server/" + rmsg[0] + "님이 로그인했습니다.");
					}
					// 그 밖의 일반 메시지일 때
					else {
						msgSendAll(msg);
					}
				}
				// 루프를 벗어나면 클라이언트 연결이 종료되면서 스레드에 인터럽트가 발생됨
				this.interrupt();
				System.out.println("##"+this.getName()+"strop !!!!!");
				
			} catch (IOException e) {
				chatlist.remove(this);
				System.out.println("[ChatThread]run() IOException 발생함 .....");
			}
		}

	}

	public static void main(String[] args) {
		MultiChatServer ms = new MultiChatServer();
		ms.start();
		// 또는 new MultiChatServer().start();
	}
}
