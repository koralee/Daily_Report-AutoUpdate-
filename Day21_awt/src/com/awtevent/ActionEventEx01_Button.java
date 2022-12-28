package com.awtevent;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class ActionEventEx01_Button extends Frame implements ActionListener {

	public Button bt = new Button("종료");
	
	public ActionEventEx01_Button() {
		super("ActionButton_Test");

		setLayout(new FlowLayout());
		add(bt);
		
		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);
		bt.addActionListener(this);

	}

	public static void main(String[] args) {
		new ActionEventEx01_Button();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt) {
			System.exit(0);
		}
			
	}

}
