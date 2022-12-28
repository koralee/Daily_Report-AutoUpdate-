package com.awtevent;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class ActionEventEx01 extends Frame implements ActionListener {

	private TextField tf = new TextField(10);

	public ActionEventEx01() {

		super("ActionEvent_Test");
		setLayout(new FlowLayout());
		add(tf);

		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);
		tf.addActionListener(this);
	}

	public static void main(String[] args) {
		new ActionEventEx01();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == tf)
		{
			String str = tf.getText();
			System.out.println("Message : "+ str);
			tf.setText("");
		}
	}

}
