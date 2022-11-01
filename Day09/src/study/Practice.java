package study;

import java.util.*;
public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int a;
		
		a = sc.nextInt();
		if(a%2!=0)
			System.out.println("홀수 입니다.");
		else
			System.out.println("짝수 입니다.");
		
		String num = (a%2 ==0) ? "짝수" : "홀수";
		System.out.println(a+"는(은) "+num+"입니다.");
	}
}
