package com.For_Ex;

/*
 * 문] a부터 z까지 출력하는 프로그램을 작성하시오
 */

public class For_Ex03_Alphabet {
	public static void main(String[] args) {
		for(char ch='a';ch<='z';ch++) {
			ch = (char)(ch);
			System.out.print(ch);
		}
		
	}
}
