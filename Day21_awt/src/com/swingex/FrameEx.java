package com.swingex;

import javax.swing.*;
import javax.swing.event.*;

public class FrameEx extends JFrame {
	
	public FrameEx() {
		
	
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 종료 버튼 [지원해 줌]
		
	}
	
	public static void main(String[] args) {
		new FrameEx();
	}
}
