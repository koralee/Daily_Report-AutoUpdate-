package study;

/* 문] 
 * 		1. 콜라, 2. 사이다, 3. 마운틴, 4. 초코송이, 5. 에이스, 6. 웨하스  가 나오는 자판기 프로그램 작성
 * 		종료는 0 번으로 해서 프로그램 완성
 * 
 * 		메뉴 입력 : Scanner
 * 		while, switch~case  사용  0~6번 이외의 번호를 입력시 "선택하신 상품이 없습니다."
 * 		
 */

import java.util.*;

public class While_EX_02_Upgrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 콜라, 2. 사이다, 3. 마운틴, 4. 초코송이, 5. 에이스, 6. 웨하스 // 종료 0.");
		System.out.print("입력 :  ");
		int menu = 1;
		String menu_Name = null;
		
		while (menu != 0) {
			menu = sc.nextInt();
			switch (menu) {
			case 0:
				System.out.print("종료 되었습니다.");
				System.exit(0);
			case 1:
				menu_Name = "콜라";
				break;
			case 2:
				menu_Name = "사이다";
				break;
			case 3:
				menu_Name = "마운틴";
				break;
			case 4:
				menu_Name = "초코송이";
				break;
			case 5:
				menu_Name = "에이스";
				break;
			case 6:
				menu_Name = "웨하스";
				break;
			default:
				menu_Name = "없는 상품";
			}
			System.out.println("       " + menu_Name);
		}
	}
}
