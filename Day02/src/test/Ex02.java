package test;
  
import java.io.*;
	/*2) 문자열을 이용하여 이름을 출력하시오.  */

public class Ex02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼 객체를 사용 ==즉,  문자열은 입력받아 버퍼에 저장하였다가 출력에 사용을 의미.
		
		System.out.print("이름을 입력 :");  // 문제 출력
		String name = br.readLine();     //  String이라는 자료형으로 만들어진 name에 br(버퍼)의 객체를 연결하여 readLine()을 이용하여 문자열을 입력받음.
		System.out.println(name);     	//  name을 출력
	}

}
