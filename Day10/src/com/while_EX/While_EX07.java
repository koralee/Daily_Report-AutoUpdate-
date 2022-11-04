package com.while_EX;
/* 문]
 * 		2의 승수를 입력받아 값을 구하는 프로그램 작성
 */

import java.util.*;

public class While_EX07 {

	public static void main(String[] args) {
		int i=1,n = 1,result=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("2의 승수 입력 :");
		n=sc.nextInt();
		while(i<=n) {
			result*=2;
			i++;
		}
	System.out.println("2의 "+n+"승은 "+result+"입니다.");	
	}
}
