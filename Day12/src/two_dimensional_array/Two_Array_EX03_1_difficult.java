package two_dimensional_array;

import java.io.*;

public class Two_Array_EX03_1_difficult {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subname = { "국어", "영어", "수학" };
		int[][] sub = new int[3][subname.length + 2];
		// new int[3] ==> 0: 첫 번째 사람, 1: 두 번째 사람, 2: 세 번재 사람. 을 의미 즉, 행은 불변!
		// subname.length+1: 국어, 영어, 수학, 총점(= +1), 석차(= +1)

		float[] avg = new float[3];

		for (int k = 0; k < subname.length; k++) { // 사람 3명
			System.out.println((k + 1) + " 번째 사람");
			for (int i = 0; i < sub[k].length - 2; i++) {
				do {
					System.out.println(subname[i] + " 점수 : ");
					sub[k][i] = Integer.parseInt(br.readLine());
				} while (sub[k][i] < 0 || sub[k][i] > 100);
				// 총점 구함.
				sub[k][sub[k].length - 2] += sub[k][i];
			}
			// 평균 구함.
			avg[k] = sub[k][sub[k].length - 2] / (float) (sub[k].length - 2);
			// 석차 초기화
			sub[k][sub[k].length - 1] = 1;
				
		}
		// 출력
		
		// 석차 계산
		for(int k = 0;k<sub.length;k++) { //sub.length = 3
			for(int i = 0;i<sub.length;i++)	// sub.length = 3
				if(sub[k][sub[k].length - 2] < sub[i][sub[i].length - 2]) {  //고정군  : 비교군 !
					sub[k][sub[k].length - 1]++;
				}			
		}
		
		
		for (int k = 0; k < sub.length; k++) {
			System.out.println();
			System.out.println("석차 : "+sub[k][sub[k].length - 1] + "등");
			System.out.println("총점 : " + sub[k][sub[k].length - 2]);
			System.out.println("평균 : " + avg[k]);
		}
	}
}
