package com.DoWhile_EX;

import java.util.*;

public class Change_For_EX07_to_DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		do{
			System.out.println("정수를 마음대로 두 번 입력");
			System.out.println("첫 번째 정수 입력 : ");
			 n1 = sc.nextInt();
			if(n1<0)break;
			System.out.println("두 번째 정수 입력 : ");
			n2 = sc.nextInt();
			System.out.printf(n1+"+"+n2+"="+(n1+n2));
		}while(true);
	}
}
