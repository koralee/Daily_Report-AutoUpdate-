package com.awtevent;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class MouthEventEx extends Frame implements MouseListener, ActionListener {

	private Button bt1 = new Button("확인"); // 이벤트 소스
	private Button bt2 = new Button("취소"); // 이벤트 소스

	public MouthEventEx() {

		super("MouthEvent Test");

		setLayout(new FlowLayout());

		add(bt1);
		add(bt2);

		// 이벤트 리스너 (== 이벤트가 실행하게 끔 하는 인터페이스)
		bt1.addMouseListener(this);
		bt2.addMouseListener(this);

		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);

	}

	public static void main(String[] args) {
		new MouthEventEx();

	}

// 이벤트 핸들러 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
// 이벤트가 발생이 된 것을 결과를 눈에 보여지게 될 수 있도록 하는 것! Ex) 이벤트의 동작 ex) Pop up! etc

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == bt1)
			System.out.println("확인 버튼 ");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == bt2)
			System.out.println("취소버튼을 눌렀다");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == bt2)
			System.out.println("취소버튼을 뗐다");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == bt1 || e.getSource() == bt2)
			System.out.println("마우스가 버튼 위에 있다.");

	}

	@Override
	public void mouseExited(MouseEvent e) {

		if (e.getSource() == bt1 || e.getSource() == bt2)
			System.out.println("마우스가 버튼 위에 없다");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
