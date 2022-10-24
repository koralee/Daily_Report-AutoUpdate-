package exam;
/*문제 .8) 문자 하나를 입력받아 아스키코드 값으로 출력하는 프로그램 작성*/
import java.io.*;
public class Ex08 {

	public static void main(String[] args)throws IOException {
		
		System.out.println("문자 하나를 입력하면 ASCII 코드 값으로 출력됩니다.");  //문제
		System.out.println("문자 한 개를 입력 : "); // 문제 
		int A = System.in.read();  // 정수형 A의 변수에 문자를 입력하면 그 문자에 맞는 아스키코드 값으로 변환되서 A에 정수의 값으로 저장됨.
		System.out.println("입력된 문자의 ASCII코드의 값은 :" + A); // 출력
		
	}

}
