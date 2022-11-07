package com.For_Ex;

/* 문]

 *   사용자로부터 임의의 정수를 입력받아 1부터 입력받은 수까지의 
 *   전체합계, 짝수의 합계, 홀수의 합계의
 *   결과 값을 각각 출력하는 프로그램 작성
 *   Ex) 10
 *   1~10 까지의 전체의 합 : 55 
 *   1~10 까지의 짝수의 합 : 30
 *   1~10 까지의 홀수의 합 : 25
 * 
 */
import java.util.*;

public class For_EX09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, even = 0, odd = 0, sum = 0;
		System.out.print("임의의 수를 입력 : ");
		n = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				even += i;
			else
				odd += i;
			sum += i;

			// 십단위 아닌 경우
			if (i == n) {
				System.out.println("1~" + i + "까지의 짝수의 합 = " + even);
				System.out.println("1~" + i + "까지의 홀수의 합 = " + odd);
				System.out.println("1~" + i + "까지의 전체의 합 = " + sum);
			} else if (i % 10 == 0) { // 십단위 경우
				System.out.println("1~" + i + "까지의 짝수의 합 = " + even);
				System.out.println("1~" + i + "까지의 홀수의 합 = " + odd);
				System.out.println("1~" + i + "까지의 전체의 합 = " + sum);
				System.out.println();
			} 
		}
	}
}