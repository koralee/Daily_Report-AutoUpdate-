package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JConmboBoxEx extends JFrame{
	
	private String[] citems = {"One", "Two", "Three", "Four", "Five"};
	
	public JConmboBoxEx() { // 클래스 기능과 유사하다. // 텍스트와 이미지 모두를 넣을 수 있다.
		
		super("ComboBox_Test");
		setLayout(new FlowLayout());
		JComboBox<String> combo = new JComboBox<String>(citems);
		add(combo);
		
		
		setBounds(300, 200, 300, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {
		new JConmboBoxEx();
		
	}

}
