package com.For_Ex;

/*
 * 1~100까지의 수중 3의 배수의 합계를 구하는 프로그램
 */

public class For_EX11_Three_Multiple_cal {

	public static void main(String[] args) {
		System.out.println("1~100까지의 수중 3의 배수의 합계를 구하는 프로그램");
		int sum=0;
		for(int i = 0;i<=100;i+=3) {
			sum+=i;
		}
		System.out.println("1~100까지의 3의 배수의 합은 "+sum);
	}
}
