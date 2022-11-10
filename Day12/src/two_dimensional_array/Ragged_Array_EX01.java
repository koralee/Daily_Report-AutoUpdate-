package two_dimensional_array;

/* 	용어 : 래기드 배열 = 가변배열 = 비정형배열
 *		- 가변 배열은 행마다 열의 개수가 서로 다른 배열을 의미한다.
 *
 *		int arr[][];
 *		arr = new int[4][];
 *		
 *		'행'을 의미	  '열'을 의미
 *		arr[0] = new int[1];
 *		첫 번째 행    열이 하나!
 *		arr[1] = new int[2];
 *    	두 번째 행    열이 두 개                   그림으로 보면   ㅁ
 *    	arr[2] = new int[3];									 ㅁ  ㅁ
 *     세 번째 행    열이 세 개										 ㅁ  ㅁ  ㅁ
 *    	arr[3] = new int[4];									 ㅁ  ㅁ  ㅁ  ㅁ  인 것을 볼 수 있다.
 *     네 번째 행    열이 네 개
 *      
 */

public class Ragged_Array_EX01 {
	public static void main(String[] args) {
		int[][] arr= new int[4][];									//	Ex value
		arr[0] = new int[3];		// 첫 번째 행의 열을 3개로 가정   10, 11, 12
		arr[1] = new int[2];		// 두 번재 행의 열을 2개로 가정   20, 21
		arr[2] = new int[4];		// 세 번재 행의 열을 4개로 가정	30, 31, 32, 33
		arr[3] = new int[2]; 		// 네 번째 행의 열을 2개로 가정	40, 41

		for(int i = 0; i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = (i+1)*10+j;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
