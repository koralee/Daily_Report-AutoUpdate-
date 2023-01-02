package com.swingexD;

import java.awt.event.*;
import javax.swing.*;

public class LoadActionListenerDDD implements ActionListener {

	JTextField text;
	ImagePanelDDD imagePanel;

	public LoadActionListenerDDD(JTextField text, ImagePanelDDD imagePanel) {
		this.text = text;
		this.imagePanel = imagePanel;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		imagePanel.setPath(text.getText());
		imagePanel.repaint();
	}

}
