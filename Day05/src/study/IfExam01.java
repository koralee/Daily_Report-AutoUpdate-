package study;

import java.util.*;

public class IfExam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("점수 입력 : ");
		int point = sc.nextInt();

		if (point >= 80) {
			System.out.println("축하합니다! 이번 시험에 합격 하셨습니다.");
			if (point % 2 == 0) 
				System.out.println("점수는 짝수 입니다.");
			 else 
				System.out.println("점수는 홀수 입니다.");
			//중첩 if문
			
			
		}else {
			System.out.println("불합격입니다. 다음에 다시 한 번 도전하세요.");
		}
	}
}
