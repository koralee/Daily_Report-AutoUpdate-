package study;

import java.util.*;
public class Upgrade_gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, i, j=1;
		System.out.print("분리하고 싶은 갯수를 입력 : ");
		int c = sc.nextInt();
		
		for (m=1;m<=9;m+=c) { 								// 1~9개의 면을 생성 그리고 (c는 몇 개씩 분리할 것인지))
			
			for (i = 1; i <= 9; i++) { 							// 행의 갯수 곱수(1~9 불변)
			
				for (j = m+1; j <(m+1)+c;j++ ) { 			// 열의 갯수 단수(2단부터 그리고 분리된 단 부터 9단까지 해야함)	
				
					if(j<=9) 	// j가 9이하일 경우 구구단 출력
						System.out.printf("%2d  x %3d = %d\t", j, i, j * i);  //구구단 출력
					
					else		// 9이상부터는 브레이크로 끝
					break;
				}	
				System.out.println();
			}
			System.out.println();
		}
	}
}
