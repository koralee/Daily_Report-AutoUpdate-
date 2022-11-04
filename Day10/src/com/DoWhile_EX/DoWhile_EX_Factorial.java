package com.DoWhile_EX;

import java.util.*;

public class DoWhile_EX_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 수를 입력 : ");
		int n = sc.nextInt();
		int sum = 1;
		int i=1;
		System.out.print("factorial : "+n+"!  = ");
		do{
			sum*=i;
			System.out.print(i);
			i++;
			if(i<=n) {
				System.out.print(" X ");
			}else {
					System.out.print(" = ");
				System.out.println(sum);
				}
			}while(i<=n);
		}
}
