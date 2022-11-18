package classEx02_VVVImportant;

import java.io.*;

public class Sum_play {

	public static void main(String[] args) throws IOException {

		// 플로우 익숙해지기!!!
		// 객체 생성
		Sum summary = new Sum();
		// 입력 메소드 호출
		summary.input();
		// 계산 메소드 호출
		int sum = summary.calculater();
		// 출력 메소드 호출
		summary.output(sum);

	}

}
