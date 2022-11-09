package array_02_Important;
/*
 * 		문]
 * 		사용자로부터 임의의 정수를 임의의 개수만큼 입력받아
 * 		입력받은 수중 가장 큰수를 출력하는 프로그램
 * 
 * 		단, 배열로 구현하시오
 * 		입력 할 개수 : 9  ==> n
 * 		데이터 입력[공백구분] : 4  7  9  1  3  2  5  6  8
 * 		가장 큰 수 : 9  
 */
import java.util.*;
public class Array_EX06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 할 개수 : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.print("데이터 입력[공백구분] :");
		for(int i=0;i<arr.length;i++)
		{	
			arr[i]=sc.nextInt();
		}
		
		int max=0;
		for(int i=0;i<arr.length;i++)
		{	
			if(arr[i]>max)
				max =arr[i];
		}
		System.out.println("가장 큰수 : "+max);
	}
}
