package study;

/*
 * 문] 임의의 두 개 의 정수를 입력 받아 큰수를 알아 맞히는 프로그램...
 */
import java.util.*;	
import java.io.*;
public class Self_Test2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 변수 선언
		int first, second;
		System.out.println("첫 번째 임의의 정수 입력 : ");
		first= Integer.parseInt(br.readLine());
		System.out.println("두 번째 임의의 정수 입력 : ");
		second = Integer.parseInt(br.readLine());
		
		if(first > second) {
			System.out.println("첫 번째 정수"+first+" 가(이) "+"두 번째 정수"+second+"보다 더큽니다.");
		}
		else if(first < second) {
			System.out.println("첫 번째 정수"+first+" 가(이) "+"두 번째 정수"+second+"보다 작습니다.");
		}
		else
			System.out.println("두 정수는 같습니다.");
	}

}
