package array_Exam;

/*
 * 문]
 *   2차원 배열을 이용하여 다음과 같이 출력하시오
 *   
 *   1
 *   1 2 3
 *   1
 *   1 2 3 4
 *   1 2
 */


public class Array_ex01 {
	public static void main(String[] args) {
		int[][] arr= new int[5][];									
		arr[0] = new int[1];		
		arr[1] = new int[3];	
		arr[2] = new int[2];		
		arr[3] = new int[4]; 
		arr[4] = new int[2]; 
		
		for(int i = 0; i<arr.length;i++) {
			int a = 1;
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = a++;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
