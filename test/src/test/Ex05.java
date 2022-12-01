package test;

public class Ex05 {

	public static void main(String[] args) {
				
		// 입력
		
				int cnt = 4;	//배열의 행크기
				int[][] arr = new int[cnt][];	//2차원 배열 선언
				int num = 1;	//숫자 증가값
				//행출력
				
				for(int i = 0; i < arr.length;i++){
					//레그드 배열 선언 2차 배열공간이 행이 늘어 날때마다 열의 크기는 하나씩 줄어든다.
					arr[i] = new int[cnt-i];
					
					//열출력
					for(int j = 0; j < arr[i].length; j++){
						
						//숫자가 하나씩 증가한다. 
						arr[i][j] = num++;
					}
					
				}
			
				//출력
				for(int i = 0; i < arr.length;i++){
				    for(int j = 0; j < arr[i].length; j++){
						System.out.printf("%3d",arr[i][j]);
					}
					System.out.println();
				}
	}

}
