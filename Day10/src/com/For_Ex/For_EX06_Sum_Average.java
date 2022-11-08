package com.For_Ex;

/*	문]
 *   양의 정수만 입력받아 입력받은 개수만큼 합계와 평균을 출력하시오
 * 	  단, 음의 정수를 입력하면 계산하시오(즉, 음수가 입력되면 바로 출력!을 의미)
 */

import java.util.*;
public class For_EX06_Sum_Average {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			float i = 0.0f,sum = 0.0f;
			int cnt = 0;
			
			for(;i>=0;) {
				sum+=i;
				System.out.println("정수를 입력하세요 : ");
				i = sc.nextFloat();
				cnt++;	
			}
		System.out.println("지금까지의 합계 : "+sum+", 평균 : "+sum/(cnt-1));
	}

}
