package com.DoWhile_EX;

//1~10까지의 합계.

public class DoWhile_Ex01 {
	public static void main(String[] args) {
		
		int i = 1, sum =0;   // 초기값
		
		do {                      // 처리문    // 조건문이 아래에 있기 때문에 무조건 1번은 처리하게 됨!
			sum+=i;
			i++;
		}while(i<=10);		//조건문
		System.out.println("1~10의 합계 : "+sum);  // 결과문
	}
}
