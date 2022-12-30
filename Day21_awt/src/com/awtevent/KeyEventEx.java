package com.awtevent;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class KeyEventEx extends Frame implements KeyListener {

	private Label la = new Label("Identify Numer", Label.RIGHT);
	private Label la1 = new Label("-", Label.CENTER);

	private TextField jumin1 = new TextField(10);
	private TextField jumin2 = new TextField(10);

	private Button bt = new Button("Confirm");

	public KeyEventEx() {
		super("KeyEvent_Test");

		setForm();

		jumin1.addKeyListener(this);
		jumin2.addKeyListener(this);

		pack();
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);
	}

	public void setForm() {
		setLayout(new BorderLayout());
		add("West", la);

		Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
		p.add("West", jumin1);
		p.add("Center", la1);
		p.add("East", jumin2);
		add("Center", p);

		Panel p1 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(bt);
		add("South", p1);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getSource() == jumin1) {
			if (jumin1.getText().trim().length() == 6) {
				jumin2.requestFocus();
			}
		}
		if (e.getSource() == jumin2) {
			if (jumin2.getText().trim().length() == 7) {
				bt.requestFocus();
			}
		}

	}

	public static void main(String[] args) {
		new KeyEventEx();
	}

}
