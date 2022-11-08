package exam;

/*
 *  스캐너를 class를 이용하여 원하를 입력받아 달러로 교환하는 프로그램을 작성하시오
 * 1$ = 1100원 으로 가정함.
 * 
 * 출력형식
 * 원화를 입력하세요(단위 원) → 3300 
 * 3300원은 $3.0 입니다.
 * 
 */


import java.util.*;

public class Exam01_dollar_Cal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원화를 입력하세요 : (단위 원)");
		int W = sc.nextInt();
		final float rate = 1100; // 환율 고정
		float D = W/rate;
		
		System.out.printf(W+" 원은 $ %.2f 입니다.",D);
	}

}
