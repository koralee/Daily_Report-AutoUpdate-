package exam;

/*문제 .9) 문자열 Hello World를 입력받아 출력하는 프로그램을 작성하시오.*/

import java.io.*;
public class Ex09 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열 입력하시면 그대로 출력됩니다.");  //문제

		String Text = br.readLine(); // String이라는 자료형의 Text 의 변수 형성 그리고 변수안에 br.readLine()으로 문자열을 입력받아 그대로 저장
		System.out.println("입력받은 문자열 : "+ Text);  // 출력
		
	}

}
