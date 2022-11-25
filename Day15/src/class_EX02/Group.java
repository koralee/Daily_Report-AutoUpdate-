package class_EX02;

import java.util.*;

public class Group {
	private char type; // S, A, B
	private Seat[] seats;// 현재 등급의 좌석 객체 배열 선언1
	private Scanner sc = new Scanner(System.in);

	public Group(char type, int num) {
		this.type = type;
		this.seats = new Seat[num];// 현재 등급의 좌석 객체 배열 선언2

		for (int i = 0; i < seats.length; i++)
			seats[i] = new Seat();// 현재 등급의 좌석 객체 배열 생성
	}

	// 좌석 예약 있나 없나
	public boolean reserve() {
		int num;
		String name;
		show();
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("번호 : ");
		num = sc.nextInt();

		if (num < 1 || num > seats.length) {
			System.out.println("잘못된 좌석 번호 입니다.");
			return false;
		}
		if (seats[num - 1].isOccupied()) {// 이미 예약된 좌석번호가 있다면
			System.out.println("이미 예약된 좌석번호 입니다.");
			return false;
		}
		seats[num - 1].reserve(name);
		return true;// 예약성공
	}

	// 좌석 예약 취소 있나 없나
	public boolean cancel() {
		show();
		System.out.print("이름: ");// 취소할 사람 이름
		String name = sc.next();

		if (name != null) {
			for (int i = 0; i < seats.length; i++) {
				if (seats[i].math(name)) { // 예약된 사람이 일치한다면
					System.out.println("예약 취소가 완료 되었습니다..");
					seats[i].cancel(); // 취소
					System.out.println();
					return true; // 예약취소 성공
				}
			}
			System.out.println("예약된 사람을 찾을 수 없습니다.");
		}
		return false;
	}

	// 좌석 출력
	public void show() {
		System.out.print(type + ">>>  ");
		for (int i = 0; i < seats.length; i++) {
			if (seats[i].isOccupied()) {
				System.out.print(seats[i].getName());
			} else {
				System.out.print("-空-");
			}
			System.out.print(" ");
		}
		System.out.println();
	}
}
