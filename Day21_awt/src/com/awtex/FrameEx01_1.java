package com.awtex;

import java.awt.*; // 라이브러리 호출

public class FrameEx01_1 {
	public static void main(String[] args) {
		// 이벤트 객체를 생성해서 활용하는 방법!
		
		// 프레임 객체 생성
		Frame f = new Frame();
		f.setSize(300, 200);
		f.setVisible(true); // true = 보임 // false = 안보임
		
		//종료키 만드는 방법
		WinEvent w = new WinEvent();
		f.addWindowListener(w);

	}
}
