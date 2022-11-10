package two_dimensional_array;

import java.io.*;

public class Two_Array_EX03_difficult {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subname = { "국어", "영어", "수학" };
		int[][] sub = new int[3][subname.length + 1]; // subname.length+1 = 4
		// new int[3] ==> 0: 첫 번째 사람, 1: 두 번째 사람, 2: 세 번재 사람. 을 의미 즉, 행은 불변!
		// subname.length+1: 국어, 영어, 수학, 총점(= +1)

		float[] avg = new float[3];

		for (int k = 0; k < subname.length; k++) { // 사람 3명 행(불변)  즉 k는 0,1,2 만 가능
			System.out.println((k + 1) + " 번째 사람");
			
			for (int i = 0; i < sub[k].length - 1; i++) { //열(과목)  과목만을 입력하기 위해 총점을 빼서 계산
					//점수 입력										  //변하는 k의 해당하는 열의 개수를 의미 sub[k].length - 1]=3   >>>   0,1,2
				do {
					System.out.println(subname[i] + " 점수 : ");
					sub[k][i] = Integer.parseInt(br.readLine());
				} while (sub[k][i] < 0 || sub[k][i] > 100);
				
				// 총점 구함.
				sub[k][sub[k].length - 1] += sub[k][i]; 
				//sub[k].length - 1] = 3  >>(여기서는 배열의 위치 값)>> sub[0][3] 에 값을 저장해라! 를 의미!
			}
			
			// 평균 구함.  //평균은 1차원 배열을 따로 추가한 것!
			avg[k] = sub[k][sub[k].length - 1] / (float) (sub[k].length - 1);
						// sub[k][3] 의 위치에 있는 값(=총점)   ÷ {( 4(배열 개수)-1(총점 자리)) = 3(과목 수)} 
		}  
		
		// 출력
		for (int k = 0; k < sub.length; k++) {
			System.out.println();
			System.out.println("총점 : " + sub[k][sub[k].length - 1] + " , 평균 : " + avg[k]);
							//배열의 위치를 의미   sub[k][3]  
		}
	}
}
