package study;

/* 문] 
 * 임의의 알베벳 한 문자를 입력받아 모음/ 자음 을 구별하는 프로그램
 * 단, 대소문자 모두 적용 / 문자 이외의 문자가 입력되면 입력 오류 출력.
 */


import java.io.*;

public class Self_Test5 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch;
		System.out.println("알파벳 한 문자 입력");
		
		ch = (char)System.in.read();
		
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.println(ch);
			if((ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')||(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')) {
				System.out.println(ch+" 는 모음입니다.");
			}
			else
				System.out.println(ch+" 는 자음입니다.");
				
		}else
			System.out.println("입력 오류");
		
	}
}
