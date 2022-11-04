package com.For_Ex;

/*		문]
 * 		사용자로 부터 n이라는 수를 입력받아 n!을 계산하는 프로그램을 작성.
 * 		공식  : Factorial : 5! = 1*2*3*4*5 = 120
 */
import java.util.*;

public class For_EX_Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 수를 입력 : ");
		int n = sc.nextInt();
		int sum = 1;
		System.out.print("factorial : "+n+"!  = ");
		for(int i=1; i<=n ;i++) {
			sum*=i;
			System.out.print(i);
			if(i<n) {
				System.out.print(" X ");
			}else {
					System.out.print(" = ");
				System.out.println(sum);
				}
			}
		}
	}
