package com.For_Ex;

/*
 * 		무한대로 두 정수를 입력받아 합계를 구하는 프로그램을 작성하시오
 * 		종료 조건 : 첫 번째 정수가 0보다 작을 경우
 */

import java.util.*;

public class For_EX07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		for (;;) {
			System.out.println("정수를 마음대로 두 번 입력");
			System.out.println("첫 번째 정수 입력 : ");
			 n1 = sc.nextInt();
			if(n1<0)break;
			System.out.println("두 번째 정수 입력 : ");
			n2 = sc.nextInt();
			System.out.printf(n1+"+"+n2+"="+(n1+n2));
		}
	}

}
