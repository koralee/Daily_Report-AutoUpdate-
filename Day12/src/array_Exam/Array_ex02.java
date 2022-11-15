package array_Exam;

/*
 * 문]
 * 
 * 		양의 정수를 10개 입력받아 배열에 저장하고, 배열에 저장된 수중 3의 배수만을 출력하는 프로그램 작성.
 * 		양의 정수 10개 입력 : 1, 5, 99, 22, 345, 154, 2346, 55, 32, 85
 * 		3의 배수 : 99, 345, 2346
 */
import java.util.*;

public class Array_ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];

		System.out.println("양의 정수 10개를 입력하시오 ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("3의 배수는");
		for (int Arr : arr) {
			if (Arr % 3 == 0)
				System.out.print(Arr + " ");
		}

	}
}
