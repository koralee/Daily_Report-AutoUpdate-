package study;

/* 입출력 시에는 반드시 주의사항이 필요함.
 * 입출력에 관련된 라이브러리(import java.io.*;)를 패키지 바로 밑에 추가해야함.
 * 그리고
 * 메인 메소드(함수) 뒤에 반드시 
 * throws IOException을 기입해야한다. (입출력에 관한 예외가 발생되면 main이 알아서 처리해라! 의 '예외전가'를 의미)
 * 
 * 
 * 
 */

import java.io.*;

public class InpurEx01 {

	public static void main(String[] args)throws IOException{
/* ASCII Code 입력받음
 *  0 ~~9  	 >>> 48 ~57
 *  A ~~ Z	 >>> 65 ~ 90
 *  a ~~ z   >>> 97 ~ 122
 */
		
		System.out.print("문자를 입력하세요 : ");
		int i = System.in.read();  // 입력된 문자를 정수형 숫자로 저장
		System.out.println(i); 

		//System.in.read(); // Enter를 의미
		//System.in.read(); // 두 번 써줘야 함.
		//또는 System.in.skip(2);
		System.in.skip(2);
		
		System.out.print("문자열을 입력하세요 : ");
		char ch = (char)System.in.read();  // 문자열을 입력해도 문자 1개만 입력되도록 강제 형변환
		System.out.println(ch);                 //  AAA를 입력해도 A 한 개만 입출력 됨.
		
		
	}

}
