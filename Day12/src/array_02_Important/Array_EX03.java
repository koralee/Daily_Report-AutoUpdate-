package array_02_Important;

import java.io.*;
public class Array_EX03 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subName =new String[] {"국어","수학","영어"};
		//0, 1, 2
		int[] sub = new int[subName.length+1];// 총 합계 = 3
		//또는 int[] sub = new int[4];
		float avg = 0.0f;
		
		for(int i = 0;i<sub.length-1;i++) {
			//과목 점수 
			do {
				System.out.print(subName[i]+"점수 : ");
				sub[i]=Integer.parseInt(br.readLine());
			}while(sub[i]<0 || sub[i]>100);
			//총 합계
			sub[sub.length-1]+=sub[i]; // 누적합계
		}
		avg = sub[sub.length-1] /(float)(sub.length-1);  // 총점 / 과목(개수)
		System.out.println("국어 점수 : "+sub[0]+" , 수학점수 : "+sub[1]+" , 영어점수 : "+sub[2]);
		System.out.println("총점 : "+sub[3]);
		System.out.printf("평균 : %.2f",avg);
	}
}
