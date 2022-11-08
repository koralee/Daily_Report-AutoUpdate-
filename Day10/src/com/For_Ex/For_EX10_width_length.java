package com.For_Ex;
/* 문]
 * 		이중 중첩 반복문을 사용하여 다음과 같이 출력하시오
 * 		★★★★★
 * 		★★★★
 * 		★★★
 * 		★★
 * 		★
 */

public class For_EX10_width_length {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {       //행(가로)
			for(int j=5;j>i;j--) {		// 열(세로)
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
