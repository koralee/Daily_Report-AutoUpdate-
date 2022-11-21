package classEx03_Array;

/*
* 		2. Grade 클래스에는 인원수를 입력받아, 입력받은 인원수 만큼
*								  이름, 국어, 영어, 수학 점수를 입력받고
*								  총점, 평균, 석차를 계산하는 클래스
*								  
*								#속성 : 인원수, Record 객체 배열		
*								#기능 : 인원수 입력, 상세 데이터 입력(입력 메소드)
*										  총점, 평균, 석차 계산	(처리 메소드)
*										  결과 출력(출력 메소드)
*/
import java.util.*;

public class Grade {
	int student;

	Scanner sc = new Scanner(System.in);
	Record[] re;

	void set() { // 인원수 셋팅 메소드
		do {
			System.out.println("인원수 입력(1~100)");
			student = sc.nextInt();
		} while (student < 0 || student > 100);

		re = new Record[student];
	}

	void input() {
		for (int i = 0; i < re.length; i++) { // 이름, 점수 입력
			
			
			re[i] = new Record();
			// 이름
			System.out.print((i + 1) + "번째 이름 입력 : ");
			re[i].name = sc.next();
			// 국, 영, 수 점수 입력
			System.out.print("국어 점수 입력 : ");
			re[i].kor = sc.nextInt();
			System.out.print("영어 점수 입력 : ");
			re[i].eng = sc.nextInt();
			System.out.print("수학 점수 입력 : ");
			re[i].matt = sc.nextInt();
			System.out.println();
		}
		// 총점, 평균 메소드
		for (int i = 0; i < re.length; i++) {
			re[i].sum = re[i].kor + re[i].eng + re[i].matt;
			re[i].avg = (double) re[i].sum / re.length;
		}
		// 석차 메소드
		for (int i = 0; i < re.length; i++) {
			for (int j = 0; j < re.length; j++) {
				if (re[i].avg < re[j].avg) {
					re[i].rank++;
				}
			}
		}
	}

	void prt() { // 출력 메소드
		System.out.println();
		System.out.printf(" 이름		국어	영어 	수학 	총점	평균	   석차\n");
		for (int i = 0; i < re.length; i++) {
			System.out.printf("%s		%3d	%3d	%3d	%3d	%.2f %3d\n",
					re[i].name, re[i].kor, re[i].eng, re[i].matt, re[i].sum, re[i].avg, re[i].rank);
		}
	}
}
