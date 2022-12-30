package com.awtevent;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class FocusEventEx extends Frame implements FocusListener {

	private TextField[] tf = new TextField[3];
	private Label la1 = new Label("Name");
	private Label la2 = new Label("Phone");
	private Label la3 = new Label("Address");

	public FocusEventEx() {
		super("FocusEvent_Test");
		setForm();

		setSize(400, 300);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);

	}

	public void setForm() {
		setLayout(new BorderLayout());

		Panel p = new Panel(new GridLayout(3, 1));
		p.add(la1);
		p.add(la2);
		p.add(la3);
		add("West", p);

		Panel pp = new Panel(new GridLayout(3, 1));
		for (int i = 0; i < tf.length; i++) {
			tf[i] = new TextField();
			pp.add(tf[i]);
			tf[i].addFocusListener(this);
		}
		
		add("Center", pp);
	}

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource() == tf[1]) {
			if (tf[0].getText().trim().length() == 0) {
				tf[0].setText("");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e2) {

				}
				tf[0].requestFocus();
			}
		} else if (e.getSource() == tf[2]) {
			if (tf[1].getText().trim().length() == 0) {
				tf[1].setText("");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e2) {

				}
				tf[1].requestFocus();
			}
		}
	}

	@Override
	public void focusLost(FocusEvent e) {

	}

	public static void main(String[] args) {
		new FocusEventEx();
	}

}
