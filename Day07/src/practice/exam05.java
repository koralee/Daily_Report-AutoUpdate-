package practice;

/*
 * 문]
 * 				숫자를 입력받아 3~5월은 봄, 6~8월은 여름, 9~11월은 가을, 12~2월은 겨울
 * 				그 외의 숫자를 입력하면 잘못 입력하셨습니다. 를 출력하는 프로그램을 입력하시오
 * 				단, if문과 swich~case문을 활용시오
 * 
 * 				출력형식
 * 				달을 입력하세요 (1~12) >> 9월
 * 				가을
 */

import java.util.*;

public class exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("달을 입력하세요 >>");
		int Seoson = sc.nextInt();

		if (1 <= Seoson && 12 >= Seoson) {
			System.out.println(Seoson + "월");
			switch (Seoson) {
			case 3:
			case 4:
			case 5:
				System.out.println(Seoson + "월은 봄 입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(Seoson + "월은 여름 입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(Seoson + "월은 가을 입니다.");
				break;
				default:System.out.println(Seoson + "월은 겨울 입니다.");
			}
		} else
			System.out.println("존재하지 않는 달 입니다.");
	}
}
