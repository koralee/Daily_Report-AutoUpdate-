package array_01_Basic;

public class Array_EX03 {

	public static void main(String[] args) {

		//int[][][] aa = new int [2][3][4];
		// int[][][] aa = new int [면][행]열]; 배열의 크기 : 면 x 행 x 열 
		
		// 데이터 저장
	/*	int i, j, k, val = 1;
		for(k=0;k<2;k++) {			//면
			for(i=0;i<3;i++) {		//행
				for(j=0;j<4;j++) {	//열
					aa[k][i][j] = val;
					val++;
				}
			}
		} */
		
		int[][][] aa= {
				{
				{1,	2,		3,		4,},	//행
				{5,	6,		7,		8},	//행
				{9,	10,	11,	12}	//행
			  // 열,   열,     열,     열
				},// 첫 번째 면
				{
				{13,	14,  15,	 16},	//행
				{17,	18,  19,	 20},	//행
				{21,	22,  23,  24}	//행					
				//  열,    열,    열,  열
				}// 두 번째 면
				
		};
		int i,k,j;
		// 배열에 저장된 데이터를 출력
		for(k = 0; k < 2; k++) {
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 4; j++) {
					System.out.printf("aa[%d][%d][%d]  ",k, i, j);
					System.out.printf("데이터 값 = %3d   ", aa[k][i][j]);

				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();	
	}
}