package array_01;

import java.util.*;

public class Array_EX01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int[] AA = new int[4];  // 또는 아래 형식을 사용
		int AA[] = new int[4];
		int i,sum=0;
		for (i = 0; i <= 3; i++) {
			System.out.print((i + 1) + "번 째 정수 입력 : ");
			AA[i] = sc.nextInt();
			//sum+=AA[i];
		}
		for(int cc:AA) {
			sum+=cc;
			System.out.println("cc의 데이터 출력 : "+cc);
		}
		System.out.println("입력 정수의 총 합계 : "+sum);
		
	}
}
