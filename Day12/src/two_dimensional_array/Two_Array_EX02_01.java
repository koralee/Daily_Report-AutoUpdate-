package two_dimensional_array;

/*
 * 		다음과 같이 배열을 이용하여 출력하시오
 * 		1   2   3  4   5
 * 		6   7   8  9   10 
 * 		11 12 13 14 15
 * 		16 17 18 19 20
 * 		21 22 23 24 25
 */

public class Two_Array_EX02_01 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int a = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = a++;
				}
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][(arr[i].length - 1) - j] = a++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
