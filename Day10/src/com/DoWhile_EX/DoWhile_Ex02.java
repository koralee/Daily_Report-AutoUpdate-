package com.DoWhile_EX;
/* 문]
 * 
 * 1에서 10까지 덧셈을 표시하고 합계를 출력하는 프로그램
 * 
 * 출력 방식
 * 1+2+3+4+5+6+7+8+9+10 = 55
 * 
 */
public class DoWhile_Ex02 {
	public static void main(String[] args) {
		
		int i = 1, sum =0;
		do {
			sum+=i;
			System.out.print(i);
			if(i<10)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.println(sum);
			}
			i++;
		}while(i<=10);  //조건이 맞으면 위로 다시 들어가고  // 조건이 안맞으면 아래로 내려간다
		
		System.out.println("\n1~10의 합계 : "+sum);
	}
}
