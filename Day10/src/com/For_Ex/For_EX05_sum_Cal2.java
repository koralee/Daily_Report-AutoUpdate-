package com.For_Ex;

/*
 * 문]
 * 0에서부터 입력한 정수까지의 합을 구하는 프로그램을 작성
 * 입력은 Scanner 클래스로 구현
 */
import java.util.*;
public class For_EX05_sum_Cal2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0,n;
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		for(int i = 0;i<=n;i++) {
			sum+=i;
		}
		System.out.print("0~"+n+"의 합 : "+sum);
	}

}
