package array_02_Important;

/*	문]
 * 
 * 임의의 숫자가 들어있는 배열의 숫자 데이터 중
 * 짝수인 요소만 골라서 출력하고
 * 3의 배수인 요소만 골라서 출력하는 프로그램을 작성
 * 
 * 임의의 배열에 저장할 숫자 : 4, 7, 9, 1, 2, 3, 8, 6, 5
 * 
 * 실행 결과
 * 배열의 전체 요소 : 4, 7, 9, 1, 2, 3, 8, 6, 5
 * 배열의 짝수 요소 : 4, 2, 8, 6
 * 배열의 3의 배수 요소 : 9, 3, 6
 * 
 */
public class Array_EX04 {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 7, 9, 1, 2, 3, 8, 6, 5 };
		System.out.print("배열의 전체 요소 출력 : ");
		for (int i = 0; i < arr.length; i++)
			System.out.printf("%3d ", arr[i]);
		System.out.println();

		System.out.print("배열의 짝수의 요소 출력 :");
		for (int i = 0; i < arr.length; i++)
			if (arr[i] % 2 == 0)
				System.out.printf("%2d  ", arr[i]);
		System.out.println();

		System.out.print("배열의 3의 배수의 요소 출력 :");
		for (int i = 0; i < arr.length; i++)
			if (arr[i] % 3 == 0)
				System.out.printf("%2d  ", arr[i]);
		System.out.println();
	}
}
