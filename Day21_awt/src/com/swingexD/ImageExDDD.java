package com.swingexD;

import java.awt.*;
import javax.swing.*;

public class ImageExDDD {

	public static void main(String[] args) {

		JFrame f = new JFrame("이미지 로딩");
		f.setLocation(500, 200);
		f.setPreferredSize(new Dimension(500, 400));
		Container con = f.getContentPane();
		ImagePanelDDD imagePanel = new ImagePanelDDD();
		con.add(imagePanel, BorderLayout.CENTER);

		JPanel controlPanel = new JPanel();
		JTextField text = new JTextField(30);
		JButton buttom = new JButton("이미지 로드");
		// C:\Users\USER\Desktop\ \Dragon.jfif
		// 이미지 경로

		controlPanel.add(text);
		controlPanel.add(buttom);
		con.add(controlPanel, BorderLayout.SOUTH);
		buttom.addActionListener(new LoadActionListenerDDD(text, imagePanel));

		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
