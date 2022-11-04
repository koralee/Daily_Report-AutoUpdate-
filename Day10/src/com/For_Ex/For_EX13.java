package com.For_Ex;
/*
 * 	문]
 * 		입력된 정수의 평균을 구하는 프로그램 작성.
 * 
 * 		1. 사용자로부터 정수의 개수를 입력 받는다.
 * 		2. 입력받은 수만큼 평균을 구한다.
 * 		3. 입력된 값은 정수/ 출력된 값은 실수 처리.
 * 
 */
import java.util.*;
public class For_EX13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt,num,i,sum =0;
		double evg;
		System.out.print("평균을 구할 정수 갯수 입력 : ");
		cnt = sc.nextInt();
		for(i=1;i<=cnt;i++) {
			System.out.println("정수입력 :");
			num = sc.nextInt();
			sum+=num;
		}
		evg=sum/(double)cnt;
		System.out.println(evg);
	}

}
