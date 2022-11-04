package com.while_EX;
/*	문]
 * 			-1^2+2^2-3^2+4^2-5^2  ..... +100^2의 합계를 구하는 프로그램 작성.
 */

import java.util.*;
public class While_EX08 {

	public static void main(String[] args) {
		int i=1, sum=0, plus=1;
		
		while(i <=100){
			plus = -plus;
			sum+=plus*(i*i);
			i++;
		}
		System.out.println("-1^2+2^2-3^2+4^2-5^2  ..... +100^2 = "+sum);
	}

}
