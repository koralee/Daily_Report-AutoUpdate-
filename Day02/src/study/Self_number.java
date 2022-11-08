package study;

import java.io.*;

public class Self_number {

	public static void main(String[] args)throws IOException {
		// 숫자 하나만 입출력 받기
		// 숫자 하나만 입출력 가능   10은  1과 0으로 되어있으므로 X
		
		int num1;
		int num2;
		
		System.out.print("첫 번째 정수를 입력하세요");
		num1 = System.in.read()-48; //-48(=='0')은 ASCII코드의 계산을 위해
		
		System.in.skip(2);
		
		System.out.print("두 번째 정수를 입력하세요");
		num2 = System.in.read()-'0'; // -'0'(==-48)은 ASCII코드의 계산을 위해
		
		System.out.print("num1 + num2 ="+(num1+num2));
		
		
	}

}
