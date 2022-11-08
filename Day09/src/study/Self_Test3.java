package study;

/*
 * 3개의 정수를 입력받아 큰 순서대로 출력하는 프로그램
 * 
 */

import java.io.*;

public class Self_Test3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int first, second, third;

		System.out.println("임의의 3개의 정수를 입력 : ");
		System.out.println("첫 번째 정수 입력 : ");
		first = Integer.parseInt(br.readLine());

		System.out.println("두 번째 정수 입력 : ");
		second = Integer.parseInt(br.readLine());

		System.out.println("세 번째 정수 입력 : ");
		third = Integer.parseInt(br.readLine());
//
//		if (second >= first  && second >= third) {
//				first = first ^ second;
//				second =second  ^ first;
//				first = first ^ second;
//		}
//		else if(third >= first && third >=second) {
//			first = first ^ third;
//			third =third  ^ first;
//			first = first ^ third;
//		}
//		if(third >=second) {
//			third = third ^ second;
//			second =second  ^ third;
//			third = third ^ second;
//	}
		
		if(first<second){
			first = first ^ second;
			second =second  ^ first;
			first = first ^ second;			
		}
		if(first<third) {
			first = first ^ third;
			third =third  ^ first;
			first = first ^ third;
		}
		if(second<third) {
			third = third ^ second;
			second =second  ^ third;
			third = third ^ second;	
		}
		
		
		System.out.println();
		System.out.println(first+">="+second+">="+third);
	}
}