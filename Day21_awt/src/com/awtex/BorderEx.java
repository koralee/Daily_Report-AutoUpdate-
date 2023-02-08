package com.awtex;

import java.awt.*;

import com.awtex.FrameEx01_3.WinEvent01;

public class BorderEx extends Frame {

	Label a, b, c, d, e;

	public BorderEx() {
		super("BorderLayout");

		setLayout(new BorderLayout(5, 5));

		a = new Label("Up", Label.CENTER);
		b = new Label("Down", Label.CENTER);
		c = new Label("Left", Label.CENTER);
		d = new Label("Right", Label.CENTER);
		e = new Label("Move", Label.CENTER);

		setBackground(Color.YELLOW); // 배경색
		a.setBackground(Color.RED); // 글자의 공간의 배경색
		b.setBackground(Color.ORANGE);
		c.setBackground(Color.GREEN);
		d.setBackground(Color.BLUE);
		e.setBackground(Color.GRAY);

		a.setForeground(Color.WHITE); // 글자의 색
		b.setForeground(Color.WHITE);
		c.setForeground(Color.WHITE);
		d.setForeground(Color.WHITE);
		e.setForeground(Color.WHITE);

		add("North", a);
		add("South", b);
		add(c, BorderLayout.WEST);
		add(d, BorderLayout.EAST);
		add("Center", e);

		setLocation(750, 40);
		setSize(300, 200);
		// setBounds(800,450,300,200); // 위 두개를 한 번에

		//pack();// 가장 최소 단위로 화면크기를 출력!

		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent(); // 종료키 만드는 방법1
		addWindowListener(ww); // 종료키 만드는 방법2
	}

	public static void main(String[] args) {
		new BorderEx();
	}

}
