package two_dimensional_array;

import java.io.*;

public class Ragged_Array_EX03_Very_Important {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("시험에 응시할 인원 수 : ");
		int human = Integer.parseInt(br.readLine()); // args[0] = 3으로 셋팅되어 있음 (=사람 수)
		System.out.print(human+" 명");
		
		String[] name = new String[human]; // 사람 수 만큼 이름배열을 생성

		String[][] subject = new String[human][]; // [] : 행(사람 수) [] : 과목

		// 점수와 총점처리할 배열 선언
		int[][] Score = new int[human][]; // int score[3][]

		// 평균 배열 선언
		float[] avg = new float[human];

		// 학점 배열 선언
		char[] grade = new char[human];

		// 석차 배열 선언
		int[] rank = new int[human];

		for (int i = 0; i < human; i++) {
			System.out.print("\n"+(i + 1) + " 번째 학생 이름 : ");
			name[i] = br.readLine();

			System.out.print("응시 과목 수 : ");
			int imsi = Integer.parseInt(br.readLine());
			subject[i] = new String[imsi];

			for (int j = 0; j < subject[i].length; j++) {
				System.out.print((j + 1) + "번째 응시 과목 : ");
				subject[i][j] = br.readLine();
			} // 과목명

			Score[i] = new int[imsi + 1];  

			for (int j = 0; j < subject[i].length; j++) {
				System.out.print(subject[i][j] + "점수 :");
				Score[i][j] = Integer.parseInt(br.readLine());
				Score[i][Score[i].length-1] += Score[i][j]; // 누적의 합    셋팅된 자리!에 값을 누적하여 저장
			}
		}
		System.out.println(); // 줄 바꿈

		for (int i = 0; i < human; i++) {
			avg[i] = Score[i][Score[i].length - 1] / (float) subject[i].length; //  총합 / 과목수
			avg[i] = (int) ((avg[i] + 0.005) * 100) / 100.0f; // 정밀한 평균 구하는 공식
		}

		// 학점 계산
		for (int i = 0; i < human; i++) {
			switch ((int) (avg[i] / 10)) {
			case 10:
				grade[i] = 'A';
				break;
			case 9:
				grade[i] = 'B';
				break;
			case 8:
				grade[i] = 'C';
				break;
			case 7:
				grade[i] = 'D';
				break;
			default:
				grade[i] = 'F';
				break;
			}
		}
		System.out.println(); // 줄 바꿈

		// 석차 계산
		for (int i = 0; i < human; i++) {
			rank[i]=1; // 1
			for (int j = 0; j < human; j++) {
				if (avg[i] < avg[j]) { // 고정군 : 대조군
					rank[i]++;
				}
			}
		}
		System.out.println(); // 줄 바꿈


		for (int i = 0; i < human; i++) {
			// 성적 출력
			System.out.println("***************"+name[i]+"성적표 **************");
			System.out.print("이름\t");

			for (int j = 0; j < subject[i].length; j++) {
				System.out.print(subject[i][j] + "\t ");  // 과목 이름별 출력
			}
			System.out.println("총점 \t 평균\t        학점\t석차 ");

			System.out.print(name[i] + "\t");

			for (int j = 0; j < subject[i].length + 1; j++) {  // +1은 총점의 자리를 의미!
				System.out.printf("%3d\t ", Score[i][j]);
			}
			System.out.printf("%.2f\t%c\t%d\n",avg[i],grade[i],rank[i]);
			//System.out.printf(avg[i] + "\t " + grade[i]+ "\t" + rank[i]);
			System.out.println("******************************************");
		}

	}

}
