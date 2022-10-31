package study;

import java.util.Scanner;

/* 문제) 
 *  Scanner 클래스를 이용하여 정수로 된돈의 액수를 입력받아 오만원, 만원, 오천원, 천원, 오백원, 
 *  백원, 오십원, 십원, 1원짜리 동전이 각각 몇개인지 반환하는 프로그램을 작성하시오.
 */

public class Code_Coin_calculater {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("금액을 입력하시오.>>");
		int mon=input.nextInt();
		int[] won= {50000,10000,5000,1000,500,100,50,10,1};
		int[] kwon=new int[9];
		int left=mon;
		
		for (int i = 0; i < kwon.length; i++) {   //  분리 코드
			kwon[i]=left/won[i];
			left=left%won[i];
		}
		
		for (int i = 0; i < kwon.length; i++) {  //   분리 출력 코드
			if(kwon[i]!=0)
				System.out.println(won[i]+"원권 : "+kwon[i]+"개");
		}
	}
}
