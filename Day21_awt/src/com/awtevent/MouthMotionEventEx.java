package com.awtevent;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;
public class MouthMotionEventEx extends Frame implements MouseMotionListener{

	public MouthMotionEventEx() {
		
		super("Mouth Motion Test");
		
		addMouseMotionListener(this);
		
		setSize(300, 200);
		setVisible(true); // true = 보임 // false = 안보임
		WinEvent ww = new WinEvent();
		addWindowListener(ww);
		
		
	}
	
	public static void main(String[] args) {
		new MouthMotionEventEx();
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if(e.getSource()==this) {
			System.out.println("X :" + e.getX()+" Y : "+e.getY());
		}		
	}

}
