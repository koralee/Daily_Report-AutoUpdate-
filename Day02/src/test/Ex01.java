package test;

/*
 *    문제 .1) 문자 하나를 입력 받아 출력하는 프로그램 작성. 
 *    ex) a --> a
 */

import java.io.*;  // 모든 io(Input, Output)의 인터페이스를 연결 을 의미


public class Ex01 { // public (= 공개적인) class 를 의미

	public static void main(String[] args)throws IOException { // throws IOException == 혹시나 예외가 발생하더라고 메인이 알아서 처리해라! 즉, 예외전가.를 의미
		  // 실행을 담당하는 부분. == 즉, main이 없으면 class가 아무리 많아도 실행을 할 수가 없다.
		
		System.out.println("하나의 문자 입력");   //질문 출력
		char A = (char)System.in.read();     // 자료형이 char 인 변수 A에 System.in.read()에서 들어오는 값을 문자의 값으로 저장. 을 의미  
		System.out.println("입력 받은 문자 : " + A);  // A를 출력!
		
	}

}
