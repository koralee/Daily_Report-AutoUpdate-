package array_Exam;

/*	문]
 * 
 * 		정수 10개를 저장할 배열을 선언하고 1에서 10까지 범위의 정수를 랜덤하게 생성하여
 * 		배열에 저장하고, 저장된 배열을 숫자들과 평균을 출력하는 프로그램 작성하시오.
 * 
 * 		Hint)
 * 		1 에서부터 10까지의 정수를 랜덤하게 생성하는 코드
 * 		int i =(int)(Math.random()*10+1);
 * 
 */

public class Array_ex04 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum=0,evg = 0;
		System.out.println("랜덤 숫자");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i]+"\t");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("평균 = "+(double)sum/arr.length);
	}
}
