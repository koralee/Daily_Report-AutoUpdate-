package practice;

/* Scanner 클래스로 정수 3개를 입력받고 그 중 중간 크기의 수를 출력하는 프로그램.
 * 
 */

import java.util.*;

public class Mid_number_Seperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, mid;
		System.out.println("정수 3개 입력 >> ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		if (n1 > n2) {
			if (n2 > n3)
				mid = n2;
			else {
				if (n1 > n3)
					mid = n3;
				else
					mid = n1;
			}
		} else {
			if (n1 > n3)
				mid = n1;
			else
				mid = n2;
		}

		System.out.println(mid);
	}
}
