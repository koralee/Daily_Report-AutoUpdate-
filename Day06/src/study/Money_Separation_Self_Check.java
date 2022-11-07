package study;

/* 문] 
 *  Scanner 클래스를 이용하여 정수로 된 도늬 액수를 입력받아
 *  오만원권, 마원권, 오천권, 천원권, 오백원짜리, 백원짜리, 오십원짜리, 십원짜리, 1원짜리
 *  동전이 각각 몇개인지 변환하는 프로그램을 작성하시오
 * 
 * 출력형식 
 * 금액을 입력
 * 
 * 금액에 맞는 숫자가 출력되도록 진행
 * 
 */

import java.util.*;

public class Self_Check3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력을 입력 : ");
		int Money = sc.nextInt(), rest;

		System.out.println("입력하신 금액은 : " + Money + "원 입니다.");

		final int oman_won = 50000;
		final int man_won = 10000;
		final int ochun_won = 5000;
		final int chun_won = 1000;
		final int oback_won = 500;
		final int back_won = 100;
		final int osib_won = 50;
		final int sib_won = 10;
		final int il_won = 1;

		rest = Money / oman_won; // 5만원권 개수
		Money = Money % oman_won;

		if (rest > 0) {
			System.out.println("오만원권	" + rest + "매");
			rest = Money / man_won; // 1만원권 개수
			Money = Money % man_won;

			if (rest > 0) {
				System.out.println("만원권		" + rest + "매");
			}
			rest = Money / ochun_won; // 5천원권 개수
			Money = Money % ochun_won;

			if (rest > 0) {
				System.out.println("오천원권	" + rest + "매");
			}
			rest = Money / chun_won; // 천원권 개수
			Money = Money % chun_won;

			if (rest > 0) {
				System.out.println("천원권		" + rest + "매");
			}
			rest = Money / oback_won; // 5백원권 개수
			Money = Money % oback_won;

			if (rest > 0) {
				System.out.println("오백원권	" + rest + "매");
			}
			rest = Money / back_won; // 백원권 개수
			Money = Money % back_won;

			if (rest > 0) {
				System.out.println("백원권		" + rest + "매");
			}
			rest = Money / osib_won; // 5백원권 개수
			Money = Money % osib_won;

			if (rest > 0) {
				System.out.println("오십원권	" + rest + "매");
			}
			rest = Money / sib_won; // 십원권 개수
			Money = Money % sib_won;

			if (rest > 0) {
				System.out.println("십원권		" + rest + "매");
				rest = Money / il_won; // 1원권 개수
				Money = Money % il_won;

				if (rest > 0) {
					System.out.println("일원권		" + rest + "매");
				}
			}
		} else
			System.out.println("금액을 0원 이상으로 다시 입력하시오.");
	}
}
