package extend_Ex01;

import java.io.*;

public class BBB extends AAA { // AAA를 상속받은 BBB 클래스
	// Data 입력 메소드
	boolean input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫 번째 정수 입력 : ");
		x = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		y = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 : ");
		ch = (char) System.in.read();
		System.in.skip(2);
		switch (ch) {
		case '+':
		case '-':
		case '*':
		case '/':
			return true;
		default:
			System.out.println("연산자를 다시 입력하시오");
		}
		return false;
	}

	// 연산 및 처리 메소드
	// double result;
	double calc() {
		double result = 0;
		switch (ch) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '*':
			result = x * y;
			break;
		case '/':
			result = x / y;
			break;
		}
		return result;
	}
}
