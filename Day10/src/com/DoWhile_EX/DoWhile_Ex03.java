package com.DoWhile_EX;

import java.util.*;

public class DoWhile_Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  cnt = 0, sum = 0;
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요. \n입력 : ");
		int n = sc.nextInt(); // 입력받은 정수를 저장할 변수
		do {
			sum += n;
			cnt++;
			System.out.print("정수를 입력하고 마지막에 -1을 입력하세요. \n입력 : ");
			n = sc.nextInt(); // 정수 입력
		} while (n != -1);
		if (cnt == 0)
			System.out.println("입력된 정수가 없습니다.");
		else {
			System.out.println(n + " 이 입력되었습니다.");
			System.out.println("정수가 입력된 횟수는 : " + cnt + "\n입력된 정수들의 합은 : " + sum + "\n평균은 : " + (double) sum / cnt);
		}
	}
}
