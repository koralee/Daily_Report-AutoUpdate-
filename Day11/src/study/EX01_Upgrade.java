package study;

/* 문]
 * Scanner를 이용하여 알파벳 소문자 하나를 입력받고 
 * 다음과 같이 출력하는 프로그램 작성
 * 
 * 소문자 알파벳 하나 를 입력 하시오 >>>  e
 * 		
 * 		abcde
 *	 	abcd
 *		abc
 * 		ab
 *	 	a
 */
import java.util.*;

public class EX01_Upgrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나를 입력하시오 >>> : ");
		char input = sc.next().charAt(0);
		//System.out.println(input);

		for (char i = input; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
