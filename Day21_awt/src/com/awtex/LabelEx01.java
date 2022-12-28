package com.awtex;

import java.awt.*;

import com.awtex.FrameEx01_3.WinEvent01;

public class LabelEx01 extends Frame {
	Label la1;
	Label la2;
	Label la3;
	Label la4;
	Font f1;
	Font f2;

	public LabelEx01() {
		super("Label Test");

		f1 = new Font("굴림체", Font.BOLD, 20);
		f2 = new Font("궁서체", Font.ITALIC, 25);

		la1 = new Label("안녕하세요.");
		la2 = new Label("홍길동", Label.CENTER);
		la3 = new Label("활빈당 보스....", Label.RIGHT);
		la4 = new Label("Nice 2 Meet U");

		// 위치관리
		setLayout(new GridLayout(4, 1));

		la1.setFont(f1);
		la2.setFont(f1);
		la3.setFont(f2);
		la4.setFont(f2);

		add(la1);
		add(la2);
		add(la3);
		add(la4);

		la1.setBackground(Color.red);
		la2.setBackground(Color.blue);
		la3.setBackground(Color.green);
		la4.setBackground(Color.pink);

		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);

	}

	public static void main(String[] args) {
		new LabelEx01();
	}

}
