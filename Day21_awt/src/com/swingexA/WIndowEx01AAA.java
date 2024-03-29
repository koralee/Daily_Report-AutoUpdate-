package com.swingexA;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class WIndowEx01AAA {

	public static void main(String[] args) {
		JFrame f = new JFrame("참가자 명단 프로그램");

		f.setPreferredSize(new Dimension(400, 200));
		f.setLocation(500, 400);
		Container con = f.getContentPane();

		String colNames[] = { "이름", "나이", "성별" };

		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		con.add(new JScrollPane(table), BorderLayout.CENTER);

		JPanel panel = new JPanel();

		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(2);

		JButton button1 = new JButton("추가");
		JButton button2 = new JButton("삭제");

		JLabel la1 = new JLabel("이름");
		JLabel la2 = new JLabel("나이");
		JLabel la3 = new JLabel("성별");

		panel.add(la1);
		panel.add(text1);
		panel.add(la2);
		panel.add(text2);
		panel.add(la3);
		panel.add(text3);

		panel.add(button1);
		panel.add(button2);

		con.add(panel, BorderLayout.SOUTH);
		
		button1.addActionListener(new Add_ActionListenerAAA(table, text1,text2,text3));
		button2.addActionListener(new Remove_ActionListenerAAA(table));

		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
