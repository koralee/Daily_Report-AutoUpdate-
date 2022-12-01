package test;

public class Ex02 {

	public static void main(String[] args) {

		int[][] arr = new int[4][5];
		int n=1;
		
		
	
		for(int i = 0; i < arr.length;i++){
			if(i % 2== 0) {
		        for(int j = 0; j < arr[i].length; j++){
				arr[i][j]=n++;
			    } 
			}else {
				for(int j = (arr[i].length-1); j >=0 ; j--){
					arr[i][j]=n++;
				}
			}
			
		}
		
		//출력
		
		for(int i = 0; i < arr.length;i++){
		    for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%3d\t",arr[i][j]);
			}
			System.out.println();
		}
	}

}
