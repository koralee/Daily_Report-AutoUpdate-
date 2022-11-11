package array_difficult_example;

import java.io.*;

public class Two_dimensional_array {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("응시 학생 수 : ");
		int human = Integer.parseInt(args[0]); // args[0] = 3으로 셋팅되어 있음 (=사람 수)
		String[] name = new String[human]; // 사람 수 만큼 이름배열을 생성
		System.out.println(human);
		String[] subject = new String[args.length - 1]; // 과목명 배열 생성 및 초기화
		// 3, 국어, 영어, 일어 총4 - 1 = 3 이므로 args.length-1 = 3 즉, 과목수

		// 점수와 총점처리할 배열 선언
		int[][] Score = new int[human][args.length]; // int score[3][4] 행은(인원 수) 고정 열은 국어,영어,일어, 총점 의 자리

		// 평균 배열 선언
		float[] avg = new float[human]; // 3 3명이므로 3개 필요

		// 학점 배열 선언
		char[] grade = new char[human]; // 3 3명이므로 3개 필요

		// 석차 배열 선언
		int[] rank = new int[human]; // 3 3명이므로 3개 필요

		// 과목명 배열의 위치에 맞게 과목을 Insert 해줌
		System.out.print("입력 과목 : ");
		for (int i = 0; i < args.length - 1; i++) {
			subject[i] = args[i + 1]; // ( 3, 국어, 영어, 일어) 이므로 args[0]인 3을 건너뛴 다음 값부터 입력.
			System.out.print(subject[i] +"\t"); // 국어 영어 일어 글자를 순서대로 출력
		}
		System.out.println(); // 줄 바꿈

		for (int i = 0; i < human; i++) {
			System.out.print("\n" + (i + 1) + " 번째 학생 이름 : ");
			name[i] = br.readLine();

			System.out.println(name[i] + " 학생의 과목별 점수 입력");

			for (int j = 0; j < subject.length; j++) { // subject.length = 3
				System.out.print(subject[j] + "점수 :");
				Score[i][j] = Integer.parseInt(br.readLine()); // 과목별 점수 Score배열의 [3][3]까지 입력
				Score[i][subject.length] += Score[i][j]; // 누적의 합 Score배열의 [0][4], [1][4], [2][4]의 위치값에 누적된 값 저장
			}
		}
		System.out.println(); // 줄 바꿈

		for (int i = 0; i < human; i++) {
			avg[i] = Score[i][subject.length] / (float) subject.length; // Score[i][4]의 위치의 값(=총합) / 과목수 (평균 공식)
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
			rank[i]++; // 1
			for (int j = 0; j < human; j++) {
				if (avg[i] < avg[j]) {   //고정군 : 대조군
					rank[i]++;
				}
			}
		}
		System.out.println(); // 줄 바꿈

		// 성적 출력
		System.out.println("*************** 성적표 **********************");
		System.out.print("이름\t");
		for (int j = 0; j < subject.length; j++) {
			System.out.print(subject[j] + "\t ");  // 과목 이름별 출력
		}
		System.out.println("총점 \t 평균\t        학점\t석차 ");

		for (int i = 0; i < human; i++) {
			System.out.print(name[i] + "\t");

			for (int j = 0; j < subject.length + 1; j++) {
				System.out.printf("%3d\t ", Score[i][j]);
			}
			System.out.printf("%.2f\t%c\t%d\n",avg[i],grade[i],rank[i]);
			//System.out.printf(avg[i] + "\t " + grade[i]+ "\t" + rank[i]);
			System.out.println("******************************************");
		}

	}
}
