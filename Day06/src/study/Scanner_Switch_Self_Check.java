package study;

import java.util.*;
public class Scanner_Switch_Self_Check {
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
		float evg = sum / 5; // 평균
		char grade;

		System.out.println("당신의 총점은 " + sum + " 이고, " + "평균은 " + evg + " 입니다.");
		
		switch((int)(evg/10)) {

		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
			default:
				grade = 'F';
		}
		System.out.println("당신의 학점은 " +grade+" 입니다.");
		
	}
}
