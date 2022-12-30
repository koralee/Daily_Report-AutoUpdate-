package com.awtevent;

import java.awt.*;
import java.awt.event.*;

import com.awtex.BorderEx;
import com.awtex.WinEvent;

public class ItemEventEx extends Frame implements ItemListener, ActionListener {

	private Label lb = new Label("Blood Type : ", Label.RIGHT);
	private Label lb1 = new Label("BirthDay : ", Label.RIGHT);
	private Label lb2 = new Label("Local : ", Label.RIGHT);
	private TextField bType = new TextField();
	private Choice blood = new Choice();
	private TextField birth = new TextField();
	private Choice year = new Choice();
	private Choice month = new Choice();
	private Choice day = new Choice();
	private TextField area = new TextField();
	private List li = new List(3, false);
	private Button end = new Button("Exit");

	public ItemEventEx() {
		super("Who M I");
		setForm();

		// 편집 불가 셋팅
		bType.setEnabled(false);
		birth.setEnabled(false);
		area.setEnabled(false);

		// 리스너 등록
		blood.addItemListener(this);
		day.addItemListener(this);
		li.addItemListener(this);

		li.addActionListener(this);

		blood.requestFocus(); // 커서의 포커스를 blood 맞춘다!

		setSize(400, 300);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);
	}

	private void setForm() {
		setLayout(new GridLayout(2, 1));

		Panel p = new Panel(new BorderLayout());
		
		Panel p1 = new Panel(new GridLayout(3, 1));
		p1.add(lb);
		p1.add(lb1);
		p1.add(lb2);
		p.add("West", p1); // 라벨

		Panel p2 = new Panel(new GridLayout(3, 1)); // 텍스트 필드
		p2.add(bType);
		p2.add(birth);
		p2.add(area);
		p.add("Center", p2);

		Panel p3 = new Panel(new GridLayout(4, 1)); // 초이스
		p3.add(blood);
		p3.add(year);
		p3.add(month);
		p3.add(day);
		p.add("East", p3);

		blood.add("A");
		blood.add("B");
		blood.add("C");
		blood.add("O");

		// 년
		for (int i = 1980; i <= 2022; i++)
			year.add(i + " year");
		// 월
		for (int i = 1; i <= 12; i++)
			month.add(i + "month");
		// 일
		for (int i = 1; i <= 31; i++)
			day.add(i + " day");

		add("Center", p);// 중앙

		Panel p4 = new Panel(new BorderLayout()); // 리스트
		p4.add("Center", li);

		li.add("Seoul");
		li.add("DaeJeon");
		li.add("DaeGu");
		li.add("Busan");
		li.add("GwangJu");
		li.add("InChuen");

		end.addActionListener(this);
		p4.add("East", end);
		add(p4);

	}

	public static void main(String[] args) {
		new ItemEventEx();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == end) {
			System.exit(0);
		} else if (e.getSource() == li) {
			int i = li.getSelectedIndex();
			li.remove(i);
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()== blood) {
			String imsi = blood.getSelectedItem();
			 bType.setText(imsi);
			 
		}else if(e.getSource() ==day) {
			String imsi = year.getSelectedItem();
			String imsi1 = month.getSelectedItem();
			String imsi2 = day.getSelectedItem();
			birth.setText(imsi +" "+ imsi1+" " + imsi2);
		}else if(e.getSource()==li) {
			String imsi = li.getSelectedItem();
			area.setText(imsi + " Local");
		}
		
		
	}
}