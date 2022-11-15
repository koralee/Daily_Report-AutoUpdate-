package array_Copy;

/*
 *   배열의 복사
 *   
 *   -- 배열 변수의 복사는 데이터 복사, 주소값 복사
 *   -> 원본을 수정하면 복사본에 영향을 미친다.
 *   -> 모든 참조형에 해당하는 복사 얇은 복사(값만 복사)
 *   
 */

public class Array_Copy02 {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50 };
		int[] copy;
		int temp;

		copy = nums;
		System.out.println(copy.length);
		temp = nums[0];
		System.out.println(temp);
		nums[0] = 1000; // 원본 수정
		System.out.println(nums[0]);

		for (int i = 0; i < copy.length; i++)
			System.out.printf("%3d\t", copy[i]);
		// 값을 copy 하는 것이 아닌 주소 값을 복사 했기 때문에
		System.out.println();
		copy[0] = 2000;
		for (int i = 0; i < copy.length; i++)
			System.out.printf("%3d\t", copy[i]);
		System.out.println();
		for (int i = 0; i < copy.length; i++)
			System.out.printf("%3d\t", nums[i]);
		// 원본을 수정하면 또는 복사본을 수정하면 >>> 복사본에 또는 원본에 영향을 미친다. (=깊은 복사)

	}
}
