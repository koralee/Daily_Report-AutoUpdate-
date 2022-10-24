package exam;

/*문제 .7) 이름과 주소와 전화번호를 입력받아 출력하는 프로그램을 작성하시오.*/
import java.io.*;
public class Ex07 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름과 주소와 전화번호를 입력받아 출력하시오"); // 문제
		System.out.println("이름 입력 : ");  //문제	
		String name = br.readLine();      // String이라는 자료형의 name 의 변수 형성 그리고 변수안에 br.readLine()으로 문자열을 입력받아 그대로 저장.
		
		System.out.println("주소 입력 : "); //
		String address = br.readLine();	 // String이라는 자료형의 address 의 변수 형성 그리고 변수안에 br.readLine()으로 문자열을 입력받아 그대로 저장.
		
		System.out.println("연락처 입력 : "); // 문제
		String tel = br.readLine();			 // String이라는 자료형의 tel 의 변수 형성 그리고 변수안에 br.readLine()으로 문자열을 입력받아 그대로 저장.

		System.out.println("이름은 "+name+" 이고, 주소는 "+address+" 이고 연락처는 "+tel+" 입니다."); // 출력
	}
}
