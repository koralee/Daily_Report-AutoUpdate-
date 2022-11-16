package array_Exam;

import java.util.*;

/*
* 문]
*
* 컴퓨터와 사용자 사이의 가위 바위 보 게임을 만듬
*
* 사용자가 먼저 시작한다. 사용자가 가위 바위 보 중 하나를 입력하고 Enter 키를 치면
* 프로그램은 가위 바위 보 중에서 램덤하게 하나를 선택하고 컴퓨터가 낸 것 으로 함
* 사용자가 입력한 값과 컴퓨터가 랜덤으로 선택한 값을 비교하여 누가 이겼는지를 판단함
* 사용자가 가위바위보 대신 그만을 입력하면 프로그램을 종료함

* 컴퓨터와 가위 바위 보 게임을 시작합니다.
* 가위바위보 => 바위
* 사용자 : 바위, 컴퓨터 : 가위,  사용자가 이겼습니다.
*
* 가위바뷔보 => 가위
* 사용자 : 가위, 컴퓨터 : 가위,  비겼습니다.
* 가위바뷔보 => 그만
* 게임을 종료 합니다.

*가위바위보가 아닌 경우 
*다시 하세요.
*/

public class Array_ex07_homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] computer = { "가위", "바위", "보" };

		while (true) {
			
			System.out.print("가위 바위 보 입력 : ");
			String hand = sc.next();
			if (hand.equals("그만")) {
				System.out.println("게임을 종료 합니다.");
				break;
			}
			int k = (int) (Math.random() * 3); // 0, 1, 2 / 3개 사용을 의미
			String temp = computer[k]; // temp에도 0가위 1바위 2보 저장
			
			System.out.println("사용자 : " + hand + "   컴퓨터 : " + temp);
				   if ((hand.equals("보") && temp.equals("바위"))
					|| (hand.equals("가위") && temp.equals("보"))
					|| (hand.equals("바위") && temp.equals("가위"))) {
				System.out.println("사용자가 이겼습니다.");
				System.out.println();

			} else if ((hand.equals("가위") && temp.equals("바위")) 
					   || (hand.equals("바위") && temp.equals("보"))
					   || (hand.equals("보") && temp.equals("가위"))) {
				System.out.println("컴퓨터가 이겼습니다.");
				System.out.println();
			} else if (hand.equals(temp)) {
				System.out.println("비겼습니다.");
				System.out.println();
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력 하세요");
				System.out.println();
			}
		}
	}
}
