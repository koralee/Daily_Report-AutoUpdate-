package com.For_Ex;
/* 문]
 * 		 사용자로부터 하나의 숫자를 입력받은 다음 , 그 수만큼 3의 배수를 출력하는 프로그램 작성
 * 	 	 출력 예문
 * 		 8
 * 		 3 6 9 12 15 18 21 24
 */

import java.util.*;
public class For_EX12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력을 원하는 3의 배수의 갯수 입력 : ");
		int count = sc.nextInt();
		for(int i=1;i<=count;i++) {
			System.out.print(i*3+"\t");
		}
	}

}
