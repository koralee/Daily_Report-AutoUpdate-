package class_EX02;

import java.util.Scanner;

public class Concert {

	private String hallName; // 콘서트홀 이름!
	private Group[] group = new Group[3]; // S, A, B 그룹 생성
	private Scanner sc = new Scanner(System.in); // 스케너 사용

	public Concert(String hallName) { // 생성자로 맴버필드 초기화
		this.hallName = hallName;
		group[0] = new Group('S', 10);
		group[1] = new Group('A', 10);
		group[2] = new Group('B', 10);
	}

	// 메소드 생성

	// 콘서트 예약 메소드
	private void reserve() {
		System.out.print("좌석구분 S(1), A(2), B(3)  입력: ");
		int type = sc.nextInt(); // 1, 2, 3 중 한 개 입력
		if (type < 1 || type > 3) { // 1,2,3 이 아니라면
			System.out.println("좌석이 존재하지 않습니다.");
			return; // 현 메소드를 호출했던 원래장소로 되돌아가라는 명령!
		}
		group[type - 1].reserve(); // 해당 메소드의 배열에 해당하는 메소드를 호출
	}

	// 콘서트 예약 검색 메소드
	private void search() {
		for (int i = 0; i < group.length; i++) {
			group[i].show(); // 0,1,2 모든 인덱스에 해당하는 Seats 배열 내용을 다 출력!
			System.out.println(">>>> 조회를 완료 하였습니다. <<<<\n");
		}
	}

	// 콘서트 예약 취소 메소드
	private void cancel() {
		System.out.println("좌석구분 S(1), A(2), B(3) 입력 : ");
		int type = sc.nextInt();
		if (type < 1 || type > 3) {
			System.out.println("좌석이 존재하지 않습니다.");
			return;
		}
		group[type - 1].cancel();
	}

	// 콘서트 예약, 예약검색, 예약취소 를 실행 메소드
	public void run() {
		System.out.println(hallName + "_예약 프로그램 입니다. ");
		int choice = 0;
		while (choice != 4) {
			System.out.print("1.예약,  2.조회,  3.취소, 4.종료 =>");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				reserve();// 예약
				break;
			case 2:
				search();// 조회
				break;
			case 3:
				cancel();// 취소
				break;
			case 4:
				System.out.println("프로그램이 종료되었습니다.");
				break; // 종료
			default:
				System.out.println("잘못 입력했데요~~~");
			}
			System.out.println();
		}
	}
}
