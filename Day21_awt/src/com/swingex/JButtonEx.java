package com.swingex;

import java.awt.*;
import javax.swing.*;

public class JButtonEx extends JFrame {

	private Icon icon1 = new ImageIcon("src/img/Cat.jfif");
	private Icon icon2 = new ImageIcon("src/img/Dragon.jfif");
	private Icon icon3 = new ImageIcon("src/img/While.jfif");
	private Icon icon4 = new ImageIcon("src/img/Marine.jfif");
	
	private JRadioButton[] jb = new JRadioButton[4];
	private ButtonGroup bg = new ButtonGroup();
	
	
	public JButtonEx() {

		Container con = this.getContentPane();
		con.setLayout(new GridLayout(2, 2));
		
		for(int i = 0; i<4;i++) {
			jb[i]=new JRadioButton(i + " 번 버튼", icon1);
			con.add(jb[i]);
			jb[i].setToolTipText(i+1+"번 째 버튼이다. 눌러....");  // 마우스를 올리면 글자가 뜸
			jb[i].setRolloverIcon(icon2); //마우스를 올렸들때
			jb[i].setPressedIcon(icon3); // 눌렀을때 
			jb[i].setSelectedIcon(icon4); // 눌렀다 뗐을때
			
			bg.add(jb[i]);
		}
		
		pack();
		//setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 종료 버튼 [지원해 줌]

	}

	public static void main(String[] args) {

		new JButtonEx();
	}

}
