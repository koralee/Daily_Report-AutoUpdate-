package com.awtex;

import java.awt.*;

public class MenuEx extends Frame {

	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("File");
	private Menu edit = new Menu("Tool");
	private Menu view = new Menu("View");
	private Menu help = new Menu("help");
	private Menu ecolor = new Menu("color");  // RGB
	private Menu esize = new Menu("size");

	private MenuItem fnew = new MenuItem("NewFile");
	private MenuItem fopen = new MenuItem("FileOpen");
	private MenuItem fsave = new MenuItem("FileSave");
	private MenuItem fsaveas = new MenuItem("FileSaveAs");
	private MenuItem fexit = new MenuItem("Exit");

	private CheckboxMenuItem ecred = new CheckboxMenuItem("Red");
	private CheckboxMenuItem ecgreen = new CheckboxMenuItem("Green");
	private CheckboxMenuItem ecblue = new CheckboxMenuItem("Blue");

	private CheckboxMenuItem es10 = new CheckboxMenuItem("10");
	private CheckboxMenuItem es20 = new CheckboxMenuItem("20");
	private CheckboxMenuItem es30 = new CheckboxMenuItem("30");

	private Button bt1 = new Button("Confirm");
	private Button bt2 = new Button("Cancel");
	
	public MenuEx() {
		super("Menu Test");
		
		setMenuBar(mb);
		mb.add(file);
		mb.add(edit);
		mb.add(view);
		mb.add(help);
		
		ecolor.add(ecred);
		ecolor.add(ecgreen);
		ecolor.add(ecblue);
		
		esize.add(es10);
		esize.add(es20);
		esize.add(es30);
		
		edit.add(ecolor);
		edit.addSeparator(); // 라인으로 분리
		edit.add(esize);
		
		file.add(fnew);
		file.addSeparator();
		file.add(fopen);
		file.add(fsave);
		file.add(fsaveas);
		file.addSeparator();
		file.add(fexit);
		
		setLayout(new BorderLayout());
		
		add("North",new Label("Figiting",Label.CENTER));
		
		add("Center", new TextArea());
		Panel p = new Panel(new GridLayout(1,2)); // 두개의 버튼을 한개의 패널처리
		p.add(bt1);
		p.add(bt2);
		
		add("South", p);
		
		
		
		
		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);

	}

	public static void main(String[] args) {
		new MenuEx();

	}

}
