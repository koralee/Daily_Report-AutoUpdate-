package practice; 

/*  문]
 *  두사람이 하는 가위바위보 게임을 만듬.
 *  그리고  me  상대는 jun 으로 설정하여
 *  가위 바위 보를 입력하여 승자를 출력하는 프로그램을 작성하시오
 *  (if문만 활용)
 *  
 *  jun = sc.next();
 *  
 *  출력형식
 *  가위, 바위, 보 게임입니다.   가위, 바위, 보 중에서 입력하세요
 *  
 *  준 >> 가위
 *  미 >> 보
 *  준이 이겼습니다.
 *  
 *  힌트 ) 문자열의 비교하기 위해서는 변수.equals("가위")
 * 
 */

import java.util.*;

public class exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String me, jun;
		System.out.println("가위 바위 보 게임입니다.");
		System.out.println("가위, 바위, 보 중에서 입력하세요.");
		System.out.println("본인이 낼 것을 입력 :>>");
		me = sc.nextLine();
		System.out.println("준이 낼 것을 입력 :>>");
		jun = sc.nextLine();

		if ((me.equals("가위") && jun.equals("가위")) || (me.equals("바위") && jun.equals("바위"))
				|| (me.equals("보") && jun.equals("보")))
			System.out.println("무승부 입니다.");
		
		else if (me.equals("가위") && jun.equals("바위")) {
			System.out.println("jun이 이겼습니다.");
			
		} else if (me.equals("바위") && jun.equals("가위")) {
			System.out.println("me가 이겼습니다.");
			
		} else if (me.equals("바위") && jun.equals("보")) {
			System.out.println("jun이 이겼습니다.");
			
		} else if (me.equals("보") && jun.equals("바위")) {
			System.out.println("me가 이겼습니다.");
			
		} else if (me.equals("가위") && jun.equals("보")) {
			System.out.println("me가 이겼습니다.");
			
		} else if (me.equals("보") && jun.equals("가위")) {
			System.out.println("jun이 이겼습니다.");
		} else
			System.out.println("잘못 입력하셨습니다.");
	}
}
