package com.swingex;

import java.awt.*;
import javax.swing.*;

public class JTextAreaEx extends JFrame{

	private JTextArea ta = new JTextArea(5, 10);
	private JScrollPane js = new JScrollPane(ta);
	
	
	public JTextAreaEx() {
		super("JTextArea Test");
	 
		// 다른 객체이므로 형변환을 해줘야 함 // 프레임과 패널은 다른 객체이다!
		JPanel jp =(JPanel)this.getContentPane();
		jp.add("Center", js);
		
		
		
		setSize(new Dimension(300, 200)); // 안에들어가는 배열의 크기로 Ex) 모눈종이  [눈에는 안보임]
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTextAreaEx();
		
	}

}
