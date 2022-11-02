package com.while_EX;

/* 문]
 * 
 * 1에서 10까지 덧셈을 표시하고 합계를 출력하는 프로그램
 * 
 * 출력 방식
 * 1+2+3+4+5+6+7+8+9+10 = 55
 * 
 */
public class While_EX02 {

	public static void main(String[] args) {
		int i = 1, sum = 0;
		while (i <= 10) {

			sum += i;
			System.out.print(i);
			if (i < 10) {
				System.out.print("+");

			} else {
				System.out.print("=");
				System.out.println(sum);
			}
			i++;
		}
	}
}
