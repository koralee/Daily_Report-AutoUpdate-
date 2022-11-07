package study;

/* 문] 
 * Switch, case문을 이용해서 커피 메뉴의 가격을 알려주는 프로그램 작성
 * 에스프레소 = 3500원
 * 카페 라뗴  = 3500원
 * 카푸치노   = 3500원
 * 아메리카노 = 2000원
 * 
 *  출력형식
 *  무슨 커피를 드릴까요?!   에스프레소
 *  에스프레소는 3500원 입니다.
 *  
 */

import java.util.*;
public class Self_Check2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String coffee;
		
		System.out.print("무슨 커피를 드릴까요 : ");
		coffee = sc.nextLine(); // 입력끝
		int price = 0 ;
		
		switch(coffee) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
		case "라떼":
			price = 3500;
			break;
		case "아메리카노":
		case "아아":
		case "아이스 아메리카노":
			price = 2000;
			break;
			default:
				System.out.println("메뉴가 없습니다.");
		}
		if(price!=0) System.out.println(coffee + "는  "+price + "원 입니다. ");
		else return;
	}
}
