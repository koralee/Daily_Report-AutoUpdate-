package com.swingexC;

import java.awt.*;
import javax.swing.*;

public class DrawingPanelCCC extends JPanel {

	int kor, eng, matt;

	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 250, 350, 250);

		for (int cnt = 0; cnt < 11; cnt++) {
			g.drawString(cnt * 10 + "", 25, 255 - 20 * cnt);
			g.drawLine(50, 250 - 20 * cnt, 350, 250 - 20 * cnt);
		}

		g.drawLine(50, 20, 50, 250);
		g.drawString("국어", 100, 270);
		g.drawString("영어", 200, 270);
		g.drawString("수학", 300, 270);

		g.setColor(Color.red);
		if (kor > 0)
			g.fillRect(110, 250 - kor * 2, 10, kor * 2);
		if (eng > 0)
			g.fillRect(210, 250 - eng * 2, 10, eng * 2);
		if (matt > 0)
			g.fillRect(310, 250 - matt * 2, 10, matt * 2);
	}

	public void setScores(int kor, int eng, int matt) {
		this.kor = kor;
		this.eng = eng;
		this.matt = matt;
	}

}
