package two_dimensional_array;

/*
 * 		2차원 배열(다차원 배열)	
 * 		- 1차원 배열과 마찬가지로 2차원 배열에서 레퍼런스 변수 선언 후 배열을 생성함.
 * 		- 2차원 배열의 레퍼런스 변수를 선언하는 방법은 주로 두 가지 
 * 		
 * 		int arr[][];  		or    	int[][] arr;
 * 		char arr[][];  		or  	char[][] arr;
 * 		double arr[][];  	or 		double[][]arr;
 * 		
 * 		배열생성  ==> 메모리 공간을 만듬.
 * 		arr = new int[2][5];  [행][열] ==> 배열의 크기 행X열
 * 		arr = new char[2][5];
 * 		arr = new double[2][5];
 * 
 * 		2차원 배열의 초기화
 * 		int arr[][] = {	{0,1,2}, {3,4,5}, {6.7.8}};  		3행 3열
 * 		char arr[][] ={{'a','b','c','d'},{'e','f','g','h'}}; 		2행 4열
 * 		double arr[][]={{0.01, 0.02}, {0.03, 0.04}}; 	2행 2열
 * 		
 */

public class Two_Array_EX01 {

	public static void main(String[] args) {
		int[][] test; //2차원 배열 선언
		test = new  int[2][4]; // 배열의 크기 설정
	
	// 배열의 초기화	
	//첫 번째 행의 시작	
		test[0][0]=100; test[0][1]=200;  test[0][2]=300; test[0][3]='\0'; 
	//첫 번째 행의 끝
	//두 번째 행의 시작
		test[1][0]=400; test[1][1]=500;  test[1][2]=600; test[1][3]=700;
	//두 번재 행의 끝
	
	// 배열의 값 출력
		for(int i=0;i<test.length;i++) {  // 행을 의미
			//test.length ==> 2차원 배열의 행의 개수를 의미
			//test[].length ==> 해당하는 행의 열의 개수를 의미
			for(int j=0;j<test[i].length;j++) {  //열의 개수   즉, 길이를 의미
				System.out.print("test {"+i+"]["+j+"] = "+test[i][j]+"\t");
			}
			System.out.println();// 행이 끝나고 줄을 바꿈
		}
			
	
	}
}
