package test;

public class Ex05 {
	public static void main(String[] args) {

		int[][] arr = new int[4][]; 
		
		int a = 1;
		for(int i = 0; i<arr.length;i++) {
			arr[i] = new int[(arr.length)-i];
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = a++;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
