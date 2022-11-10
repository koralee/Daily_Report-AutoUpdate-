package two_dimensional_array;

/*
 * 	문]
 * 배열의 선언하여 1~9까지 초기화 한 후 출력하는 프로그램 작성
 * 
 * 
 */

public class Two_Array_EX02 {
	public static void main(String[] args) {
		int a = 1;
		int[][] num = new int[3][3];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = a++;
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
