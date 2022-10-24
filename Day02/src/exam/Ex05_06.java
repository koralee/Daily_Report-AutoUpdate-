package exam;

/*	문제 .5) 국어, 영어, 수학 점수를 입력받아 합계를 구하는 프로그램작성
 * 
 * 문제 .6) 위 5번 문제를 이용하여 평균을 구하는 프로그램을 작성하시오.
 * 단 소수점 이하 2자리 까지 출력하는 프로그램을 작성하시오.
 */

import java.io.*;

public class Ex05_06 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
		//문제 5
		System.out.println("국어, 영어, 수학 점수의 합계를 구하시오");  // 질문	
		int kor, eng, matt, sum;		//  정수형 변수들 선언
		
		System.out.println("국어 점수 입력 :");   // 문제 
		kor = Integer.parseInt(br.readLine()); // 정수형 kor의 변수에 문자형의 readLine()으로 입력되는 문자를 정수로 변경하여 값을 저장
		
		System.out.println("영어 점수 입력 :");   // 문제
		eng = Integer.parseInt(br.readLine()); // 정수형 eng의 변수에 문자형의 readLine()으로 입력되는 문자를 정수로 변경하여 값을 저장

		System.out.println("수학 점수 입력 :");  	// 문제
		matt = Integer.parseInt(br.readLine()); // 정수형 matt의 변수에 문자형의 readLine()으로 입력되는 문자를 정수로 변경하여 값을 저장
		
		sum = kor + eng + matt;  // 세 점수과목의 점수를 sum에 저장
		
		System.out.println("국어, 영어, 수학   각 점수의 총 합계 : " +  sum+ " 입니다.");  // 출력
	
		
		
		// 문제6
		float evg = sum/3;   // 실수형 evg에 총합계 sum / 3의 값을 저장   but   실수의 값으로 저장됨.  선언된 자료형이 float 이므로
		System.out.printf("세 과목의 평균은 : %.2f 입니다.",evg); // 수소점 2점 자리까지 표시하기위해 %f 앞에 .2 붙여서 출력
	}
}
