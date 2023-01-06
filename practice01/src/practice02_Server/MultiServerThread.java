package practice02_Server;

/*		각각의 클라이언트와 연결된 Socket 객체를 가지고 있으며
 * 		클라이언트와 접속을 유지하고, 통신을 담당하는 객체이다.
 * 
 * 		특정 클라이언트가 전송한 메시지를 수신해서 모든 클라이언트에게
 * 		전송하는 Broadcasting이 구현되는 클래스이다.
 */

import java.io.*;
import java.net.*;
import java.util.*;

//  Thread이므로 main은 불필요!
public class MultiServerThread extends Thread {

	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	private ArrayList<MultiServerThread> clientList;

	public MultiServerThread(ArrayList<MultiServerThread> clientList, Socket socket) {
		this.clientList = clientList;
		this.socket = socket;

	}

	// Thread를 이용해서 실행 시키고자 하는 내용을 구현하는 Method
	@Override
	public synchronized void run() { 
	//synchronized 는 동기화 ex) 접속자들의 충돌의 막아줌(쉽게말해 교통정리)

		try {
			//Stream연결
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			//클라이언트와 메시지를 반복적으로 송수신
			while(true) {
				//클라이언트가 보낸 메시지를 읽기
				String msg = in.readLine();
				broadcasting(msg);
			}
		} catch (IOException io) {
			
			clientList.remove(this);
			String ipAddress = socket.getInetAddress().getHostAddress();
			try {
				// 다른 클라이언트에게 퇴장 정보를 알림.
				broadcasting(ipAddress+" 의 연결이 끊어졌습니다.");	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	
	//역할 : 모든 사용자에게 메세지를 전달하는 기능
	public void broadcasting(String msg) throws IOException {
		/*
		 *  아래 clientList에 저장된 MultiServerThread의 개수만큼 반복하면서
		 *  각각의 MultiServerThread의 sendMsg메소드를 호출해서
		 *  연결된 클라이언트에게 메세지를 전달하는 기능.
		 */
		for(MultiServerThread t : clientList) {
			//각각의 MultiServerThread의 sendMsg메소드를 호출해서 메세지를
			//각각의 클라이언트에게 전달하는 기능.
			t.sendMsg(msg);
		}
	}
	
	//역할 : 전달받은 메세지를 소켓에 OutputStream과 연결된 PrintWriter를 이용해서
	// 			클라이언트에게 전달하는 기능
	public void sendMsg(String msg) throws IOException {
		out.println(msg);
		out.flush();
	}
}
