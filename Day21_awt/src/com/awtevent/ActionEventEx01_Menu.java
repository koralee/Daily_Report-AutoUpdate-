package com.awtevent;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class ActionEventEx01_Menu extends Frame implements ActionListener {

	private Button[] bt = new Button[4];
	private Panel[] pp = new Panel[4];
	private Color[] cc = { Color.red, Color.green, Color.blue, Color.yellow };

	private CardLayout card = new CardLayout();
	private Panel pptop;

	public ActionEventEx01_Menu() {
		super("ActionMenu_Test");

		setLayout(new BorderLayout());
		Panel p = new Panel(new GridLayout(1, 4));

		for (int i = 0; i < bt.length; i++) {
			bt[i] = new Button("No." + i + " Button");
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}

		add("North", p);

		pptop = new Panel(card);
		for (int i = 0; i < pp.length; i++) {
			pp[i] = new Panel();
			pp[i].setBackground(cc[i]);
			pptop.add("" + i, pp[i]);
		}
		add("Center", pptop);
		card.show(pptop, "0");

		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);

	}

	public static void main(String[] args) {
		new ActionEventEx01_Menu();
	}

	@Override
	public void actionPerformed(ActionEvent e) { // Handler
		for (int i = 0; i < cc.length; i++) {
			if (e.getSource() == bt[i]) {
				card.show(pptop, "" + i);
			}
		}
	}

}
