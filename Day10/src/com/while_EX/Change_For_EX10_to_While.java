package com.while_EX;

public class Change_For_EX10_to_While {
		public static void main(String[] args) {
			int i=0;
			while(i<5) {       //열(세로)
				int j=5;
				while(j>i) {		// 행(가로)
					System.out.print("★");
					j--;
				}
				System.out.println();
				i++;
			}
		}
	}
