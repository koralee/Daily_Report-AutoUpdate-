package practice;

import java.util.*;

public class exam03_2_369 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("369 게임");
		System.out.println("1~99사이의 임의의 숫자 입력 :");
		int num = sc.nextInt();

		if (num > 0 && num < 100) {
			System.out.println("입력 값 : " + num);

			if (num >= 30 && (num - (num % 10)) % 30 == 0) {
				System.out.print("박수 짝!(1)");
				
							if (num % 10 != 0 && num % 3 == 0)
							System.out.println("짝!");
			} 
			
			else if (num % 10 != 0 && (num % 10) % 3 == 0)
				System.out.println("박수 짝(2)");
			else
				System.out.println("박수 X");
		} 
		else
			System.out.println("입력값 오류!!!XXXXX");
	}

}
