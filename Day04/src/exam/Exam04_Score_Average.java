package exam;

import java.util.Scanner;

/*
 * 숙제!
 * 점수와 학년을 입력받아 점수가 60점 이상이면 합격, 미만이면 불합격 출력하고, 학년이 4학년의 경우 70점 이상이어야 합격할 수 있다.
 * 
 * 중첩if문을 사용하여 처리하는 프로그램을 작성하시오.
 * 
 * 학년 : year,    점수는 : Score
 */

public class Exam04_Score_Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("학년과 점수를 입력하면 합격 불합격을 표시됩니다.");

		System.out.println("학년 입력 : ");
		int year = sc.nextInt();
		if (year <= 4) { // 학년 true
			System.out.println("점수 입력 : ");
			int Score = sc.nextInt(); // 점수 입력

			System.out.println(year + "학년 이고, 점수는 " + Score + " 입니다."); // 정보 출력

			if (Score >= 70)
				System.out.println("축하합니다. 합격입니다.");
			else {
				if (year != 4 && Score >= 60) {
					System.out.println("축하합니다. 합격입니다.");
				} else {
					System.out.println("불합격 입니다.");
				}
			}
		} else // 학년 false
			System.out.println("학년을 다시 입력하세요");
	}
}
