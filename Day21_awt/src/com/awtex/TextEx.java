package com.awtex;

import java.awt.*;

public class TextEx extends Frame {

	private TextField tf = new TextField("제목");
	private TextArea ta = new TextArea("메모", 5, 10);  // text, 범위, 범위 넘어가면 스크롤바 생김   
	private Button bt = new Button("확인");
	private Label la = new Label("내용");
	

	public TextEx() {
		super("Text Test");

		//레이아웃 셋팅
		setLayout(new BorderLayout()); // 가로 세로
		add("North",tf);
		add("South",bt);
		add("Center",ta);
		add("West",la);

	
		
		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);
	}

	public static void main(String[] args) {
		new TextEx();
	}
}
