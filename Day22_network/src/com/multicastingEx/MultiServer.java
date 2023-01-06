package com.multicastingEx;

import java.io.*;
import java.net.*;
import java.util.*;

/*
 * 		MultiServer = 모든 클라이언트의 연결 요청을 받아서 Socket을 생성하고
 * 							 Socket을 유지하기 위해서 Thread 객체를 생성
 * 							 생성된 Thread 객체를 컬렉션(ArrayList) 내에 저장한다.
 */



public class MultiServer { // 서버는 Read/Write 순서  // 클라이언트는 Write/Read 순서 
	
	/*		ArrayList<MultiServerThread	>는
	 * 		특정 사용자가 보낸 메시지를 모든 클라이언트에게 전달하기 위해 클라이언트와 메시지를
	 *      송, 수신할 수 있는 기능을 가진 MultiServerThread 객체를 저장할 컬렉션
	 */
	
	private ArrayList<MultiServerThread	> clientList 
	= new ArrayList<MultiServerThread	>();
	
	private ServerSocket server = null;
	
	public MultiServer() {
		try {
			
			server = new ServerSocket(6000);
			System.out.println("서버가 시작되었습니다.");
			
			while(true) {
				Socket socket = server.accept(); // 서버에 접속한 정보를 저장
				InetAddress ip = socket.getInetAddress(); // 소켓에서 ip를 얻어옴
				String ipAddress = ip.getHostAddress(); // ip를 저장
				System.out.println(ipAddress + "님이 입장 하셨습니다.");
				
				//멀티쓰레드 객체를 만들어서 호출!
				MultiServerThread t = new MultiServerThread(clientList, socket);
				t.start();
				
				// 클라이언트 리스트에 쓰레드를 추가
				clientList.add(t);
			}
		
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		new MultiServer();
	}

}
