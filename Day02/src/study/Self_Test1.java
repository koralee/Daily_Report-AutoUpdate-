package study;

import java.io.*;

public class Self_Test1 {
	public static void main(String[] args) throws IOException {
		
		// 문자 한 개 입력 받아 확인해보기
		System.out.print("문자를 입력하세요 : ");
		int i = System.in.read(); 	 // Ex) 문자 A를 입력하면 ASCII값인 65가 저장됨.
		System.out.println(i);		 // 그러므로 A가 아닌 65가 출력됨.

		System.in.skip(2); // 컴퓨터가 인식하는 키보드의 ENTER 기능과 동일.

		System.out.println("문자열을 입력하세요 : ");
		char ch = (char) System.in.read(); 
		/* System.in.read() 자체가 int 정수형을 입력 받으려고한다.
		 	하지만 선언해준 변주의 자료형은 char이므로 맞춰줘야한다.
		 	그러므로 강제 형변환을 해줘서 자료형을 맞춰줘야 저장이 가능함.
		
		 	정리하면 
		 	원래 문자(Ex 'A')를 입력하면 그 문자에 맞는 ASCII값(Ex '65 )이 입력되어야 하지만 
		 	ch의 자료형에 맞추기위해 강제 형변환을 하여 값은 65가 아닌 A가 나온다. 
			또한 문자열 AAA를 입력해도 char는 1개의 문자를 의미하는 자료형이므로 A 딱 1개만 입출력 됨.*/
		System.out.print(ch);
		
	}
}
