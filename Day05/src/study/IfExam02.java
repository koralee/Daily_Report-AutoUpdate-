package study;

/*
 * 국어, 영어, 수학, 사회, 과학 점수를 입력받아 총점과 평균을 구한 뒤,
 * 평균점수에 따라 등급을 평가하시오
 * A는 평균 점수가 90점 이상
 * B는 평균 점수가 80점 이상
 * C는 평균 점수가 70점 이상
 * D는 평균 점수가 60점 이상
 * 평균 점수가 60점 이하면 F 처리 하십시오
 */

import java.util.*;

public class IfExam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor, eng, matt, soc, sci;

		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		matt = sc.nextInt();
		System.out.print("사회 점수 : ");
		soc = sc.nextInt();
		System.out.print("과학 점수 : ");
		sci = sc.nextInt();
		// 입력끝

		int sum = kor + eng + matt + soc + sci; // 총합
		int evg = sum / 5; // 평균

		System.out.println("당신의 총점은 " + sum + " 이고, " + "평균은 " + evg + " 입니다.");
		
		// 등급판정
		if (evg >= 90)
			System.out.println("당신의 등급은 A 입니다.");
		else if (evg >= 80)
			System.out.println("당신의 등급은 B 입니다.");
		else if (evg >= 70)
			System.out.println("당신의 등급은 C 입니다.");
		else if (evg >= 60)
			System.out.println("당신의 등급은 D 입니다.");
		else //(0~59점 까지)
			System.out.println("당신의 등급은 F 입니다.");
		
	}
}
