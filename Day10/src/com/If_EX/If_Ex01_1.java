package com.If_EX;

import java.io.IOException;
public class If_Ex01_1 {

	public static void main(String[] args) throws IOException {
		char var;
		char change;
		System.out.print("알파벳 한 문자 입력 :");

		var = (char)System.in.read();
		if((var >='A' && var<='Z') || (var >='a' && var<='z') ) {
		change = (var >='a' && var <='z') ? (char)(var-('a'-'A')) :  (char)(var+('a'-'A'));
		System.out.println(change);
		}
		else
		System.out.println("입력 오류");
	}
}
