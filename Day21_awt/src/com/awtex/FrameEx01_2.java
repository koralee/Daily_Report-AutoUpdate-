package com.awtex;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEx01_2 extends Frame implements WindowListener {
	// 클래스 하나에서 여러개를 상속받을 수 없으므로 하나는 클래스로! 하나는 인터페이스로! 상속을 받아서 사용하는 방법

	public FrameEx01_2() {
		super("이벤트2");
		setSize(300, 200); // 화면 크기 설정
		setVisible(true); // 화면 출력 설정 true = 보임 // false = 안보임
		addWindowListener(this); // this == 현재의 객체 (를 사용을 의미!)
	}

	public static void main(String[] args) {
		new FrameEx01_2(); // 생성자만 호출해서 실행!
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}
