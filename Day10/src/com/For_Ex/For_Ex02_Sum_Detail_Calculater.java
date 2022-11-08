package com.For_Ex;

/* 문]
 * 
 * 1에서 10까지 덧셈을 표시하고 합계를 출력하는 프로그램
 * 
 * 출력 방식
 * 1+2+3+4+5+6+7+8+9+10 = 55
 * 
 */

public class For_Ex02_Sum_Detail_Calculater {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i);
			if (i <10)
				System.out.print("+");
			else {
			System.out.print("=");
			System.out.print(sum);
			}
		}
	}
}
