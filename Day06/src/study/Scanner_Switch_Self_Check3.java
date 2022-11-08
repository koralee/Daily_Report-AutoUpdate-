package study;

/*
 *  숙제  
 *  사용자로부터 임의의 정수 두개와 연산자를 입력받아
 *  해당 연산자의 처리 결과를 출력하는 프로그램을 작성하시오
 *  
 *  단, switch case 문으로 구현하고 모든 수를 정수처리한다.
 *  
 *  Ex) 		첫 번째 정수 :
 *   		 	연산자[ + , -  ,  *  ,  /  ,  %]
 *    	 		두 번째 정수 : 
 */

import java.io.*;

public class Scanner_Switch_Self_Check3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 0, c = 0;
		System.out.println("임의의 두 정수와 연산자를 입력하세요 ");
		System.out.println("첫 번째 임의의 정수를 입력 : ");
		a = Integer.parseInt(br.readLine());

		if (a >= 0) {
			System.out.println("연산자[ + , -  ,  *  ,  /  ,  %]를 입력 : ");
			char ch = (char) System.in.read();
			System.in.skip(2);
			switch (ch) {
			case '+':
				System.out.println("연산자 : " + ch);
				System.out.println("두 번째 임의의 정수를 입력 : ");
				b = Integer.parseInt(br.readLine());

				if (b >= 0) {
					c = a + b;
					System.out.printf("%d %c %d = %d", a, ch, b, c);
					break;
				} else
					System.out.println("정수를 입력하세요");
				break;

			case '-':
				System.out.println("연산자 : " + ch);
				System.out.println("두 번째 임의의 정수를 입력 : ");
				b = Integer.parseInt(br.readLine());

				if (b >= 0) {
					c = a - b;
					System.out.printf("%d %c %d = %d", a, ch, b, c);
					break;
				} else
					System.out.println("정수를 입력하세요");
				break;

			case '*':
				System.out.println("연산자 : " + ch);
				System.out.println("두 번째 임의의 정수를 입력 : ");
				b = Integer.parseInt(br.readLine());

				if (b >= 0) {
					c = a * b;
					System.out.printf("%d %c %d = %d", a, ch, b, c);
					break;
				} else
					System.out.println("정수를 입력하세요");
				break;

			case '/':
				System.out.println("연산자 : " + ch);
				System.out.println("두 번째 임의의 정수를 입력 : ");
				b = Integer.parseInt(br.readLine());

				if (b >= 0) {
					c = a / b;
					System.out.printf("%d %c %d = %d", a, ch, b, c);
					break;
				} else
					System.out.println("정수를 입력하세요");
				break;

			case '%':
				System.out.println("연산자 : " + ch);
				System.out.println("두 번째 임의의 정수를 입력 : ");
				b = Integer.parseInt(br.readLine());

				if (b >= 0) {
					c = a % b;
					System.out.printf("%d %c %d = %d", a, ch, b, c);
					break;
				} else
					System.out.println("정수를 입력하세요");
				break;
				default: 
					System.out.println("잘못된 연산자 입니다.");
			}
		} else
			System.out.println("정수를 입력하세요");

	}
}
