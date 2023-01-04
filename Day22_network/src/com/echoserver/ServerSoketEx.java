package com.echoserver;

import java.io.IOException;
import java.net.*;

//쉽게말해서 Server == Master
public class ServerSoketEx {
	public static void main(String[] args) throws IOException {
			// 접속자를 받아 들이기 위해 ServerSocket이 필요하기 때문에 ServerSocket을 생성함.
			ServerSocket ss = new ServerSocket(3000); //숫자에 맞는 소켓에 클라이언트가 연결되어야함.
			
			while(true) {
				//접속자가 접속 할 때가지 무한정 기다림(무한대기) 
				// 그러므로 서버는 반드시 한 번만 돌려야한다!
				Socket s = ss.accept(); // 접속 감지
				
				//접속자의 ip를 알아내기 위해서 객체를 얻어옴
				InetAddress iaddr = s.getInetAddress();
				String user_ip = iaddr.getHostAddress();
				System.out.println(user_ip+ " 님이 접속하셨습니다.");
				
			}
	}
}
