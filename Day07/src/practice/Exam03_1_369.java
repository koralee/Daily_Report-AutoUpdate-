package practice;

/*
 *	문]
 * 369 프로그램을 작성하시오
 * 1~99까지 정수를 입력받고 정수의 3,6,9 중 하나가 있을 경우 "박수 짝!" 
 * 두개가 있는 경우 박수 짝!짝!을 출력하는 프로그램을 작성하시오.
 * ex) 13인 경우 박수 짝!  //  36 인 경우 박수 짝! 짝!
 * 
 *  출력형식
 *  
 *  1~99 사이의 정수를 입력하시오 >> 36
 *  박수 짝! 짝! 
 *  
 */

import java.util.*;

public class exam03_1_369 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1~99 사이의 정수를 입력하시오 >>");
		int num = sc.nextInt();
		int count = 0;
		
		if (num >= 1 && num < 100) {
		 int a = num /10;  // 십의 자리 
		 int b = num %10; // 일의 자리
		 if(a != 0 && a%3 ==0)
			 count++;
		 if(b != 0 && b%3 ==0)
			 count++;
		 
		 if(count == 2) 
			 System.out.println("박수 짝!짝!");
			 else if(count ==1)
				 System.out.println("박수 짝!");
		 
		 else
			 System.out.println("박수가 없음");
		}
		else
			System.out.println("범위가 벗어났습니다.");
	}
}
