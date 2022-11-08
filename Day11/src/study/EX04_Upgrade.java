package study;

import java.util.*;
public class EX04_Upgrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료합니다.");
		
		 while(true) {
			 System.out.println(">>");	
			 
			 String text = sc.nextLine();// 한 라인 전체 읽기
			 
			 if(text.equals("exit")) // exit가 입력되면 반복을 종료 
				 break;
		 }
	}

}
