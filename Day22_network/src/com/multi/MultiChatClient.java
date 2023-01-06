package com.multi;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.Buffer;

import javax.swing.*;
import javax.swing.border.*;
import java.net.*;

public class MultiChatClient extends JFrame implements ActionListener, Runnable {

	private String ip; // 서버 ip
	private String id; // 로그인/ 로그아웃
	private Socket socket;

	// 입출력 스트림 선언
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;
//=================================	
	private JPanel loginPanel; // 로그인 패널
	private JButton loginButton;// 로그인 버튼
	private JLabel label1;// 대화명 라벨
	private JTextField idInput;// 대화명 입력 텍스트 필드
//=================================
	private JPanel logoutPanel;// 로그아웃 패널 구성
	private JLabel label2; // 대화명 출력 라벨
	private JButton logoutButton; // 로그아웃 버튼
//=================================
	private JPanel msgPanel;// 입력 패널 구성
	private JTextField msgInput;// 메시지 입력 텍스트 필드
	private JButton exitButton;// 종료 버튼
//=================================
// 카드 레이아웃 관련
	private Container tab;
	private CardLayout clayout;
	private Thread thread;

	boolean status;

// =================================
// 프레임 관련 
	private JFrame jframe; // 채팅창
	private JTextArea msgOut; // 채팅 내용출력창

//=================================
	public MultiChatClient(String ip) {
		this.ip = ip;
		// 로그인 패널 구성
		loginPanel = new JPanel();

		// 레이아웃 설정
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginButton = new JButton("로그인");
		label1 = new JLabel("대화명");

		// 패널에 위젯 구성
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);

		// 로그아웃 패널 구성
		logoutPanel = new JPanel();
		// 레이아웃 설정
		logoutPanel.setLayout(new BorderLayout());
		label2 = new JLabel();
		logoutButton = new JButton("로그아웃");

		// 패널에 위젯 구성
		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);

		// 입력 패널 구성
		msgPanel = new JPanel();
		// 레이아웃 설정
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);

		exitButton = new JButton("종료");

		// 패널에 위젯 구성
		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);

		// 로그인/로그아웃 패널을 선택하기 위한 카드레이아웃 패널 구성
		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel, "logout");

		// 메인 프레임 구성
		jframe = new JFrame("::멀티챗::");
		msgOut = new JTextArea(" ", 10, 30);
		// JTextArea의 내용을 수정하지 못하게 함. 즉, 출력 전용으로 사용
		msgOut.setEditable(false);
		// 수직 스크롤바는 항상 나타내고, 수평 스크롤바는 필요할 때만 나타나게 함
		JScrollPane jsp = new JScrollPane(msgOut,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);

		//로그인 패널 먼저 표시
		clayout.show(tab, "login");
		jframe.pack();
		jframe.setResizable(false);
		jframe.setVisible(true); // true = 보임 // false = 안보임
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 이벤트 리스너 등록
		loginButton.addActionListener(this);
		logoutButton.addActionListener(this);
		msgInput.addActionListener(this);
		exitButton.addActionListener(this);		
	}
		public void connectServer() {
			try {
				//소켓 생성
				socket = new Socket(ip, 6000);
				System.out.println("[Client]Server 연결 성공이닷 !!!!!");
				
				inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				outMsg = new PrintWriter(socket.getOutputStream(),true);
				
				//Server에 메시지를 전달
				outMsg.println(id+"/"+"Login");
				thread = new Thread(this);
				thread.start();	
			}catch (Exception e) {
				System.out.println("[MultiChatClient]connectionServer() IOException 발생함 .....");
			}
		}
	
	
	public static void main(String[] args) {
		new MultiChatClient("192.168.0.113");
	}

	@Override
	public void run() {
		String msg;
		String[] rmsg;
		
		status = true;
		
		while(status) {
			try {
				//메세지 수신과 파싱
				msg = inMsg.readLine();
				rmsg = msg.split("/");
				
				//JTextArea에 서신된 메시지를 추가함
				msgOut.append(rmsg[0]+">"+rmsg[1]+"\n");
				
				//커서를 현재 대화 메시지에 표시함.
				msgOut.setCaretPosition(msgOut.getDocument().getLength());
			
			} catch (IOException ii) {
				status = false;
			}
		}
		System.out.println("[MultiChatClient]"+thread.getName()+"종료 되었습니다.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		Object obj = e.getSource();
		if(obj == exitButton) {
			System.exit(0);
			
		}else if(obj == loginButton) {
			id = idInput.getText();
			label2.setText("대화명"+id);
			clayout.show(tab, "logout");
			connectServer();
			
		}else if(obj == logoutButton) {
			outMsg.println(id+"/"+"logout");
			msgOut.setText("");
			clayout.show(tab, "login");
			outMsg.close();
			try {
				inMsg.close();
				socket.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			status = false;
			
		}else if(obj == msgInput) {
			//메시지를 전송하고
			outMsg.println(id+"/"+msgInput.getText());
			//메시지 입력창을 초기화(클리어시킴)
			msgInput.setText("");
		}
	}
}
