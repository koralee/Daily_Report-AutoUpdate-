package com.swingex;

import java.awt.*;
import javax.swing.*;

import com.awtex.WinEvent;
public class JLabelEx extends JFrame{

	private Icon icon = new ImageIcon("src/img/dog.jfif");
	private JLabel jlb1 = new JLabel(icon);
	private JLabel jlb2 = new JLabel("Test2", JLabel.CENTER);
	private JLabel jlb3 = new JLabel("Test3", icon,SwingConstants.RIGHT);
	
	public JLabelEx() {
		super("JLabel Test");
		
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(3, 1));
		con.add(jlb1);
		con.add(jlb2);
		jlb2.setIcon(icon);
		
		con.add(jlb3);
		
	
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 종료 버튼 [지원해 줌]
		
	}
	
	public static void main(String[] args) {
		new JLabelEx();
	}

}
