package array_Exam;

/*
 *  문]
 *  
 *  정수를 몇 개 저장할지 키보드로 개수(최대 100개 까지)를 입력받아 정수 배열을 생성하고,
 *  1~100까지의 범위의 정수를 랜덤으로 저장하고 
 *  배열의 같은 수가 나올 수 없도록 배열값을 출력하는 프로그램을 작성
 * 
 */

import java.util.*;

public class Array_ex05 {
	private static boolean exists(int[] arr, int i, int r) {
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int n = sc.nextInt();;
		if (n > 100 || 0 > n) {
				System.out.println("1~100 사이로 배열의 개수를 입력 : ");
				System.exit(0);
		} // 배열의 개수 설정
		
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) { // 랜덤 숫자를 배열에 입력
			int r = (int) (Math.random() * 100 + 1);
			if(exists(arr, i, r)) {
				i--;
				continue;
			}
			arr[i]=r;
		}
		for(int i =0;i<arr.length;i++) {
		if(i%10==0)
		System.out.println();
		System.out.print(arr[i]+"\t");
		}
	}


}
