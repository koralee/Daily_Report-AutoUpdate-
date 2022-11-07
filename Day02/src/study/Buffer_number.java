package study;

import java.io.*; // 입출력 필수 라이브러리

public class InputEx02 {

	public static void main(String[] args) throws IOException { // 예외전가 필수
		
		//숫자 하나만 입력 받기
		//숫자를 입력 (1개)만 가능!  Ex 10은  1과 0 숫자 두개 이므로 X
		
		int num1;  // 첫 번째 정수
		int num2;  // 두 번째 정수
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		num1 = System.in.read()-48;  // -48은 ASCII code를 숫자로 처리하라는 것을 의미
												  // Ex) 문자'5'의 ASCII 값은 53 - 48 = 5  이므로 숫자 5 가 저장 됨.
		
		//System.in.read(); // Enter를 의미
		//System.in.read(); // 두 번 써줘야 함.
		//또는 System.in.skip(2);
		
		System.in.skip(2);
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		num2 = System.in.read()-'0';  //-'0'은 -48과 동일 즉,  ASCII code를 숫자로 처리하라는 것을 의미
												  // Ex) 문자 '5'의 ASCII 값은 53 - 문자 '0'의 ASCII 값은 48 이므로 53 - 48 = 5 가 저장됨.
		
		System.out.println("num1 + num2 = " + (num1 +num2));
		
		
		
	}

}