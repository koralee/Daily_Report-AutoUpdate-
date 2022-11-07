package study;

	/*문1]
 	*		   임의의  알파벳 한 문자를 입력받아 모음인지
	*		   자음인지를 판정하는 프로그램을 삼항 연산자를 이용하여 작성하시오.
	*		   단, 대소문자 모두 적용하고, 문자외의 문자 입력 되면 
	*		   입력오류를 출력하시오.
	*/
import java.io.*;
public class Homework1_00 {

	public static void main(String[] args)throws IOException {
		System.out.println("임의의 알파벳 한 문자를 입력 :");
		char ch =(char)System.in.read();   // 문자 입력
		
		char ch2 =((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z'))? ch : '\0' ;   
		// 알파벳이 들어오면  ch가 S에 저장   그 외의 값이면  ' '이  저장
		
		String Seperate = ((ch2=='a' ||ch2=='e' ||ch2=='i' ||ch2=='o' ||ch2=='u')||(ch2=='A' ||ch2=='E' ||ch2=='I' ||ch2=='O' ||ch2=='U'))?"모음":"자음"; 
		//  S가 모음이랑 겹치면 모음  아니면 자음을 k에 저장
		
		String Print = (ch2 == ch)? (ch2+"는"+Seperate+"입니다."):"입력오류";
		System.out.println(Print);
	}

}
