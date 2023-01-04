package com.swingex;

import java.awt.*;
import javax.swing.*;

public class JTabbedPaneEx extends JFrame{

	private ImageIcon icon1 = new ImageIcon("src/img/Dragon.jfif");
	private ImageIcon icon2 = new ImageIcon("src/img/Marine.jfif");

	private JLabel jlb = new JLabel("Label", icon1, JLabel.CENTER);
	private JButton jbt = new JButton("Button", icon1);

	private JTabbedPane jtp = new JTabbedPane(SwingConstants.TOP); // top center bottom
	
	public JTabbedPaneEx() {
		super("JTabbedPane Test");
		
		Container con = this.getContentPane()	;
		con.setLayout(new BorderLayout());
		
		jtp.addTab("Label",icon2, jlb);
		jtp.addTab("Label",icon2, jbt);
		
		con.add("Center",jtp);
		//setSize(300,300);
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {
		new JTabbedPaneEx();
	}

}
