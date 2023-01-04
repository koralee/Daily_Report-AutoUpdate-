package com.awtex;

import java.awt.*;
import java.awt.event.*;

public class FrameEx01_4 extends Frame {
	// 익명 클래스를 이용하는 방법

	
	
	public FrameEx01_4() {
		super("이벤트4");
		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		addWindowListener(new WindowAdapter() { // 추상클래스
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}


	public static void main(String[] args) {
		new FrameEx01_4(); // 생성자만 호출해서 실행!
	}
}
