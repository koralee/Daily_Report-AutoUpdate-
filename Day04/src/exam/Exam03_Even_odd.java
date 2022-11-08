package exam;
/* 
 * 입력한 정수가 홀수인지 짝수인지를 구분하는 프로그램
 * 
 */

import java.util.*;

public class Exam03_Even_odd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		String result;

		System.out.print("정수 입력 :");
		num = sc.nextInt();

		if (num % 2 == 0)
			result = "짝수";

		else
			result = "홀수";

		// if문 즉 조건문 대신에 사용가능 [즉, if문과 동일]→ result = (num%2 ==0)? "짝수" : "홀수";

		System.out.println(num + " 은 " + result + " 입니다.");
	}
}