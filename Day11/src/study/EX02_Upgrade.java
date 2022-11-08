package study;

/*
 *  1~10까지의 합계 : 55
 *   계속 하시겠습니까 ?  Y  N  
 *   1~100까지의 합계 : 5050
 *   계속 하시겠습니까 ? N
 *   종료되었습니다.
 *
 */
import java.util.*;
import java.io.*;

public class EX02_Upgrade {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, total = 0;
		char ch;

		while (true) {
			do {
				System.out.print("임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			} while (n < 1 || n > 1000);
			// 1부터 n까지의 누적 합계를 구함.
			total = 0;
			for (int i = 1; i <= n; i++) {
				total += i;
			}
			System.out.println("1~" + n + "까지의 합계 : " + total);
			System.out.println("계속 하시겠습니까[Y/N] : ");
			ch = (char) System.in.read();

			if (ch != 'Y' && ch != 'y')
				break;
			System.in.skip(2);
		}
	}
}
