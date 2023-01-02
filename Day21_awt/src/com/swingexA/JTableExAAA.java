package com.swingexA;

import java.awt.*;
import javax.swing.*;

public class JTableExAAA {

	public static void main(String[] args) {
		JFrame f = new JFrame("참가자 명단 프로그램");
		
		f.setPreferredSize(new Dimension(300,150));
		f.setLocation(500, 400);
		Container con = f.getContentPane();
		
		String colName[] = {"이름", "나이", "성별"};
		Object data[][] = {
				{"김철수", 23, "男"},
				{"김영희",24,"女"},
				{"홍길동",25,"男"}
		};
		
		JTable table = new JTable(data, colName);
		
		JScrollPane scrollPane = new JScrollPane(table);
		con.add(scrollPane, BorderLayout.CENTER);
		JButton Button = new JButton("출력");
		Button.addActionListener(new PrintActionListenerAAA(table));
		
		con.add(Button, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
}
