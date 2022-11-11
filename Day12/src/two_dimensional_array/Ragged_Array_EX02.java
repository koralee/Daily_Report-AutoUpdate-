package two_dimensional_array;

/* 	 가변배열
 * 
 * 	-자바의 배열은 1차원만 관리한다.
 * 	형식 
 * 		int[][] arr = new int[3][];
 * 		arr[0] = new int[2];
 * 		arr[1] = new int[1];
 * 		arr[2] = new int[3];
 */

public class Ragged_Array_EX02 {
	public static void main(String[] args) {
		
		// 가변 배열 선언
		int[][] arr= new int[3][];
		// 배열 초기화 
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
	
		arr[0][0]=100; arr[0][1]=200;
		arr[1][0]=300;
		arr[2][0]=400; arr[2][1]=500; arr[2][2]=600;
		
		for(int i=0;i<arr.length;i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"] = "+arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
