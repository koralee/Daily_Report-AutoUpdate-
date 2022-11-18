package classEx02_VVVImportant;

/*
 * 		임의의 두 정수와 연산자를 입력받아 처리하는 프로그램을 구현
 * 
 * 		단, 클래스를 구분하여 구연하시오.
 * 
 * 		임의의 두 정수 입력[공백 구분]
 * 		연산자 입력[+, -, *, / ]  : +
 * 		10 + 5 = 15
 * 
 * 		입력기능, 연산기능, 출력기능 구현
 * 		
 * 		입력기능은 (스캐너 버퍼)두 가지 모두 사용하시오!
 */

import java.util.*;
import java.io.*;

public class Calc {
	int n1, n2;
	char ch;

	void input() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 두 정수 입력[공백 구분]");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.println("연산자 입력[+, -, *, /] : ");
		ch = (char) System.in.read();
	}

	int calculate() {
		int sum = 0;
		switch (ch) {
		case '+':
			sum = n1 + n2;
			break;
		case '-':
			sum = n1 - n2;
			break;
		case '*':
			sum = n1 * n2;
			break;
		case '/':
			sum = n1 / n2;
			break;
		}
		return sum;
	}

	void output(int result) {
		System.out.printf("%d %c %d = %d\n ", n1, ch, n2, result);
	}

}
