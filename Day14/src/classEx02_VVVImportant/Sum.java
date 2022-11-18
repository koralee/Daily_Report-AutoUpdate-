package classEx02_VVVImportant;

/*
 * 	임의의 정수를 입력받아 1부터 입력받은 정수까지 합계를 구하는 프로그램 작성
 *  단, 클래스를 모듈화하여 처리.
 *  또한 입력 처리는 bufferedReader로 처리한다.
 *  
 *  입력 Data가 1보다 작거나 100보다 큰 경우
 *  다시 입력하도록 처리한다.
 * 
 */

import java.io.*;

public class Sum {
	int num;

	void input() throws IOException { // 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.println("1~100의 임의의 수를 입력하시오");
			num = Integer.parseInt(br.readLine());
		} while (num < 1 || 100 < num);

	}

	int calculater() { // 계산
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

	void output(int sum) { // 출력 [매개변수로 넘겨 받아 처리]
		System.out.println("1~" + num + "까지의 합계 : " + sum);
	}
}
