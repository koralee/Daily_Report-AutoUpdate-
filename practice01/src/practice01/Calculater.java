package practice01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;

public class Calculater extends JFrame implements ActionListener {

	private JTextField result = new JTextField("0",20) ; // text
	private String[] str = {"<-", "CE","C","=", 
										"7", "8", "9","+",
										"4","5","6","-",
										"1","2","3","*",
										"0","00",".","/"};

	private Button[] bt = new Button[str.length];

	public Calculater() {
		super("Button Test");

// 레이아웃 설정
		
		this.setLayout(new BorderLayout());
		this.add("North",result);
		result.setEnabled(false);
		result.setHorizontalAlignment(JTextField.RIGHT);
		JPanel num =new JPanel(new GridLayout(5, 4, 10, 10)); // 5는 가로 //4는 세로 // 가로의 gap //세로의 gap
		
		for (int i = 0; i < bt.length; i++) {
			bt[i] = new Button(str[i]);
			bt[i].setFont(new Font("궁서체", Font.BOLD, 30));
			num.add(bt[i]);
		}

		add("Center",num);
		
		setSize(500,400); // 사이즈 자동 조정
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new Calculater();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
