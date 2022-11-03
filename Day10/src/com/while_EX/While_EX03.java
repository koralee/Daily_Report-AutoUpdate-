package com.while_EX;

/*  while : 종료값이 명확하지 않을 때주로 사용함.
 *  
 *  문]
 *  while 문을 이용하여 -1이 입력될때 까지 정수를 계속 입력받아
 *  합계와 평균을 구하는 프로그램 작성.
 */

import java.util.*;

public class While_EX03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요. \n입력 : ");
		int n = sc.nextInt(); // 입력받은 정수를 저장할 변수
		int cnt = 0; // count
		int sum = 0; // 누적의 합을 저장할 변수

		while (n != -1) {
			sum += n;
			cnt++; // count 증가
			System.out.print("정수를 입력하고 마지막에 -1을 입력하세요. \n입력 : ");
			n = sc.nextInt(); // 정수 입력
		}
		if (cnt == 0)
			System.out.println("입력된 정수가 없습니다.");
		else {
			System.out.println(n + " 이 입력되었습니다.");
			System.out.println("정수가 입력된 횟수는 : " + cnt + "\n입력된 정수들의 합은 : " + sum+"\n평균은 : "+(double)sum/cnt);
		}
	}
}
