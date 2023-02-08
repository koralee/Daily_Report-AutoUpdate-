package com.awtex;

import java.awt.*;

public class TextEx extends Frame {

	private TextField tf = new TextField("Subject");
	private TextArea ta = new TextArea("Memo", 5, 10);  // text, 범위, 범위 넘어가면 스크롤바 생김   
	private Button bt = new Button("Confirm");
	private Label la = new Label("Story");
	

	public TextEx() {
		super("Text Test");

		//레이아웃 셋팅
		setLayout(new BorderLayout()); // 가로 세로
		add("North",tf);//제목
		add("South",bt);//버튼
		add("Center",ta);//내용
		add("West",la);//라벨

	
		
		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);
	}

	public static void main(String[] args) {
		new TextEx();
	}
}
