package study;

import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1, su2, su3, su4, su5, sum, evg;
		String check;
		System.out.println("기사 시험 5과목의 점수를 입력하시오");
		System.out.println("1과목 점수 입력 : ");
		su1 = sc.nextInt();
		
		System.out.println("2과목 점수 입력 : ");
		su2 = sc.nextInt();
		
		System.out.println("3과목 점수 입력 : ");
		su3 = sc.nextInt();
		
		System.out.println("4과목 점수 입력 : ");
		su4 = sc.nextInt();
		
		System.out.println("5과목 점수 입력 : ");
		su5 = sc.nextInt();
		
		sum = su1+ su2+ su3+ su4+ su5;
		evg = sum/5;
		System.out.println("과목의 총합 점수는 : "+sum+" 이고, ");
		System.out.println("평균 점수는 : "+evg+"입니다.");
		
		if(evg >= 60) {  // 평점 60점 중
			if(su1<40 | su2<40 || su3<40 || su4<40 || su5<40) {
				if(su1<40) {
					System.out.println("su1 과목의 과락발생으로 인하여 불합격입니다.");
					}
				 if(su2<40) {
					System.out.println("su2 과목의 과락발생으로 인하여 불합격입니다.");
					}
				 if(su3<40) {
					System.out.println("su3 과목의 과락발생으로 인하여 불합격입니다.");
					}
				 if(su4<40) {
					System.out.println("su4 과목의 과락발생으로 인하여 불합격입니다.");
					}
				 if(su5<40) {
					System.out.println("su5 과목의 과락발생으로 인하여 불합격입니다.");
					}
				}
			else
				System.out.println("이번 시험에 합격하셨습니다. 축하드립니다.");
		}
		else
			System.out.println("시험에 불합격 하셨습니다.");
		
	}

}
