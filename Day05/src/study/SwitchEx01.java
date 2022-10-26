package study;

import java.util.*;
public class SwitchEx01 {
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

		System.out.println("당신의 총점은 " + sum + " 이고, " + "평균은 " + evg + " 입니다.");
		
		switch((int)(evg/10)) {

		case 9:
			System.out.println("당신의 학점은 A 입니다.");			
			break;
		case 8:
			System.out.println("당신의 학점은 B 입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C 입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D 입니다.");
			break;
			default:
				System.out.println("당신의 학점은 F 입니다.");
		}
		
	}
}
