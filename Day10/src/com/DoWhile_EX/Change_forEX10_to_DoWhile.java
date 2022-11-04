package com.DoWhile_EX;

public class Change_forEX10_to_DoWhile {
	public static void main(String[] args) {
		int i = 0;
		do {
			int j = 5;
			do {
				System.out.print("★");
				j--;
			} while (j > i);
			i++;
			System.out.println();
		} while (i < 5);
	}
}
