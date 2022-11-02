package com.If_EX;

/*	문]
 * 		사용자로부터 알파벳 한 문자를 입력받아 
 * 대문자 → 소문자/ 소문자 → 대문자로 변환하는 프로그램.
 */
import java.io.*;

public class If_Ex02 {

	public static void main(String[] args) throws IOException {
		// 변수 선언
		char ch;
		int n;

		System.out.println("알파벳 한 문자 입력"); 
		n = System.in.read();
		if (n >= 65 && n <= 90) { // 입력값이 대문자라면 -32
			ch =(char)(n+32); 
			System.out.println(ch);
		} else if (n >= 97 && n <= 122) { // 입력값이 소문자라면 +32
			ch =(char)(n-32);
			System.out.println(ch);
		} else
			System.out.println("입력 오류!!! 알파벳이 아닙니다.");
	}

}
