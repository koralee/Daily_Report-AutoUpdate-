package practice;

import java.util.Scanner;

public class exam06_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String me, jun;
		System.out.println("가위 바위 보 게임입니다.");
		System.out.println("가위, 바위, 보 중에서 입력하세요.");
		System.out.println("본인이 낼 것을 입력 :>>");
		me = sc.nextLine();
		System.out.println("준이 낼 것을 입력 :>>");
		jun = sc.nextLine();

		if ((me.equals("가위") && jun.equals("가위")) || (me.equals("바위") && jun.equals("바위"))|| (me.equals("보") && jun.equals("보")))		// 무승부
			n=0;
		
		else if (me.equals("가위") && jun.equals("바위")) {    	  // 준
			n=1;
			
		} else if (me.equals("바위") && jun.equals("가위")) { 	  // 미
			n=4;
			
		} else if (me.equals("바위") && jun.equals("보")) { 	  // 준
			n=2;
			
		} else if (me.equals("보") && jun.equals("바위")) {		  //미
			
			n=5;
		} else if (me.equals("가위") && jun.equals("보")) { 	  // 미
			
			n=6;
		} else if (me.equals("보") && jun.equals("가위")) {		 // 준
			n=3;
		}
			
		switch(n) {
		case 0:
			System.out.println("무승부 입니다.");
			break;
		case 1:
		case 2:
		case 3:
			System.out.println("jun이 이겼습니다.");
		break;
		case 4:
		case 5:
		case 6:
			System.out.println("me가 이겼습니다.");
		break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
