package class_EX01;

import java.util.*;

import javax.swing.text.DefaultCaret;

public class Month_Schedule_run {

	private Scanner sc = new Scanner(System.in);
	private int nDays; // 날짜
	private Day[] days; // Day 객체 배열 선언

	public Month_Schedule_run(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays]; // Day 객체 배열의 갯수만 잡아놓음.
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day(); // Day의 갯수만큼 배열의 갯수만큼 생성
		}

	}

	private void input() {
		System.out.print("날짜(1~30) : ");
		int day = sc.nextInt();

		System.out.println("할 일(빈칸없이 입력) : ");
		String work = sc.next();
		day--;
		if (day < 0 || day > 29) { // 인덱스 0~29
			System.out.println("날짜를 잘못 입력 하셨습니다.");
			return;
		}

		days[day].set(work);// 오늘의 할일

	}

	private void view() {
		System.out.print("날짜(1~30) : ");
		int day = sc.nextInt();

		day--;
		if (day < 0 || day > 29) { // 인덱스 0~29
			System.out.println("날짜를 잘못 입력 하셨습니다.");
			return;
		}
		System.out.println((day+1)+"일의 할 일은 ");
		days[day].show();// 오늘의 할일
	}

	private void finish() {
		System.out.println("프로그램 종료!!! 꺼져~!");
	}

	public void run() {
		System.out.println("글로벌인 IT 4기 스케줄 관리 프로그램 ");
		while(true) {
			System.out.println("할일 (입력:1, 보기:2, 종료:3)");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: input(); break;
			case 2:	view(); break;
			case 3:  finish();return;
			default: System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println();
		}
	
	}

	public static void main(String[] args) {
		Month_Schedule_run m = new Month_Schedule_run(30);
		m.run();
	}
}
