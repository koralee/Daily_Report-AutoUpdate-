package exam;

/* 문제 .10) 10과 6을 XOR 게이트의 결과를 출력하는 프로그램을 작성하시오.*/

import java.io.*;
public class Ex10 {

	public static void main(String[] args) {
		int a=10,b=6,c;   // 정수형 a, b 를 선언 그리고 초기값을 a = 10  , b = 6으로 설정    C는 선언만! 초기값 설정 X
		c = a ^ b;  // a와 b의 XOR 연산의 값을 변수 c에 저장.
		System.out.println(c);  // c 출력
		
	}

}
