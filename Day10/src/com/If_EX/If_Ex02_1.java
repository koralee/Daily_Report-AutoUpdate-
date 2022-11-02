package com.If_EX;
/*	문]
 * 		사용자로부터 알파벳 한 문자를 입력받아 
 * 대문자 → 소문자/ 소문자 → 대문자로 변환하는 프로그램.
 * 단, 삼항 연산자를 사용할 것.
 */
import java.io.*;

public class If_Ex02_1 {

	public static void main(String[] args) throws IOException {
		System.out.println("알파벳 한 문자를 입력 : ");
		int n = System.in.read();
		String ch = (n >= 65 && n <= 90) ?  ch = (char) (n + 32) + "": (n >= 97 && n <= 122) ? ch = (char) (n - 32) + "" : "입력 오류";
		System.out.println(ch);    // 또는 아래 방법
		
		System.out.println((n >= 65 && n <= 90) ?   (char) (n + 32)   : (n >= 97 && n <= 122) ?  (char) (n - 32) : "입력 오류");
	}
}
