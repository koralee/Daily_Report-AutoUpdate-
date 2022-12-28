package com.awtex;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEx01_3 extends Frame {
	// 내부클래스를 이용하는 방법

	class WinEvent01 extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public FrameEx01_3() {
		super("이벤트3");
		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent01 ww = new WinEvent01();
		addWindowListener(ww);
	}



	public static void main(String[] args) {
		new FrameEx01_3(); // 생성자만 호출해서 실행!
	}
}
