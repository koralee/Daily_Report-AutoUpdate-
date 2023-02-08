package com.awtex;

import java.awt.*;

import com.awtex.FrameEx01_3.WinEvent01;

public class BorderEx_Button extends Frame {

	private String[] str = { "7", "8", "9",
										 "4", "5", "6",
										 "1", "2", "3",
										 "#", "0", "*" };

	private Button[] bt = new Button[str.length];

	public BorderEx_Button() {
		super("Button Test");

		// 레이아웃 설정
		setLayout(new GridLayout(4, 3, 5, 5)); 
		// 4는 가로 //3는 세로 // 가로의 gap //세로의 gap
		for (int i = 0; i < bt.length; i++) {

			bt[i] = new Button(str[i]); // 버튼 생성
			bt[i].setFont(new Font("궁서체", Font.BOLD, 30)); //폰트 설정
			add(bt[i]);
		}

		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);
	}

	public static void main(String[] args) {

		new BorderEx_Button();
	}

}
