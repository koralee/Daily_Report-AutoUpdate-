package com.awtex;

import java.awt.*;

public class ListEx extends Frame {

	private Label la = new Label("과목 이름");
	private List li = new List(4, true);

	private Button bt = new Button("확인");
	private String[] name;

	public ListEx(String[] a) {
		super("List Test");// 창 이름
		this.name = a; // a는 배열 통째로 들어가지는 것이다!

		// 레이아웃 설정 (먼저해줘야한다!)
		setLayout(new BorderLayout()); // 가로 세로

		for (int i = 0; i < name.length; i++) {
			li.add(name[i]);
		}

		add("North", la);
		add("Center", li);
		add("South", bt);
		li.setFont(new Font("궁서체", Font.BOLD, 30));

		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);
	}

	public static void main(String[] args) {
		String[] Sub = { "Java", "JSP", "DB", "Spring " };
		new ListEx(Sub);
	}
}
