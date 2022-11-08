package study;

import java.io.*;
public class Self_numberS {

	public static void main(String[] args)throws IOException {
		// 숫자열 받기  ReanLine() 사용!
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, math,sum, evg;
		
		System.out.println("국어 점수 입력 : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.println("영어 점수 입력 : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.println("수학 점수 입력 : ");
		math = Integer.parseInt(br.readLine());
		
		sum = kor+eng+math;
		System.out.println(sum);
		evg = sum/3;
		System.out.println(evg);
		
	}

}
