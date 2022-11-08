package study;

/*문1]
*		   임의의  알파벳 한 문자를 입력받아 모음인지
*		   자음인지를 판정하는 프로그램을 삼항 연산자를 이용하여 작성하시오.
*		   단, 대소문자 모두 적용하고, 문자외의 문자 입력 되면 
*		   입력오류를 출력하시오.
*/
import java.io.*;

public class Jaeum_Moeum_Seperation {

	public static void main(String[] args) throws IOException {
		System.out.println("임의의 알파벳 한 문자를 입력 :");
		char ch = (char) System.in.read(); // 문자 입력

		String ch2 = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				? ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
						|| (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) ? "모음" : "자음": "입력오류";

		System.out.println(ch + "는" + ch2 + "입니다.");
	}

}
