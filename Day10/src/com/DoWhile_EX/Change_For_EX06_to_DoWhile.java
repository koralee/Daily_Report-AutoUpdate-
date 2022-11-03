package com.DoWhile_EX;

import java.util.*;

public class Change_For_EX06_to_DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float i = 0.0f, sum = 0.0f;
		int cnt = 0;
		do {
			sum += i;
			System.out.println("정수를 입력하세요 : ");
			i = sc.nextFloat();
			cnt++;
		}
		while (i >= 0);
		System.out.println("지금까지의 합계 : " + sum + ", 평균 : " + sum / (cnt - 1));
	}
}
