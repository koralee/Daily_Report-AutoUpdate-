package com.swingexA;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Add_ActionListenerAAA implements ActionListener {

	JTable table;
	JTextField text1;
	JTextField text2;
	JTextField text3;

	public Add_ActionListenerAAA(JTable table, JTextField text1, JTextField text2, JTextField text3) {
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String[] arr = new String[3];
		arr[0] = text1.getText();
		arr[1] = text2.getText();
		arr[2] = text3.getText();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(arr);
	}
}
