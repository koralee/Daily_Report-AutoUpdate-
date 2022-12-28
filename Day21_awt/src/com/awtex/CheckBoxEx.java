package com.awtex;

import java.awt.*;

public class CheckBoxEx extends Frame {

	private Label lb = new Label("which fruit Do U Like?!");
	private Checkbox[] cb = { new Checkbox("Banana", true), new Checkbox("Apple", true), new Checkbox("Pich", true) };
	private Button bt = new Button("Confirm");

	public CheckBoxEx() {
		super("CheckBox Test");

		setLayout(new GridLayout(5,1 ));

		 add(lb); 
		 for (int i = 0; i <cb.length; i++) {
			 add(cb[i]);
			 }
		 add(bt);
		pack();
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);
	}

	public static void main(String[] args) {

		new CheckBoxEx();
	}

}
