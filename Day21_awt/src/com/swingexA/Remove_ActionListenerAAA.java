package com.swingexA;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Remove_ActionListenerAAA implements ActionListener {

	JTable table;

	public Remove_ActionListenerAAA(JTable table) {
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		if (row == -1) { // 행이 존재하지 않는 경우
			return;
		}
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.removeRow(row);
	}

}
