package com.swingexC;

import java.awt.event.*;
import javax.swing.*;

public class DrawActionListenerCCC implements ActionListener {

	JTextField text1, text2, text3;
	DrawingPanelCCC drawingPanel;

	public DrawActionListenerCCC(JTextField text1, JTextField text2, JTextField text3, DrawingPanelCCC drawingPanel) {
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.drawingPanel = drawingPanel;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int kor = Integer.parseInt(text1.getText());
			int eng = Integer.parseInt(text2.getText());
			int matt = Integer.parseInt(text3.getText());
			drawingPanel.setScores(kor, eng, matt);
			drawingPanel.repaint();

		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(drawingPanel, "잘못된 숫자 형식입니다.", ",에러메세지", JOptionPane.ERROR_MESSAGE);
		}

	}

}
