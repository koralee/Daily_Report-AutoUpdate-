package exam;

/* Scanner 클래스를 이용하여 2자리의 정수(10~99)를 입력받고,
 *  10의 자리와 1의 자리가 같은 지를 판별하여 출력하는 프로그램을 작성하시오
 *  
 *  출력형식
 *  2자리의 정수 입력(10~99) → Ex 77
 *  Yes! 10의 자리와 1의 자리가 같습니다.
 *  
 */

import java.util.*;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("두 자리의 정수를 입력 : ");
		int a = sc.nextInt();
		System.out.println(a);

		if (a >= 10 && a <= 99) {

			if (a / 10 == a % 10) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			} else
				System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		} else
			System.out.println("범위 오류! 10~99의 값을 입력하시오 ");
	}

}
