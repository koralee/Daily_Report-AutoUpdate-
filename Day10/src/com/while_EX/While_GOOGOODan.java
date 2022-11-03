package com.while_EX;

public class While_GOOGOODan {

	public static void main(String[] args) {
		int i = 2, j;

		while (i <= 9) {
			j = 1;
			while (j <= 9) {
				System.out.printf("%3d X %3d = %d\n", i, j, j * i);
				j++;
			}
			i++;
		}
		System.out.println();
	}

}
