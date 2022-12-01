package exception;
/*
 * 		throws 예약어 : 예외 전가
 * 
 * 		[접근제한자] 반환형 메소드명(매개변수, 매개변수,....) throws 예외 클래스1, 예외클래스2....
 */

import java.io.IOException;

public class Exception05 {
	// [접근제한자] 반환형 메소드명(매개변수, 매개변수,....) throws 예외 클래스1, 예외클래스2....
	public void input(int a, int b) throws IOException, Exception {

	}

	public static void main(String[] args) throws IOException, Exception {
		Exception05 ee = new Exception05();
		ee.input(0, 0);
	}
}
