package com.For_Ex;

/*	문]
 * 
 * 		두 개의 정수를 입력받아서 그 사이에 존재하는 정수들의 합을 구하는 프로그램
 * 		Ex)  3  5 >>>  3+4+5 = 12
 * 	    Ex)  5  3 >>>  3+4+5 = 12
 * 
 */

import java.util.*;

public class For_EX08_A_a_or_a_A_changeMathod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, sum = 0;
		System.out.print("첫 번째 정수 입력 : ");
		n1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		n2 = sc.nextInt();
		System.out.print("두 정수 사이의 합계 : ");
		if (n1 > n2) {
			n1 = n1 ^ n2;
			n2 = n2 ^ n1;
			n1 = n1 ^ n2;
		}
		for (int i = n1; i <= n2; i++) {
			sum += i;
			System.out.print(i);
			if (i <n2) {
				System.out.print("+");
			}
			else {
			System.out.print("=");
			System.out.print(sum);
				}
			}
		}
	}
