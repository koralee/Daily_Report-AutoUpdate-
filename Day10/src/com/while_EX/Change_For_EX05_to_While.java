package com.while_EX;

import java.util.*;

public class Change_For_EX05_to_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0,n;
		int i = 0;
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		while(i<=n) {
			sum+=i;
			i++;
		}
		
		System.out.print("0~"+n+"의 합 : "+sum);
	}

}
