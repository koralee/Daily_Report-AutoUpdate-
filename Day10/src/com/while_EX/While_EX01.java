package com.while_EX;

public class While_EX01 {

	public static void main(String[] args) {
		int i= 1,sum=0;
		
		while(i<=10) {
			sum+=i;
			System.out.println("1부터 "+i+"까지의 합계 :"+sum);
			i++;
		}
	}

}
