package com.awtex;

import java.awt.*;

public class DialogEx extends Frame {
	// 컴포넌트 정의(== 설계) ex) 바나나, 딸기, 사과 등을 포함한 과일! 그룹이라고 생각하는게 좋다!
	private Dialog d = new Dialog(this, "조회 서비스", false);

	private Label dla1 = new Label("Find password by Name & IndiNumber");
	private Label dla2 = new Label("Name", Label.RIGHT);
	private Label dla3 = new Label("IndiNumber", Label.RIGHT);
	private Label dla4 = new Label("-", Label.CENTER);

	private TextField dtf1 = new TextField(21);// 이름칸 크기
	private TextField dtf2 = new TextField(6); // 주민 앞자리
	private TextField dtf3 = new TextField(7); // 주민 뒷자리

	private Button dbt1 = new Button("Finder");
	private Button dbt2 = new Button("Cancel");

	public DialogEx() {

		super("FileDialog Test");

		setDialog();
		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);
		d.setVisible(true);
	}

	private void setDialog() {

		d.setLayout(new BorderLayout());
		d.add("North", dla1);

		Panel p1 = new Panel(new BorderLayout());
		Panel p2 = new Panel(new GridLayout(2, 1));// 이름하고 주민번호

		p2.add(dla2);
		p2.add(dla3);

		p1.add("West", p2);

		Panel p3 = new Panel(new GridLayout(2, 1));
		Panel tfPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));

		tfPanel.add(dtf1);
		p3.add(tfPanel);

		p4.add(dtf2);
		p4.add(dla4);
		p4.add(dtf3);

		p3.add(tfPanel);
		p3.add(p4);

		p1.add("Center", p3);

		Panel p = new Panel(new FlowLayout());
		p.add(dbt1);
		p.add(dbt2);
		d.add("Center", p1);
		d.add("South", p);

		d.setSize(360, 150);
		d.setResizable(false);
	}

	public static void main(String[] args) {
		DialogEx de = new DialogEx();
	}

}
