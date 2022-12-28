package com.awtex;

import java.awt.*;

public class CheckBoxGroupEx extends Frame {

	private GridLayout gl = new GridLayout(4, 1);
	private Label lb = new Label("Gender?!");
	private CheckboxGroup cg = new CheckboxGroup();
	private Checkbox Man = new Checkbox("M", cg, true);
	private Checkbox Woman = new Checkbox("W", cg, false);
	private Button bt = new Button();

	public CheckBoxGroupEx() {
		super("CheckBoxGroup Test");

		setLayout(gl);

		add(lb);
		add(Man);
		add(Woman);
		add(bt);
		
		
		
		
		pack();
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);

	}

	public static void main(String[] args) {
		new CheckBoxGroupEx();
	}

}
