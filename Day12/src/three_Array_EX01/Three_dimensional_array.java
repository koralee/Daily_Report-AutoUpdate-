package three_Array_EX01;

import java.io.*;

public class Three_dimensional_array {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subname = { "국어", "영어", "수학" };
		int[][][] sub = new int[2][3][subname.length + 3]; // 반2개 반당 학생3명 과목+3 즉, [2][3][6]
		// 0: 국어, 1: 영어, 2: 수학, 3: 총점, 4: 석차, 5: 전교 석차
		float[][] avg = new float[2][3]; // 평균이 2차원인이유는 반평균, 전교 평균
		char[][] grade = new char[2][3];
		for (int h = 0; h < sub.length; h++) { // 반

			for (int k = 0; k < sub[h].length; k++) { // 인원(학생 수)

				for (int i = 0; i < sub[h][k].length - 3; i++) { // 과목만을 받아야 하므로 0,1,2 이니까 -3을 해줌.
					do {
						System.out.print(subname[i] + "점수 : ");
						sub[h][k][i] = Integer.parseInt(br.readLine());
					} while (sub[h][k][i] < 0 || sub[h][k][i] > 100);
					sub[h][k][sub[h][k].length - 3] += sub[h][k][i]; // 점수 누적 = 총점
				}
				System.out.println();
				// 평균
				avg[h][k] = sub[h][k][sub[h][k].length - 3] / (float) sub[h][k].length - 3;

				// 반 석차
				sub[h][k][sub[h][k].length - 2] = 1;

				// 전교 석차
				sub[h][k][sub[h][k].length - 1] = 1;
			}
		} // 입력 작업 끝

		// 반 석차 구하기
		for (int h = 0; h < sub.length; h++) { // 반
			for (int k = 0; k < sub[h].length; k++) { // 반의 학생 고정군
				for (int i = 0; i < sub[h].length; i++) { // 반의 학생 비교군
					if (sub[h][k][sub[h][k].length - 3] < sub[h][i][sub[h][i].length - 3]) {// 총점 비교
						sub[h][k][sub[h][k].length - 2]++;
					}
				}
			}

		}

		// 선교 석차 구하기
		for (int h = 0; h < sub.length; h++) { // 반(고정군)
			for (int k = 0; k < sub[h].length; k++) { // 반의 학생(고정군)

				for (int i = 0; i < sub.length; i++) { // 반(비교군)
					for (int j = 0; j < sub[i].length; j++) { // 반의 학생(비교군)

						if (sub[h][k][sub[h][k].length - 3] < sub[i][j][sub[i][j].length - 3]) { // 총점 비교
							sub[h][k][sub[h][k].length - 1]++;
						}
					}
				}
			}
			// 학점 구하기
			for (int i = 0; i < sub.length; i++) {
				for (int j = 0; j < sub[h].length; j++) {
					switch ((int) (avg[i][j] / 10)) {
					case 10:
						grade[i][j] = 'A';
						break;
					case 9:
						grade[i][j] = 'B';
						break;
					case 8:
						grade[i][j] = 'C';
						break;
					case 7:
						grade[i][j] = 'D';
						break;
					default:
						grade[i][j] = 'F';
						break;
					}
				}
			}
		}

		// 출력단
		for (int h = 0; h < sub.length; h++) {
			for (int k = 0; k < sub[h].length; k++) {
				System.out.println();
				System.out.println("총점 :" + sub[h][k][sub[h][k].length - 3]);
				System.out.println("반 석차 :" + sub[h][k][sub[h][k].length - 2] + "등");
				System.out.println("전교 선차 : " + sub[h][k][sub[h][k].length - 1] + "등");
				System.out.println("학점 : " + avg);
			}
		}

	}
}
