package study;

/* 	문]
 * 주민 번호 7번재 자리를 입력해서 연대와 성별을 출력하는 프로그램
 */

import java.io.*;

public class Self_Test4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("주민번호 7번째 자리를 입력 : ");
		int a = System.in.read() - 48; // 성별 분리    1(49)=-48 = 1
		int y = 0; // 년도 저장
		String gender; // 성별 저장
		if (a >= 1 && a <= 4) {
			switch (a) {
			case 1:
			case 2:
				y = 1900;
				break;
			case 3:
			case 4:
				y = 2000;
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				System.exit(0);
			}

			gender = (a % 2 == 0) ? "여성" : "남성";
			System.out.println("당신은 "+y+"년대생 "+gender+" 입니다.");
		}
		else
			System.out.println("주민번호 7번째 자리의 숫자 범위는 1~4 입니다. ");
	}
}
