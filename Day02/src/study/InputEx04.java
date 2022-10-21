package study;

/* 숫자열 입력받기
 * 숫자도 처음에는 문자열로 받아들인다.
 */

import java.io.*; // 모든 IO에 관련된 class를 사용한다는 뜻. (객체지향의 장점)
public class InputEx04 {

	public static void main(String[] args)throws IOException {
		
		 // InputStreamReader is = new InputStreamReader(System.in);
		 // BufferedReader br = new BufferedReader(is);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, mat, sum, evg;
		
		System.out.print("국어의 점수를 입력하세요 = ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어의 점수를 입력하세요 = ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학의 점수를 입력하세요 = ");
		mat = Integer.parseInt(br.readLine());
		
		sum = kor + eng + mat;
		evg = sum/3;
		
		System.out.printf("국어점수는 = %d,영어점수는 = %d,수학점수는 = %d, 총 합계 = %d\n", kor,eng,mat,sum);
		System.out.print("세 과목의 총 합산 점수 = "+sum);
		System.out.print("\t평균 점수 = " + evg);
		
		System.out.println();
	}

}