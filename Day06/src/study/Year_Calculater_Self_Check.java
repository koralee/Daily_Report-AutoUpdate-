package study;

/*
 *  문]
 *  사용자로부터 임의의 년도를 입력받아 윤년인지 평년인지 판별하는 프로그램을 작성하시오
 *  
 *    윤년 은 4로 나누어 떨어진다.  
 *    
 *    		   400으로 나누어 떨어진다.
 *    		   100으로 나누어 떨어지지 않아야 한다.
 *    
 *    평년 은 윤년을 제외한 나머지 
 */

import java.util.Scanner;

public class Year_Calculater_Self_Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 년도를 입력 : ");
		int year = sc.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("윤년 입니다.");
		} else
			System.out.println("평년 입니다.");
	}
}
