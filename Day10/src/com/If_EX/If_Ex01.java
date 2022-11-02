package com.If_EX;

/* 문]
 * 임의의 정수를 입력받아 입력받은 정수를 양수, 음수, 0 인지를 판정하는 프로그램 작성.
 * 단. BufferedReader와 조건삼항 연상자를 이용하여 출력하시오.
 *   ex   12 ==> 양수   
 *   		0 	==> 0
 *   	 -12	==> 음수
 * 
 */
import java.io.*;
public class If_Ex01 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("임의의 정수 입력 : ");
		int a = Integer.parseInt(br.readLine());

		String A = (a!=0)? (a>0)? "양수" :"음수"	:"0"	;
		System.out.println(a+" ==> "+A);
	}
}
