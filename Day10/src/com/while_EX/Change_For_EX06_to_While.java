package com.while_EX;

import java.util.*;

public class Change_For_EX06_to_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float i = 0.0f, sum = 0.0f;
		int cnt = 0;

		while(i >= 0){
			sum += i;
			System.out.println("정수를 입력하세요 : ");
			i = sc.nextFloat();
			cnt++;
		}
		System.out.println("지금까지의 합계 : " + sum + ", 평균 : " + sum / (cnt - 1));
	}
}
