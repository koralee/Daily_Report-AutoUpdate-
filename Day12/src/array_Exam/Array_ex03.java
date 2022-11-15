package array_Exam;

/*
 *  문]
 *  배열과 반복문을 이용하여 다음 프로그램을 작성.
 *  
 *  키보드로 정수 입력 
 *  돈의 액수를 입력받아 오만원권, 만원권, 천원권, 오백원짜리 동전, 백원짜리 동전, 오십원짜리 동전, 십원짜리 동전, 1원 짜리 동전
 *  각각 몇 개인지 변환하는 프로그램을 작성하시오
 *  
 *  단, 반드시 배열과 반복문을 사용하시오
 *  65123
 */

import java.util.*;

public class Array_ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		int[] sep = new int[] {50000,10000,1000,500,100,50,10,1};
		int mok = 0;

		for (int i = 0; i < sep.length; i++) {
			mok = money / sep[i]; // 돈의 개수 계산
			if(mok>0)
			System.out.println(sep[i]+"원 짜리 : "+ mok + " 개");
			money = money % sep[i]; //money 갱신
		}
	}
}
