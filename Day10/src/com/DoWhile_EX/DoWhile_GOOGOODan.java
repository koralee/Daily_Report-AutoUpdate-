package com.DoWhile_EX;

public class DoWhile_GOOGOODan {

	public static void main(String[] args) {
		int i , j;

		i=2;
		do{	
			j = 1;
			do {
				System.out.printf("%3d X %3d = %d\n", i, j, j * i);
				j++;
			}while(j<=9);
			
			System.out.println();		
			i++;
		}while(i<=9);
			
				
		
}
}