package class_EX02;

import java.util.*;

public class Group {
	private char type; // S, A, B 필드 선언
	private Seat[] seats;// 현재 등급의 좌석 객체 배열 선언1 // 배열안에 배열로 생각할 것
	private Scanner sc = new Scanner(System.in); // 스케너 사용

	public Group(char type, int num) { // 생성자로 초기화! (등급, 개수)
		this.type = type;
		this.seats = new Seat[num];// 현재 등급의 좌석 객체 배열의 개수 선언

		for (int i = 0; i < seats.length; i++)
			seats[i] = new Seat();// 현재 등급의 좌석 객체 배열 생성
	}

	// 좌석 예약 있나 없나로
	public boolean reserve() {
		int num;
		String name;
		show(); // 좌석 현 상태를 일단 출력
		System.out.println("이름 : ");
		name = sc.next(); // 저장할 이름 입력
		System.out.println("번호 : ");
		num = sc.nextInt();// 저장할 좌석의 위치 입력

		if (num < 1 || num > seats.length) {
			System.out.println("잘못된 좌석 번호 입니다.");
			return false; // 현 메소드가 호출된 곳 끝!으로 돌아감. // 위에 입력값 저장X
		}
		if (seats[num - 1].isOccupied()) {// 이미 예약된 좌석번호가 있다면(값이 True로 들어온다면)
			System.out.println("이미 예약된 좌석번호 입니다.");
			return false; // 현 메소드가 호출된 곳 끝!으로 돌아감. // 위에 입력값 저장X
		}
		seats[num - 1].reserve(name); // 위에 입력값이 저장O (인덱스는 0번 부터! 이므로)
		return true;// 이름으로 원하는 좌석 예약성공
	}

	// 좌석 예약 취소 있나 없나
	public boolean cancel() {
		show(); // 일단 현 좌석 예매 상태 확인하기 위해 출력!
		System.out.print("이름: ");// 이름을 보고
		String name = sc.next();// 취소할 사람 이름 입력

		if (name != null) { // 빈공간이 아니면!
			for (int i = 0; i < seats.length; i++) {
				if (seats[i].match(name)) { // 예약된 사람이 일치한다면
					System.out.println("예약 취소가 완료 되었습니다..");
					seats[i].cancel(); // 취소
					System.out.println(); // 출 넘기기
					return true; // 예약취소 성공 // 현 메소드가 호출된 곳으로 돌아감!
				}
			}
			System.out.println("예약된 사람을 찾을 수 없습니다.");
			// for문에 들어갔는데 for문 내의 if의 조건을 만족하지 못하고 for문이 그대로 끝나서
			// 밖으로 나온 것이라면 일치하는 사람이 없다는 것을 의미!
		}
		return false;// 현 메소드가 호출된 곳 끝! 으로 돌아감!
	}

	// 좌석 출력
	public void show() {
		System.out.print(type + ">>>  ");
		for (int i = 0; i < seats.length; i++) {
			if (seats[i].isOccupied()) { // true 라면
				System.out.print(seats[i].getName());// 해당인덱스에 저장된 이름 갖고옴.
			} else {
				System.out.print("-空-"); // false 라면 출력
			}
			System.out.print(" "); // 띄어쓰기
		}
		System.out.println(); // 다음줄로 넘어감.
	}
}
