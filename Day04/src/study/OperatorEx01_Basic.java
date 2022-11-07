package study;

/*
 * 대입 연산자 : =
 * 산술 연산자 : + , - , * , / , %
 * 
 */

import java.util.*;

public class OperatorEx01 {
	public static void main(String[] args) {

		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력해주세요 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력해주세요 : ");
		int n2 = sc.nextInt();

		int c, d, e, f, g;

		c = n1 + n2;	//합
		d = n1 - n2;	//차
		e = n1 * n2;	//곱
		f = n1 / n2;	//몫
		g = n1 % n2;	//나머지
		System.out.printf("%d+%d = %d\n", n1, n2, c);
		System.out.printf("%d-%d = %d\n", n1, n2, d);
		System.out.printf("%d*%d = %d\n", n1, n2, e);
		System.out.printf("%d/%d = %d\n", n1, n2, f);
		System.out.printf("%d %% %d = %d\n", n1, n2, g);
		
		System.out.println("두 정수의 합 : "+c+", 차 : "+d+", 곱 : "+e+ ", 몫 : "+f +", 나머지 : "+g);
		System.out.printf("두 정수의 합 : %d, 차 : %d, 곱 : %d, 몫 : %d, 나머지 : %d",c,d,e,f,g);
		
	}
}
