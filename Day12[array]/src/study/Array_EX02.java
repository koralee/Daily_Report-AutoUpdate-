package study;

public class Array_EX02 {
	public static void main(String[] args) {
		/*
		int[][] aa = new int[3][4];
		// int[][] aa = new int[행][열] 배열의 크기 : 행 x 열 : 12
		int i, k, val = 1;

		// 배열에 데이터 저장
		for (i = 0; i < 3; i++) {
			for (k = 0; k < 4; k++) {
				aa[i][k] = val;
				val++;
			}
		}
		// 배열에 저장된 데이터를 출력
		for (i = 0; i < 3; i++) {
			for (k = 0; k < 4; k++) {
				System.out.printf("aa[%d][%d]  ", i, k);
				System.out.printf("데이터 값 = %3d   ", aa[i][k]);

			}
			System.out.println();
		}
		System.out.println();
		*/
		
		int bb[][] =
			{
				{2,3},
				{3,6,9},
				{4,5,7,8}
			};
		for(int i=0;i<bb.length;i++) {  //행  여기서는 bb.length는 3
			for(int j=0;j<bb[i].length;j++) { //열의 길이  ?행의 길이만큼  여기서 bb[i].length는 ↓↓↓↓↓↓↓↓↓↓ 
				System.out.print(bb[i][j]+"\t");	//ex)0행은 2, 3 이므로  2 // 1행은 3, 6, 9 이므로 3  // 2행은 4, 5, 7, 8이므로 4
			}
			System.out.println();
		}
	}
}