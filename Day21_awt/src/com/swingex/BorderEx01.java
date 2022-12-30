package com.swingex;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderEx01 extends JFrame {
	private JButton[] jb = new JButton[6];

	public BorderEx01() {
		super("Border Test");
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(3, 2, 5, 5));
		
		for(int i = 0; i<6;i++) {
			jb[i] = new JButton("No. "+i+"Button");
			con.add(jb[i]);
		}
		
		EmptyBorder eb = new EmptyBorder(10, 10, 10, 10); // 테두리없게
		jb[0].setBorder(eb);
		
		LineBorder lb = new LineBorder(Color.red, 10); // 테두리에 경계
		jb[1].setBorder(lb);
		
		EtchedBorder eb1 = new EtchedBorder(); // 테두리에 경계가 깍여서 깔끔해짐
		jb[2].setBorder(eb1);

		BevelBorder bb1 = new BevelBorder(BevelBorder.RAISED); //양각의 입체감이 생김
		jb[3].setBorder(bb1);
		
		SoftBevelBorder sbb1 = new SoftBevelBorder(BevelBorder.LOWERED); //음각의 입체감이 생김
		jb[4].setBorder(sbb1);
		
		MatteBorder mb1 = new MatteBorder(5, 10,15,20, Color.GREEN); // 컴포넌트가 경계선자체를 매트모양으로 만들고 그 위에 보임.
		jb[5].setBorder(mb1);
		
		
		
		
		setSize(new Dimension(300, 200)); // 안에들어가는 배열의 크기로 Ex) 모눈종이 [눈에는 안보임]
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new BorderEx01();
	}
}
