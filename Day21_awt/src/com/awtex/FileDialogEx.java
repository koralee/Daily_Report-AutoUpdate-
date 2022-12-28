package com.awtex;

import java.awt.*;

public class FileDialogEx extends Frame{
	
	private FileDialog fd = new FileDialog(this, "My Save", FileDialog.SAVE);
	
	public FileDialogEx() {
		super("FileDialog Test");
		
		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
	
		fd.setVisible(true);
		System.out.println(fd.getFile());
		System.out.println(fd.getDirectory());
		
		WinEvent ww = new WinEvent();
		addWindowListener(ww);
			
	
	}

	public static void main(String[] args) {
		new FileDialogEx();
	}

}
