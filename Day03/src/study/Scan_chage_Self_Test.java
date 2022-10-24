package study;

import java.io.IOException;
import java.util.*;
public class Scan_chage_Self_Test {
	public static void main(String[] args) throws IOException {
	

		Scanner sc = new Scanner(System.in);
		
		//1.) 문자 하나를 입력받아 출력
		//8.) 문자 하나를 입력받아 아스키 코드로 출력하는 프로그램 작성
		System.out.print("문자 입력 : ");
		char ch;
		ch = sc.next().charAt(0);
		System.out.println(ch);
		int ch2 = (int)ch; 			 	// ASCII코드의 값 뽑아내는 법
		System.out.println(ch2); 		// ASCII 코드의 값 확인
		
		
		System.in.skip(2); // Enter
		
		//2.) 문자열을 이용하여 이름을 출력하시오
		System.out.print("이름 입력 :");
		String name0;
		name0 = sc.next();
		System.out.println("이름은 : "+name0 +" 입니다.");
		
		System.in.skip(2); // Enter
		
		//3.) 숫자 하나씩을 입력받는 프로그램을 작성하되, 두 개의 변수를 이용하여 합을 구하는 프로그램 작성
		//4.) 임의의 두 정수를 입력받아 합을 구하는 프로그램을 작성하시오.
		System.out.println("각각 두 개의 숫자를 입력하여 합을 구하시오");
		System.out.print("첫 번째 숫자를 입력 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자를 입력 : ");
		int b = sc.nextInt();
		
		int sum = a + b ;
		System.out.println("두 수의 합은 : "+ sum+" 입니다." );
		System.in.skip(2); // Enter
		
		
		System.out.println("아무 정수를 입력 : ");
		int k = sc.nextInt();
		System.out.println("아무 정수를 입력 : ");
		int s = sc.nextInt();
		
		int sum2 = k + s ;
		System.out.println("두 정수의 합은 : "+sum2 + "입니다.");
		
		System.in.skip(2);
		
		// 5.) 국어, 영어, 수학 점수를 입력받아 합계를 구하는 프로그램작성
		// 6.) 위 5번 문제를 이용하여 평균을 구하는 프로그램을 작성하시오. ,단 소수점 이하 2자리 까지 출력하는 프로그램을 작성하시오.
		   
		System.out.println("국어, 영어, 수학  세 과목의 점수의 총 합계를 구하시오");
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		int mat = sc.nextInt();
		
		int sum3 = kor + eng + mat ;
		System.out.println("세 과목의 점수의 총 합계 :"+sum3+" 입니다.");
		float evg = sum3/3;
		System.out.printf("세 과목의 평균은 %.2f 입니다.\n", evg);
		System.in.skip(2);
		
		
		// 7.) 이름과 주소와 전화번호를 입력받아 출력하는 프로그램을 작성하시오.
		System.out.println("이름과 주소와 연락처를 입력받아 출력하시오");
		
		//tip Scanner를 사용해서 Enter를 사용해서 입력을 마무리 할 경우 주로 nextLine을 사용하는 것이 좋다.
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		sc.nextLine(); // 위의 next는 공백을 기준으로 공백 이전의 것만 인식하므로 끝에 Enter처리를 해줘야 해서  sc.NextLine()을 Enter의 개념으로 한 번더 해줘야함.
		
		System.out.println("주소 입력 :");
		String address = sc.nextLine();
		
		System.out.println("연락처 입력 :");  // nextInt는 앞의 0을 인식하지 못하므로 연락처는 nextLine을 사용할 것!
		String tel=sc.nextLine();
		
		System.out.println("이름은  "+name);
		System.out.println("주소는  "+address);
		System.out.println("연락처는 "+tel);
		
		// 9.) 문자열 Hello World를 입력받아 출력하는 프로그램을 작성하시오.
		System.out.println("문자열을 입력하세요");
		String Text = sc.nextLine();
		System.out.println(Text);
		
		// 10.) xor 게이트의 결과를 출력하는 프로그램을 작성하시오.
		System.out.println("xor 게이트 계산기");
		System.out.println("아무런 첫 번째 정수를 입력 하세요");
		int A = sc.nextInt();
		System.out.println("아무런 두 번째 정수를 입력 하세요");
		int B = sc.nextInt();
		
		int C = A ^ B;
		System.out.println("입력한 두 정수의 xor 게이트 계산 값은 : " + C + " 입니다. ");

	}
}
