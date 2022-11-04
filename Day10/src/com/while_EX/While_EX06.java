package com.while_EX;
/* 문]
 * 		사용자로부터 입력받은 정수를 계속해서 더한다.
 * 		만약 0이 입력되면 지금까지의 정수를 더하여 결과를 출력
 * 
 */

import java.util.*;
public class While_EX06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=1,sum=0;
		
		while(num!=0) {
			System.out.print("정수 입력,  0 종료 : ");
			num = sc.nextInt();
			sum+=num;
		}
		System.out.println(sum);
	}

}
