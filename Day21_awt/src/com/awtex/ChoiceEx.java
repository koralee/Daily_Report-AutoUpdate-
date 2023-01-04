package com.awtex;

import java.awt.*;

public class ChoiceEx extends Frame {

	private Label la = new Label("Birth");
	private Choice co = new Choice();
	private Button bt = new Button("Confirm");
	
	
	public ChoiceEx() {
		super("Choice Test");

		setLayout(new GridLayout(3, 1));
		
		add(la);
		add(co);
		add(bt);
		for(int i = 1; i<=12; i++) {
			co.add(String.valueOf(i)+" Mon");
		}
		
		
		pack();
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);	
		
	}

	public static void main(String[] args) {
		new ChoiceEx();
	}
}
