package extend_Ex03;

/*		국어, 영어, 수학 (과목3개)의 점수를 입력받아 Grade객체를 생성하고
 * 		평균을 출력하는 프로그램을 작성
 * 
 * 		average() 메소드를 작성하여 평균 계산
 */

import java.util.*;
public class Grade {
	private int kor;
	private int eng;
	private int matt;

	Grade(int kor, int eng, int matt){
		this.kor=kor;
		this.eng=eng;
		this.matt=matt;
	}
	public int average() {
		int result = kor+eng+matt;
		return result/3;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 영어 수학  점수 입력 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int matt = sc.nextInt();
		Grade G = new Grade(kor, eng, matt);
		System.out.println("평균은 : "+G.average());
	}
}
